package com.w2a.testcases;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.page.actions.HomePage;
import com.w2a.utilities.Utilities;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class FlightSearchTest {

    @BeforeTest
    public void setUp(){

        Page.initConfiguration();
    }
    @Test(dataProviderClass = Utilities.class,dataProvider = "dp")
    public  void flightSearchTest(Hashtable<String,String> data) {
        if(data.get("runmode").equalsIgnoreCase("No")){
            throw new SkipException("Skipping the test as runmode is set to know");
        }
        HomePage home = new HomePage();

        //Assert.assertEquals(home.findTabCount(),5);
        ErrorCollector.verifyEquals(home.findTabCount(),7);
        home.gotoFlights().bookAFlight(data.get("LeavingFrom"),data.get("GoingTo"));

    }
    public void doFlightSearch(){

    }

    @AfterTest
    public void quit(){

        Page.quitBrowser();
    }
}
