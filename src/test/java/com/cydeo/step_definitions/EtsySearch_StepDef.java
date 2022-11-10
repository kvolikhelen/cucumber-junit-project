package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyTitleVerification;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsySearch_StepDef {
    EtsyTitleVerification etsyTitleVerification = new EtsyTitleVerification();

    @Given("User is on etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        BrowserUtils.verifyTitle(ConfigurationReader.getProperty("expectedTitle"));
    }

    @When("User types Wooden Spoon in the search box")
    public void userTypesWoodenSpoonInTheSearchBox() {
        etsyTitleVerification.searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        etsyTitleVerification.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void userSeesWoodenSpoonIsInTheTitle() {
        String expected = "Wooden spoon - Etsy";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Title failed", expected, actual);
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKeyword) {
        etsyTitleVerification.searchBox.sendKeys(searchKeyword);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Title failed", expectedTitle, actual);
    }
}
