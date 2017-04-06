package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vyacheslav on 27.03.2017.
 */
public class Container_26 extends TestProcedures {

    SelenideElement Address_BTI_Value = $(byName("address_list_0"));//Адрес БТИ
    SelenideElement Container_Type_Value = $(byXpath(".//*[@id='container_type_id']/div[1]/div[2]"));//Тип ТКО
    SelenideElement Address_List_Value = $("#address_list");//Уточнение адреса
    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[3]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement ArrangementTypeValue = $(byXpath(".//*[@id='arrangement_type_id']/div[1]/div[2]"));//Вид размещения
    SelenideElement CoatingTypeValue = $(byXpath(".//*[@id='coating_type_id']/div[1]/div[2]"));//Вид покрытия
    SelenideElement Area = $("#area");//Площадь, кв.м
    SelenideElement AddressText = $("#address_text");//Местоположение (адрес)
    SelenideElement Latitude = $("#latitude");//Широта (WGS-84)
    SelenideElement Longitude = $("#longitude");//Долгота (WGS-84)
    SelenideElement AbutmentTypeValue = $(byXpath(".//*[@id='abutment_type_id']/div[1]/div[2]"));//Вид сопряжения
    SelenideElement Distance = $("#distance");//Кол-во, п.м
    SelenideElement MafTypeValue = $(byXpath(".//*[@id='maf_type_id']/div[1]/div[2]"));//Вид МАФ (кровля/ограждение)
    SelenideElement Quantity = $("#quantity");//Кол-во, шт.
    SelenideElement SnowFreeArea = $("#snow_free_area");//Перемещения снега на свободные площади
    SelenideElement SnowTempArea = $("#snow_temp_area");//Перемещения снега на места промежуточного размещения
    SelenideElement SnowRemovalArea = $("#snow_removal_area");//Перемещения снега для последующей погрузки и вывоза из куч: 0 м²
    SelenideElement Property = $("#property");//Характеристики


    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void containerObject()  {
        clickContainer_26();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list_0']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list_0']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersContainer() {
        clickContainer_26();
        createObject();
        Container_Type_Value.waitUntil(visible,15000).click();
        $(byText("Контейнерная площадка")).click();
        Address_BTI_Value.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewContainerProject() {
        clickContainer_26();
        Id_or_Name.sendKeys("3404464");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404464")).click();
        Header_Card.shouldHave(text("Контейнерная площадка"));
    }

    @Test
    public void ContainerAllFields() {
        clickContainer_26();
        Id_or_Name.sendKeys("3404549");
        Search_Button.click();
        $(byText("3404549")).click();
        Header_Card.shouldHave(text("Контейнерная площадка ID 3404549"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        Container_Type_Value.shouldHave(text("Контейнерная площадка"));
        assertTrue("Проверка Адрес БТИ", Address_BTI_Value.getValue().contains("ЗАО/Раменки/Ломоносовский просп. 32(адрес)"));
        assertTrue("Проверка Уточнение адреса", Address_List_Value.getValue().contains("тестовый адрес"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        ArrangementTypeValue.shouldHave(text("открытое"));
        CoatingTypeValue.shouldHave(text("Резиновое покрытие"));
        assertTrue("Проверка Площадь", Area.getValue().contains("576323"));
        assertTrue("Проверка Местоположение(адрес)", AddressText.getValue().contains("тестовое расположение"));
        assertTrue("Проверка Широта (WGS-84)", Latitude.getValue().contains("3434534534"));
        assertTrue("Проверка Долгота (WGS-84)", Longitude.getValue().contains("65656567"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#longitude\").offset().top }, 1000);");
        AbutmentTypeValue.shouldHave(text("Булыжник"));
        assertTrue("Проверка Кол-во, п.м", Distance.getValue().contains("456783"));
        MafTypeValue.shouldHave(text("Ограждения газонов"));
        assertTrue("Проверка Кол-во, шт.", Quantity.getValue().contains("45672"));
        assertTrue("Проверка Перемещения снега на свободные площади", SnowFreeArea.getValue().contains("543674"));
        assertTrue("Проверка Перемещения снега на места промежуточного размещения", SnowTempArea.getValue().contains("653234"));
        assertTrue("Проверка Перемещения снега для последующей погрузки и вывоза из куч: 0 м²", SnowRemovalArea.getValue().contains("5578845"));
        assertTrue("Проверка Характеристики", Property.getValue().contains("тестовые характеристики"));

        }

}
