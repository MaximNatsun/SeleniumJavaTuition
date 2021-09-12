package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    @Step("Выбран раздел 'Маркет'")
    public void selectMarketSection() {
        new MainPage().clickOnMarketIcon();
    }

}
