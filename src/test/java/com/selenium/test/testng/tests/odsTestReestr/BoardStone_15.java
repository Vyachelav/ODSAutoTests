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

public class BoardStone_15 extends TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void boardStone()  {
        clickBoardStone_15();
        objectNull();
        $(byXpath("./*/
/*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*/
/*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void requiredBoardStone() {
        clickBoardStone_15();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Бортовой камень")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewBoardStoneProject() {
        clickBoardStone_15();
        Id_or_Name.sendKeys("2268941");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268941")).click();
        Header_Card.shouldHave(text("Бортовой камень"));
    }

    @Test
    public void viewBoardStoneApproved() {
        clickBoardStone_15();
        Id_or_Name.sendKeys("1142446");
        Search_Button.click();
        $(byText("1142446")).click();
        Header_Card.shouldHave(text("Бортовой камень"));
    }
}
*/
