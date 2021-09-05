import org.junit.Test;
import steps.*;

import java.util.HashMap;

public class TestForAllureReport extends BaseSteps {

    @Test
    public void textInsurance() {
        MainPageSteps mainSteps = new MainPageSteps();
        AllProgramsSteps allPrograms = new AllProgramsSteps();
        InsuranceSteps insuranceSteps = new InsuranceSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();
        RegistrationSteps registrationSteps = new RegistrationSteps();

        HashMap<String, String> testData = new HashMap<>();
        testData.put("Иванов", "surname_vzr_ins_0");
        testData.put("Иван", "name_vzr_ins_0");
        testData.put("25.11.1990", "birthDate_vzr_ins_0");
        testData.put("Сидоров", "person_lastName");
        testData.put("Петр", "person_firstName");
        testData.put("Игоревич", "person_middleName");
        testData.put("12.04.1989", "person_birthDate");
        testData.put("3012", "passportSeries");
        testData.put("335353", "passportNumber");
        testData.put("30.01.2016", "documentDate");
        testData.put("УВД Тестового района по г. Тест", "documentIssue");

        HashMap<String, String> errorMessages = new HashMap<>();
        errorMessages.put("phone", "Поле не заполнено.");
        errorMessages.put("email", "Поле не заполнено.");
        errorMessages.put("repeatEmail", "Поле не заполнено.");

        mainSteps.stepSelectMainMenu("Страхование");
        mainSteps.stepSelectSubMenuInsurance("Все страховые программы");
        allPrograms.stepSelectProgramInsurancePage("Страхование путешественников");
        insuranceSteps.stepGetTitle("Страхование путешественников");
        insuranceSteps.stepClickOnButton("Оформить онлайн");
        sendAppSteps.stepClickOnInsuranceCover("Минимальная");
        sendAppSteps.stepClickOnSendAppButton("Оформить");
        registrationSteps.stepFillFields(testData);
        registrationSteps.stepClickOnGender("Мужской");
        registrationSteps.stepCheckFields(testData);
        registrationSteps.stepClickOnContinueAppButton("Продолжить");
        registrationSteps.stepCheckCommonErrorMessage("При заполнении данных произошла ошибка");
        registrationSteps.stepCheckFieldErrors(errorMessages);
    }
}
