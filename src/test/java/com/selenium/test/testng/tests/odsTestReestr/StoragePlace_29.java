package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
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
public class StoragePlace_29 extends TestProcedures {

    SelenideElement StoragePlaceTypeValue = $(byXpath(".//*[@id='storage_place_type_id']/div[1]/div[2]"));//Тип места хранения
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
    public void storagePlace()  {
        clickStoragePlace_29();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersStoragePlace() {
        clickStoragePlace_29();
        createObject();
        StoragePlaceTypeValue.waitUntil(visible,15000).click();
        $(byText("База хранения ПГМ и инвентаря")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewStoragePlaceProject() {
        clickStoragePlace_29();
        Id_or_Name.sendKeys("3404448");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404448")).click();
        Header_Card.shouldHave(text("База хранения ПГМ и инвентаря"));
    }

    @Test
    public void StoragePlaceAllFields() {
        clickStoragePlace_29();
        Id_or_Name.sendKeys("3404559");
        Search_Button.click();
        $(byText("3404559")).click();
        Header_Card.shouldHave(text("База хранения ПГМ и инвентаря ID 3404559"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        StoragePlaceTypeValue.shouldHave(text("База хранения ПГМ и инвентаря"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        Material_Value.shouldHave(text("Железо"));
        assertTrue("Проверка Площадь, кв.м", Area.getValue().contains("4398654"));
        assertTrue("Проверка Местоположение", PlacementName.getValue().contains("слева от теста"));
        AbutmentTypeValue.shouldHave(text("Булыжник"));
        assertTrue("Проверка Протяженность сопряжения", Distance.getValue().contains("5698453"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#distance\").offset().top }, 1000);");
        MafTypeValue.shouldHave(text("Спортивное оборудование"));
        assertTrue("Проверка Кол-во шт.", Quantity.getValue().contains("4376323"));

    }


}
