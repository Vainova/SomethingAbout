import CookieFilesAccept.CookieAcceptWindow;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;

public class AcceptCookieButtonTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        DriverObject driverObject = new DriverObject();
        driver = driverObject.initDriver();
    }

        @Test
        @DisplayName("Проверка принятия файлов Cookie")
        @Description("Тест проверяет, что кнопка принятия файлов Cookie работает корректно.")
        @Step("Нажимаем на кнопку принятия файлов Cookie")
        public void acceptCookieButton() {
            CookieAcceptWindow cookieAcceptWindow = new CookieAcceptWindow(driver);
            cookieAcceptWindow.clickButtonAccept();
            Allure.addAttachment("Скриншот",
                    new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
}
