package steps;

import io.cucumber.java.mn.Харин;
import io.qameta.allure.Step;
import pages.SubSectionPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SubSectionSteps {

    BaseSteps baseSteps = new BaseSteps();

    @Step("Выполнено нажатие на кнопку 'Все фильтры'")
    public void clickOnAllFiltersButton() {
        new SubSectionPage().clickOnAllFiltersButton();
    }

    @Step("Выбран параметр 'Показывать по 12'")
    public void choose12ShowedResults() throws InterruptedException {
        new SubSectionPage().clickOnNumberOfShowedResults();
        new SubSectionPage().clickOnShow12Results();
    }

    @Step("На странице обнаружено '{0}' элементов")
    public void checkNumberOfShowedResults(int expectedNumber) {
        int actualNumber = new BaseSteps().countNumberOfElements("//article[contains(@data-autotest-id, 'product-snippet')]");
        assertEquals(expectedNumber, actualNumber);
    }

    @Step("Запомнили заголовок первого элемента в списке")
    public void getTitleOfFirstResultTv() {
        baseSteps.setTitleOfFirstResult(baseSteps.titleOfFirstResult(new SubSectionPage().getTitleOfFirstItemTv()));
        baseSteps.setTypeOfTitle("Телевизоры");
    }

    @Step("Запомнили заголовок первого элемента в списке")
    public void getTitleOfFirstResultHeadPhones() {
        baseSteps.setTitleOfFirstResult(baseSteps.titleOfFirstResult(new SubSectionPage().getTitleOfFirstItemHeadPhones()));
        baseSteps.setTypeOfTitle("наушники");
    }

    @Step("В поисковую строку введен элемент, который ранее запомнили")
    public void searchFirstItem() {
        String title = baseSteps.getTitleOfFirstResult();
        new SubSectionPage().searchFirstItem(title);
    }

    @Step("Наименование товара первого элемента соответствует искомому значению")
    public void checkSearchedTitle() {
        String rememberedTitle = baseSteps.getTitleOfFirstResult();
        String typeOfTitle = baseSteps.getTypeOfTitle();
        String actualTitleOfFirstItem = "";
        if (typeOfTitle.contains("Телевизоры")) {
            actualTitleOfFirstItem = baseSteps.titleOfFirstResult(new SubSectionPage().getTitleOfFirstItemTv());
        } else if (typeOfTitle.contains("наушники")) {
            actualTitleOfFirstItem = baseSteps.titleOfFirstResult(new SubSectionPage().getTitleOfFirstItemHeadPhones());
        }
        assertTrue(String.format("Запомненный заголовок равен [%s]. Фактический заголовок - [%s]", rememberedTitle, actualTitleOfFirstItem),
                actualTitleOfFirstItem.contains(rememberedTitle));
    }
}
