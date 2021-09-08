package ru.aplana.autotest.steps;

import io.qameta.allure.Step;
import ru.aplana.autotest.pages.InsurancePage;

import static org.junit.Assert.assertTrue;

public class InsuranceSteps {

    @Step("На странице найден заголовок '{0}'.")
    public void stepGetTitle(String expectedTitle) {
        String actualTitle = new InsurancePage().title.getText();
        assertTrue(String.format("Ожидаемый заголовок равен [%s]. Фактический заголовок - [%s]", expectedTitle, actualTitle),
                actualTitle.contains(expectedTitle));
    }

    @Step("Выполнено нажатие на кнопку '{0}'.")
    public void stepClickOnButton(String buttonName) {
        new InsurancePage().clickOnButton(buttonName);
    }

}
