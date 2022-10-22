package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;
    private String prijaviSeXpath ="//span[text() = 'Moj profil']";
    private String profileEmailXpath= "//*[@class= 'ym-hide-content']";
    private String searchTextBoxXpath = "//*[@class='search-txt']";


    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement PrijaviSe() {
        return driver.findElement(By.xpath(prijaviSeXpath));
    }

    public WebElement ProfileEmail() {
        return driver.findElement(By.xpath(profileEmailXpath));
    }

    public WebElement searchTextBox() {
        return driver.findElements(By.xpath(searchTextBoxXpath)).get(0);
    }



}
