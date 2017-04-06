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
public class PlanarStructure_27 extends TestProcedures {

    SelenideElement PlanarTypeValue = $(byXpath(".//*[@id='planar_structure_type_id']/div[1]/div[2]"));//Тип(Наименование)
    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[2]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement TerritoryClassValue = $(byXpath(".//*[@id='territory_class_id']/div[1]/div[2]"));//Класс территории
    SelenideElement CoatingTypeValue = $(byXpath(".//*[@id='coating_type_id']/div[1]/div[2]"));//Вид покрытия
    SelenideElement TotalArea = $("#total_area");//Общая площадь
    SelenideElement ManualCleanArea = $("#manual_clean_area");//Площадь ручной уборки
    SelenideElement AutoCleanArea = $("#auto_clean_area");//Площадь механизированной уборки
    SelenideElement AbutmentTypeValue = $(byXpath(".//*[@id='abutment_type_id']/div[1]/div[2]"));//Вид сопряжения (наименование)
    SelenideElement PlantingsTypeValue = $(byXpath(".//*[@id='plantings_type_id']/div[1]/div[2]"));//Вид озеленения
    SelenideElement Distance = $("#distance");//Протяженность сопряжения
    SelenideElement PlantingArea = $("#planting_area");//Площадь озеленения
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
    public void planarStructure()  {
        clickPlanarStructure_27();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#parent_name\").offset().top }, 1000);");
        $(byXpath(".//*[@id='characteristics']/div/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[3]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[4]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[5]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div/div[3]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div/div[4]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div/div[5]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();


    }

    @Test
    public void requiredParametersPlanarStructure() {
        clickPlanarStructure_27();
        createObject();
        PlanarTypeValue.waitUntil(visible,15000).click();
        $(byText("Площадка отдыха")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#parent_name\").offset().top }, 1000);");
        TerritoryClassValue.waitUntil(visible,15000).click();
        $(byText("3 класс")).click();
        TotalArea.waitUntil(visible,15000).sendKeys("185");
        ManualCleanArea.waitUntil(visible,15000).sendKeys("30");
        AutoCleanArea.waitUntil(visible,15000).sendKeys("25");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewPlanarStructureProject() {
        clickPlanarStructure_27();
        Id_or_Name.sendKeys("3404460");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404460")).click();
        Header_Card.shouldHave(text("Площадка отдыха"));
    }

    @Test
    public void PlanarStructureAllFields() {
        clickPlanarStructure_27();
        Id_or_Name.sendKeys("3404555");
        Search_Button.click();
        $(byText("3404555")).click();
        Header_Card.shouldHave(text("Спортивная площадка ID 3404555"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        PlanarTypeValue.shouldHave(text("Спортивная площадка"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        TerritoryClassValue.shouldHave(text("2 класс"));
        CoatingTypeValue.shouldHave(text("Резиновое покрытие"));
        assertTrue("Проверка Общая площадь", TotalArea.getValue().contains("456783"));
        assertTrue("Проверка Площадь ручной уборки", ManualCleanArea.getValue().contains("23654"));
        assertTrue("Проверка Площадь механизированной уборки", AutoCleanArea.getValue().contains("12654"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#distance\").offset().top }, 1000);");
        AbutmentTypeValue.shouldHave(text("Булыжник"));
        PlantingsTypeValue.shouldHave(text("Кустарник"));
        assertTrue("Проверка Протяженность сопряжения", Distance.getValue().contains("438764"));
        assertTrue("Проверка Площадь озеленения", PlantingArea.getValue().contains("237894"));
        assertTrue("Проверка Перемещения снега на свободные площади", SnowFreeArea.getValue().contains("1475432"));
        assertTrue("Проверка Перемещения снега на места промежуточного размещения", SnowTempArea.getValue().contains("2468764"));
        assertTrue("Проверка Перемещения снега для последующей погрузки и вывоза из куч: 0 м²", SnowRemovalArea.getValue().contains("3401258"));
        assertTrue("Проверка Характеристики", Property.getValue().contains("тестовыехарактеристики"));

    }
}
