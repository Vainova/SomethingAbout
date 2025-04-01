import CookieFilesAccept.CookieAcceptWindow;
import OnlineReplenishmentPack.OnlineReplenishment;
import PopupPack.PopupElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PopupTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        DriverObject driverObject = new DriverObject();
        driver = driverObject.initDriver();
        CookieAcceptWindow cookieAcceptWindow = new CookieAcceptWindow(driver);
        cookieAcceptWindow.clickButtonAccept();
        OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);
        onlineReplenishment.clickPhoneNumber()
                .typePhoneNumber("297777777")
                .clickInputSum()
                .typeSum("1")
                .clickButtonContinue();
    }

    @Test
    @DisplayName("Проверка Popup")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Проверка корректности работы Popup с оплатой.")
    @Story("Проверка функциональности Popup")
    public void checkPopup() {
        PopupElement popupElement = new PopupElement(driver);

        WebElement popupWindow = popupElement.waitForPopupToBeVisible();
        assertTrue(popupWindow.isDisplayed());

        popupElement.switchToIframeElement();

        validatePopupContent(popupElement);
    }

    @Step("Проверка Popup")
    private void validatePopupContent(PopupElement popupElement) {
        assertEquals("1.00 BYN", popupElement.checkMainSumPopup());
        assertEquals("Оплатить 1.00 BYN", popupElement.checkSumButton());
        assertEquals("Оплата: Услуги связи Номер:375297777777", popupElement.checkPhoneNumber());
        assertEquals("Номер карты", popupElement.checkPlaceholderCartNumber());
        assertEquals("Срок действия", popupElement.checkPlaceholderValidityPeriod());
        assertEquals("CVC", popupElement.checkPlaceholderCVC());
        assertEquals("Имя держателя (как на карте)", popupElement.checkPlaceholderName());

        assertTrue(popupElement.inputPictureVisa());
        assertTrue(popupElement.inputPictureMastercard());
        assertTrue(popupElement.inputPictureBelkart());
        assertTrue(popupElement.inputPictureMaestroSystem());
        assertTrue(popupElement.inputPictureMirSystem());
    }
}

