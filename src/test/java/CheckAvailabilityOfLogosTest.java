import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public  class CheckAvailabilityOfLogosTest {
     static WebDriver driver;

     @BeforeAll
     static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    @DisplayName("Проверка наличия логотипов платежных систем")
    public void checkAvailabilityOfLogos() {

        WebElement pictureVisa = driver.findElement(By.xpath
                ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']"));

        assertTrue(pictureVisa.isDisplayed(), "Изображение найдено");

        WebElement pictureVerifiedByVisa = driver.findElement(By.xpath
                ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']"));

        assertTrue(pictureVerifiedByVisa.isDisplayed(),"Изображение найдено");

        WebElement pictureMasterCard = driver.findElement(By.xpath
                ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']"));

        assertTrue(pictureMasterCard.isDisplayed(),"Изображение найдено");

        WebElement pictureMasterCardSecureCode = driver.findElement(By.xpath
                ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']"));

        assertTrue(pictureMasterCardSecureCode.isDisplayed(),"Изображение найдено");

        WebElement pictureBelcart = driver.findElement(By.xpath
                ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']"));

        assertTrue(pictureBelcart.isDisplayed(),"Изображение найдено");
    }
}