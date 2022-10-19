package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wdwait;
    private String emailId="username_header";
    private  String daljeId = "next-step";
    private String passwordId = "password_header";
    private String loginButtonXpath = "//*[@name= 'login']";
    private String forgotPasswordId = "forgot_password";
    private String sandEmailXpath = "//*[text() = 'Pošalji']";
    private String messageId = "activation-link-sent";
    private String facebookLoginXpath = "//*[@title = 'Uloguj se pomoću svog Facebook naloga']";
    private String wrongPasswordMessageXpath = "//*[@class= 'uk-alert uk-alert-danger']";


    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement EmailField() {
        return driver.findElement(By.id(emailId));
    }

    public WebElement DaljeButton() {
        return driver.findElement(By.id(daljeId));
    }

    public WebElement PasswordField() {
        return driver.findElement(By.id(passwordId));
    }

    public WebElement LoginButton() {
        return driver.findElement(By.xpath(loginButtonXpath));
    }

    public WebElement forgotPassword() {return driver.findElement(By.id(forgotPasswordId));}

    public WebElement sendEmail() {
        return driver.findElement(By.xpath(sandEmailXpath));
    }

    public WebElement messageText() {
        return driver.findElement(By.id(messageId));
    }
    public WebElement facebookLogin() {
        return driver.findElement(By.xpath(facebookLoginXpath));
    }
    public WebElement wrongPasswordTextMessage() {
        return driver.findElement(By.xpath(wrongPasswordMessageXpath));
    }

}
