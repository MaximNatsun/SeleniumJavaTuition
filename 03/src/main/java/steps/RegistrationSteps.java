package steps;

import io.qameta.allure.Step;
import pages.RegistrationPage;

import java.util.HashMap;

public class RegistrationSteps extends BaseSteps {

    @Step("Значение '{0}' заполнено в поле '{1}'.")
    public void stepFillFieldOnPage(String value, String field) {
        new RegistrationPage(driver).fillFieldOnPage(field, value);
    }

    @Step("Заполняются поля:")
    public void stepFillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepFillFieldOnPage);
    }

    @Step("Был выбран '{0}' пол")
    public void stepClickOnGender(String gender) {
        new RegistrationPage(driver).clickOnGender(gender);
    }

    @Step("Значение '{0}' корректно заполнено в поле '{1}'")
    public void stepCheckCorrectContent(String value, String field) {
        new RegistrationPage(driver).checkCorrectContent(value, field);
    }

    @Step("Проверяется корректность заполненных полей:")
    public void stepCheckFields(HashMap<String, String> fields) {
        fields.forEach(this::stepCheckCorrectContent);
    }

    @Step("Выполнено нажатие на кнопку '{0}'")
    public void stepClickOnContinueAppButton(String buttonName) {
        new RegistrationPage(driver).clickOnContinueAppButton(buttonName);
    }

    @Step("На странице под полем '{0}' найдено сообщение об ошибке '{1}'")
    public void stepCheckFieldErrorMessage(String field, String message) {
        new RegistrationPage(driver).checkFieldErrorMessage(message, field);
    }

    @Step("Проверяются сообщения об ошибке:")
    public void stepCheckFieldErrors(HashMap<String, String> fields) {
        fields.forEach(this::stepCheckFieldErrorMessage);
    }

    @Step("На странице обнаружено общее сообщение об ошибке: '{0}'")
    public void stepCheckCommonErrorMessage(String message) {
        new RegistrationPage(driver).checkCommonErrorMessage(message);
    }
}
