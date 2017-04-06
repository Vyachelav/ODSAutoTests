package com.selenium.test.testng.tests.Checks;

import com.selenium.test.testng.tests.odsTestReestr.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.executeJavaScript;


/**
 * Created by Vyacheslav on 20.03.2017.
 */
public class TestNullParams extends com.selenium.test.testng.tests.odsTestReestr.TestProcedures {

   @BeforeClass
   public void befClass() {
       autorisationUser();
   }

   @BeforeMethod
    public void befTest() {
       openOGHReestr();
   }

    @Test
    public void odhObject1()   {
        clickODH_1();
        objectNull();
        $(byXpath(".//*[@id='auto-owner_id']/div")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[2]/div[1]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list_0']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[2]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[2]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list_0']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div[1]/div[2]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#object_category_id>div\").offset().top - 250}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[3]/div[2]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
        $(byXpath(".//*[@id='characteristics']/div[3]/div[2]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
        $("#options-tab").click();
        $(byXpath(".//*[@id='options']/div/div[4]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='options']/div/div[5]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='options']/div/div[4]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
        $(byXpath(".//*[@id='options']/div/div[5]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
    }

    @Test
    public void stopsObject()   {
        clickStops_5();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void lampPosts()  {
        clickLampposts_6();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void mafObject()  {
        clickMaf_7();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void manholesObject() {
        clickManholes_8();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

  @Test
    public void otherEnginConstruct()  {
        clickOtherEnginConstruct_9();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
      $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void roadSigns_10()  {
        clickRoadSigns_10();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void fencingObject()  {
        clickFencing_11();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void trafficLight()  {
        clickTrafficLight_12();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void carriagewayObject()  {
        clickCarriageway_13();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void sidewalksObject()  {
        clickSidewalks_14();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,25000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div/div[4]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[2]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,25000).exists();
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,25000).exists();
    }

    @Test
    public void boardStone()  {
        clickBoardStone_15();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();

    }

    @Test
    public void otherFlatBuilding()  {
        clickOtherFlatBuilding_16();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,25000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#bord_end\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div/div[4]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[2]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[2]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,25000).exists();
        $(byXpath(".//*[@id='characteristics']/div[3]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,25000).exists();
    }

    @Test
    public void treesObject()  {
        clickTrees_17();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void shrubsObject()  {
        clickShrubs_18();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();



    }

    @Test
    public void lawnsObject()  {
        clickLawns_19();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void tramRails() {
        clickTramRails_20();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void trolleybusContNetwork()  {
        clickTrolleybusContNetwork_21();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void roadmarkObject()  {
        clickRoadmark_22();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void marginObject()  {
        clickMargin_23();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void improvementTerritory1()  {
        clickImprovementTerritory_24();
        objectNull();
        $(byXpath(".//*[@id='props']/div[2]/div[1]/div/div[2]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='auto-okrug_id']/div")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='auto-district_id']/div")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[4]/div[1]/div/div[2]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[5]/div[1]/div/div[4]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[2]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,25000).exists();
        $(byXpath(".//*[@id='props']/div[4]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,25000).exists();
        $(byXpath(".//*[@id='props']/div[5]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,25000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#territory_type_id>div\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[1]/div")).waitUntil(visible,25000).shouldHave(text("обязательный список"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[1]/div/div[2]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[3]/div/div[4]")).waitUntil(visible,25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,25000).exists();
        $(byXpath(".//*[@id='characteristics']/div[1]/div[3]/div/div[3]/hr[2]")).waitUntil(visible,25000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#passport_id\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[1]/div")).waitUntil(visible,25000).shouldHave(text("обязательный список"));

   }

    @Test
    public void buildingObject()  {
        clickBuilding_25();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void containerObject()  {
        clickContainer_26();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list_0']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list_0']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void planarStructure()  {
        clickPlanarStructure_27();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#parent_name\").offset().top }, 1000);");
        $(byXpath(".//*[@id='characteristics']/div/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[3]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[4]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[5]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div/div[3]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div/div[4]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='characteristics']/div/div[5]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();


    }

      @Test
    public void storagePlace()  {
        clickStoragePlace_29();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void dtsObject()  {
        clickDts_30();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void ppiObject()  {
        clickPpi_33();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void reliefObject()  {
        clickRelief_34();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void functionalityObject() {
        clickFunctionality_35();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void environmentProtection() {
        clickEnvironmentProtection_36();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }

    @Test
    public void littleForm()  {
        clickLittleForm_37();
        objectNull();
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[2]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='address_list']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='props']/div[1]/div[2]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath(".//*[@id='address_list']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
    }





    }