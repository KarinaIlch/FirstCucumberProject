package com.ilcarro.stepDefinition;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters correct data")
    public void enter_correct_data() {
        new LoginPage(driver).enterData("rita@gma.de", "rIta12345*");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla() {
        new LoginPage(driver).clickOnYalla();
    }

    @Then("User verifies SuccessMessage is displayed")
    public void verify_Success() {
        new LoginPage(driver).verifyMessage("Logged in success");
    }

    @And("User enters correct email and wrong password")
    public void enter_wrong_password(DataTable table){
        new LoginPage(driver).enterWrongPassword(table);
    }

    @Then ("User verifies ErrorMessage is displayed")
    public void verify_error() {
        new LoginPage(driver).verifyMessage("Login or Password incorrect");
    }

}