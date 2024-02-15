package com.Automation_ex.pages;

import com.Automation_ex.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountInfoPage extends BasePage {

    public AccountInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
       @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement accountText;

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement title;

  @FindBy(xpath = "//input[@data-qa ='name']")
    public WebElement nameField;

  @FindBy(xpath = "//input[@id='email']")
    public WebElement emailField;

  @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

  @FindBy(id = "days")
    public WebElement dayCalendar;

  @FindBy(id = "months")
    public WebElement monthCalendar;

  @FindBy(id = "years")
    public WebElement yearCalendar;
  @FindBy(xpath = "//input[@name='newsletter']")
    public WebElement newsLetterCheckBox;

  @FindBy(xpath = "//input[@name='optin']")
    public WebElement receiveEmailBox;

  @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstName;

  @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

  @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

  @FindBy(xpath = "//input[@id='address1']")
    public WebElement address;

  @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

  @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

  @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

  @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

  @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;
 @FindBy(xpath = "//input[@id='mobile_number']")
 public WebElement mobilNumber;
  @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccountButton;
    }


