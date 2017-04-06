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
import static com.codeborne.selenide.Selenide.executeJavaScript;

*/
/**
 * Created by Vyacheslav on 27.03.2017.
 *//*

public class Carriageway_13 extends TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void carriagewayObject()  {
        clickCarriageway_13();
        objectNull();
        $(byXpath("./*/
/*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*/
/*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        $(byXpath("./*/
/*[@id='characteristics']/div[2]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*/
/*[@id='characteristics']/div[3]/div[1]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*/
/*[@id='characteristics']/div[3]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void requiredParametersCarriageway() {
        clickCarriageway_13();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("ПЧ.Примыкание")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Covering_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Щебеночное")).click();
        Area.waitUntil(visible,15000).setValue("5");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewCarriagewayProject() {
        clickCarriageway_13();
        Id_or_Name.sendKeys("2268940");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268940")).click();
        Header_Card.shouldHave(text("ПЧ.Основная"));
    }

    @Test
    public void viewCarriagewayApproved() {
        clickCarriageway_13();
        Id_or_Name.sendKeys("1142436");
        Search_Button.click();
        $(byText("1142436")).click();
        Header_Card.shouldHave(text("ПЧ.Въезд"));
    }
}
*/
