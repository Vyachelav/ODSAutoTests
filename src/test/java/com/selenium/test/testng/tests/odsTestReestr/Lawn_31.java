package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
import com.selenium.test.testng.tests.odsTestReestr.TestProcedures;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vyacheslav on 27.03.2017.
 */
public class Lawn_31 extends TestProcedures {


    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[1]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement TotalArea = $("#total_area");//Общая площадь газонов, кв.м.
    SelenideElement OrdinaryArea = $("#ordinary_area");//Обыкновенный, кв.м.
    SelenideElement MeadowArea = $("#meadow_area");//Луговой, кв.м.
    SelenideElement GorndArea = $("#grond_area");//Партерный, кв.м.
    SelenideElement SlopeArea = $("#slope_area");//На откосе, кв.м.
    SelenideElement EcoparkArea = $("#ecopark_area");//Газон на ячеистом основании, экопарковки, кв.м.
    SelenideElement OtherArea = $("#other_area");//Проверка Иного типа, кв.м.
    SelenideElement GoodConditionArea = $("#good_condition_area");//Хор. Состояние, кв.м.
    SelenideElement NormalConditionArea = $("#normal_condition_area");//Удовл. состояние, кв.м.
    SelenideElement BadConditionArea = $("#bad_condition_area");//Неудовл. состояние, кв.м.

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void requiredParametersLawn() {
        clickLawn_31();
        createObject();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewLawnProject() {
        clickLawn_31();
        Id_or_Name.sendKeys("3404440");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404440")).click();
        Header_Card.shouldHave(text("Уч. №<неопределено> "));
    }

    @Test
    public void LawnAllFields() {
        clickLawn_31();
        Id_or_Name.sendKeys("3404563");
        Search_Button.click();
        $(byText("3404563")).click();
        Header_Card.shouldHave(text("Уч. №<неопределено> ID 3404563"));
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        assertTrue("Проверка Общая площадь газонов, кв.м.", TotalArea.getValue().contains("5667795"));
        assertTrue("Проверка Обыкновенный, кв.м.", OrdinaryArea.getValue().contains("232452"));
        assertTrue("Проверка Луговой, кв.м.", MeadowArea.getValue().contains("675756"));
        assertTrue("Проверка Партерный, кв.м.", GorndArea.getValue().contains("23474"));
        assertTrue("Проверка На откосе, кв.м.", SlopeArea.getValue().contains("758214"));
        assertTrue("Проверка Газон на ячеистом основании, экопарковки, кв.м.", EcoparkArea.getValue().contains("56732"));
        assertTrue("Проверка Иного типа, кв.м.", OtherArea.getValue().contains("343478"));
        assertTrue("Проверка Хор. Состояние, кв.м.", GoodConditionArea.getValue().contains("935822"));
        assertTrue("Проверка Удовл. состояние, кв.м.", NormalConditionArea.getValue().contains("547984"));
        assertTrue("Проверка Неудовл. состояние, кв.м.", BadConditionArea.getValue().contains("5689322"));

    }


}
