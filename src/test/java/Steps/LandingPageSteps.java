package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Pages.LandingPage;

public class LandingPageSteps {

    LandingPage landingPage = new LandingPage();

    @Given("user navigates to landing page")
    public void user_navigates_to_landing_page() {
        landingPage.navigateToLandingPage();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        landingPage.validateTitle(expectedTitle);
    }
}