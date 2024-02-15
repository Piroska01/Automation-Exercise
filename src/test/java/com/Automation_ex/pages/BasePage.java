package com.Automation_ex.pages;

import com.Automation_ex.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement homepage;

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signInButton;
}
