package Pages;

import Base.BaseTest;
import com.microsoft.playwright.Locator;
import org.testng.Assert;
import utils.PlaywrightFactory;
import config.ConfigReader;

public class LandingPage extends BaseTest {

    Locator searchBar = page.locator("//input[@type=\"text\"]");
    Locator searchIcon = page.locator("//input[@id=\"nav-search-submit-button\"]");


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
    public void productNameSearch(String expectedProduct) {
        searchBar.click();
        searchBar.fill(expectedProduct);

    }
    public void searchIconClicked() {
        searchIcon.click();
    }
}