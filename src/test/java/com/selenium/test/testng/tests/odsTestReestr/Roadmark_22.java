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
public class Roadmark_22 extends TestProcedures {


    SelenideElement StandartNum = $("#standard_num");//Поле Номер линии по ГОСТ Р 51256-99
    SelenideElement SubtitleCharacteristics = $(byXpath(".//*[@id='characteristics']/div/h2"));//Подзаголовок Характеристики
    SelenideElement Area = $("#area");//Площадь линий, м²
    SelenideElement Property = $("#property");//Характеристика линии
    SelenideElement LineWidth = $("#line_width");//Ширина линии, см
    SelenideElement Distance = $("#distance");//Протяженность линии, п.м
    SelenideElement MarkMaterialKindValue = $(byXpath(".//*[@id='mark_material_kind_id']/div[1]/div[2]"));//Вид материала разметки
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
    public void roadmarkObject()  {
        clickRoadmark_22();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersRoadMark() {
        clickRoadmark_22();
        createObject();
        StandartNum.waitUntil(visible,15000).sendKeys("ert34t3");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewRoadmarkProject() {
        clickRoadmark_22();
        Id_or_Name.sendKeys("3404669");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404669")).click();
        Header_Card.shouldHave(text("ЛинияПоГост"));
    }

    @Test
    public void BuildingAllFields() {
        clickRoadmark_22();
        Id_or_Name.sendKeys("3404596");
        Search_Button.click();
        $(byText("3404596")).click();
        Header_Card.shouldHave(text("линияж ID 3404596"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("01.04.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        assertTrue("Проверка Номер линии по ГОСТ Р 51256-99",StandartNum.getValue().contains("линияж"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404600_Автотесты. Не трогать!!!"));
        OwnerValue.shouldHave(text("АвД"));
        CustomerValue.shouldHave(text("АвД СЗАО"));
        Characteristics.shouldHave(text("Исходные данные"));
        SubtitleCharacteristics.shouldHave(text("Характеристики"));
        Materials.shouldHave(text("Материалы"));
        assertTrue("Проверка Площадь линий, м²", Area.getValue().contains("354787"));
        assertTrue("Проверка Характеристика линии", Property.getValue().contains("2р35"));
        assertTrue("Проверка Ширина линии, см", LineWidth.getValue().contains("25467"));
        assertTrue("Проверка Протяженность линии, п.м", Distance.getValue().contains("24682"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#line_width\").offset().top - 100}, 1000);");
        MarkMaterialKindValue.shouldHave(text("Нитрокраска"));
        assertTrue("Проверка Примечание", Description.getValue().contains("тимрак"));





    }
}
