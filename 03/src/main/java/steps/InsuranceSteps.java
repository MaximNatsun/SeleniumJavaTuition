package steps;

import io.qameta.allure.Step;
import pages.InsurancePage;

public class InsuranceSteps extends BaseSteps {

    @Step("На странице найден заголовок '{0}'.")
    public void stepGetTitle(String title) {
        new InsurancePage(driver).checkTitle(title);
    }

    @Step("Выполнено нажатие на кнопку '{0}'.")
    public void stepClickOnButton(String buttonName) {
        new InsurancePage(driver).clickOnButton(buttonName);
    }

}
