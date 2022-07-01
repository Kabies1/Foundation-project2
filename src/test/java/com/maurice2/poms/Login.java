package com.maurice2.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;



public class Login {
    private WebDriver driver;

    @FindBy (id = "userName")
    public WebElement usernameInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (tagName = "button")
    public WebElement loginButton;
    
    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this); // this initializes the private driver field

        /*
         The PageFactory class is provided by selenium and it abstracts away from us the code that handles initializing 
         our webElement fields. We simply provide the initElements ()
         */
    }
public void enterUsername(String userName){

        // to enter a username into the input element we use sendKey() below
    this.usernameInput.sendKeys(userName);
}

public void enterPassword(String password){

  //to enter the password into the input element we use sendKey() below
    this.passwordInput.sendKeys(password);

}
public void clickButton(){
    // to click on an element you just use for the click() method
    this.loginButton.click();
    
}

}
