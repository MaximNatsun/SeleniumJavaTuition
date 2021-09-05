import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.*;
import steps.BaseSteps;

public class MyRefactoringTest extends BaseSteps {
/*
    @Test
    @Ignore
    public void newInsuranceTest() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[contains(@class, 'kitt-cookie-warning__close')]")).click();

        MainPage mainPage = new MainPage(driver);
        mainPage.selectMainMenu("Страхование");
        mainPage.selectSubMenuInsurance("Все страховые программы");

        AllProgramsInsurancePage allProgramsInsurancePage = new AllProgramsInsurancePage(driver);
        allProgramsInsurancePage.selectProgramInsurancePage("Страхование путешественников");

        InsurancePage insurancePage = new InsurancePage(driver);
        insurancePage.checkTitle("Страхование путешественников");
        insurancePage.clickOnButton("Оформить онлайн");

        SendAppPage sendAppPage = new SendAppPage(driver);
        sendAppPage.waitSendAppClickable("Оформить");
        sendAppPage.clickOnInsuranceCover("Минимальная");
        sendAppPage.clickOnSendAppButton("Оформить");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.fillFieldOnPage("surname_vzr_ins_0", "Иванов");
        registrationPage.fillFieldOnPage("name_vzr_ins_0", "Иван");
        registrationPage.fillFieldOnPage("birthDate_vzr_ins_0", "25.11.1990");
        registrationPage.fillFieldOnPage("person_lastName", "Сидоров");
        registrationPage.fillFieldOnPage("person_firstName", "Петр");
        registrationPage.fillFieldOnPage("person_middleName", "Игоревич");
        registrationPage.fillFieldOnPage("person_birthDate", "12.04.1989");
        registrationPage.clickOnGender("Мужской");
        registrationPage.fillFieldOnPage("passportSeries", "3012");
        registrationPage.fillFieldOnPage("passportNumber", "335353");
        registrationPage.fillFieldOnPage("documentDate", "30.01.2016");
        registrationPage.fillFieldOnPage("documentIssue", "УВД Тестового района по г. Тест");

        // проверяем корректность заполненных полей
        registrationPage.checkCorrectContent("Иванов", "surname_vzr_ins_0");
        registrationPage.checkCorrectContent("Иван", "name_vzr_ins_0");
        registrationPage.checkCorrectContent("25.11.1990", "birthDate_vzr_ins_0");
        registrationPage.checkCorrectContent("Сидоров", "person_lastName");
        registrationPage.checkCorrectContent("Петр", "person_firstName");
        registrationPage.checkCorrectContent("Игоревич", "person_middleName");
        registrationPage.checkCorrectContent("12.04.1989", "person_birthDate");
        registrationPage.checkCorrectContent("3012", "passportSeries");
        registrationPage.checkCorrectContent("335353", "passportNumber");
        registrationPage.checkCorrectContent("30.01.2016", "documentDate");
        registrationPage.checkCorrectContent("УВД Тестового района по г. Тест", "documentIssue");

        // нажимаем "Продолжить" и проверяем наличие сообщений об ошибке
        registrationPage.clickOnContinueAppButton("Продолжить");
        registrationPage.checkCommonErrorMessage("При заполнении данных произошла ошибка");
        registrationPage.checkFieldErrorMessage("Поле не заполнено.", "phone");
        registrationPage.checkFieldErrorMessage("Поле не заполнено.", "email");
        registrationPage.checkFieldErrorMessage("Поле не заполнено.", "repeatEmail");
    }

 */
}
