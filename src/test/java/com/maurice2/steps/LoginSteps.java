package com.maurice2.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.maurice2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the employee is on the login page")
public void the_employee_is_on_the_login_page() {
    TestRunner.driver.get("File:///Users/mauricekabeireho/_dev/myProject1-automation/api-automation/src/test/resources/web-pages/login-page.html");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("the employee clicks the login button")
public void the_employee_clicks_the_login_button() {
    TestRunner.login.clickButton();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

/* Manager steps are given below */

@When("the manager enters his correct username")
public void the_manager_enters_his_correct_username() {
    TestRunner.login.enterUsername("Lmurungi");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("the manager enters his correct password")
public void the_manager_enters_his_correct_password() {
    TestRunner.login.enterPassword("Automation");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("the manager should be logged in to the manager home page")
public void the_manager_should_be_logged_in_to_the_manager_home_page() {
    TestRunner.Wait.until(ExpectedConditions.titleIs("Manager's Portal"));
        String title =TestRunner.driver.getTitle();
        Assert.assertEquals("Manager's Portal", title);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

    /*
     Tester steps are below
     */

     
    @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username() {
        TestRunner.login.enterUsername("Mkamara");
        // Write code here that turns the phrase above into concrete actions
        //hrow new io.cucumber.java.PendingException();
    }
    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password() {
        TestRunner.login.enterPassword("Automation");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    
    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_tester_home_page() {
        TestRunner.Wait.until(ExpectedConditions.titleIs("Tester Page"));
        String title =TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Page", title);
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
}

