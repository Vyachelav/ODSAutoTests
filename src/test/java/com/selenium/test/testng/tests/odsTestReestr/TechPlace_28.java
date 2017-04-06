package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
import com.selenium.test.testng.tests.odsTestReestr.TestProcedures;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vyacheslav on 27.03.2017.
 */
public class TechPlace_28 extends TestProcedures {

    SelenideElement Material_Value = $(byXpath(".//*[@id='material_id']/div[1]/div[2]"));//Материал
    SelenideElement Area = $("#area");//Площадь, кв.м
    SelenideElement PlacementName = $("#placement_name");//Местоположение
    SelenideElement AbutmentTypeValue = $(byXpath(".//*[@id='abutment_type_id']/div[1]/div[2]"));//Вид сопряжения
    SelenideElement Distance = $("#distance");//Протяженность сопряжения
    SelenideElement MafTypeValue = $(byXpath(".//*[@id='maf_type_id']/div[1]/div[2]"));//Вид МАФ
    SelenideElement Quantity = $("#quantity");//Кол-во шт.

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void requiredParametersTechPlace() {
        clickTechPlace_28();
        createObject();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewTechPlaceProject() {
        clickTechPlace_28();
        Id_or_Name.sendKeys("3404458");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404458")).click();
        Header_Card.shouldHave(text("неопределено"));
    }

    @Test
    public void TechPlaceAllFields() {
        clickTechPlace_28();
        Id_or_Name.sendKeys("3404557");
        Search_Button.click();
        $(byText("3404557")).click();
        Header_Card.shouldHave(text("неопределено ID 3404557"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        Material_Value.shouldHave(text("Бетон"));
        assertTrue("Проверка Площадь, кв.м", Area.getValue().contains("5612074"));
        assertTrue("Проверка Местоположение", PlacementName.getValue().contains("справа от теста"));
        AbutmentTypeValue.shouldHave(text("Булыжник"));
        assertTrue("Проверка Протяженность сопряжения", Distance.getValue().contains("57823642"));
        MafTypeValue.shouldHave(text("Ограждения газонов"));
        assertTrue("Проверка Кол-во шт.", Quantity.getValue().contains("4328734"));
    }
}
