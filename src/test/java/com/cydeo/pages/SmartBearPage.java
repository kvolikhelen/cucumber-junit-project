package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement loginButton;


    //input[@id='ctl00_MainContent_fmwOrder_txtName']


}


