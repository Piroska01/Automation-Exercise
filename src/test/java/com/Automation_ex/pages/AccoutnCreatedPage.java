package com.Automation_ex.pages;

import com.Automation_ex.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AccoutnCreatedPage extends BasePage {

    public AccoutnCreatedPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(linkText = "Continue")
    public WebElement continueButton;
}

