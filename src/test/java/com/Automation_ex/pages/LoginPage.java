package com.Automation_ex.pages;

import com.Automation_ex.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement emailLogin;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement password;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement LoginButton;

    @FindBy(xpath = "//li[10]//a[1]")
    public WebElement LoginName;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    public WebElement deleteAccount;
}
