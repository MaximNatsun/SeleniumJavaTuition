package steps;

import io.qameta.allure.Step;
import pages.MarketPage;

public class MarketSteps {

    @Step("Выбрано меню 'Электроника'")
    public void selectElectronicsMenu() {
        new MarketPage().clickOnElectronicsMenu();
    }
}
