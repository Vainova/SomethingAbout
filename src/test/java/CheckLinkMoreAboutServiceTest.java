import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckLinkMoreAboutServiceTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    @DisplayName("Проверка работы ссылки Подробнее о сервисе")
    public void checkLinkMoreAboutService() {

        WebElement linkAboutService = driver.findElement(By.xpath
                ("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"));

        String url = linkAboutService.getAttribute("href");
        linkAboutService.click();

        String currentUrl = driver.getCurrentUrl();

        Assertions.assertEquals(url,currentUrl);
    }
}