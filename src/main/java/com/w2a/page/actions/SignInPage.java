package com.w2a.page.actions;

import com.w2a.base.Page;
import com.w2a.page.locators.SignInPageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SignInPage extends Page {

    public SignInPageLocators sign ;
    public SignInPage(){
        this.sign = new SignInPageLocators() ;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,sign);
    }

    public void doLogin(String username, String password){
        //sign.txtboxSignIn.sendKeys(username);
        //sign.txtboxPwd.sendKeys(password);
        //sign.btnSignIn.click();
        type(sign.txtboxSignIn,username);
        type(sign.txtboxPwd,password);
        click(sign.btnSignIn);
    }
}
