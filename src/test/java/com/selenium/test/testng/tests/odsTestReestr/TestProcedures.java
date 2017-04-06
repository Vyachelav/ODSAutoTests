package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.name;

/**
 * Created by Vyacheslav on 16.03.2017.
 */
public class TestProcedures {
    SelenideElement Username_Field = $(name("username"));//Имя пользователя
    SelenideElement Password_Field = $(name("password"));//Пароль
    SelenideElement LogIn_Button = $(".submit>input");//Кнопка входа в систему
    SelenideElement Save_Button = $(("#save"));//Кнопка "Сохранить"
    SelenideElement Add_Button = $("#add-button");//Кнопка "Добавить"
    SelenideElement Id_or_Name = $("#idOrName");//Поле поиска "ID или Наименование"
    ElementsCollection Status_Combo_Box_List = $$(byXpath("html/body/div[6]/div/div/div/div"));//Выпадающий список Статус
    SelenideElement StatusValue = $(byXpath(".//*[@id='status']/div[1]/div[2]"));//Статус
    SelenideElement Search_Button = $("#search");//Кнопка поиска
    SelenideElement Header_Card = $(".header-card>h1");//Заголовок объекта реестра
    SelenideElement Start_Date = $("#startDate"); //Действует с
    SelenideElement End_Date = $("#endDate"); //Действует по
    SelenideElement Parent_name = $("#parent_name");// Имя родителя
    SelenideElement Properties = $("#props-tab");//Свойства
    SelenideElement Version = $("#versions-tab");//Версии
    SelenideElement Characteristics = $("#characteristics-tab");//Исходные данные
    SelenideElement Materials = $("#materials-tab");//Материалы
    SelenideElement Reestr_Name = $("#name");//Имя для объектов типа 1,24
    SelenideElement Odh_Bord_Begin = $("#odh_bord_begin");//ОДХ:Начало границы
    SelenideElement Odh_Bord_End = $("#odh_bord_end");//ОДХ:Конец границы
    SelenideElement Address_List = $(byName("address_list"));//Выпадающий список адреса
    SelenideElement Address_List_0 = $(byName("address_list_0"));//Выпадающий список адреса
    SelenideElement Option_Tab =  $("#options-tab");//Вкладка "Свойства"
    SelenideElement IsConsiderLabel = $(byXpath(".//*[@id='props']/div[3]/div[2]/div/div/label"));//Чекбокс "Не учитывать"
    SelenideElement IsConsiderCheckBox = $("#is_consider");//Лейбл Чекбокс "Не учитывать"
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


