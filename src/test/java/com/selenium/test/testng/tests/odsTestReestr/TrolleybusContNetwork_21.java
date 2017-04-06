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
public class TrolleybusContNetwork_21 extends TestProcedures {

    SelenideElement NetElementTypeComboBox =  $(byXpath(".//*[@id='net_element_type_id']/div[1]/div[2]"));//Тип
    SelenideElement Subtitle_Location = $(byXpath(".//*[@id='characteristics']/div[1]/h2")); // Подзаголовок "МЕСТОПОЛОЖЕНИЕ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Characteristic = $(byXpath(".//*[@id='characteristics']/div[2]/h2")); // Подзаголовок "ХАРАКТЕРИСТИКИ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Area = $(byXpath(".//*[@id='characteristics']/div[3]/h2")); // Подзаголовок "ПЛОЩАДЬ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Side = $("#side");//Сторона
    SelenideElement BordBegin = $("#bord_begin");//Начало, м
    SelenideElement BordEnd = $("#bord_end");//Конец, м
    SelenideElement Quantity = $("#quantity");//Количество контактных сетей, шт.
    SelenideElement Distance = $("#distance");//Длина Длина контактных сетей, п.м
    SelenideElement SuspHeight = $("#susp_height");//Высота подвески над проезжей частью, м
    SelenideElement IsIsolatedCheckBox = $("#is_isolated");
    SelenideElement IsIsolatedLabel = $("#characteristics>div>div>div>div>label");
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
    public void trolleybusContNetwork()  {
        clickTrolleybusContNetwork_21();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void requiredParametersTrolleybusContNetwork() {
        clickTrolleybusContNetwork_21();
        createObject();
        NetElementTypeComboBox.waitUntil(visible,15000).click();
        $(byText("Троллейбусные контактные сети")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewTrolleybusContNetworkProject() {
        clickTrolleybusContNetwork_21();
        Id_or_Name.sendKeys("3404685");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404685")).click();
        Header_Card.shouldHave(text("Троллейбусные контактные сети"));
    }

    @Test
    public void TrolleybusContNetworkAllFields()    {
        clickTrolleybusContNetwork_21();
        Id_or_Name.sendKeys("3404594");
        Search_Button.click();
        $(byText("3404594")).click();
        Header_Card.shouldHave(text("Троллейбусные контактные сети ID 3404594"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("01.04.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        NetElementTypeComboBox.shouldHave(text("Троллейбусные контактные сети"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404600_Автотесты. Не трогать!!!"));
        OwnerValue.shouldHave(text("АвД"));
        CustomerValue.shouldHave(text("АвД СЗАО"));
        Subtitle_Location.shouldHave(text("Местоположение"));
        assertTrue("Проверка Сторона", Side.getValue().contains("нечёт"));
        assertTrue("Проверка Начало, м", BordBegin.getValue().contains("52689"));
        assertTrue("Проверка Конец, м", BordEnd.getValue().contains("356345"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Subtitle_Characteristic.shouldHave(text("Характеристики"));
        assertTrue("Проверка Количество путей", Quantity.getValue().contains("687357"));
        assertTrue("Проверка Длина путей, п.м", Distance.getValue().contains("345734"));
        assertTrue("Проверка Высота подвески над проезжей частью, м", SuspHeight.getValue().contains("35684554"));
        IsIsolatedCheckBox.isSelected();
        IsIsolatedLabel.shouldHave(text("В одном уровне"));
        assertTrue("Проверка Примечание", Description.getValue().contains("борарго"));
    }
}
