package com.w2a.page.actions;

import com.w2a.base.Page;
import com.w2a.page.locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {

    public HomePageLocators home;
    public HomePage(){
        this.home = new HomePageLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,home);
    }
    public void gotoStays(){

    }

    public HomePage gotoFlights(){
        //home.flightTab.click();
        click(home.flightTab);
            return this;
    }

    public void gotoCars(){

    }

    public void gotoPackages(){

    }

    public void gotoThingstodo(){

    }

    public void bookAFlight(String LeavingFrom, String GoingTo){
        home.tabReturn.isDisplayed();
//        home.txtBoxLeaving.click();
  //      home.txtBoxGoing.sendKeys(LeavingFrom);
    //    home.txtboxGoingTo.sendKeys(GoingTo);
        //home.btnSearch.click();
        click(home.btnSearch);
        home.txtErrorMessage.getText().equalsIgnoreCase("To continue, please correct the 2 errors below.");
    }

    public int findTabCount(){

        return home.tabCount.size();
    }
}
