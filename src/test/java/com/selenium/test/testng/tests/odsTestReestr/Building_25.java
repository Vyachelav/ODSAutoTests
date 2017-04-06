package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;


/**
 * Created by Vyacheslav on 27.03.2017.
 */
public class Building_25 extends TestProcedures {

    SelenideElement Building_Type_Value = $(byXpath(".//*[@id='buildings_type_id']/div[1]/div[2]"));//Назначение (тип)
    SelenideElement Address_BTI_Value = $(byName("address_list"));//Адрес БТИ
    SelenideElement Build_Area = $ ("#build_area");//Площадь застройки
    SelenideElement Floor_Qty = $ ("#floor_qty");//Этажность
    SelenideElement Blind_Area = $ ("#blind_area");//Отмостка
    SelenideElement Property = $ ("#property");//Характеристика
    SelenideElement Architecture_Color = $ ("#architecture_color");//Колористическое решение
    SelenideElement Architecture_Lighting = $ ("#architecture_lighting");//Архитектурно-худож. освещение


    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void buildingObject()  {
        clickBuilding_25();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersBuilding() {
        clickBuilding_25();
        createObject();
        Building_Type_Value.waitUntil(visible,15000).click();
        $(byText("Спортивное")).click();
        Address_BTI_Value.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносова улица")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewBuildingProject() {
        clickBuilding_25();
        Id_or_Name.sendKeys("3404470");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404470")).click();
        Header_Card.shouldHave(text("Учебное"));
    }

    @Test
    public void BuildingAllFields() {
        clickBuilding_25();
        Id_or_Name.sendKeys("3404539");
        Search_Button.click();
        $(byText("3404539")).click();
        Header_Card.shouldHave(text("Жилое ID 3404539"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        Building_Type_Value.shouldHave(text("Жилое"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        assertTrue("Проверка Адрес БТИ", Address_BTI_Value.getValue().contains("ЗАО/Раменки/Ломоносовский пр.(улица)"));
        assertTrue("Проверка Площадь застройки",Build_Area.getValue().contains("837456"));
        assertTrue("Проверка Этажность",Floor_Qty.getValue().contains("54398"));
        assertTrue("Проверка Отмостки",Blind_Area.getValue().contains("3187"));
        assertTrue("Проверка Характеристика",Property.getValue().contains("тестовая"));
        assertTrue("Проверка Колористическое решение",Architecture_Color.getValue().contains("супер-пупер зеленый"));
        assertTrue("Проверка Архитектурно-худож. освещение",Architecture_Lighting.getValue().contains("Видно но не всем"));


    }
}
