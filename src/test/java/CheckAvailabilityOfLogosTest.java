import OnlineReplenishmentPack.OnlineReplenishment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public  class CheckAvailabilityOfLogosTest {
     static WebDriver driver;

     @BeforeAll
     static void setUp() {
        WebDriverManager.chromedriver().setup();
         WebDriverManager.chromedriver().setup();
         DriverObject driverObject = new DriverObject();
         driver = driverObject.initDriver();
     }

    @Test
    @DisplayName("Проверка наличия логотипов платежных систем")
    public void checkAvailabilityOfLogos() {

        OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);

        assertTrue(onlineReplenishment.checkAvailabilityOfVisa());
        assertTrue(onlineReplenishment.checkAvailabilityOfVerifiedByVisa());
        assertTrue(onlineReplenishment.checkAvailabilityOfMasterCard());
        assertTrue(onlineReplenishment.checkAvailabilityOfMasterCardSecureCode());
        assertTrue(onlineReplenishment.checkAvailabilityOfBelcart());
    }
}
