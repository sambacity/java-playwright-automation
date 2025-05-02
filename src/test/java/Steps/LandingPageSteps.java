package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Pages.LandingPage;
import io.cucumber.java.en.When;

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

    @And("user clicks on the search bar and searches for {string}")
    public void productNameSearch(String expectedProduct){
        landingPage.productNameSearch(expectedProduct);
    }
    @When("User clicks on the search icon to search the product")
    public void searchIconClicked(){
        landingPage.searchIconClicked();
    }
}