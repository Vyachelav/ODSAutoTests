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
public class Dts_30 extends TestProcedures {

    SelenideElement DtsTypeValue = $(byXpath(".//*[@id='dts_type_id']/div[1]/div[2]"));//Тип ДТС
    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[2]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement TerritoryClassValue = $(byXpath(".//*[@id='territory_class_id']/div[1]/div[2]"));//Класс территории
    SelenideElement CleanArea = $("#clean_area");//Площадь уборки
    SelenideElement CoatingTypeValue = $(byXpath(".//*[@id='coating_type_id']/div[1]/div[2]"));//Вид покрытия
    SelenideElement TotalArea = $("#total_area");//Общая площадь
    SelenideElement ManualCleanArea = $("#manual_clean_area");//Площадь ручной уборки
    SelenideElement AutoCleanArea = $("#auto_clean_area");//Площадь механизированной уборки
    SelenideElement AbutmentTypeValue = $(byXpath(".//*[@id='abutment_type_id']/div[1]/div[2]"));//
    SelenideElement Distance = $("#distance");//Протяженность сопряжения
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
    public void dtsObject()  {
        clickDts_30();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersDts() {
        clickDts_30();
        createObject();
        DtsTypeValue.waitUntil(visible,15000).click();
        $(byText("Лестница пешеходная")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewDtsProject() {
        clickDts_30();
        Id_or_Name.sendKeys("3404667");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404667")).click();
        Header_Card.shouldHave(text("Лестница пешеходная"));
    }

    @Test
    public void DtsAllFields() {
        clickDts_30();
        Id_or_Name.sendKeys("3404561");
        Search_Button.click();
        $(byText("3404561")).click();
        Header_Card.shouldHave(text("Пешеходная дорожка ID 3404561"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        DtsTypeValue.shouldHave(text("Пешеходная дорожка"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        TerritoryClassValue.shouldHave(text("3 класс"));
        assertTrue("Проверка Площадь уборки", CleanArea.getValue().contains("5672345"));
        CoatingTypeValue.shouldHave(text("Резиновое покрытие"));
        assertTrue("Проверка Общая площадь", TotalArea.getValue().contains("53478674"));
        assertTrue("Проверка Площадь ручной уборки", ManualCleanArea.getValue().contains("54375"));
        assertTrue("Проверка Площадь механизированной уборки", AutoCleanArea.getValue().contains("211216"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#auto_clean_area\").offset().top }, 1000);");
        AbutmentTypeValue.shouldHave(text("Брусчатка"));
        assertTrue("Проверка Протяженность сопряжения", Distance.getValue().contains("467894"));
        assertTrue("Проверка Перемещения снега на свободные площади", SnowFreeArea.getValue().contains("67227"));
        assertTrue("Проверка Перемещения снега на места промежуточного размещения", SnowTempArea.getValue().contains("56834"));
        assertTrue("Проверка Перемещения снега для последующей погрузки и вывоза из куч: 0 м²", SnowRemovalArea.getValue().contains("56893"));
        assertTrue("Проверка Характеристики", Property.getValue().contains("тестовые характеристики"));

    }
}
