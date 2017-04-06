package com.selenium.test.testng.tests.Checks;

import com.selenium.test.testng.tests.odsTestReestr.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Vyacheslav on 22.03.2017.
 */
public class TestViewObjectApproved extends TestProcedures {

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void viewODHApproved() {
    clickODH_1();
    Id_or_Name.sendKeys("1134870");
    Search_Button.click();
    $(byText("1134870")).click();
    Header_Card.shouldHave(text("Мичуринский проспект ID 1134870"));
    }

    @Test
    public void viewStopsApproved() {
        clickStops_5();
        Id_or_Name.sendKeys("2269105");
        Search_Button.click();
        $(byText("2269105")).click();
        Header_Card.shouldHave(text("Остановка"));
    }

    @Test
    public void viewLamppostsApproved() {
        clickLampposts_6();
        Id_or_Name.sendKeys("2269112");
        Search_Button.click();
        $(byText("2269112")).click();
        Header_Card.shouldHave(text("Опора контактных сетей"));
    }

    @Test
    public void viewMafApproved() {
        clickMaf_7();
        Id_or_Name.sendKeys("1829006");
        Search_Button.click();
        $(byText("1829006")).click();
        Header_Card.shouldHave(text("Иное"));
    }

    @Test
    public void viewManholesApproved() {
        clickManholes_8();
        Id_or_Name.sendKeys("1741562");
        Search_Button.click();
        $(byText("1741562")).click();
        Header_Card.shouldHave(text("Люки смотровых колодцев"));
    }

    @Test
    public void viewOtherEnginConstructApproved() {
        clickOtherEnginConstruct_9();
        Id_or_Name.sendKeys("1546254");
        Search_Button.click();
        $(byText("1546254")).click();
        Header_Card.shouldHave(text("УТН"));
    }

    @Test
    public void viewRoadSignsApproved() {
        clickRoadSigns_10();
        Id_or_Name.sendKeys("2105669");
        Search_Button.click();
        $(byText("2105669")).click();
        Header_Card.shouldHave(text("Дорожные знаки"));
    }

    @Test
    public void viewFencingApproved() {
        clickFencing_11();
        Id_or_Name.sendKeys("1924677");
        Search_Button.click();
        $(byText("1924677")).click();
        Header_Card.shouldHave(text("Ограждающие и направляющие устройства"));
    }

    @Test
    public void viewTrafficLightApproved() {
        clickTrafficLight_12();
        Id_or_Name.sendKeys("1955776");
        Search_Button.click();
        $(byText("1955776")).click();
        Header_Card.shouldHave(text("Светофоры"));
    }

    @Test
    public void viewCarriagewayApproved() {
        clickCarriageway_13();
        Id_or_Name.sendKeys("1142436");
        Search_Button.click();
        $(byText("1142436")).click();
        Header_Card.shouldHave(text("ПЧ.Въезд"));
    }

    @Test
    public void viewSidewalksApproved() {
        clickSidewalks_14();
        Id_or_Name.sendKeys("1143364");
        Search_Button.click();
        $(byText("1143364")).click();
        Header_Card.shouldHave(text("Тротуар (кроме поперечных)"));
    }

    @Test
    public void viewBoardStoneApproved() {
        clickBoardStone_15();
        Id_or_Name.sendKeys("1142446");
        Search_Button.click();
        $(byText("1142446")).click();
        Header_Card.shouldHave(text("Бортовой камень"));
    }

    @Test
    public void viewOtherFlatBuildingApproved() {
        clickOtherFlatBuilding_16();
        Id_or_Name.sendKeys("1147437");
        Search_Button.click();
        $(byText("1147437")).click();
        Header_Card.shouldHave(text("Техническая площадка"));
    }

    @Test
    public void viewTreesApproved() {
        clickTrees_17();
        Id_or_Name.sendKeys("1892312");
        Search_Button.click();
        $(byText("1892312")).click();
        Header_Card.shouldHave(text("Деревья"));
    }

    @Test
    public void viewShrubsApproved() {
        clickShrubs_18();
        Id_or_Name.sendKeys("1898564");
        Search_Button.click();
        $(byText("1898564")).click();
        Header_Card.shouldHave(text("Кустарники"));
    }

    @Test
    public void viewLawnsApproved() {
        clickLawns_19();
        Id_or_Name.sendKeys("1889450");
        Search_Button.click();
        $(byText("1889450")).click();
        Header_Card.shouldHave(text("Газон"));
    }

    @Test
    public void viewTramRailsApproved() {
        clickTramRails_20();
        Id_or_Name.sendKeys("2269093");
        Search_Button.click();
        $(byText("2269093")).click();
        Header_Card.shouldHave(text("Трамвайные пути (обособленные)"));
    }

    @Test
    public void viewTrolleybusContNetworkApproved() {
        clickTrolleybusContNetwork_21();
        Id_or_Name.sendKeys("1518177");
        Search_Button.click();
        $(byText("1518177")).click();
        Header_Card.shouldHave(text("Троллейбусные контактные сети"));
    }

    @Test
    public void viewRoadmarkApproved() {
        clickRoadmark_22();
        Id_or_Name.sendKeys("1903607");
        Search_Button.click();
        $(byText("1903607")).click();
        Header_Card.shouldHave(text("1.16.3"));
    }

    @Test
    public void viewMarginApproved() {
        clickMargin_23();
        Id_or_Name.sendKeys("1165287");
        Search_Button.click();
        $(byText("1165287")).click();
        Header_Card.shouldHave(text("Обочина"));
    }

    @Test
    public void viewImprovementTerritoryApproved() {
        clickImprovementTerritory_24();
        Id_or_Name.sendKeys("2150128");
        Search_Button.click();
        $(byText("2150128")).click();
        Header_Card.shouldHave(text("Чаянова ул. 14 ID 2150128"));
    }

    @Test
    public void viewBuildingApproved() {
        clickBuilding_25();
        Id_or_Name.sendKeys("2269033");
        Search_Button.click();
        $(byText("2269033")).click();
        Header_Card.shouldHave(text("Жилое"));
    }

    @Test
    public void viewContainerApproved() {
        clickContainer_26();
        Id_or_Name.sendKeys("2196791");
        Search_Button.click();
        $(byText("2196791")).click();
        Header_Card.shouldHave(text("Контейнерная площадка"));
    }

    @Test
    public void viewPlanarStructureApproved() {
        clickPlanarStructure_27();
        Id_or_Name.sendKeys("2269215");
        Search_Button.click();
        $(byText("2269215")).click();
        Header_Card.shouldHave(text("Площадка для сушки белья"));
    }

    @Test
    public void viewTechPlaceApproved() {
        clickTechPlace_28();
        Id_or_Name.sendKeys("2269192");
        Search_Button.click();
        $(byText("2269192")).click();
        Header_Card.shouldHave(text("неопределено"));
    }

    @Test
    public void viewStoragePlaceApproved() {
        clickStoragePlace_29();
        Id_or_Name.sendKeys("2269041");
        Search_Button.click();
        $(byText("2269041")).click();
        Header_Card.shouldHave(text("База хранения ПГМ и инвентаря"));
    }

    @Test
    public void viewDtsApproved() {
        clickDts_30();
        Id_or_Name.sendKeys("2269049");
        Search_Button.click();
        $(byText("2269049")).click();
        Header_Card.shouldHave(text("Пешеходная дорожка"));
    }

    @Test
    public void viewLawnApproved() {
        clickLawn_31();
        Id_or_Name.sendKeys("2239622");
        Search_Button.click();
        $(byText("2239622")).click();
        Header_Card.shouldHave(text("Уч. №5"));
    }

    @Test
    public void viewFlowersGardenApproved() {
        clickFlowersGarden_32();
        Id_or_Name.sendKeys("2230540");
        Search_Button.click();
        $(byText("2230540")).click();
        Header_Card.shouldHave(text("Уч. №1, раст. №1"));
    }

    @Test
    public void viewPpiApproved() {
        clickPpi_33();
        Id_or_Name.sendKeys("2232341");
        Search_Button.click();
        $(byText("2232341")).click();
        Header_Card.shouldHave(text("Пандус и безбарьерный съезд от площадок к дорожкам"));
    }

    @Test
    public void viewReliefApproved() {
        clickRelief_34();
        Id_or_Name.sendKeys("2269058");
        Search_Button.click();
        $(byText("2269058")).click();
        Header_Card.shouldHave(text("Съезд с тротуара на проезжую часть с понижением высоты бортового камня"));
    }

    @Test
    public void viewFunctionalityApproved() {
        clickFunctionality_35();
        Id_or_Name.sendKeys("2269511");
        Search_Button.click();
        $(byText("2269511")).click();
        Header_Card.shouldHave(text("Специальное оборудование на детских и спортивных площадках"));
    }

    @Test
    public void viewEnvironmentProtectionApproved() {
        clickEnvironmentProtection_36();
        Id_or_Name.sendKeys("2269516");
        Search_Button.click();
        $(byText("2269516")).click();
        Header_Card.shouldHave(text("Иное"));
    }

    @Test
    public void viewLittleFormApproved() {
        clickLittleForm_37();
        Id_or_Name.sendKeys("2269521");
        Search_Button.click();
        $(byText("2269521")).click();
        Header_Card.shouldHave(text("Фигура \"Пеликан\""));
    }
}
