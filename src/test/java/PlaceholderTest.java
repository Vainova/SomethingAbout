import CookieFilesAccept.CookieAcceptWindow;
import OnlineReplenishmentPack.OnlineReplenishment;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaceholderTest {
   static WebDriver driver ;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        DriverObject driverObject = new DriverObject();
        driver = driverObject.initDriver();
        CookieAcceptWindow cookieAcceptWindow = new CookieAcceptWindow(driver);
        cookieAcceptWindow.clickButtonAccept();
    }

   @Test
    @DisplayName("Проверка плейсхолдеров услуги связи")
   @Description("Тест проверяет корректность отображения плейсхолдеров для различных услуг связи")
    public void checkPlaceholdersCommunicationServices() {

       OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);

       checkPlaceholdersForCommunicationServices(onlineReplenishment);
       checkPlaceholdersForHomeInternet(onlineReplenishment);
       checkPlaceholdersForInstallment(onlineReplenishment);
       checkPlaceholdersForArrears(onlineReplenishment);
   }
    @Step("Проверка плейсхолдеров для услуги связи")
    private void checkPlaceholdersForCommunicationServices(OnlineReplenishment onlineReplenishment) {
        assertEquals("Номер телефона",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderCommunicationServicesPhoneNumber());
        assertEquals("Сумма",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderCommunicationServicesSum());
        assertEquals("E-mail для отправки чека",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderCommunicationServicesEmail());
    }

    @Step("Проверка плейсхолдеров для домашнего интернета")
    private void checkPlaceholdersForHomeInternet(OnlineReplenishment onlineReplenishment) {
        onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionButton();
        onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionHomeInternet();
        assertEquals("Номер абонента",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderHomeInternetSubscriberNumber());
        assertEquals("Сумма",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderHomeInternetSum());
        assertEquals("E-mail для отправки чека",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderHomeInternetEmail());
    }

    @Step("Проверка плейсхолдеров для рассрочки")
    private void checkPlaceholdersForInstallment(OnlineReplenishment onlineReplenishment) {
        onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionButton();
        onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionInstallment();
        assertEquals("Номер счета на 44",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderInstallmentAccountNumber());
        assertEquals("Сумма",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderInstallmentSum());
        assertEquals("E-mail для отправки чека",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderInstallmentEmail());
    }

    @Step("Проверка плейсхолдеров для задолженности")
    private void checkPlaceholdersForArrears(OnlineReplenishment onlineReplenishment) {
        onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionButton();
        onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionArrears();
        assertEquals("Номер счета на 2073",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderArrearsAccountNumber());
        assertEquals("Сумма",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderArrearsSum());
        assertEquals("E-mail для отправки чека",
                onlineReplenishment.onlineReplenishmentPlaceholders.placeholderArrearsEmail());
    }
}

