package com.selenium.test.testng.tests.odsTestReestr;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vyacheslav on 27.03.2017.
 */
public class ImprovementTerritory_24 extends TestProcedures {


    SelenideElement Subtitle_AddressBTI = $(byXpath((".//*[@id='props']/div[6]/div/h2"))); // Подзаголовок Связанные Адреса БТИ
    SelenideElement Subtitle_Characteristic = $(byXpath((".//*[@id='characteristics']/div[1]/h2"))); // Подзаголовок Классификационные характеристики
    SelenideElement Subtitle_Passport = $(byXpath(".//*[@id='characteristics']/div[2]/h2"));//Подзаголовок Данные паспорта;
    SelenideElement Subtitle_ArchPlanCharact = $(byXpath(".//*[@id='characteristics']/div[4]/h2"));//Подзаголовок Архитектурно-планировочная характеристика;
    SelenideElement ApprovingTab = $("#approving-tab");//Вкладка Согласование
    SelenideElement OwnerValue = $("#react-select-2--value-item");//Балансодержатель
    SelenideElement CustomerValue = $("#react-select-3--value-item");//Заказчик
    SelenideElement OkrugValue = $("#react-select-4--value-item");//Округ
    SelenideElement DistrictValue = $("#react-select-5--value-item");//Район
    SelenideElement AddressText = $("#address_text");//Адрес
    SelenideElement TerritoryTypeValue = $(byXpath(".//*[@id='territory_type_id']/div[1]/div[2]"));//Тип территории
    SelenideElement EnumerationTab = $("#enumeration-tab");//Перечетная ведомость
    SelenideElement AssortmentTab = $("#assortment-tab");//Ассортиментная ведомость
    SelenideElement RepairsTab = $("#repairs-tab");//Сведения о благоустройстве и ремонте
    SelenideElement TotalCleanArea = $("#total_clean_area");//Общая уборочная площадь
    SelenideElement TerritoryPurpose = $("#territory_purpose");//Классификационный код
    SelenideElement GreeneryCleanCategoryValue = $(byXpath(".//*[@id='greenery_clean_category_id']/div[1]/div[2]"));
    SelenideElement PassportNum = $("#passport_num");//Номер паспорта
    SelenideElement PassportCustomer = $("#react-select-6--value-item");//Заказчик паспорта
    SelenideElement PassportDraft = $("#react-select-7--value-item");//Разработчик паспорта
    SelenideElement PassportDraftFio = $("#passport_draft_fio");//Составитель паспорта (Ф.И.О. исполнителя, составляющего паспорт)
    SelenideElement InventoryDate = $("#inventory_date");//Дата проведения полевых работ
    SelenideElement PassportDate = $("#passport_date");//Дата согласования/составления паспорта
    SelenideElement PassportId = $("#passport_id");//Уникальный идентификационный номер паспорта
    SelenideElement PlaningCharacteristicInfo = $("#planing_characteristic_info");//Архитектурно-планировочная характеристика
    SelenideElement AddressBtiNumberValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div/div/div/div"));//Связанные Адреса БТИ № п/п
    SelenideElement AddressBtiOkrugValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div"));//Связанные Адреса БТИ Округ
    SelenideElement AddressBtiDistrictValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[3]/div/div/div/div"));//Связанные Адреса БТИ Район
    SelenideElement AddressBtiStreetValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[4]/div/div/div/div"));//Связанные Адреса БТИ Улица
    SelenideElement AddressBtiAddressValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[5]/div/div/div/div"));//Связанные Адреса БТИ Дом, корпус, строение
    SelenideElement AddressBtiUnomValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[6]/div/div/div/div"));//Связанные Адреса БТИ UNOM
    SelenideElement AddressBtiUnadValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[7]/div/div/div/div"));//Связанные Адреса БТИ UNAD
    SelenideElement AddressBtiStatusValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[8]/div/div/div/div"));//Связанные Адреса БТИ Статус
    SelenideElement AddressBtiBuildingClassValue = $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[9]/div/div/div/div"));//Связанные Адреса БТИ Класс строения
    SelenideElement ArchPlanCharactNumberValue = $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div/div/div/div"));//Архитектурно-планировочная характеристика № п/п
    SelenideElement ArchPlanCharactTypeValue = $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div"));//Архитектурно-планировочная характеристика Тип объекта
    SelenideElement ArchPlanCharactQuantityValue = $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[3]/div/div/div/div"));//Архитектурно-планировочная характеристика Кол-во
    SelenideElement ArchPlanCharactConditionValue = $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[4]/div/div/div/div"));//Архитектурно-планировочная характеристика Состояние
    SelenideElement ArchPlanCharactRecomendationValue = $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[5]/div/div/div/div"));//Архитектурно-планировочная характеристика Рекомендация
    SelenideElement SubtitleEnumeration = $(byXpath(".//*[@id='enumeration']/div/h2"));//Заголовок Перечетная ведомость
    SelenideElement EnumerationNumberValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div/div/div/div"));//Перечетная ведомость № п/п
    SelenideElement EnumerationNumberTerritoryValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div"));//Перечетная ведомость № участка
    SelenideElement EnumerationNumberBiogroupValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[3]/div/div/div/div"));//Перечетная ведомость № биогруппы
    SelenideElement EnumerationNumberPlantValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[4]/div/div/div/div"));//Перечетная ведомость № растения
    SelenideElement EnumerationTypePlantationValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[5]/div/div/div/div"));//Перечетная ведомость Тип насаждения
    SelenideElement EnumerationLifeFormValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[6]/div/div/div/div"));//Перечетная ведомость Жизненная форма
    SelenideElement EnumerationPlaceValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[7]/div/div/div/div"));//Перечетная ведомость Месторасположение (парки, скверы, улицы, магистрали и т.д.)
    SelenideElement EnumerationTypePlantValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[8]/div/div/div/div"));//Перечетная ведомость Вид растения
    SelenideElement EnumerationPlantQuantityValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[9]/div/div/div/div"));//Перечетная ведомость Кол-во растений, шт.
    SelenideElement EnumerationPlantSquareValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[10]/div/div/div/div"));//Перечетная ведомость Кол-во растений, кв.м
    SelenideElement EnumerationPlantAreaValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[11]/div/div/div/div"));//Перечетная ведомость Кол-во растений, п.м
    SelenideElement EnumerationDiameterValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[12]/div/div/div/div"));//Перечетная ведомость Диаметр на высоте 1,3 м.
    SelenideElement EnumerationHeightValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[13]/div/div/div/div"));//Перечетная ведомость Высота, м.
    SelenideElement EnumerationAgeValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[14]/div/div/div/div"));//Перечетная ведомость Возраст, лет
    SelenideElement EnumerationWithoutWeakValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[15]/div/div/div/div"));//Перечетная ведомость Без признаков ослабления, шт
    SelenideElement EnumerationWeakValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[16]/div/div/div/div"));//Перечетная ведомость Ослабленные, шт
    SelenideElement EnumerationVeryWeakValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[17]/div/div/div/div"));//Перечетная ведомость Сильно-ослабленные, шт
    SelenideElement EnumerationDryingValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[18]/div/div/div/div"));//Перечетная ведомость Усыхающие, шт
    SelenideElement EnumerationDeadwoodThisYearValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[19]/div/div/div/div"));//Перечетная ведомость Сухостой текущего года, шт
    SelenideElement EnumerationDeadwoodLastYearValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[20]/div/div/div/div"));//Перечетная ведомость Сухостой прошлых лет, шт
    SelenideElement EnumerationCharacteristicValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[21]/div/div/div/div"));//Перечетная ведомость Характеристика состояния растений
    SelenideElement EnumerationRecomendationValue = $(byXpath(".//*[@id='enumeration']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[22]/div/div/div/div"));//Перечетная ведомость Рекомендации по уходу
    SelenideElement SubtitleAssortmentType = $(byXpath(".//*[@id='assortment']/div/h2"));//Подзаголовок Ассортиментная ведомость
    SelenideElement AssortmentYearValue = $(byXpath(".//*[@id='assortment']/div/div[1]/h2"));//Ассортиментная ведомость Год
    SelenideElement AssortmentSeasonValue = $(byXpath(".//*[@id='assortment']/div/div[1]/h3"));//Ассортиментная ведомость Сезон
    SelenideElement AssortmentNumberValue = $(byXpath(".//*[@id='assortment']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div/div/div/div"));//Ассортиментная ведомость № п/п
    SelenideElement AssortmentPlantQuantityValue = $(byXpath(".//*[@id='assortment']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div"));//Ассортиментная ведомость Кол-во растений, шт.
    SelenideElement AssortmentCultureNameValue = $(byXpath(".//*[@id='assortment']/div/div[1]/div[2]/div/div/div[1]/div[3]/div/div/div/div[2]/div/div[3]/div/div/div/div"));//Ассортиментная ведомость Наименование культуры
    SelenideElement SubtitleRepairs = $(byXpath(".//*[@id='repairs']/div/h2"));//Подзаголовок Сведения о благоустройстве и ремонте
    SelenideElement RepairsNumberValue = $(byXpath(".//*[@id='repairs']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[1]/div/div/div/div"));//Сведения о благоустройстве и ремонте № п/п
    SelenideElement RepairsNameValue = $(byXpath(".//*[@id='repairs']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[2]/div/div/div/div"));//Сведения о благоустройстве и ремонте Наименование
    SelenideElement RepairsDateValue = $(byXpath(".//*[@id='repairs']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[3]/div/div/div/div"));//Сведения о благоустройстве и ремонте Дата
    SelenideElement RepairsCharacteristicValue = $(byXpath(".//*[@id='repairs']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[4]/div/div/div/div"));//Сведения о благоустройстве и ремонте Характеристика (объемы)
    SelenideElement RepairsOrganizationValue = $(byXpath(".//*[@id='repairs']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[5]/div/div/div/div"));//Сведения о благоустройстве и ремонте Подрядная организация
    SelenideElement RepairsGuarantee = $(byXpath(".//*[@id='repairs']/div/div[1]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div[6]/div/div/div/div"));//Сведения о благоустройстве и ремонте Гарантийные сроки
    SelenideElement Okrug = $(byXpath("//span[@id='react-select-4--value']/div[1]"));//Поле Округ
    SelenideElement OkrugInput = $(byXpath("//span[@id='react-select-4--value']/div/input"));//Ввод значения в поле Округ
    SelenideElement OkrugCombobox = $("#react-select-4--option-0");//Выпадающий список поля Округ
    SelenideElement District = $(byXpath("//span[@id='react-select-5--value']/div[1]"));//Поле Район
    SelenideElement DistrictInput = $(byXpath("//span[@id='react-select-5--value']/div/input"));////Ввод значения в поле Район
    SelenideElement DistrictComboBox = $("#react-select-5--option-0");//Выпадающий список поля Район
    SelenideElement TerritoryTypeComboBox = $(byXpath("//div[@id='territory_type_id']/div[1]/div[2]"));//Тип территории
    SelenideElement AddressBTIAddButton = $(byXpath("//div[1]/div/div[1]/div[3]/div/form/div[3]/div[6]/div/div[1]/div[1]/button[1]"));//Кнопка добавления Связанные адреса БТИ
    SelenideElement AddressDetailsValue = $(byName("address_details"));//поле Улица/Адрес в Связанные адреса БТИ
    SelenideElement GreeneryCleanCategoryComboBox = $(byXpath(".//*[@id='greenery_clean_category_id']/div[1]/div[2]"));//Категория содержания зеленных насаждений
    SelenideElement ArchPlanCharacteristicAddButton = $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[1]/button[1]"));//Кнопка добавления Архитектурно-планировочная характеристика
    SelenideElement ArchPlanCharacteristicBuildingTypeComboBox = $(byXpath(".//*[@id='buildings_type_id']/div[1]/div[2]"));//Архитектурно-планировочная характеристика: Тип объекта
    SelenideElement ArchPlanCharacteristicConditionComboBox = $(byXpath(".//*[@id='condition_id']/div[1]/div[2]"));////Архитектурно-планировочная характеристика: Состояние
    SelenideElement ArchPlanCharacteristicQuantity = $("#quantity");////Архитектурно-планировочная характеристика: Кол-во
    SelenideElement ArchPlanCharacteristicRecomendation = $("#recomendation");////Архитектурно-планировочная характеристика: Рекомендация

    @BeforeClass
    public void befClass() {
        autorisationUser();
    }

    @BeforeMethod
    public void befTest() {
        openOGHReestr();
    }

    @Test
    public void improvementTerritory() {
        clickImprovementTerritory_24();
        objectNull();
        $(byXpath(".//*[@id='props']/div[2]/div[1]/div/div[2]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[3]/div[1]/div[1]/div/div[2]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[3]/div[1]/div[2]/div/div[2]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[4]/div[1]/div/div[2]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[5]/div[1]/div/div[4]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='props']/div[2]/div[1]/div/div[1]/hr[2]")).waitUntil(visible, 25000).exists();
        $(byXpath(".//*[@id='props']/div[4]/div[1]/div/div[1]/hr[2]")).waitUntil(visible, 25000).exists();
        $(byXpath(".//*[@id='props']/div[5]/div[1]/div/div[3]/hr[2]")).waitUntil(visible, 25000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#territory_type_id\").offset().top - 100}, 1000);");
        $(byXpath(".//*[@id='props']/div[6]/div/div[1]/div[1]/div")).waitUntil(visible, 25000).shouldHave(text("обязательный список"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[1]/div/div[2]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[3]/div/div[4]")).waitUntil(visible, 25000).shouldHave(text("обязательное поле"));
        $(byXpath(".//*[@id='characteristics']/div[1]/div[1]/div/div[1]/hr[2]")).waitUntil(visible, 25000).exists();
        $(byXpath(".//*[@id='characteristics']/div[1]/div[3]/div/div[3]/hr[2]")).waitUntil(visible, 25000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#passport_id\").offset().top}, 1000);");
        $(byXpath(".//*[@id='characteristics']/div[4]/div[2]/div[1]/div")).waitUntil(visible, 25000).shouldHave(text("обязательный список"));

    }

    @Test
    public void requiredImprovementTerritory() {
        clickImprovementTerritory_24();
        objectNull();
        Reestr_Name.sendKeys("Автотест1");
        Okrug.click();
        OkrugInput.sendKeys("ЮЗАО");
        OkrugCombobox.click();
        District.click();
        DistrictInput.sendKeys("Южн");
        DistrictComboBox.click();
        AddressText.sendKeys("Тестовая улица");
        TerritoryTypeComboBox.click();
        $(byText("Основные")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#territory_type_id>div\").offset().top - 100}, 2000);");
        AddressBTIAddButton.waitUntil(visible, 10000).click();
        AddressDetailsValue.click();
        AddressDetailsValue.sendKeys("лом");
        $(byText("Ломоносовский проспект, дом 32")).waitUntil(visible,10000).click();
        $(byText("Добавить")).click();
        TotalCleanArea.sendKeys("85");
        GreeneryCleanCategoryComboBox.click();
        $(byText("I-я кат.")).click();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#passport_draft_fio\").offset().top + 350}, 1500);");
        ArchPlanCharacteristicAddButton.click();
        ArchPlanCharacteristicBuildingTypeComboBox.click();
        $(byText("Здание магазина")).click();
        ArchPlanCharacteristicConditionComboBox.click();
        $(byText("неудовлетворительное")).click();
        ArchPlanCharacteristicQuantity.sendKeys("545632");
        ArchPlanCharacteristicRecomendation.sendKeys("Тестовая");
        $(byText("Добавить")).click();
        clickSave();
        $(byText("Не указана геометрия объекта. Отобразите геометрию ОГХ перед сохранением."));



    }

    @Test
    public void viewImprovementTerritoryProject() {
        clickImprovementTerritory_24();
        Id_or_Name.sendKeys("3404477");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("3404477")).click();
        Header_Card.shouldHave(text("Тестовое"));
    }

    @Test
    public void viewImprovementTerritoryApproved() {
        clickImprovementTerritory_24();
        Id_or_Name.sendKeys("3284055");
        Search_Button.click();
        $(byText("3284055")).click();
        Header_Card.shouldHave(text("Краснопрудная ул. 11 ID 3284055"));
    }

    @Test
    public void ImprovementTerritoryAllFields() {
        clickImprovementTerritory_24();
        Id_or_Name.sendKeys("3404533");
        Search_Button.click();
        $(byText("3404533")).click();
        Header_Card.shouldHave(text("Не трогать Объект для Автотеста ID 3404533"));
        assertTrue("Проверка Дата С", Start_Date.getValue().contains("29.03.2017"));
        assertTrue("Проверка Дата По", End_Date.getValue().contains("01.01.3000"));
        StatusValue.shouldHave(text("Утвержден"));
        Properties.shouldHave(text("Свойства"));
        Version.shouldHave(text("Версии"));
        ApprovingTab.shouldHave(text("Согласование"));
        OwnerValue.shouldHave(text("ГБУ \"ЭВАЖД\""));
        CustomerValue.shouldHave(text("ГБУ \"ЭВАЖД\""));
        assertTrue("Проверка Имя", Reestr_Name.getValue().contains("Не трогать Объект для Автотеста"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#name\").offset().top - 250}, 1000);");
        OkrugValue.shouldHave(text("ЮВАО"));
        DistrictValue.shouldHave(text("Капотня"));
        assertTrue("Проверка Адрес", AddressText.getValue().contains("тестовый для автотеста"));
        TerritoryTypeValue.shouldHave(text("Самоуправление"));
        Subtitle_AddressBTI.shouldHave(text("Связанные адреса БТИ"));
        Subtitle_Characteristic.shouldHave(text("Классификационные характеристики"));
        AddressBtiNumberValue.shouldHave(text("1"));
        AddressBtiOkrugValue.shouldHave(text("ЗАО"));
        AddressBtiDistrictValue.shouldHave(text("Раменки"));
        AddressBtiStreetValue.shouldHave(text("Ломоносовский просп."));
        AddressBtiAddressValue.shouldHave(text("32"));
        AddressBtiUnomValue.shouldHave(text("7101"));
        AddressBtiUnadValue.shouldHave(text("2"));
        AddressBtiStatusValue.shouldHave(text("актуален"));
        AddressBtiBuildingClassValue.shouldHave(text("1"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#total_clean_area\").offset().top + 120}, 1000);");
        Characteristics.shouldHave(text("Исходные данные"));
        EnumerationTab.shouldHave(text("Перечетная ведомость"));
        AssortmentTab.shouldHave(text("Ассортиментная ведомость"));
        RepairsTab.shouldHave(text("Сведения о благоустройстве и ремонте"));
        Materials.shouldHave(text("Материалы"));
        assertTrue("Проверка Общая уборочная площадь", TotalCleanArea.getValue().contains("8547125"));
        assertTrue("Проверка Классификационный код", TerritoryPurpose.getValue().contains("Классификация автотест"));
        GreeneryCleanCategoryValue.shouldHave(text("I-я кат."));
        Subtitle_Passport.shouldHave(text("Данные паспорта"));
        assertTrue("Проверка Номер паспорта", PassportNum.getValue().contains("автотест 23467 хор"));
        PassportCustomer.shouldHave(text("ООО \"ЭКОТЕХ\""));
        PassportDraft.shouldHave(text("ООО \"ПОСЕЙДОН КОМПАНИ\""));
        assertTrue("Проверка Составитель паспорта (Ф.И.О. исполнителя, составляющего паспорт)", PassportDraftFio.getValue().contains("Тестировщик Тест Тестович"));
        assertTrue("Проверка Дата проведения полевых работ", InventoryDate.getValue().contains("07.04.2017"));
        assertTrue("Проверка Дата согласования/составления паспорта", PassportDate.getValue().contains("16.04.2017"));
        assertTrue("Проверка Уникальный идентификационный номер паспорта", PassportId.getValue().contains("Самый уникальный номер 123"));
        Subtitle_ArchPlanCharact.shouldHave(text("Архитектурно-планировочная характеристика"));
        assertTrue("Проверка Архитектурно-планировочная характеристика", PlaningCharacteristicInfo.getValue().contains("Тестовая архитектура"));
        ArchPlanCharactNumberValue.shouldHave(text("1"));
        ArchPlanCharactTypeValue.shouldHave(text("Учебное"));
        ArchPlanCharactQuantityValue.shouldHave(text("356345634"));
        ArchPlanCharactConditionValue.shouldHave(text("удовлетворительное"));
        ArchPlanCharactRecomendationValue.shouldHave(text("теееееестттт"));

    }

    @Test
    public void ImprovementTerritoryEnumerationTab() {
        clickImprovementTerritory_24();
        Id_or_Name.sendKeys("3404533");
        Search_Button.click();
        $(byText("3404533")).click();
        Header_Card.shouldHave(text("Не трогать Объект для Автотеста ID 3404533"));
        assertTrue("Проверка Дата С", Start_Date.getValue().contains("29.03.2017"));
        assertTrue("Проверка Дата По", End_Date.getValue().contains("01.01.3000"));
        assertTrue("Проверка Имя", Reestr_Name.getValue().contains("Не трогать Объект для Автотеста"));
        executeJavaScript("$('.content').animate({scrollTop: $(\"#name\").offset().top -150 }, 2000);");
        $("#enumeration-tab").click();
        SubtitleEnumeration.shouldHave(text("Перечётная ведомость"));
        EnumerationNumberValue.shouldHave(text("1"));
        EnumerationNumberTerritoryValue.shouldHave(text("4984965"));
        EnumerationNumberBiogroupValue.shouldHave(text("12343"));
        EnumerationNumberPlantValue.shouldHave(text("768567"));
        EnumerationTypePlantationValue.shouldHave(text("Однорядная живая изгородь"));
        EnumerationLifeFormValue.shouldHave(text("Полукустарник"));
        EnumerationPlaceValue.shouldHave(text("улицымагистрали"));
        EnumerationTypePlantValue.shouldHave(text("Цветы многолетние"));
        EnumerationPlantQuantityValue.shouldHave(text("45656"));
        EnumerationPlantSquareValue.shouldHave(text("4456456"));
        EnumerationPlantAreaValue.shouldHave(text("87686"));
        EnumerationDiameterValue.shouldHave(text("45687"));
        EnumerationHeightValue.shouldHave(text("98320"));
        EnumerationAgeValue.shouldHave(text("21346"));
        EnumerationWithoutWeakValue.shouldHave(text("9789"));
        EnumerationWeakValue.shouldHave(text("3452"));
        EnumerationVeryWeakValue.shouldHave(text("678677"));
        EnumerationDryingValue.shouldHave(text("34534"));
        EnumerationDeadwoodThisYearValue.shouldHave(text("657567"));
        EnumerationDeadwoodLastYearValue.shouldHave(text("345345"));
        EnumerationCharacteristicValue.shouldHave(text("8999090"));
        EnumerationRecomendationValue.shouldHave(text("ухаживайте"));
    }


        @Test
        public void ImprovementTerritoryAssortmentTab() {
            clickImprovementTerritory_24();
            Id_or_Name.sendKeys("3404533");
            Search_Button.click();
            $(byText("3404533")).click();
            Header_Card.shouldHave(text("Не трогать Объект для Автотеста ID 3404533"));
            assertTrue("Проверка Дата С", Start_Date.getValue().contains("29.03.2017"));
            assertTrue("Проверка Дата По", End_Date.getValue().contains("01.01.3000"));
            assertTrue("Проверка Имя", Reestr_Name.getValue().contains("Не трогать Объект для Автотеста"));
            executeJavaScript("$('.content').animate({scrollTop: $(\"#name\").offset().top -150 }, 2000);");
            AssortmentTab.waitUntil(visible,10000).click();
            SubtitleAssortmentType.shouldHave(text("Ассортиментная ведомость"));
            AssortmentYearValue.shouldHave(text("2017"));
            AssortmentSeasonValue.shouldHave(text("Лето"));
            AssortmentNumberValue.shouldHave(text("1"));
            AssortmentPlantQuantityValue.shouldHave(text("456745"));
            AssortmentCultureNameValue.shouldHave(text("тестовая"));


        }

        @Test
        public void ImprovementTerritoryRepairsTab() {
            clickImprovementTerritory_24();
            Id_or_Name.sendKeys("3404533");
            Search_Button.click();
            $(byText("3404533")).click();
            Header_Card.shouldHave(text("Не трогать Объект для Автотеста ID 3404533"));
            assertTrue("Проверка Дата С", Start_Date.getValue().contains("29.03.2017"));
            assertTrue("Проверка Дата По", End_Date.getValue().contains("01.01.3000"));
            assertTrue("Проверка Имя", Reestr_Name.getValue().contains("Не трогать Объект для Автотеста"));
            executeJavaScript("$('.content').animate({scrollTop: $(\"#name\").offset().top -250 }, 2500);");
            RepairsTab.waitUntil(visible,10000).click();
            SubtitleRepairs.shouldHave(text("Сведения о благоустройстве и ремонте"));
            RepairsNumberValue.shouldHave(text("1"));
            RepairsNameValue.shouldHave(text("ремонт тестовый"));
            RepairsDateValue.shouldHave(text("05.04.2017"));
            RepairsCharacteristicValue.shouldHave(text("большие"));
            RepairsOrganizationValue.shouldHave(text("Хорошая"));
            RepairsGuarantee.shouldHave(text("нет гарантии"));

        }




}