package com.Automation_ex.step_definition;

import com.Automation_ex.pages.*;
import com.Automation_ex.utilities.BrowserUtil;
import com.Automation_ex.utilities.ConfigurationReader;
import com.Automation_ex.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase01_Step_Def {
    BasePage basePage = new BasePage() {
};
    SignUpPage signUpPage =new SignUpPage();
    AccountInfoPage accountInfoPage = new AccountInfoPage();
    AccoutnCreatedPage accoutnCreatedPage =new AccoutnCreatedPage();
    LoginPage loginPage =new LoginPage();
    @Given("User is on a homepage")
    public void user_is_on_a_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User verify that home page title is {string}")
    public void userVerifyThatHomePageTitleIsAutomationExercise(String expectedTitle) {

        BrowserUtil.verifyTitleContains(expectedTitle);
    }

    @And("User clicks on Signup \\/ Login button")
    public void userClicksOnSignupLoginButton() {

        signUpPage.signInButton.click();
    }
    @And("User should see  {string} on the webpage")
    public void userShouldSeeOnTheWebpage(String expectedName) {


        String actualName =signUpPage.NewUserSignUp.getText();

        Assert.assertEquals(expectedName, actualName);
    }

    @When("Enter {string} and {string}")
    public void enter_and(String name1, String email) {
        signUpPage.name.sendKeys(name1);
        signUpPage.emailAddress.sendKeys(email);

    }
    @When("Click Signup button")
    public void click_signup_button() {
        signUpPage.signUpButton.click();

    }
    @And("user should see {string}")
    public void userShouldSee(String expectedInfo) {

        String actualInfo= accountInfoPage.accountText.getText();
        Assert.assertEquals(expectedInfo,actualInfo);

    }
    @And("Fill details:  Title, Name, Email, Password, Date of birth Day ,Month, Year")
    public void fillDetailsTitleNameEmailPasswordDateOfBirthDayMonthYear() {

        accountInfoPage.title.click();

        accountInfoPage.passwordBox.sendKeys("Csipike1980$");

        BrowserUtil.sleep(2);

        Select dayDropdown = new Select(accountInfoPage.dayCalendar);
        dayDropdown.selectByVisibleText("1");

        Select monthDropdown = new Select(accountInfoPage.monthCalendar);
        monthDropdown.selectByVisibleText("December");

        Select yearDropdown = new Select(accountInfoPage.yearCalendar);
        yearDropdown.selectByVisibleText("1980");

    }
    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        accountInfoPage.newsLetterCheckBox.click();
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        accountInfoPage.receiveEmailBox.click();
    }
    @And("Fill details: First name , Last name , Company , Address, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {

        accountInfoPage.firstName.sendKeys("Piri");
        accountInfoPage.lastName.sendKeys("Lajos");
        accountInfoPage.company.sendKeys("Csiga Egylet");
        accountInfoPage.address.sendKeys("234 Flower St");
        accountInfoPage.address2.sendKeys("NA");

        Select countryDropdown =new Select(accountInfoPage.country);
        countryDropdown.selectByVisibleText("United States");

        accountInfoPage.state.sendKeys("Florida");
        accountInfoPage.city.sendKeys("New Port Richey");
        accountInfoPage.zipcode.sendKeys("34654");
        accountInfoPage.mobilNumber.sendKeys("723-985-9988");
    }
    @When("Click Create Account button")
    public void click_create_account_button() {
       accountInfoPage.createAccountButton.click();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        accoutnCreatedPage.accountCreatedText.isDisplayed();
    }

    @When("Click Continue button")
    public void click_continue_button() {

        accoutnCreatedPage.continueButton.click();

    }
        @And("Verify that Logged in as username is visible")
        public void verifyThatLoggedInAsUsernameIsVisible() {


            Assert.assertTrue(loginPage.LoginName.isDisplayed());
    }
    @When("Click Delete Account button")
    public void click_delete_account_button() {
     loginPage.deleteAccount.click();

    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {

        Assert.assertTrue(loginPage.deletedText.isDisplayed());
    }
}
