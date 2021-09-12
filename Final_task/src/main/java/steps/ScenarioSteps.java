package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainSteps = new MainPageSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    SubSectionSteps subSectionSteps = new SubSectionSteps();
    FilterSteps filterSteps = new FilterSteps();


    @When("^выбран раздел 'Яндекс.Маркет'")
    public void stepSelectMarketSection() {
        mainSteps.selectMarketSection();
        new BaseSteps().switchToNextTab();
    }

    @When("^выбрано меню 'Электроника'")
    public void stepSelectElectronicsMenu() {
        marketSteps.selectElectronicsMenu();
    }

    @When("^выбран раздел \"(.*)\"$")
    public void stepSelectSubMenu(String menu) {
        electronicsSteps.selectSubMenu(menu);
    }

    @Then("^заходим в расширенный поиск - нажатие на кнопку 'Все фильтры'")
    public void stepClickOnAllFiltersButton() {
        subSectionSteps.clickOnAllFiltersButton();
    }

    @When("^задан параметр поиска от \"(.*)\" рублей$")
    public void stepSetPriceSince(String price) {
        filterSteps.setPriceSince(price);
    }

    @When("^выбран производитель \"(.*)\"$")
    public void stepSetProducer(String producer) throws InterruptedException {
        filterSteps.setProducer(producer);
    }

    @Then("^производится нажатие на кнопку 'Показать'")
    public void stepPressShowButton() {
        filterSteps.pressShowButton();
    }

    @When("^выбран параметр 'Показывать по 12' элементов на странице")
    public void stepChoose12ShowedResults() throws InterruptedException {
        subSectionSteps.choose12ShowedResults();
    }

    @Then("^на странице найдено \"(.*)\" элементов")
    public void stepCheckNumberOfShowedResults(int number){
        subSectionSteps.checkNumberOfShowedResults(number);
    }

    @When("^получили заголовок первого элемента в списке среди категории \"(.*)\"$")
    public void stepGetTitleOfFirstResult(String item) {
        switch (item) {
            case "Телевизоры":
                subSectionSteps.getTitleOfFirstResultTv();
                break;
            case "Наушники":
                subSectionSteps.getTitleOfFirstResultHeadPhones();
                break;
        }
    }

    @When("^в поисковой строке было введено значение, которое запомнили ранее, и нажат ENTER")
    public void stepSearchFirstItem() {
        subSectionSteps.searchFirstItem();
    }

    @Then("^в результатах поиска найден товар, по которому был произведен поиск")
    public void stepCheckItemTitle() {
        subSectionSteps.checkSearchedTitle();
    }

}
