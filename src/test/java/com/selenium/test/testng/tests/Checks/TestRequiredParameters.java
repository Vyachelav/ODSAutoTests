package com.selenium.test.testng.tests.Checks;

import com.codeborne.selenide.SelenideElement;
import com.selenium.test.testng.tests.odsTestReestr.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.text.html.CSS;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

/**
 * Created by Vyacheslav on 21.03.2017.
 */
public class TestRequiredParameters extends TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }
    @AfterClass
    public void clearCache() {
        clearCache();
    }

    @Test
    public void requiredParametersODH() {
        clickODH_1();
        createObject();
        Owner_ID_Combobox_Button.click();
        Owner_Customer_Field.sendKeys("ЮЗАО");
        Owner_List.findBy(text("АвД ЮЗАО")).click();
        Customer_ID_ComboBox_Button.click();
        Owner_Customer_Field.sendKeys("ЮЗАО");
        Customer_List.findBy(text("АвД ЮЗАО")).click();
        Reestr_Name.sendKeys("Автотест1");
        Address_List_0.sendKeys("лом");
        $(byText("Ломоносовский пр.")).click();
        Object_Category_Type_ComboBox_Button.click();
        $(byText("Городские магистрали")).click();
        Object_Group_Type_ComboBox_Button.click();
        $(byText("Группа А")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#object_category_id>div\").offset().top - 250}, 1000);");
        Clean_Category_ComboBox_Button.click();
        $(byText("3 категория")).click();
        Odh_Bord_Begin.sendKeys("58");
        Odh_Bord_End.sendKeys("62");
        Option_Tab.click();
        Distance.sendKeys("33");
        Declare_Length.sendKeys("35");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersStops() {
        clickStops_5();
        createObject();
        Conv_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Вазон")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersLampposts() {
        clickLampposts_6();
        createObject();
        Conv_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Опора освещения")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersMAF() {
        clickMaf_7();
        createObject();
        Conv_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Биотуалет")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersManholes() {
        clickManholes_8();
        createObject();
        Engin_Struct_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Люки смотровых колодцев")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersOtherEnginConstruct() {
        clickOtherEnginConstruct_9();
        createObject();
        Engin_Struct_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Иное")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersRoadSigns() {
        clickRoadSigns_10();
        createObject();
        Equipment_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Дорожные указатели")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersFencing() {
        clickFencing_11();
        createObject();
        Equipment_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Ограждающие и направляющие устройства")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersTrafficLight() {
        clickTrafficLight_12();
        createObject();
        Equipment_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Светофоры")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersCarriageway() {
        clickCarriageway_13();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("ПЧ.Примыкание")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Covering_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Щебеночное")).click();
        Area.waitUntil(visible,15000).setValue("5");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersSidewalks() {
        clickSidewalks_14();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Пешеходная дорожка")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top-200}, 1000);");
        Covering_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Грунтовое")).click();
        Area.waitUntil(visible,15000).setValue("88");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
            }

    @Test
    public void requiredBoardStone() {
        clickBoardStone_15();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Бортовой камень")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersOtherFlatBuilding() {
        clickOtherFlatBuilding_16();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("примыкает к автостоянке")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        Covering_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Озелененное")).click();
        Area.waitUntil(visible,15000).setValue("35,5");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersTrees() {
        clickTrees_17();
        createObject();
        Greenery_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Деревья")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersShrubs() {
        clickShrubs_18();
        createObject();
        Greenery_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Кустарники")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersLawns() {
        clickLawns_19();
        createObject();
        Greenery_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Цветники многолетние")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersTram_rails() {
        clickTramRails_20();
        createObject();
        Net_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Трамвайные пути (обособленные)")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersTrolleybusContNetwork() {
        clickTrolleybusContNetwork_21();
        createObject();
        Net_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Троллейбусные контактные сети")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersRoadMark() {
        clickRoadmark_22();
        createObject();
        Standart_Num_ComboBox_Button.waitUntil(visible,15000).setValue("ert34t3");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersMargin() {
        clickMargin_23();
        createObject();
        Flat_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Обочина")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void improvementTerritory1() {
        clickImprovementTerritory_24();
        objectNull();
        Reestr_Name.sendKeys("Автотест1");
        $(byXpath(".//*[@id='auto-okrug_id']/span/span[1]/span/span[2]")).click();
        $(byXpath("html/body/span/span/span[1]/input")).sendKeys("ЮЗАО");
        $$(byXpath(".//*[@id='select2-okrug_id-results']/li")).findBy(text("ЮЗАО")).click();
        $(byXpath(".//*[@id='auto-district_id']/span/span[1]/span/span[2]")).click();
        $(byXpath("html/body/span/span/span[1]/input")).sendKeys("Южн");
        $$(byXpath(".//*[@id='select2-district_id-results']/li")).findBy(text("Южное Бутово")).click();
        $("#address_text").sendKeys("Тестовая улица");
        $("#territory_type_id>div>button").click();
        $$(byXpath("html/body/div[26]/div/div/div")).findBy(text("Основные")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#territory_type_id>div\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[1]/button[1]")).click();
        /*executeJavaScript("$('add_assoc_address').animate({scrollTop: $(\"#addressdetails-undefined--30152\").offset().top }, 1000);");
        $(".addressComboBox").click();
        $(byId("address_details")).sendKeys("лом");
        $$(byXpath(".//*[@id='address_details']/div[2]")).findBy(text("Ломоносовский просп., 32")).click();
        $(byXpath("html/body/div[15]/div/div[1]/div/div/div[2]/button[1]")).click();*/
        $("#total_clean_area").sendKeys("85");
        $("#greenery_clean_category_id>div>button").click();
        $(byText("I-я кат.")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#passport_id\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[1]/button[1]")).click();
        $("#buildings_type_id>div>button").click();


    }
   @Test
    public void requiredParametersBuilding() {
        clickBuilding_25();
        createObject();
        Building_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Спортивное")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносова улица")).click();
        clickSave();
       $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersContainer() {
        clickContainer_26();
        createObject();
        Container_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Контейнерная площадка")).click();
        Address_List_0.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersPlanarStructure() {
        clickPlanarStructure_27();
        createObject();
        Planar_Structure_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Площадка отдыха")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#parent_name\").offset().top }, 1000);");
        Territory_Class_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("3 класс")).click();
        Total_Area_Field.waitUntil(visible,15000).sendKeys("185");
        Manual_Clean_Area_Field.waitUntil(visible,15000).sendKeys("30");
        Auto_Clean_Area_Field.waitUntil(visible,15000).sendKeys("25");
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersTechPlace() {
        clickTechPlace_28();
        createObject();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersStoragePlace() {
        clickStoragePlace_29();
        createObject();
        Storage_Place_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("База хранения ПГМ и инвентаря")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersDts() {
        clickDts_30();
        createObject();
        Dts_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Пандус")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersLawn() {
        clickLawn_31();
        createObject();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersFlowersGarden() {
        clickFlowersGarden_32();
        createObject();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersPpi() {
        clickPpi_33();
        createObject();
        Arrange_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Пандус и безбарьерный съезд от дорожек к тротуарам")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersRelief() {
        clickRelief_34();
        createObject();
        Arrange_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Специальное оборудование на детских и спортивных площадках")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersFunctionality() {
        clickFunctionality_35();
        createObject();
         Arrange_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Съезд с тротуара на проезжую часть с понижением высоты бортового камня")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersEnvironmentProtection() {
        clickEnvironmentProtection_36();
        createObject();
         Arrange_Element_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Иное")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

    @Test
    public void requiredParametersLittleForm() {
        clickLittleForm_37();
        createObject();
        Maf_Type_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Урны")).click();
        Maf_Form_ComboBox_Button.waitUntil(visible,15000).click();
        $(byText("Качели")).click();
        Address_List.waitUntil(visible,15000).sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));
    }

}
