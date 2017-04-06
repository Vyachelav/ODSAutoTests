
package com.selenium.test.testng.tests;

import com.selenium.test.testng.tests.odsTestReestr.TestProcedures;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
/**
 * Created by Vyacheslav on 16.03.2017.
 */
public class TestLogin extends TestProcedures {

    @BeforeClass
    public void Test111() {
        openLoginPage();
    }
   @Test
    public void wrongLoginPassword() {
        openLoginPage();
        enterLoginPassword("user", "qwerty1");
        $(("#error-message")).shouldHave(text("Неверный логин или пароль"));

    }
    @Test
    public void trueLoginPassword() {
        openLoginPage();
        enterLoginPassword("user", "qwerty");
        $("#nav-user>div>a>span").shouldHave(text("user"));
    }




}
