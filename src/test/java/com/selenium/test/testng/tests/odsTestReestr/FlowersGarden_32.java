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
public class FlowersGarden_32 extends TestProcedures {


    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[1]/div[2]/div/div/label"));//Не учитывать лейбл
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Чекбокс Не учитывать
    SelenideElement SpecificationTab = $("#specification-tab");//Вкладка Спецификация
    SelenideElement TotalArea = $("#total_area");//Общая площадь цветника, кв.м.
    SelenideElement AnnualsArea = $("#annuals_area");//Однолетники, кв.м.
    SelenideElement PerennialsArea = $("#perennials_area");//Многолетники и розы, кв.м.
    SelenideElement InertArea = $("#inert_area");//Инертный материал (отсыпка), кв.м.
    SelenideElement ShrubsArea = $("#shrubs_area");//Декоративные кустарники, кв.м.
    SelenideElement WithShrubsArea = $("#with_shrubs_area");//С учетом кустарников, кв.м.
    SelenideElement SeasonShiftArea = $("#season_shift_area");//С учетом сезонной сменности, кв.м.
    SelenideElement BulbousArea = $("#bulbous_area");//Луковичные и клубнелуковичные кроме тюльпанов, нарциссов, кв.м.
    SelenideElement TulipArea = $("#tulip_area");//Тюльпаны, нарциссы, кв.м.
    SelenideElement BiennialsArea = $("#biennials_area");//Двулетники (виола), кв.м.
    SelenideElement FlindersArea = $("#flinders_area");//Декорирование щепой, кв.м.
    SelenideElement VaseQty = $("#vase_qty");//Вазоны шт.
    SelenideElement VaseArea = $("#vase_area");//Вазоны кв.м.
    SelenideElement FloorVerticalDesignQty = $("#floor_vertical_design_qty");//Напольные вертикальные конструкции шт.
    SelenideElement FloorVerticalDesignArea = $("#floor_vertical_design_area");//Напольные вертикальные конструкции кв.м.
    SelenideElement SuspendVerticalDesignQty = $("#suspend_vertical_design_qty");//Подвесные вертикальные конструкции шт.
    SelenideElement SuspendVerticalDesignArea = $("#suspend_vertical_design_area");//Подвесные вертикальные конструкции кв.м.
    SelenideElement FlowersVerticalDesignQty = $("#flowers_vertical_design_qty");//Цветочные вертикальные конструкции шт.
    SelenideElement FlowersVerticalDesignArea = $("#flowers_vertical_design_area");//Цветочные вертикальные конструкции кв.м.
    SelenideElement SubtitleSpecification = $("#specification>div>h2");
    SelenideElement SpecificationYear = $("#specification>div>div>h2");
    SelenideElement SpecificationNumber = $(byXpath(".//*[@id='specification']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div/div/div/div"));
    SelenideElement SpecificationPlantingType = $(byXpath(".//*[@id='specification']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div"));
    SelenideElement SpecificationArea = $(byXpath(".//*[@id='specification']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[3]/div/div/div/div"));
    SelenideElement SpecificationQuantity = $(byXpath(".//*[@id='specification']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[4]/div/div/div/div"));
    SelenideElement SpecificationDescription = $(byXpath(".//*[@id='specification']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[5]/div/div/div/div"));


    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void requiredParametersFlowersGarden() {
        clickFlowersGarden_32();
        createObject();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void viewFlowersGardenProject() {
        clickFlowersGarden_32();
        Id_or_Name.sendKeys("3404434");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404434")).click();
        Header_Card.shouldHave(text("Уч. №<неопределено>, раст. №<неопределено>"));
    }

    @Test
    public void FlowersGardenAllFields() {
        clickFlowersGarden_32();
        Id_or_Name.sendKeys("3404565");
        Search_Button.click();
        $(byText("3404565")).click();
        Header_Card.shouldHave(text("Уч. №<неопределено>, раст. №<неопределено> ID 3404565"));
        assertTrue("Проверка Дата С",Start_Date.getValue().contains("29.03.2017"));
        assertTrue("Проверка Дата По",End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        Characteristics.shouldHave(text("Исходные данные"));
        Materials.shouldHave(text("Материалы"));
        SpecificationTab.shouldHave(text("Спецификация"));
        assertTrue("Проверка Имя",Parent_name.getValue().contains("Входит: 3404533_Не трогать Объект для Автотеста"));
        IsConsiderLabel.shouldHave(text("Не учитывать"));
        IsConsiderCheckBox.isDisplayed();
        OwnerValue.shouldHave(text("Жилищник Таганский"));
        CustomerValue.shouldHave(text("Жилищник Бескудниковский"));
        assertTrue("Проверка Общая площадь цветника, кв.м.", TotalArea.getValue().contains("3463657673"));
        assertTrue("Проверка Однолетники, кв.м.", AnnualsArea.getValue().contains("6789907"));
        assertTrue("Проверка Многолетники и розы, кв.м.", PerennialsArea.getValue().contains("546353"));
        assertTrue("Проверка Инертный материал (отсыпка), кв.м.",InertArea.getValue().contains("5685678"));
        assertTrue("Проверка Декоративные кустарники, кв.м.", ShrubsArea.getValue().contains("2347886"));
        assertTrue("Проверка С учетом кустарников, кв.м.", WithShrubsArea.getValue().contains("546241"));
        assertTrue("Проверка С учетом сезонной сменности, кв.м.", SeasonShiftArea.getValue().contains("42734"));
        assertTrue("Проверка Луковичные и клубнелуковичные кроме тюльпанов, нарциссов, кв.м.", BulbousArea.getValue().contains("689956"));
        assertTrue("Проверка Тюльпаны, нарциссы, кв.м.", TulipArea.getValue().contains("214337"));
        assertTrue("Проверка Двулетники (виола), кв.м.", BiennialsArea.getValue().contains("678904"));
        assertTrue("Проверка Декорирование щепой, кв.м.", FlindersArea.getValue().contains("24572"));
        assertTrue("Проверка Вазоны шт.", VaseQty.getValue().contains("23436"));
        assertTrue("Проверка Вазоны кв.м.", VaseArea.getValue().contains("679656"));
        assertTrue("Проверка Напольные вертикальные конструкции шт.", FloorVerticalDesignQty.getValue().contains("23904"));
        assertTrue("Проверка Напольные вертикальные конструкции кв.м.", FloorVerticalDesignArea.getValue().contains("13456567"));
        assertTrue("Проверка Подвесные вертикальные конструкции шт.", SuspendVerticalDesignQty.getValue().contains("234654"));
        assertTrue("Проверка Подвесные вертикальные конструкции кв.м.", SuspendVerticalDesignArea.getValue().contains("34793"));
        assertTrue("Проверка Цветочные вертикальные конструкции шт.", FlowersVerticalDesignQty.getValue().contains("2347879"));
        assertTrue("Проверка Цветочные вертикальные конструкции кв.м.", FlowersVerticalDesignArea.getValue().contains("548568"));

    }

    @Test
    public void FlowersGardenSpecificationTab() {
        clickFlowersGarden_32();
        Id_or_Name.sendKeys("3404565");
        Search_Button.click();
        $(byText("3404565")).click();
        SpecificationTab.click();
        SubtitleSpecification.shouldHave(text("Спецификация"));
        SpecificationYear.shouldHave(text("2017"));
        SpecificationNumber.shouldHave(text("4564567"));
        SpecificationPlantingType.shouldHave(text("Клумбы"));
        SpecificationArea.shouldHave(text("9789789678"));
        SpecificationQuantity.shouldHave(text("2354235465"));
        SpecificationDescription.shouldHave(text("78678678978"));


    }
}
