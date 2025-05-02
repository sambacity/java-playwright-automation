package Base;

import com.microsoft.playwright.Page;
import config.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PlaywrightFactory;

import java.util.Properties;

public class BaseTest {

    protected Page page;
    protected Properties prop;
    protected PlaywrightFactory pf;

    public BaseTest() {
        this.page = PlaywrightFactory.getPage();
    }

    @BeforeMethod
    public void setUp() {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.initProp();
        pf = new PlaywrightFactory();
        page = pf.initBrowser(prop);
    }

    @AfterMethod
    public void tearDown() {
        page.context().browser().close();
    }
}