import CookieFilesAccept.CookieAcceptWindow;
import OnlineReplenishmentPack.OnlineReplenishment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class CheckLinkMoreAboutServiceTest {
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
    @DisplayName("Проверка работы ссылки Подробнее о сервисе")
    public void checkLinkMoreAboutService() {

        OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);

        String url = onlineReplenishment.getLinkAboutService();
        onlineReplenishment.clickLinkAboutService();
        String currentUrl = driver.getCurrentUrl();

        Assertions.assertEquals(url,currentUrl);
    }
}
