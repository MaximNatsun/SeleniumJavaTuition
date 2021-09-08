package ru.aplana.autotest.steps;

import io.qameta.allure.Step;
import ru.aplana.autotest.pages.SendAppPage;

public class SendAppSteps {

    @Step("Выбран план страховой защиты - '{0}'.")
    public void stepClickOnInsuranceCover(String item) {
        new SendAppPage().clickOnInsuranceCover(item);
    }

    @Step("Было выполнено нажатие на кнопку - 'Оформить'.")
    public void stepClickOnSendAppButton() {
        new SendAppPage().clickOnSendAppButton();
    }
}
