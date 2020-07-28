package com.w2a.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {

    @FindBy(id="signin-loginid")
    public WebElement txtboxSignIn;

    @FindBy(id="signin-password")
    public WebElement txtboxPwd;

    @FindBy(id="submitButton")
    public WebElement btnSignIn;
}
