import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckButtonContinueTest {
    static WebDriver driver;
    static WebDriverWait waitUntil;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    @DisplayName("Проверка работы кнопки Продолжить")
    public void checkButtonContinue() throws InterruptedException {

        WebElement inputPhoneNumber = driver.findElement(By.id("connection-phone"));
        inputPhoneNumber.click();
        inputPhoneNumber.sendKeys("297777777");

        WebElement inputSum = driver.findElement(By.id("connection-sum"));
        inputSum.click();
        inputSum.sendKeys("1");

        WebElement buttonContinue = driver.findElement(By.xpath
                ("//button[@class='button button__default ']"));
        buttonContinue.click();

        waitUntil = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement popup = waitUntil.until(ExpectedConditions.visibilityOfElementLocated((By.className("bepaid-app"))));

        System.out.println(popup);
        assertTrue(popup.isDisplayed());

    }
}