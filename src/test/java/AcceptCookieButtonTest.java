import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class AcceptCookieButtonTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
        @Test
        @DisplayName("Проверка принятия файлов Cookie")
        public void acceptCookieButton() {
            WebElement buttonAgreeCookies = driver.findElement(By.id("cookie-agree"));

            buttonAgreeCookies.click();
    }
}