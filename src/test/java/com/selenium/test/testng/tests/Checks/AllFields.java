package com.selenium.test.testng.tests.Checks;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Vyacheslav on 29.03.2017.
 */
public class AllFields extends TestProcedures {
    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

}
