package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
     driver.manage().window().maximize();
     driver.navigate().to("https://www.polovniautomobili.com/login");

    }


    @Test (priority=3)
    public void successfulLogin() throws InterruptedException{
        //homePage.PrijaviSe().click();
        visibilityWait(loginPage.EmailField());
        if (loginPage.EmailField().getText() != "")
        {
            loginPage.EmailField().sendKeys("ilijasmiljanicbb@gmail.com");
        }
        else
        {
            loginPage.EmailField().clear();
            loginPage.EmailField().sendKeys("ilijasmiljanicbb@gmail.com");
        }
        loginPage.DaljeButton().click();
        visibilityWait(loginPage.PasswordField());
        loginPage.PasswordField().sendKeys("First123.");
        loginPage.LoginButton().click();
        Assert.assertEquals(homePage.ProfileEmail().getText(), "ilijasmiljanicbb@gmail.com");
    }
    @Test (priority=2)
    public void forgottenPassword() throws InterruptedException{
        //homePage.PrijaviSe().click();
        visibilityWait(loginPage.EmailField());
        if (loginPage.EmailField().getText() != "")
        {
            loginPage.EmailField().sendKeys("ilijasmiljanicbb@gmail.com");
        }
        else
        {
            loginPage.EmailField().clear();
            loginPage.EmailField().sendKeys("ilijasmiljanicbb@gmail.com");
        }
        loginPage.DaljeButton().click();
        visibilityWait(loginPage.forgotPassword());
        loginPage.forgotPassword().click();
        loginPage.sendEmail().click();
        visibilityWait(loginPage.messageText());
        Assert.assertTrue(loginPage.messageText().getText().contains("Poslat je e-mail za promenu šifre na unetu adresu"));
        Assert.assertTrue(loginPage.messageText().getText().contains("Ukoliko obaveštenje ne vidiš u okviru Inbox direktorijuma, proveri da li je stiglo u okviru direktorijuma za nepoželjnu poštu (Spam/Junk)"));
    }

    @Test (priority=1)
    public void wrongPassword() throws InterruptedException{
        if (loginPage.EmailField().getText() != "")
        {
            loginPage.EmailField().sendKeys("ilijasmiljanicbb@gmail.com");
        }
        else
        {
            loginPage.EmailField().clear();
            loginPage.EmailField().sendKeys("ilijasmiljanicbb@gmail.com");
        }
        loginPage.DaljeButton().click();
        visibilityWait(loginPage.EmailField());
        visibilityWait(loginPage.PasswordField());
        loginPage.PasswordField().sendKeys("First123");
        loginPage.LoginButton().click();
        Assert.assertTrue(loginPage.wrongPasswordTextMessage().getText().contains("Proveri da li si dobro uneo e-mail i/ili šifru."));
        Assert.assertTrue(loginPage.wrongPasswordTextMessage().getText().contains("Ukoliko si zaboravio šifru za logovanje, možeš je promeniti klikom na link"));
        Assert.assertTrue(loginPage.wrongPasswordTextMessage().getText().contains("Zaboravljena šifra"));
        Assert.assertTrue(loginPage.wrongPasswordTextMessage().getText().contains("Ako imaš nekih nedoumica, možeš saznati više klikom na link "));


    }

}
