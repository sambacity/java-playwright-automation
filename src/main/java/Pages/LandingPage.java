package Pages;

import com.microsoft.playwright.Page;
import org.testng.Assert;
import utils.PlaywrightFactory;
import config.ConfigReader;

public class LandingPage {
    Page page;

    public LandingPage() {
        this.page = PlaywrightFactory.getPage();
    }

    public void navigateToLandingPage() {
      page.navigate(ConfigReader.get("url")); // reads from config.properties
    }

    public void validateTitle(String expectedTitle) {
        String actualTitle = page.title();
        Assert.assertEquals(actualTitle, expectedTitle, "Title doesn't match");
    }
}