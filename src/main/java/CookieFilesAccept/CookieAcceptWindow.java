package CookieFilesAccept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CookieAcceptWindow {
    public By buttonAgreeCookie = By.id("cookie-agree");

    private WebDriver driver;

    public CookieAcceptWindow(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAccept() {
       WebElement buttonElement =  driver.findElement(buttonAgreeCookie);

       if (buttonElement.isDisplayed()) {
           buttonElement.click();
       }
    }
}