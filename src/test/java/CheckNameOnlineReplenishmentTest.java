import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNameOnlineReplenishmentTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    @DisplayName("Проверка названия блока Онлайн пополнение без комиссии")
    public void checkName () {

        WebElement payWrapper = driver.findElement(By.className("pay__wrapper"));

        assertEquals("Онлайн пополнение\n" +
                "без комиссии", payWrapper.findElement(By.tagName("h2")).getText());
    }
}