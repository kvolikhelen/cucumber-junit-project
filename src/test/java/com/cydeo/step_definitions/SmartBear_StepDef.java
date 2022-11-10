package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrdersPage;
import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SmartBear_StepDef {

    SmartBearPage smartBearPage = new SmartBearPage();
    SmartBearOrdersPage smartBearOrdersPage = new SmartBearOrdersPage();

    @Given("User is on the SmartBearSoftware page")
    public void user_is_on_the_smart_bear_software_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @When("User enters username")
    public void user_enters_username() {
        smartBearPage.usernameBox.sendKeys(ConfigurationReader.getProperty("Username"));
    }

    @When("User enters password")
    public void user_enters_password() {
        smartBearPage.passwordBox.sendKeys(ConfigurationReader.getProperty("Password"));
    }

    @And("User clicks login Button")
    public void userClicksLoginButton() {
        smartBearPage.loginButton.click();
    }

    @And("User should see Web Orders")
    public void user_should_see_web_orders() {
        Assert.assertEquals("Web Orders", Driver.getDriver().getTitle());
    }


    @And("User goes to Order page")
    public void userGoesToOrderPage() {
        BrowserUtils.sleep(3);
        smartBearOrdersPage.orderPage.click();
    }

    @And("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String productSelection) {
        smartBearOrdersPage.familyAlbumProduct.click();
        BrowserUtils.sleep(2);
    }

    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String quantity) {
        // smartBearOrdersPage.quantity.click();
       // smartBearOrdersPage.quantity.clear();
        smartBearOrdersPage.quantity.sendKeys(quantity);
        BrowserUtils.sleep(2);
    }

    @And("User enters {string} to customer name")
    public void userEntersToCustomerName(String customerName) {
        smartBearOrdersPage.customerName.sendKeys(customerName);
    }

    @And("User enters {string} to street")
    public void userEntersToStreet(String street) {
        smartBearOrdersPage.street.sendKeys(street);
    }

    @And("User enters {string} to city")
    public void userEntersToCity(String city) {
        smartBearOrdersPage.city.sendKeys(city);
    }

    @And("User enters {string} to state")
    public void userEntersToState(String state) {
        smartBearOrdersPage.state.sendKeys(state);
    }

    @And("User enters {string}")
    public void userEnters(String zip) {
        smartBearOrdersPage.zip.sendKeys(zip);

    }

    @And("User selects {string} as card type")
    public void userSelectsAsCardType(String visa) {
        smartBearOrdersPage.visa.click();

    }

    @And("User enters {string} to card number")
    public void userEntersToCardNumber(String cardNumber) {
        smartBearOrdersPage.cardNumber.sendKeys(cardNumber);
    }

    @And("User enters {string} to expiration date")
    public void userEntersToExpirationDate(String expiration) {
        smartBearOrdersPage.expiration.sendKeys(expiration);
        BrowserUtils.sleep(2);
    }

    @And("User clicks process button")
    public void userClicksProcessButton() {
        smartBearOrdersPage.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void userVerifiesIsInTheList(String customerName) {

    }
}
