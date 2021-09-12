package steps;

import io.qameta.allure.Step;
import pages.ElectronicsPage;


public class ElectronicsSteps {

    @Step("Выбрано подменю '{0}'")
    public void selectSubMenu(String subMenu) {
        new ElectronicsPage().clickOnSubMenu(subMenu);
    }

}
