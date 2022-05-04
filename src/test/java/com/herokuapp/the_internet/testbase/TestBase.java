package com.herokuapp.the_internet.testbase;

import com.herokuapp.the_internet.propertyreader.PropertyReader;
import com.herokuapp.the_internet.utility.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase extends Utility {
    String browser= PropertyReader.getInstance().getProperty("browser");
    @BeforeTest
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterClass
    public void tearDown(){
        closeBrowser();
    }


}
