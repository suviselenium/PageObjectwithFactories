package com.w2a.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageLocators {

    @FindBy(xpath="//ul[@id='uitk-tabs-button-container']/li[2]/a")
    public WebElement flightTab;

    //Locators for flight booking
    @FindBy(xpath="//ul[@id='uitk-tabs-button-container']/div/li/a")
    public WebElement tabReturn;

    @FindBy(xpath="//*[@id=\"location-field-leg1-origin-input\"]")
    public WebElement txtboxLeavingFrom;

    @FindAll({
        @FindBy(css="location-field-leg1-origin-menu"),
        @FindBy(css=".uitk-typeahead-menu uitk-menu uitk-menu-mounted")
    })
    public WebElement txtBoxLeaving;

    @FindAll({
            @FindBy(css="location-field-leg1-destination-menu"),
            @FindBy(css=".uitk-typeahead-menu uitk-menu uitk-menu-mounted")
    })
    public WebElement txtBoxGoing;


    @FindBy(xpath="//div[@id='location-field-leg1-destination-menu']/div/input")
    public WebElement txtboxGoingTo;

    @FindBy(id="d1-btn")
    public WebElement btnDepartingDate;

    @FindBy(id="d2-btn")
    public WebElement btnReturningDate;

    @FindBy(xpath="//button[@data-testid='submit-button']")
    public WebElement btnSearch;

    @FindBy(xpath ="//h3[@class='uitk-error-summary-heading']")
    public WebElement txtErrorMessage;

    @FindBy(css="li[role='presentation']")
    public List<WebElement> tabCount;





}
