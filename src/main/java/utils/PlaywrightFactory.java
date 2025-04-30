package utils;

import com.microsoft.playwright.*;
import java.util.Properties;

public class PlaywrightFactory {
    BrowserContext context;
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;

    public Page initBrowser(Properties prop) {
        playwright = Playwright.create();
        String browserName = prop.getProperty("browser").toLowerCase();

        if (browserName.equals("chrome") || browserName.equals("chromium")) {
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }

        context = browser.newContext();
        page = context.newPage();
        page.navigate(prop.getProperty("baseUrl"));
        return page;
    }
    public static Page getPage() {
        if (playwright == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            page = browser.newPage();
        }
        return page;
    }
}