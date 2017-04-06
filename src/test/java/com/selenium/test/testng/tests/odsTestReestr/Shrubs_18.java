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
public class Shrubs_18 extends TestProcedures {

    SelenideElement GreeneryTypeComboBox = $(byXpath(".//*[@id='greenery_type_id']/div[1]/div[2]"));//Тип
    SelenideElement Subtitle_Location = $(byXpath(".//*[@id='characteristics']/div[1]/h2")); // Подзаголовок "МЕСТОПОЛОЖЕНИЕ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Characteristic = $(byXpath(".//*[@id='characteristics']/div[2]/h2")); // Подзаголовок "ХАРАКТЕРИСТИКИ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Side = $("#side");//Сторона
    SelenideElement PlantingTypeComboBox = $(byXpath(".//*[@id='planting_type_id']/div[1]/div[2]"));//Тип посадки
    SelenideElement GreeneryVariety = $(byXpath(".//*[@id='greenery_variety_id']/div[1]/div[2]"));//Вид
    SelenideElement PlanyingArea = $("#planting_area");//Площадь под посадкой, м²
    SelenideElement Quantity = $("#quantity");//Количество в биогруппе, шт.
    SelenideElement Age = $("#age");//Возраст, лет
    SelenideElement SectionNum = $("#section_num");//Местоположение. № улев. уч-ка
    SelenideElement GreenNum = $("#green_num");//Местоположение. № раст.
    SelenideElement Distance = $("#distance");//Протяженность посадки, п. м
    SelenideElement Height = $("#height");//Высота, м
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
    public void shrubsObject()  {
        clickShrubs_18();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void requiredParametersShrubs() {
        clickShrubs_18();
        createObject();
        GreeneryTypeComboBox.waitUntil(visible,15000).click();
        $(byText("Кустарники")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewShrubsProject() {
        clickShrubs_18();
        Id_or_Name.sendKeys("3404689");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404689")).click();
        Header_Card.shouldHave(text("Кустарники"));
    }

    @Test
    public void viewShrubsAllFields() {
        clickShrubs_18();
        Id_or_Name.sendKeys("3404588");
        Search_Button.click();
        $(byText("3404588")).click();
        Header_Card.shouldHave(text("Кустарники ID 3404588"));
        Start_Date.isDisplayed();
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("01.04.2017"));
        End_Date.isDisplayed();
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        GreeneryTypeComboBox.shouldHave(text("Кустарники"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404600_Автотесты. Не трогать!!!"));
        OwnerValue.shouldHave(text("АвД"));
        CustomerValue.shouldHave(text("АвД СЗАО"));
        Subtitle_Location.shouldHave(text("Местоположение"));
        assertTrue("Проверка Сторона", Side.getValue().contains("нет"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#side\").offset().top - 100}, 1000);");
        Subtitle_Characteristic.shouldHave(text("Характеристики"));
        PlantingTypeComboBox.shouldHave(text("Группа"));
        GreeneryVariety.shouldHave(text("Кустарник в группе"));
        assertTrue("Проверка Площадь под посадкой, м²", PlanyingArea.getValue().contains("5398"));
        assertTrue("Проверка Количество в биогруппе, шт.", Quantity.getValue().contains("36845"));
        assertTrue("Проверка Возраст, лет", Age.getValue().contains("572457"));
        assertTrue("Проверка Местоположение. № улев. уч-ка", SectionNum.getValue().contains("уч. 67834"));
        assertTrue("Проверка Местоположение. № раст.", GreenNum.getValue().contains("раст. 7834"));
        assertTrue("Проверка Протяженность посадки, п. м", Distance.getValue().contains("63568"));
        assertTrue("Проверка Высота, м", Height.getValue().contains("65834"));
        assertTrue("Проверка Примечание", Description.getValue().contains("таррто"));

    }
}
