import CookieFilesAccept.CookieAcceptWindow;
import OnlineReplenishmentPack.OnlineReplenishment;
import PopupPack.PopupElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

    public class CheckButtonContinueTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        DriverObject driverObject = new DriverObject();
        driver = driverObject.initDriver();
        CookieAcceptWindow cookieAcceptWindow = new CookieAcceptWindow(driver);
        cookieAcceptWindow.clickButtonAccept();
    }

    @Test
    @DisplayName("Проверка работы кнопки Продолжить")
    @Description("Этот тест проверяет, что кнопка 'Продолжить' работает корректно.")
    public void checkButtonContinue() throws InterruptedException {
        OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);
        onlineReplenishment.clickPhoneNumber()
                .typePhoneNumber("297777777")
                .clickInputSum()
                .typeSum("1")
                .clickButtonContinue();

        PopupElement popupElement = new PopupElement(driver);

        WebElement popupWindow = popupElement.waitForPopupToBeVisible();
        assertTrue(popupWindow.isDisplayed(), "Popup елемент должен отображаться");
    }
}
