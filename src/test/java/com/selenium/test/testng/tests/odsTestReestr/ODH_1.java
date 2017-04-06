package com.selenium.test.testng.tests.odsTestReestr;

import com.selenium.test.testng.tests.odsTestReestr.TestProcedures;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

/**
 * Created by Vyacheslav on 27.03.2017.
 */
/*public class ODH_1 extends TestProcedures {

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
        $(byXpath("./*//*[@id='auto-owner_id']/div")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='props']/div[2]/div[1]/div/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='address_list_0']/div[1]/div[2]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='characteristics']/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='characteristics']/div[1]/div[2]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='props']/div[2]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath("./*//*[@id='address_list_0']/div[1]/div[1]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath("./*//*[@id='characteristics']/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath("./*//*[@id='characteristics']/div[1]/div[2]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        executeJavaScript("$('.content').animate({scrollTop: $(\"#object_category_id>div\").offset().top - 250}, 1000);");
        $(byXpath("./*//*[@id='characteristics']/div[2]/div[1]/div[1]/div/div[4]")).waitUntil(visible,15000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='characteristics']/div[3]/div[1]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='characteristics']/div[3]/div[2]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='characteristics']/div[2]/div[1]/div[1]/div/div[3]/hr[2]")).waitUntil(visible,15000).exists();
        $(byXpath("./*//*[@id='characteristics']/div[3]/div[1]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
        $(byXpath("./*//*[@id='characteristics']/div[3]/div[2]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
        $("#options-tab").click();
        $(byXpath("./*//*[@id='options']/div/div[4]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='options']/div/div[5]/div/div[2]")).waitUntil(visible,20000).shouldHave(text("обязательное поле"));
        $(byXpath("./*//*[@id='options']/div/div[4]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
        $(byXpath("./*//*[@id='options']/div/div[5]/div/div[1]/hr[2]")).waitUntil(visible,20000).exists();
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
    public void viewODHApproved() {
        clickODH_1();
        Id_or_Name.sendKeys("1134870");
        Search_Button.click();
        $(byText("1134870")).click();
        Header_Card.shouldHave(text("Мичуринский проспект ID 1134870"));
    }

    @Test
    public void viewODHProject() {
        clickODH_1();
        Id_or_Name.sendKeys("2269169");
        StatusValue.click();
        Status_Combo_Box_List.find(text("Проект")).click();
        //$(byText("Проект")).click();
        Search_Button.click();
        $(byText("2269169")).click();
        Header_Card.shouldHave(text("Улица Судакова"));

    }

}*/
