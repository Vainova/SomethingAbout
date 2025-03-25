package OnlineReplenishmentPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnlineReplenishmentPlaceholders {
    public By communicationServicesPhoneNumber = By.xpath
            ("//input[@id='connection-phone']");
    public By communicationServicesSum = By.xpath
            ("//input[@id='connection-sum']");
    public By communicationServicesEmail = By.xpath
            ("//input[@id='connection-email']");
    public By anOptionButton = By.xpath
            ("//button[@class='select__header']");
    public By choosingAnOptionHomeInternet = By.xpath
            ("//p[@class='select__option' and contains (text(), 'Домашний интернет')]");
    public By homeInternetSubscriberNumber = By.xpath
            ("//input[@id='internet-phone']");
    public By homeInternetSum = By.xpath
            ("//input[@id='internet-sum']");
    public By homeInternetEmail = By.xpath
            ("//input[@id='internet-email']");
    public By choosingAnOptionInstallment = By.xpath
            ("//p[@class='select__option' and contains (text(), 'Рассрочка')]");
    public By installmentAccountNumber = By.xpath
            ("//input[@id='score-instalment']");
    public By installmentSum = By.xpath
            ("//input[@id='instalment-sum']");
    public By installmentEmail = By.xpath
            ("//input[@id='instalment-email']");
    public By choosingAnOptionArrears = By.xpath
            ("//p[@class='select__option' and contains (text(), 'Задолженность')]");
    public By arrearsAccountNumber = By.xpath
            ("//input[@id='score-arrears']");
    public By arrearsSum = By.xpath
            ("//input[@id='arrears-sum']");
    public By arrearsEmail = By.xpath
            ("//input[@id='arrears-email']");

    private WebDriver driver;
    private WebDriverWait wait;

    public OnlineReplenishmentPlaceholders(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String placeholderCommunicationServicesPhoneNumber() {
        return driver.findElement(communicationServicesPhoneNumber).getAttribute("placeholder");
    }

    public String placeholderCommunicationServicesSum() {
        return driver.findElement(communicationServicesSum).getAttribute("placeholder");
    }

    public String placeholderCommunicationServicesEmail() {
        return driver.findElement(communicationServicesEmail).getAttribute("placeholder");
    }

    public void clickAnOptionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(anOptionButton)).click();
    }

    public void clickAnOptionHomeInternet() {
        driver.findElement(choosingAnOptionHomeInternet).click();
    }

    public String placeholderHomeInternetSubscriberNumber() {
        return driver.findElement(homeInternetSubscriberNumber).getAttribute("placeholder");
    }

    public String placeholderHomeInternetSum() {
        return driver.findElement(homeInternetSum).getAttribute("placeholder");
    }

    public String placeholderHomeInternetEmail() {
        return driver.findElement(homeInternetEmail).getAttribute("placeholder");
    }

    public void clickAnOptionInstallment() {
        driver.findElement(choosingAnOptionInstallment).click();
    }

    public String placeholderInstallmentAccountNumber() {
        return driver.findElement(installmentAccountNumber).getAttribute("placeholder");
    }

    public String placeholderInstallmentSum() {
        return driver.findElement(installmentSum).getAttribute("placeholder");
    }

    public String placeholderInstallmentEmail() {
        return driver.findElement(installmentEmail).getAttribute("placeholder");
    }

    public void clickAnOptionArrears() {
        driver.findElement(choosingAnOptionArrears).click();
    }

    public String placeholderArrearsAccountNumber() {
        return driver.findElement(arrearsAccountNumber).getAttribute("placeholder");
    }

    public String placeholderArrearsSum() {
        return driver.findElement(arrearsSum).getAttribute("placeholder");
    }

    public String placeholderArrearsEmail() {
        return driver.findElement(arrearsEmail).getAttribute("placeholder");
    }
}
