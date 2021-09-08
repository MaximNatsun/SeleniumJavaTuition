package ru.aplana.autotest.steps;

import io.qameta.allure.Step;
import ru.aplana.autotest.pages.AllProgramsInsurancePage;

public class AllProgramsSteps {

    @Step("Выполнено нажатие на программу '{0}'.")
    public void stepSelectProgramInsurancePage(String menuItem) {
        new AllProgramsInsurancePage().selectProgramInsurancePage(menuItem);
    }

}
