package steps;

import io.qameta.allure.Step;
import pages.FilterPage;

public class FilterSteps {

    @Step("Установлен параметр поиска 'Цена' от {0} рублей")
    public void setPriceSince(String price) {
        new FilterPage().setPriceSince(price);
    }

    @Step("Выбран производитель - '{0}'")
    public void setProducer(String item) throws InterruptedException {
        new FilterPage().setProducer(item);
    }

    @Step("Произведено нажатие на кнопку 'Показать'")
    public void pressShowButton() {
        new FilterPage().pressShowButton();
    }
}
