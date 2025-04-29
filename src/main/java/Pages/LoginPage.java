package Pages;

import com.microsoft.playwright.Locator;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private com.microsoft.playwright.Locator page;
    Locator loginButton = page.locator("//a[contains(text(),\"Log in\")]");
    Locator userName = page.locator("//input[@id=\"loginusername\"]");
    Locator password = page.locator("//input[@id=\"loginpassword\"]");
    Locator loginButtonOnClick = page.locator("//button[@onclick=\"logIn()\"]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserName(){
    }

    public void letsLogin(){
        page.click((Locator.ClickOptions) loginButton);

    }



}

