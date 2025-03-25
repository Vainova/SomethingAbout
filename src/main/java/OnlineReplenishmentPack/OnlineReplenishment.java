package OnlineReplenishmentPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineReplenishment {
    public By linkAboutService = By.xpath
            ("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']");
    public By inputPhoneNumber = By.id("connection-phone");
    public By inputSum = By.id("connection-sum");
    public By buttonContinue = By.xpath
            ("//button[@class='button button__default ']");
    public By pictureVisa = By.xpath
            ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg']");
    public By pictureVerifiedByVisa = By.xpath
            ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg']");
    public By pictureMasterCard = By.xpath
            ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg']");
    public By pictureMasterCardSecureCode = By.xpath
            ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg']");
    public By  pictureBelcart = By.xpath
            ("//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg']");
    public By payWrapper = By.className("pay__wrapper");

    public OnlineReplenishmentPlaceholders onlineReplenishmentPlaceholders;
    private WebDriver driver;

    public OnlineReplenishment(WebDriver driver){
        this.driver = driver;
        this.onlineReplenishmentPlaceholders = new OnlineReplenishmentPlaceholders(driver);
    }

    public String getLinkAboutService() {
        return driver.findElement(linkAboutService).getAttribute("href");
    }

    public void clickLinkAboutService() {
        driver.findElement(linkAboutService).click();
    }

    public OnlineReplenishment clickPhoneNumber() {
        driver.findElement(inputPhoneNumber).click();
        return this;
    }

    public OnlineReplenishment  typePhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    public OnlineReplenishment clickInputSum() {
        driver.findElement(inputSum).click();
        return this;
    }

    public OnlineReplenishment typeSum(String sum) {
        driver.findElement(inputSum).sendKeys(sum);
        return this;
    }

    public OnlineReplenishment clickButtonContinue() {
        driver.findElement(buttonContinue).click();
        return this;
    }


    public boolean checkAvailabilityOfVisa(){
        return driver.findElement(pictureVisa).isDisplayed();
    }

    public boolean checkAvailabilityOfVerifiedByVisa(){
        return driver.findElement(pictureVerifiedByVisa).isDisplayed();
    }

    public boolean checkAvailabilityOfMasterCard(){
        return driver.findElement(pictureMasterCard).isDisplayed();
    }

    public boolean checkAvailabilityOfMasterCardSecureCode(){
        return driver.findElement(pictureMasterCardSecureCode).isDisplayed();
    }

    public boolean checkAvailabilityOfBelcart(){
        return driver.findElement(pictureBelcart).isDisplayed();
    }

    public String getTitleOnlineReplenishment() {
       return driver.findElement(payWrapper).findElement(By.tagName("h2")).getText();
    }
}
