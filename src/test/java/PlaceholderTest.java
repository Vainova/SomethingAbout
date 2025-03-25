import CookieFilesAccept.CookieAcceptWindow;
import OnlineReplenishmentPack.OnlineReplenishment;
import io.github.bonigarcia.wdm.WebDriverManager;
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
    public void checkPlaceholdersCommunicationServices() {

    OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);

    assertEquals("Номер телефона",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderCommunicationServicesPhoneNumber());
    assertEquals("Сумма",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderCommunicationServicesSum());
    assertEquals("E-mail для отправки чека",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderCommunicationServicesEmail());

    onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionButton();
    onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionHomeInternet();
    assertEquals("Номер абонента",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderHomeInternetSubscriberNumber());
    assertEquals("Сумма",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderHomeInternetSum());
    assertEquals("E-mail для отправки чека",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderHomeInternetEmail());

    onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionButton();
    onlineReplenishment.onlineReplenishmentPlaceholders.clickAnOptionInstallment();
    assertEquals("Номер счета на 44",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderInstallmentAccountNumber());
    assertEquals("Сумма",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderInstallmentSum());
    assertEquals("E-mail для отправки чека",
            onlineReplenishment.onlineReplenishmentPlaceholders.placeholderInstallmentEmail());

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
