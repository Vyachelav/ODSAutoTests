package com.selenium.test.testng.tests.Checks;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.name;

/**
 * Created by Vyacheslav on 16.03.2017.
 */
public class TestProcedures {
    SelenideElement Username_Field = $(name("username"));
    SelenideElement Password_Field = $(name("password"));
    SelenideElement LogIn_Button = $(".submit>input");
    SelenideElement Save_Button = $(("#save"));
    SelenideElement Add_Button = $("#add-button");
    SelenideElement Id_or_Name = $("#idOrName");
    SelenideElement Status_Combo_Box = $(byXpath(".//*[@id='status']/div[1]/svg/path"));
    ElementsCollection Status_Combo_Box_List = $$(byXpath("html/body/div[6]/div/div/div/div"));
    SelenideElement StatusValue = $(byXpath(".//*[@id='status']/div[1]/div[2]"));
    SelenideElement Search_Button = $("#search");
    SelenideElement Header_Card = $(".header-card>h1");
    SelenideElement Start_Date = $("#startDate"); //Действует с
    SelenideElement End_Date = $("#endDate"); //Действует по
    SelenideElement Status = $("#status"); //Статус
    SelenideElement Parent_name = $("#parent_name");// Имя родителя
    SelenideElement Properties = $("#props-tab");//Свойства
    SelenideElement Version = $("#versions-tab");//Версии
    SelenideElement Characteristics = $("#characteristics-tab");//Исходные данные
    SelenideElement Materials = $("#materials-tab");//Материалы
    SelenideElement Owner_ID_Combobox_Button = $(byXpath(".//*[@id='auto-owner_id']/span/span[1]/span/span[2]"));
    SelenideElement Customer_ID_ComboBox_Button = $(byXpath(".//*[@id='auto-customer_id']/span/span[1]/span/span[2]"));
    SelenideElement Conv_Element_Type_ComboBox_Button = $("#conv_element_type_id>div>button");
    SelenideElement Engin_Struct_Type_ComboBox_Button = $("#engin_struct_type_id>div>button");
    SelenideElement Equipment_Type_ComboBox_Button = $("#equipment_type_id>div>button");
    SelenideElement Flat_Element_Type_ComboBox_Button = $("#flat_element_type_id>div>button");
    SelenideElement Covering_Element_Type_ComboBox_Button = $("#covering_type_id>div>button");
    SelenideElement Area = $("#area");
    SelenideElement Greenery_Type_ComboBox_Button = $("#greenery_type_id>div>button");
    SelenideElement Net_Element_Type_ComboBox_Button =  $("#net_element_type_id>div>button");
    SelenideElement Standart_Num_ComboBox_Button = $("#standard_num");
    SelenideElement Building_Type_ComboBox_Button = $("#buildings_type_id>div>button");
    SelenideElement Arrange_Element_Type_ComboBox_Button = $("#arrange_element_type_id>div>button");
    SelenideElement Container_Type_ComboBox_Button = $("#container_type_id>div>button");
    SelenideElement Planar_Structure_Type_ComboBox_Button =  $("#planar_structure_type_id>div>button");
    SelenideElement Territory_Class_ComboBox_Button = $("#territory_class_id>div>button");
    SelenideElement Total_Area_Field = $("#total_area");
    SelenideElement Manual_Clean_Area_Field = $("#manual_clean_area");
    SelenideElement Auto_Clean_Area_Field = $("#auto_clean_area");
    SelenideElement Storage_Place_Type_ComboBox_Button = $("#storage_place_type_id>div>button");
    SelenideElement Dts_Type_ComboBox_Button = $("#dts_type_id>div>button");
    SelenideElement Address_List = $(byName("address_list"));
    SelenideElement Maf_Type_ComboBox_Button =  $("#maf_type_id>div>button");
    SelenideElement Maf_Form_ComboBox_Button =  $("#maf_form_id>div>button");
    SelenideElement Owner_Customer_Field = $(byXpath("html/body/span/span/span[1]/input"));
    ElementsCollection Owner_List = $$(byXpath(".//*[@id='select2-owner_id-results']/li"));
    ElementsCollection Customer_List = $$(byXpath(".//*[@id='select2-customer_id-results']/li"));
    SelenideElement Reestr_Name = $("#name");
    SelenideElement Odh_Bord_Begin = $("#odh_bord_begin");
    SelenideElement Odh_Bord_End = $("#odh_bord_end");
    SelenideElement Address_List_0 = $(byName("address_list_0"));
    SelenideElement Object_Category_Type_ComboBox_Button = $("#object_category_id>div>button");
    SelenideElement Object_Group_Type_ComboBox_Button = $("#object_group_id>div>button");
    SelenideElement Clean_Category_ComboBox_Button = $("#clean_category_ids>div>button");
    SelenideElement Option_Tab =  $("#options-tab");
    SelenideElement Distance = $("#distance");
    SelenideElement Declare_Length = $("#declare_lenght");
    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[3]/div[2]/div/div/label"));
    SelenideElement IsConsiderCheckBox = $("#is_consider");
    SelenideElement Subtitle_Location = $(byXpath(".//*[@id='characteristics']/div[1]/h2")); // Подзаголовок "МЕСТОПОЛОЖЕНИЕ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Characteristic = $(byXpath(".//*[@id='characteristics']/div[2]/h2")); // Подзаголовок "ХАРАКТЕРИСТИКИ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Area = $(byXpath(".//*[@id='characteristics']/div[3]/h2")); // Подзаголовок "ПЛОЩАДЬ" в заголовке "ИСХОДНЫЕ ДАННЫЕ"
    SelenideElement Subtitle_Versions = $(byXpath(".//*[@id='versions']/h3")); // Подзаголовок "ВЕРСИИ ОБЪЕКТА:" в заголовке "ВЕРСИИ"
    SelenideElement OwnerValue = $(byXpath(".//*[@id='react-select-2--value-item']"));//Значение поля "Балансодержатель"
    SelenideElement CustomerValue = $(byXpath(".//*[@id='react-select-3--value-item']"));//Значение поля "Заказчик"




    public void enterLoginPassword(String user, String password) {
        Username_Field.sendKeys(user);
        Password_Field.sendKeys(password);
        LogIn_Button.click();
    }

    public void openLoginPage() {

        open("http://ods.altarix.org/login");
    }

    public void openOGHReestr() {
        open("http://ods.altarix.org/r/ods");
    }

    public void autorisationUser() {
        open("http://ods.altarix.org/login");
        enterLoginPassword("user", "qwerty");
    }

    public void clickODH_1()
    {
        $(byXpath(" .//*[@id='app']/div/div[2]/div[1]/div/a[1]")).click();
    }

    public void clickStops_5()
    {
      $(byXpath(".//*[@id='app']/div/div[2]/div[4]/div[2]/a[3]")).click();
    }

    public void clickStopsInside_5()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/span")).click();
    }

    public void clickLampposts_6()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[5]/div[2]/a[3]")).click();
    }

    public void clickLamppostsInside_6()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[7]/span")).click();
    }

    public void clickMaf_7()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/div[2]/a[1]")).click();
    }

    public void clickMafInside_7()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/span")).click();
    }

    public void clickManholes_8()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[5]/div[2]/a[1]")).click();
    }

    public void clickManholesInside_8()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[9]/span")).click();
    }

   public void clickOtherEnginConstruct_9()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[5]/div[2]/a[2]")).click();
    }

    public void clickOtherEnginConstructInside_9()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[10]/span")).click();
    }

   public void clickRoadSigns_10()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[7]/div[2]/a[1]")).click();
    }

    public void clickRoadSignsInside_10()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[1]/span")).click();
    }

    public void clickFencing_11()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[7]/div[2]/a[2]")).click();
    }

    public void clickFencingInside_11()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[2]/span")).click();
    }

    public void clickTrafficLight_12()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[7]/div[2]/a[3]")).click();
    }

    public void clickTrafficLightInside_12()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/span")).click();
    }

    public void clickCarriageway_13()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/div[2]/a[1]")).click();
    }

    public void clickCarriagewayInside_13()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[11]/span")).click();
    }

    public void clickSidewalks_14()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/div[2]/a[3]")).click();
    }

    public void clickSidewalksInside_14()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[13]/span")).click();
    }

    public void clickBoardStone_15()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/div[2]/a[4]")).click();
    }

    public void clickBoardStoneInside_15()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[14]/span")).click();
    }

    public void clickOtherFlatBuilding_16()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/div[2]/a[5]")).click();
    }

    public void clickOtherFlatBuildingInside_16()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[15]/span")).click();
    }

    public void clickTrees_17()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/div[2]/a[1]")).click();
    }

    public void clickTreesInside_17()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[16]/span")).click();
    }

    public void clickShrubs_18()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/div[2]/a[2]")).click();
    }

    public void clickShrubsInside_18()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[17]/span")).click();
    }

    public void clickLawns_19()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/div[2]/a[3]")).click();
    }

    public void clickLawnsInside_19()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[18]/span")).click();
    }

    public void clickTramRails_20()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[4]/div[2]/a[1]")).click();
    }

    public void clickTramRailsInside_20()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[4]/span")).click();
    }

    public void clickTrolleybusContNetwork_21()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[4]/div[2]/a[2]")).click();
    }

    public void clickTrolleybusContNetworkInside_21()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[5]/span")).click();
    }

    public void clickRoadmark_22()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[7]/div[2]/a[4]")).click();
    }

    public void clickRoadmarkInside_22()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[19]/span")).click();
    }

    public void clickMargin_23()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/div[2]/a[2]")).click();
    }

    public void clickMarginInside_23()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[12]/span")).click();
    }

    public void clickImprovementTerritory_24()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[1]/div/a[2]/div[2]")).click();
    }

    public void clickBuilding_25()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[2]/div[2]/a[1]")).click();
    }

    public void clickBuildingInside_25()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[1]/span")).click();
    }

    public void clickContainer_26()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[1]/div/a[3]/div[1]")).click();
    }

    public void clickContainerInside_26()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[2]/span")).click();
    }

    public void clickPlanarStructure_27()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[2]/div[2]/a[2]")).click();
    }

    public void clickPlanarStructureInside_27()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/span")).click();
    }

    public void clickTechPlace_28()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[2]/div[2]/a[3]")).click();
    }

    public void clickTechPlaceInside_28()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[4]/span")).click();
    }

    public void clickStoragePlace_29()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[2]/div[2]/a[4]")).click();
    }

    public void clickStoragePlaceInside_29()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[5]/span")).click();
    }

    public void clickDts_30()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[3]/div[2]/a[6]")).click();
    }

    public void clickDtsInside_30()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/span")).click();
    }

    public void clickLawn_31()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/div[2]/a[4]")).click();
    }

    public void clickLawnInside_31()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[7]/span")).click();
    }

    public void clickFlowersGarden_32()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/div[2]/a[5]")).click();
    }

    public void clickFlowersGardenInside_32()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[8]/span")).click();
    }

    public void clickPpi_33()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/div[2]/a[2]")).click();
    }

    public void clickPpiInside_33()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[9]/span")).click();
    }

    public void clickRelief_34()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/div[2]/a[3]")).click();
    }

    public void clickReliefInside_34()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[10]/span")).click();
    }

    public void clickFunctionality_35()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/div[2]/a[4]")).click();
    }

    public void clickFunctionalityInside_35()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[11]/span")).click();
    }

    public void clickEnvironmentProtection_36()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/div[2]/a[5]")).click();
    }

    public void clickEnvironmentProtectionInside_36()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[12]/span")).click();
    }

    public void clickLittleForm_37()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[6]/div[2]/a[6]")).click();
    }

    public void clickLittleFormInside_37()
    {
        $(byXpath(".//*[@id='app']/div/div[2]/div[13]/span")).click();
    }

    public void objectNull()
    {
        createObject();
        clickSave();
    }

    public void clickSave() {
        Save_Button.click();
    }

    public void createObject() {
        Add_Button.click();
        $(byText("Продолжить")).click();
    }
}


