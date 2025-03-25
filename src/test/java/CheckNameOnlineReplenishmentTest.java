import OnlineReplenishmentPack.OnlineReplenishment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckNameOnlineReplenishmentTest {
    static WebDriver driver;

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        DriverObject driverObject = new DriverObject();
        driver = driverObject.initDriver();
    }

    @Test
    @DisplayName("Проверка названия блока Онлайн пополнение без комиссии")
    public void checkName () {

        OnlineReplenishment onlineReplenishment = new OnlineReplenishment(driver);

        assertEquals("Онлайн пополнение\n" +
                "без комиссии", onlineReplenishment.getTitleOnlineReplenishment());
    }
}
