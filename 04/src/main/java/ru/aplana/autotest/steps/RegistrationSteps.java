package ru.aplana.autotest.steps;

import io.qameta.allure.Step;
import ru.aplana.autotest.pages.InsurancePage;
import ru.aplana.autotest.pages.RegistrationPage;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class RegistrationSteps {

    @Step("Значение '{0}' заполнено в поле '{1}'.")
    public void stepFillFieldOnPage(String value, String field) {
        new RegistrationPage().fillFieldOnPage(field, value);
    }

    @Step("Был выбран '{0}' пол")
    public void stepClickOnMaleGender() {
        new RegistrationPage().clickOnMaleGender();
    }

    @Step("Значение '{0}' корректно заполнено в поле '{1}'")
    public void stepCheckCorrectContent(String value, String field) {
        new RegistrationPage().checkCorrectContent(value, field);
    }

    @Step("Выполнено нажатие на кнопку 'Продолжить'")
    public void stepClickOnContinueAppButton() {
        new RegistrationPage().clickOnContinueAppButton();
    }

    @Step("На странице обнаружено общее сообщение об ошибке: '{0}'")
    public void stepCheckCommonErrorMessage(String expectedMessage) {
        String actualMessage = new RegistrationPage().commonErrorMessage.getText();
        assertTrue(String.format("Ожидаемое сообщение равно [%s]. Фактическое сообщение - [%s]", expectedMessage, actualMessage),
                actualMessage.contains(expectedMessage));
    }

    @Step("На странице под полем 'Phone' найдено сообщение об ошибке '{1}'")
    public void stepCheckPhoneErrorMessage(String expectedMessage) {
        String actualMessage = new RegistrationPage().errorMessagePhone.getText();
        assertTrue(String.format("Ожидаемое сообщение равно [%s]. Фактическое сообщение - [%s]", expectedMessage, actualMessage),
                actualMessage.contains(expectedMessage));
    }

    @Step("На странице под полем 'Email' найдено сообщение об ошибке '{1}'")
    public void stepCheckEmailErrorMessage(String expectedMessage) {
        String actualMessage = new RegistrationPage().errorMessageEmail.getText();
        assertTrue(String.format("Ожидаемое сообщение равно [%s]. Фактическое сообщение - [%s]", expectedMessage, actualMessage),
                actualMessage.contains(expectedMessage));
    }

    @Step("На странице под полем 'repeatEmail' найдено сообщение об ошибке '{1}'")
    public void stepCheckRepeatEmailErrorMessage(String expectedMessage) {
        String actualMessage = new RegistrationPage().errorMessageConfirmEmail.getText();
        assertTrue(String.format("Ожидаемое сообщение равно [%s]. Фактическое сообщение - [%s]", expectedMessage, actualMessage),
                actualMessage.contains(expectedMessage));
    }
}
