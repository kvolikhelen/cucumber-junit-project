package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();


    @Given("User is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("User enters username {string}")
    public void user_enters_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }

    @When("User enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        webTableLoginPage.loginButton.click();
    }

    @Then("User should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("User enters username {string} and password {string} and logins")
    public void userEntersUsernameAndPasswordAndLogins(String username, String password) {
//        webTableLoginPage.inputUsername.sendKeys(username);
//        webTableLoginPage.inputPassword.sendKeys(password);
//        webTableLoginPage.loginButton.click();

        webTableLoginPage.login(username, password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {

//        webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
//        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));

    }
}
