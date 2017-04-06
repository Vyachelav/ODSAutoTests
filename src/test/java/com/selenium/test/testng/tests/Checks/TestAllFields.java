package com.selenium.test.testng.tests.Checks;

import com.selenium.test.testng.tests.odsTestReestr.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
/**
 * Created by Vyacheslav on 24.03.2017.
 */
public class TestAllFields extends com.selenium.test.testng.tests.odsTestReestr.TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void Improvement_Territory_All_Fields() {
        clickODH_1();

    }
}
