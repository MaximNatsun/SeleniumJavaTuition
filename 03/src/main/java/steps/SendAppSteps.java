package steps;

import io.qameta.allure.Step;
import pages.SendAppPage;

public class SendAppSteps extends BaseSteps {

    @Step("Выбран план страховой защиты - '{0}'.")
    public void stepClickOnInsuranceCover(String item) {
        new SendAppPage(driver).clickOnInsuranceCover(item);
    }

    @Step("Выполнено нажатие на кнопку - '{0}'.")
    public void stepClickOnSendAppButton(String buttonName) {
        new SendAppPage(driver).clickOnSendAppButton(buttonName);
    }
}
