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
public class Lawns_19 extends TestProcedures {

    SelenideElement GreeneryTypeComboBox = $(byXpath(".//*[@id='greenery_type_id']/div[1]/div[2]"));//Тип
    SelenideElement Subtitle_Location = $(byXpath(".//*[@id='characteristics']/div[1]/h2")); // Подзаголовок "МЕСТОПОЛОЖЕНИЕ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Characteristic = $(byXpath(".//*[@id='characteristics']/div[2]/h2")); // Подзаголовок "ХАРАКТЕРИСТИКИ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Side = $("#side");//Сторона
    SelenideElement BordBegin = $("#bord_begin");//Начало, м
    SelenideElement BordEnd = $("#bord_end");//Конец, м
    SelenideElement PlantingTypeComboBox = $(byXpath(".//*[@id='planting_type_id']/div[1]/div[2]"));//Тип посадки
    SelenideElement PlanyingArea = $("#planting_area");//Площадь под посадкой, м²
    SelenideElement WidthBegin = $("#width_begin");//Ширина в начале
    SelenideElement WidthEnd = $("#width_end");//Ширина в начале
    SelenideElement Description = $("#description");//Примечание


    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void lawnsObject()  {
        clickLawns_19();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersLawns() {
        clickLawns_19();
        createObject();
        GreeneryTypeComboBox.waitUntil(visible,15000).click();
        $(byText("Цветники многолетние")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewLawnsProject() {
        clickLawns_19();
        Id_or_Name.sendKeys("3404693");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404693")).click();
        Header_Card.shouldHave(text("Цветники многолетние"));
    }

    @Test
    public void viewTreesAllFields() {
        clickLawns_19();
        Id_or_Name.sendKeys("3404590");
        Search_Button.click();
        $(byText("3404590")).click();
        Header_Card.shouldHave(text("Цветники многолетние ID 3404590"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("01.04.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        GreeneryTypeComboBox.shouldHave(text("Цветники многолетние"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404600_Автотесты. Не трогать!!!"));
        OwnerValue.shouldHave(text("АвД"));
        CustomerValue.shouldHave(text("АвД СЗАО"));
        Subtitle_Location.shouldHave(text("Местоположение"));
        assertTrue("Проверка Сторона", Side.getValue().contains("нет"));
        assertTrue("Проверка Начало, м", BordBegin.getValue().contains("52352"));
        assertTrue("Проверка Конец, м", BordEnd.getValue().contains("678234"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Subtitle_Characteristic.shouldHave(text("Характеристики"));
        PlantingTypeComboBox.shouldHave(text("Группа"));
        assertTrue("Проверка Ширина в начале, м", WidthBegin.getValue().contains("457724"));
        assertTrue("Проверка Ширина в конце, м", WidthEnd.getValue().contains("3568556"));
        assertTrue("Проверка Площадь под посадкой, м²", PlanyingArea.getValue().contains("577932"));
        assertTrue("Проверка Примечание", Description.getValue().contains("енгр"));

    }


}
