package com.w2a.page.locators;

import com.w2a.base.Page;
import com.w2a.page.actions.TopNavigations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TopNavigationLocators {

        @FindBy(xpath = "//div[@id='gc-custom-header-nav-bar-acct-menu']/button")
        public WebElement btnSignIn;

        @FindBy(xpath="//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div/div/div/div[1]/div/div/a[1]")
        public WebElement linkSignIn;

        @FindBy(xpath="//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div/div/div/div[1]/div/div/a[2]")
        public WebElement linkCreateAccount;
}
