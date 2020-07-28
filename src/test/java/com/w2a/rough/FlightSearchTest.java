package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.page.actions.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FlightSearchTest {


    public static void main(String[] args) {
        Page.initConfiguration();
        HomePage home = new HomePage();
        home.gotoFlights().bookAFlight("Pune (PNQ-Lohegaon)","Concord, NC (USA-Concord Regional)");
        Page.quitBrowser();
    }
    public void doFlightSearch(){

    }
}
