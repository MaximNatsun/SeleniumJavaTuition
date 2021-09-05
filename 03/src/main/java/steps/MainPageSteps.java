package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps extends BaseSteps {
    @Step("Выбрано меню '{0}'.")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage(driver).selectMainMenu(menuItem);
    }

    @Step("Выбран пункт '{0}'.")
    public void stepSelectSubMenuInsurance(String menuItem) {
        new MainPage(driver).selectSubMenuInsurance(menuItem);
    }
}
