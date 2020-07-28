package com.w2a.page.actions;

import com.w2a.base.Page;
import com.w2a.page.locators.TopNavigationLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TopNavigations {
    public TopNavigationLocators top;

    public TopNavigations(WebDriver driver){
        this.top = new TopNavigationLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,top);
    }

    public SignInPage gotoSignIn(){
        top.btnSignIn.click();
        top.linkSignIn.click();
        Page.click(top.btnSignIn);
        Page.click(top.linkSignIn);


        return new SignInPage();
    }


    public void gotoCreateAccount(){

    }

    public void gotoList(){

    }

    public void gotoSupport(){

    }

    public void gotoTrips(){

    }
}
