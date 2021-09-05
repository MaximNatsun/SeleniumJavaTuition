package steps;

import io.qameta.allure.Step;
import pages.AllProgramsInsurancePage;

public class AllProgramsSteps extends BaseSteps {

    @Step("Выполнено нажатие на программу '{0}'.")
    public void stepSelectProgramInsurancePage(String menuItem) {
        new AllProgramsInsurancePage(driver).selectProgramInsurancePage(menuItem);
    }

}
