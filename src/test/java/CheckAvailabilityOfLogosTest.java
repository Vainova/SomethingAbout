import OnlineReplenishmentPack.OnlineReplenishment;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
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
    @Description("Тест проверяет наличие логотипов различных платежных систем на странице")

    public void checkAvailabilityOfLogos() {
         OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);

        assertLogoAvailability(onlineReplenishment, "Visa", onlineReplenishment.checkAvailabilityOfVisa());
        assertLogoAvailability(onlineReplenishment, "Verified By Visa", onlineReplenishment.checkAvailabilityOfVerifiedByVisa());
        assertLogoAvailability(onlineReplenishment, "MasterCard", onlineReplenishment.checkAvailabilityOfMasterCard());
        assertLogoAvailability(onlineReplenishment, "MasterCard SecureCode", onlineReplenishment.checkAvailabilityOfMasterCardSecureCode());
        assertLogoAvailability(onlineReplenishment, "Belcart", onlineReplenishment.checkAvailabilityOfBelcart());
    }
    @Step("Проверка наличия логотипа ")
    private void assertLogoAvailability(OnlineReplenishment onlineReplenishment, String logoName, boolean isAvailable) {
        assertTrue(isAvailable, logoName + " Логотип должнен быть");
    }
}
