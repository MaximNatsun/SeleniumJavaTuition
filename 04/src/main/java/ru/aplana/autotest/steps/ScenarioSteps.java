package ru.aplana.autotest.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ScenarioSteps {

    MainPageSteps mainSteps = new MainPageSteps();
    AllProgramsSteps allPrograms = new AllProgramsSteps();
    InsuranceSteps insuranceSteps = new InsuranceSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();

    @When("^выбран пункт меню \"(.*)\"$")
    public void stepSelectMainMenu(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^в подменю выбран пункт \"(.*)\"$")
    public void stepSelectSubMenuInsurance(String menuItem) {
        mainSteps.stepSelectSubMenuInsurance(menuItem);
    }

    @When("^выбрана программа \"(.*)\"$")
    public void stepSelectProgramInsurancePage(String menuItem) {
        allPrograms.stepSelectProgramInsurancePage(menuItem);
    }

    @Then("^заголовок страницы равен \"(.*)\"$")
    public void stepGetTitle(String title) {
        insuranceSteps.stepGetTitle(title);
    }

    @When("^выполнено нажатие на кнопку \"(.*)\"$")
    public void stepClickOnButton(String buttonName) {
        insuranceSteps.stepClickOnButton(buttonName);
    }

    @Then("^выбираем программу покрытия рисков \"(.*)\"$")
    public void stepClickOnInsuranceCover(String item) {
        sendAppSteps.stepClickOnInsuranceCover(item);
    }

    @Then("^выполняется нажатие на кнопку 'Оформить'")
    public void stepClickOnAppButton() {
        sendAppSteps.stepClickOnSendAppButton();
    }

    @When("^заполняются поля:$")
    public void stepFillFields(DataTable fields) {
        fields.<String,String>asMap(String.class, String.class)
                .forEach((field, value) -> registrationSteps.stepFillFieldOnPage(field, value));
    }

    @When("^выбран мужской пол$")
    public void stepChooseGender() {
        registrationSteps.stepClickOnMaleGender();
    }

    @Then("^значения полей равны:$")
    public void stepCheckCorrectContent(DataTable fields) {
        fields.<String,String>asMap(String.class, String.class)
                .forEach((field, value) -> registrationSteps.stepCheckCorrectContent(field, value));
    }

    @When("^производим нажатие на кнопку 'Продолжить'")
    public void stepClickOnContinueAppButton() {
        registrationSteps.stepClickOnContinueAppButton();
    }

    @Then("^отображается общее сообщение об ошибке \"(.*)\"$")
    public void stepCheckCommonErrorMessage(String message) {
        registrationSteps.stepCheckCommonErrorMessage(message);
    }

    @Then("^под полем 'Мобильный телефон' отобразилось сообщение об ошибке \"(.*)\"$")
    public void stepCheckPhoneErrorMessage(String message) {
        registrationSteps.stepCheckPhoneErrorMessage(message);
    }

    @Then("^под полем 'Электронная почта' отобразилось сообщение об ошибке \"(.*)\"$")
    public void stepCheckEmailErrorMessage(String message) {
        registrationSteps.stepCheckEmailErrorMessage(message);
    }

    @Then("^под полем 'Повтор электронной почты' отобразилось сообщение об ошибке \"(.*)\"$")
    public void stepCheckRepeatEmailErrorMessage(String message) {
        registrationSteps.stepCheckRepeatEmailErrorMessage(message);
    }
}
