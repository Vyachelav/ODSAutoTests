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
public class TramRails_20 extends TestProcedures {

    SelenideElement NetElementTypeComboBox =  $(byXpath(".//*[@id='net_element_type_id']/div[1]/div[2]"));//Тип
    SelenideElement Subtitle_Location = $(byXpath(".//*[@id='characteristics']/div[1]/h2")); // Подзаголовок "МЕСТОПОЛОЖЕНИЕ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Characteristic = $(byXpath(".//*[@id='characteristics']/div[2]/h2")); // Подзаголовок "ХАРАКТЕРИСТИКИ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Area = $(byXpath(".//*[@id='characteristics']/div[3]/h2")); // Подзаголовок "ПЛОЩАДЬ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Side = $("#side");//Сторона
    SelenideElement BordBegin = $("#bord_begin");//Начало, м
    SelenideElement BordEnd = $("#bord_end");//Конец, м
    SelenideElement Quantity = $("#quantity");//Количество путей
    SelenideElement Distance = $("#distance");//Длина путей, п.м
    SelenideElement SuspHeight = $("#susp_height");//Высота подвески над проезжей частью, м
    SelenideElement PathCoveringType = $(byXpath(".//*[@id='path_covering_type_id']/div[1]/div[2]"));//Тип покрытия на трамвайных путях
    SelenideElement ConnCoveringType = $(byXpath(".//*[@id='conn_covering_type_id']/div[1]/div[2]"));//Тип покрытия на сопряжении с проезжей частью
    SelenideElement IsIsolatedCheckBox = $("#is_isolated");
    SelenideElement IsIsolatedLabel = $("#characteristics>div>div>div>div>label");
    SelenideElement Area = $("#area");//Площадь, м²
    SelenideElement AutoCleanArea = $("#auto_clean_area");//Площадь уборки мех., м²
    SelenideElement ManualCleanArea = $("#manual_clean_area");//Площадь уборки ручн., м²
    SelenideElement SnowArea = $("#snow_area");//Площадь вывоза снега, м²
    SelenideElement RotorArea = $("#rotor_area");//Площадь роторной перекидки, м²
    SelenideElement ReagentArea = $("#reagent_area");//Площадь обработки реагентами, м²
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
    public void tramRails() {
        clickTramRails_20();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersTram_rails() {
        clickTramRails_20();
        createObject();
        NetElementTypeComboBox.waitUntil(visible,15000).click();
        $(byText("Трамвайные пути (обособленные)")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewTramRailsProject() {
        clickTramRails_20();
        Id_or_Name.sendKeys("3404683");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404683")).click();
        Header_Card.shouldHave(text("Трамвайные пути (обособленные)"));
    }

    @Test
    public void TramRailsAllFields()    {
        clickTramRails_20();
        Id_or_Name.sendKeys("3404592");
        Search_Button.click();
        $(byText("3404592")).click();
        Header_Card.shouldHave(text("Трамвайные пути (обособленные) ID 3404592"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("01.04.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        NetElementTypeComboBox.shouldHave(text("Трамвайные пути (обособленные)"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404600_Автотесты. Не трогать!!!"));
        OwnerValue.shouldHave(text("АвД"));
        CustomerValue.shouldHave(text("АвД СЗАО"));
        Subtitle_Location.shouldHave(text("Местоположение"));
        assertTrue("Проверка Сторона", Side.getValue().contains("нечёт"));
        assertTrue("Проверка Начало, м", BordBegin.getValue().contains("542547"));
        assertTrue("Проверка Конец, м", BordEnd.getValue().contains("54268"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Subtitle_Characteristic.shouldHave(text("Характеристики"));
        Subtitle_Area.shouldHave(text("Площадь"));
        assertTrue("Проверка Количество путей", Quantity.getValue().contains("35682"));
        assertTrue("Проверка Длина путей, п.м", Distance.getValue().contains("467835"));
        assertTrue("Проверка Высота подвески над проезжей частью, м", SuspHeight.getValue().contains("678245"));
        PathCoveringType.shouldHave(text("Специальное покрытие"));
        ConnCoveringType.shouldHave(text("цементная плитка"));
        IsIsolatedCheckBox.isSelected();
        IsIsolatedLabel.shouldHave(text("В одном уровне"));
        assertTrue("Проверка Площадь, м²", Area.getValue().contains("56773"));
        assertTrue("Проверка Площадь уборки мех., м²", AutoCleanArea.getValue().contains("56893"));
        assertTrue("Проверка Площадь уборки ручн., м²", ManualCleanArea.getValue().contains("78348"));
        assertTrue("Проверка Площадь вывоза снега, м²", SnowArea.getValue().contains("636779"));
        assertTrue("Проверка Площадь роторной перекидки, м²", RotorArea.getValue().contains("666782"));
        assertTrue("Проверка Площадь обработки реагентами, м²", ReagentArea.getValue().contains("357356"));
        assertTrue("Проверка Примечание", Description.getValue().contains("Текст5"));



    }
}
