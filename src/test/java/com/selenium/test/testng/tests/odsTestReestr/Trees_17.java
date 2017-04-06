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
public class Trees_17 extends TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }


    SelenideElement GreeneryTypeComboBox = $(byXpath(".//*[@id='greenery_type_id']/div[1]/div[2]"));//Тип
    SelenideElement Subtitle_Location = $(byXpath(".//*[@id='characteristics']/div[1]/h2")); // Подзаголовок "МЕСТОПОЛОЖЕНИЕ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Characteristic = $(byXpath(".//*[@id='characteristics']/div[2]/h2")); // Подзаголовок "ХАРАКТЕРИСТИКИ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Side = $("#side");//Сторона
    SelenideElement BordBegin = $("#bord_begin");//Начало, м
    SelenideElement BordEnd = $("#bord_end");//Конец, м
    SelenideElement PlantingTypeComboBox = $(byXpath(".//*[@id='planting_type_id']/div[1]/div[2]"));//Тип посадки
    SelenideElement Name = $("#name");//Наименование вида
    SelenideElement PlanyingArea = $("#planting_area");//Площадь под посадкой, м²
    SelenideElement Quantity = $("#quantity");//Количество, шт.
    SelenideElement Diameter = $("#diameter");//Диаметр на высоте 1,3 м, см
    SelenideElement Age = $("#age");//Возраст, лет
    SelenideElement Description = $("#description");//Примечание

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void treesObject()  {
        clickTrees_17();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersTrees() {
        clickTrees_17();
        createObject();
        GreeneryTypeComboBox.waitUntil(visible,15000).click();
        $(byText("Деревья")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewTreesProject() {
        clickTrees_17();
        Id_or_Name.sendKeys("3404687");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404687")).click();
        Header_Card.shouldHave(text("Деревья"));
    }

    @Test
    public void viewTreesAllFields() {
        clickTrees_17();
        Id_or_Name.sendKeys("3404586");
        Search_Button.click();
        $(byText("3404586")).click();
        Header_Card.shouldHave(text("Деревья ID 3404586"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("01.04.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        GreeneryTypeComboBox.shouldHave(text("Деревья"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404600_Автотесты. Не трогать!!!"));
        OwnerValue.shouldHave(text("АвД"));
        CustomerValue.shouldHave(text("АвД СЗАО"));
        Subtitle_Location.shouldHave(text("Местоположение"));
        assertTrue("Проверка Сторона", Side.getValue().contains("нет"));
        assertTrue("Проверка Начало, м", BordBegin.getValue().contains("56268"));
        assertTrue("Проверка Конец, м", BordEnd.getValue().contains("356723"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Subtitle_Characteristic.shouldHave(text("Характеристики"));
        PlantingTypeComboBox.shouldHave(text("Группа"));
        assertTrue("Проверка Наименование вида", Name.getValue().contains("тополь"));
        assertTrue("Проверка Площадь под посадкой, м²", PlanyingArea.getValue().contains("735689"));
        assertTrue("Проверка Количество, шт.", Quantity.getValue().contains("3567"));
        assertTrue("Проверка Диаметр на высоте 1,3 м, см", Diameter.getValue().contains("57954"));
        assertTrue("Проверка Возраст, лет", Age.getValue().contains("53783"));
        assertTrue("Проверка Примечание", Description.getValue().contains("вававава"));

    }
}
