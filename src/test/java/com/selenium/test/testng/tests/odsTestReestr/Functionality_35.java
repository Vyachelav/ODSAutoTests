package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
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
import static org.junit.Assert.assertTrue;

/**
 * Created by Vyacheslav on 27.03.2017.
 */
public class Functionality_35 extends TestProcedures {

    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[2]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement ArrangementElementTypeValue = $(byXpath(".//*[@id='arrange_element_type_id']/div[1]/div[2]"));//Назначение (тип)
    SelenideElement Quantity = $("#quantity");//Кол-во
    SelenideElement UnitValue = $(byXpath(".//*[@id='unit_id']/div[1]/div[2]"));////Единица измерения
    SelenideElement MaterialValue = $(byXpath(".//*[@id='material_id']/div[1]/div[2]"));//Материал
    SelenideElement ZoneValue = $(byXpath(".//*[@id='zone_id']/div[1]/div[2]"));//Принадлежность элемента к зоне территории
    SelenideElement Property = $("#property");//Характеристика
    SelenideElement Options = $("#options");//Параметры

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void functionalityObject() {
        clickFunctionality_35();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersFunctionality() {
        clickFunctionality_35();
        createObject();
        ArrangementElementTypeValue.waitUntil(visible,15000).click();
        $(byText("Ороситель поливочного водопровода")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewFunctionalityProject() {
        clickFunctionality_35();
        Id_or_Name.sendKeys("3404422");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404422")).click();
        Header_Card.shouldHave(text("Ороситель поливочного водопровода"));
    }


    @Test
    public void FunctionalityAllFields() {
        clickFunctionality_35();
        Id_or_Name.sendKeys("3404571");
        Search_Button.click();
        $(byText("3404571")).click();
        Header_Card.shouldHave(text("Светильники декоративные ID 3404571"));
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        ArrangementElementTypeValue.shouldHave(text("Светильники декоративные"));
        assertTrue("Проверка Сооружение", Address_List.getValue().contains("ЗАО/Раменки/Ломоносовский просп. 32(адрес)"));
        assertTrue("Проверка Кол-во", Quantity.getValue().contains("4352134"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#quantity\").offset().top}, 1000);");
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        UnitValue.shouldHave(text("Метры погонные"));
        MaterialValue.shouldHave(text("Дерево"));
        ZoneValue.shouldHave(text("Зона 3"));
        assertTrue("Проверка Характеристика", Property.getValue().contains("самая тестовая"));
        assertTrue("Проверка Параметры", Options.getValue().contains("самые тестовые"));

    }
}
