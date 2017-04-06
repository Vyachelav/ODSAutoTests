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
public class LittleForm_37 extends TestProcedures {

    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[2]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement Quantity = $("#quantity");//Кол-во
    SelenideElement UnitValue = $(byXpath(".//*[@id='unit_id']/div[1]/div[2]"));////Единица измерения
    SelenideElement MaterialValue = $(byXpath(".//*[@id='material_id']/div[1]/div[2]"));//Материал
    SelenideElement ZoneValue = $(byXpath(".//*[@id='zone_id']/div[1]/div[2]"));//Принадлежность элемента к зоне территории
    SelenideElement MafTypeValue = $(byXpath(".//*[@id='maf_type_id']/div[1]/div[2]"));//Вид
    SelenideElement MafFormID = $(byXpath(".//*[@id='maf_form_id']/div[1]/div[2]"));//Наименование
    SelenideElement FencesTypeValue = $(byXpath(".//*[@id='fences_type_id']/div[1]/div[2]"));//Тип ограждения (простого или сложного рисунка)
    SelenideElement FencesHeight = $("#fences_height");//Высота, м. (для ограждений)
    SelenideElement Description = $("#description");//Примечание
    SelenideElement Property = $("#property");//Характеристика
    SelenideElement Length = $("#length");//Длина
    SelenideElement Width = $("#width");//Ширина
    SelenideElement Height = $("#height");//Высота
    SelenideElement Producer = $("#producer");//Изготовитель
    SelenideElement PassportNum = $("#passport_num");//№ сертификата







    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void littleForm()  {
        clickLittleForm_37();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[2]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='props']/div[1]/div[2]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersLittleForm() {
        clickLittleForm_37();
        createObject();
        MafTypeValue.waitUntil(visible,15000).click();
        $(byText("Игровое оборудование")).click();
        MafFormID.waitUntil(visible,15000).click();
        $(byText("Лавка (СП-002)")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewLittleFormProject() {
        clickLittleForm_37();
        Id_or_Name.sendKeys("3404410");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404410")).click();
        Header_Card.shouldHave(text("Лавка (СП-002)"));
    }

    @Test
    public void LittleFormAllFields() {
        clickLittleForm_37();
        Id_or_Name.sendKeys("3404580");
        Search_Button.click();
        $(byText("3404580")).click();
        Header_Card.shouldHave(text("Фигура \"Лошадь\" ID 3404580"));
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        MafTypeValue.shouldHave(text("Ограждения газонов"));
        MafFormID.shouldHave(text("Фигура \"Лошадь\""));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#maf_form_id\").offset().top}, 1000);");
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        assertTrue("Проверка Сооружение", Address_List.getValue().contains("ЗАО/Раменки/Ломоносовский просп. 32(адрес)"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        UnitValue.shouldHave(text("Штуки"));
        assertTrue("Проверка Кол-во", Quantity.getValue().contains("3468897"));
        MaterialValue.shouldHave(text("Пластмасс"));
        ZoneValue.shouldHave(text("Зона 1"));
        FencesTypeValue.shouldHave(text("Сигнальное"));
        assertTrue("Проверка Высота, м. (для ограждений)", FencesHeight.getValue().contains("3456776"));
        assertTrue("Проверка Примечание", Description.getValue().contains("тестовое примечание"));
        assertTrue("Проверка Характеристика", Property.getValue().contains("тестовая характеристичка"));
        assertTrue("Проверка Длина", Length.getValue().contains("546783"));
        assertTrue("Проверка Ширина", Width.getValue().contains("345784"));
        assertTrue("Проверка Высота", Height.getValue().contains("346802"));
        assertTrue("Проверка Изготовитель", Producer.getValue().contains("ООО \"Черемушки\""));
        assertTrue("Проверка № сертификата", PassportNum.getValue().contains("5654782342625"));



    }
}
