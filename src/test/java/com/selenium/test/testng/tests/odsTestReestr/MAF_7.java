/*
package com.selenium.test.testng.tests.odsTestReestr;

import com.selenium.test.testng.tests.odsTestReestr.TestProcedures;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

*/
/**
 * Created by Vyacheslav on 27.03.2017.
 *//*

public class MAF_7 extends TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void mafObject()  {
        clickMaf_7();
        objectNull();
        $(byXpath("./*/
/*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*/
/*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void requiredParametersMAF() {
        clickMaf_7();
        createObject();
        Conv_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Биотуалет")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewMafProject() {
        clickMaf_7();
        Id_or_Name.sendKeys("2269174");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269174")).click();
        Header_Card.shouldHave(text("Биотуалет"));
    }

    @Test
    public void viewMafApproved() {
        clickMaf_7();
        Id_or_Name.sendKeys("1829006");
        Search_Button.click();
        $(byText("1829006")).click();
        Header_Card.shouldHave(text("Иное"));
    }
}
*/
