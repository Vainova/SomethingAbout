package PopupPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class PopupElement {
    public By iframeElement = By.className("bepaid-iframe");
    public By popup = By.className("bepaid-app");
    public By mainPicture = By.xpath("//div[@class='pay-description__cost']");
    public By sumButton = By.xpath("//button[@class='colored disabled']");
    public By phoneNumber = By.xpath("//div[@class='pay-description__text']");
    public By placeholderCartNumber = By.xpath("//div[@class='content ng-tns-c2312288139-1']");
    public By placeholderValidityPeriod = By.xpath("//div[@class='content ng-tns-c2312288139-4']");
    public By placeholderCVC = By.xpath("//div[@class ='content ng-tns-c2312288139-5']");
    public By placeholderName = By.xpath("//div[@class ='content ng-tns-c2312288139-3']");
    public By pictureVisa = By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']");
    public By pictureMastercard = By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']");
    public By pictureBelkart = By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']");
    public By pictureMaestroSystem = By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']");
    public By pictureMirSystem = By.xpath("//img[@src='assets/images/payment-icons/card-types/mir-system.svg']");

    private  WebDriver driver;
    WebDriverWait wait;

    public PopupElement(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement waitForPopupToBeVisible() {

       WebDriverWait waitUntil = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement popupWindow = waitUntil.until(ExpectedConditions.visibilityOfElementLocated(popup));
       return popupWindow;
    }

    public void switchToIframeElement() {
        WebElement iframe = driver.findElement(iframeElement);
        driver.switchTo().frame(iframe);

    }

    public String checkMainSumPopup() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(mainPicture)).getText();
    }

    public String checkSumButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sumButton)).getText();
    }

    public   String checkPhoneNumber() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumber)).getText();
    }

    public String checkPlaceholderCartNumber() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderCartNumber)).getText();
    }

    public String checkPlaceholderValidityPeriod() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderValidityPeriod)).getText();
    }

    public String checkPlaceholderCVC() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderCVC)).getText();
    }

    public String checkPlaceholderName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(placeholderName)).getText();
    }

    public boolean inputPictureVisa() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pictureVisa)).isDisplayed();
    }

    public boolean inputPictureMastercard() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pictureMastercard)).isDisplayed();
    }

    public boolean inputPictureBelkart() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pictureBelkart)).isDisplayed();
    }

    public boolean inputPictureMaestroSystem() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pictureMaestroSystem)).isDisplayed();
    }

    public boolean inputPictureMirSystem() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pictureMirSystem)).isDisplayed();
    }
}
