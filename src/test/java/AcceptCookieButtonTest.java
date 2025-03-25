import CookieFilesAccept.CookieAcceptWindow;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

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
        public void acceptCookieButton() {
            CookieAcceptWindow cookieAcceptWindow = new CookieAcceptWindow(driver);
            cookieAcceptWindow.clickButtonAccept();
    }
}
