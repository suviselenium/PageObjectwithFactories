package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.page.actions.SignInPage;
import com.w2a.utilities.Utilities;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class SignInTest {
    @BeforeTest
    public void setUp(){
        Page.initConfiguration();
    }

    @Test(dataProviderClass = Utilities.class,dataProvider = "dp")
    public  void signinTest(Hashtable<String,String>data) {

        if(data.get("runmode").equalsIgnoreCase("No")){
            throw new SkipException("Skipping the test as runmode is set to know");
        }
        SignInPage signin = Page.top.gotoSignIn();
        signin.doLogin(data.get("username"),data.get("password"));

    }

    @AfterTest
    public void quit(){

        Page.quitBrowser();
    }
}
