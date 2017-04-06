package com.selenium.test.testng.tests.Checks;

import com.selenium.test.testng.tests.odsTestReestr.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Vyacheslav on 23.03.2017.
 */
public class TestViewObjectProject extends TestProcedures {
    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void viewODHProject() {
        clickODH_1();
        Id_or_Name.sendKeys("2269169");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269169")).click();
        Header_Card.shouldHave(text("Улица Судакова"));

    }

    @Test
    public void viewStopsProject() {
        clickStops_5();
        Id_or_Name.sendKeys("2269232");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269232")).click();
       Header_Card.shouldHave(text("Остановка"));
    }

    @Test
    public void viewLamppostsProject() {
        clickLampposts_6();
        Id_or_Name.sendKeys("2269595");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269595")).click();
       Header_Card.shouldHave(text("Опора контактных сетей"));
    }

    @Test
    public void viewMafProject() {
        clickMaf_7();
        Id_or_Name.sendKeys("2269174");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269174")).click();
       Header_Card.shouldHave(text("Биотуалет"));
    }

    @Test
    public void viewManholesProject() {
        clickManholes_8();
        Id_or_Name.sendKeys("2268918");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268918")).click();
       Header_Card.shouldHave(text("Решётки водоприемных колодцев"));
    }

    @Test
    public void viewOtherEnginConstructProject() {
        clickOtherEnginConstruct_9();
        Id_or_Name.sendKeys("2268989");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268989")).click();
       Header_Card.shouldHave(text("Вход в подуличный переход к станции метро"));
    }

    @Test
    public void viewRoadSignsProject() {
        clickRoadSigns_10();
        Id_or_Name.sendKeys("2269015");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269015")).click();
       Header_Card.shouldHave(text("Дорожные знаки"));
    }

    @Test
    public void viewFencingProject() {
        clickFencing_11();
        Id_or_Name.sendKeys("2269188");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269188")).click();
       Header_Card.shouldHave(text("Ограждающие и направляющие устройства"));
    }

    @Test
    public void viewTrafficLightProject() {
        clickTrafficLight_12();
        Id_or_Name.sendKeys("2269017");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269017")).click();
       Header_Card.shouldHave(text("Светофоры"));
    }

    @Test
    public void viewCarriagewayProject() {
        clickCarriageway_13();
        Id_or_Name.sendKeys("2268940");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268940")).click();
       Header_Card.shouldHave(text("ПЧ.Основная"));
    }

    @Test
    public void viewSidewalksProject() {
        clickSidewalks_14();
        Id_or_Name.sendKeys("2268923");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268923")).click();
       Header_Card.shouldHave(text("Тротуар (кроме поперечных)"));
    }

    @Test
    public void viewBoardStoneProject() {
        clickBoardStone_15();
        Id_or_Name.sendKeys("2268941");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268941")).click();
       Header_Card.shouldHave(text("Бортовой камень"));
    }

    @Test
    public void viewOtherFlatBuildingProject() {
        clickOtherFlatBuilding_16();
        Id_or_Name.sendKeys("2269715");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269715")).click();
       Header_Card.shouldHave(text("Разделительная полоса в одном уровне с ПЧ"));
    }

    @Test
    public void viewTreesProject() {
        clickTrees_17();
        Id_or_Name.sendKeys("2269608");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269608")).click();
       Header_Card.shouldHave(text("Деревья"));
    }

    @Test
    public void viewShrubsProject() {
        clickShrubs_18();
        Id_or_Name.sendKeys("2268995");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268995")).click();
       Header_Card.shouldHave(text("Кустарники"));
    }

    @Test
    public void viewLawnsProject() {
        clickLawns_19();
        Id_or_Name.sendKeys("2269610");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269610")).click();
       Header_Card.shouldHave(text("Газон"));
    }

    @Test
    public void viewTramRailsProject() {
        clickTramRails_20();
        Id_or_Name.sendKeys("2268997");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268997")).click();
       Header_Card.shouldHave(text("Трамвайные пути (обособленные)"));
    }

    @Test
    public void viewTrolleybusContNetworkProject() {
        clickTrolleybusContNetwork_21();
        Id_or_Name.sendKeys("2269538");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269538")).click();
       Header_Card.shouldHave(text("Троллейбусные контактные сети"));
    }

    @Test
    public void viewRoadmarkProject() {
        clickRoadmark_22();
        Id_or_Name.sendKeys("2269127");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269127")).click();
       Header_Card.shouldHave(text("123421342141"));
    }

    @Test
    public void viewMarginProject() {
        clickMargin_23();
        Id_or_Name.sendKeys("2269138");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269138")).click();
       Header_Card.shouldHave(text("Обочина"));
    }

    @Test
    public void viewImprovementTerritoryProject() {
        clickImprovementTerritory_24();
        Id_or_Name.sendKeys("2268952");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268952")).click();
       Header_Card.shouldHave(text("Даев пер. 12/16, Даев пер. 14"));
    }

    @Test
    public void viewBuildingProject() {
        clickBuilding_25();
        Id_or_Name.sendKeys("2194870");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2194870")).click();
       Header_Card.shouldHave(text("Жилое"));
    }

    @Test
    public void viewContainerProject() {
        clickContainer_26();
        Id_or_Name.sendKeys("2268921");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268921")).click();
       Header_Card.shouldHave(text("Контейнерная площадка"));
    }

    @Test
    public void viewPlanarStructureProject() {
        clickPlanarStructure_27();
        Id_or_Name.sendKeys("2269434");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269434")).click();
       Header_Card.shouldHave(text("Детская площадка"));
    }

    @Test
    public void viewTechPlaceProject() {
        clickTechPlace_28();
        Id_or_Name.sendKeys("2269456");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269456")).click();
       Header_Card.shouldHave(text("неопределено"));
    }

    @Test
    public void viewStoragePlaceProject() {
        clickStoragePlace_29();
        Id_or_Name.sendKeys("2269042");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269042")).click();
       Header_Card.shouldHave(text("База хранения ПГМ и инвентаря"));
    }

    @Test
    public void viewDtsProject() {
        clickDts_30();
        Id_or_Name.sendKeys("2269046");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269046")).click();
       Header_Card.shouldHave(text("Пешеходная дорожка"));
    }

    @Test
    public void viewLawnProject() {
        clickLawn_31();
        Id_or_Name.sendKeys("2269634");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269634")).click();
       Header_Card.shouldHave(text("Уч. №<неопределено> "));
    }

    @Test
    public void viewFlowersGardenProject() {
        clickFlowersGarden_32();
        Id_or_Name.sendKeys("2268945");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2268945")).click();
       Header_Card.shouldHave(text("Уч. №<неопределено>, раст. №<неопределено>"));
    }

    @Test
    public void viewPpiProject() {
        clickPpi_33();
        Id_or_Name.sendKeys("2269010");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269010")).click();
       Header_Card.shouldHave(text("Пандус с опорными поручнями к наружным лестницам подъездов жилых домов"));
    }

    @Test
    public void viewReliefProject() {
        clickRelief_34();
        Id_or_Name.sendKeys("2269665");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269665")).click();
       Header_Card.shouldHave(text("Иное"));
    }

    @Test
    public void viewFunctionalityProject() {
        clickFunctionality_35();
        Id_or_Name.sendKeys("2269006");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269006")).click();
       Header_Card.shouldHave(text("Пандус и безбарьерный съезд от тротуаров к проезжей части"));
    }

    @Test
    public void viewEnvironmentProtectionProject() {
        clickEnvironmentProtection_36();
        Id_or_Name.sendKeys("2269640");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269640")).click();
       Header_Card.shouldHave(text("Иное"));
    }

    @Test
    public void viewLittleFormProject() {
        clickLittleForm_37();
        Id_or_Name.sendKeys("2269524");
        Status_Combo_Box.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269524")).click();
       Header_Card.shouldHave(text("Фигура \"Слон\""));
    }

}
