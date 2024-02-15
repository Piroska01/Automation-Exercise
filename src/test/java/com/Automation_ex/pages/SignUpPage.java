package com.Automation_ex.pages;

import com.Automation_ex.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage{

    public SignUpPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//h2[.=\'New User Signup!\']")
    public WebElement NewUserSignUp;

    @FindBy(name ="name")
    public WebElement name;

    @FindBy(xpath =" //input[@data-qa='signup-email']")
    public WebElement emailAddress;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;

}
