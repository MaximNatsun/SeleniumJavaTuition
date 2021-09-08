package ru.aplana.autotest.steps;

import io.qameta.allure.Step;
import ru.aplana.autotest.pages.MainPage;

public class MainPageSteps {
    @Step("Выбрано меню '{0}'.")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage().selectMainMenu(menuItem);
    }

    @Step("Выбран пункт '{0}'.")
    public void stepSelectSubMenuInsurance(String menuItem) {
        new MainPage().selectSubMenuInsurance(menuItem);
    }
}
