package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.page.actions.SignInPage;

public class SignInTest {
    public static void main(String[] args) {
        Page.initConfiguration();
        SignInPage signin = Page.top.gotoSignIn();
        signin.doLogin("abcd@gmail.com","Test1234");
        Page.quitBrowser();
    }
}
