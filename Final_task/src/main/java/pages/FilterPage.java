package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage extends BasePage {

    @FindBy(xpath = "//h4[contains(text(), 'Цена')]/ancestor::div[contains(@class, '_3918R _2GwyK')]//div[@data-prefix = 'от']/input[@type = 'text']")
    WebElement priceSince;

    @FindBy(xpath = "(//BUTTON[@class='zsSJk dOdmr _1QJa9'])[1]")
    WebElement showAllProducersButton;

    @FindBy(xpath = "//h4[contains(text(), 'Производитель')]/ancestor::div[contains(@class, '_3918R _2GwyK')]//*[contains(text(), 'Samsung')]")
    WebElement producerSamsung;

    @FindBy(xpath = "//h4[contains(text(), 'Производитель')]/ancestor::div[contains(@class, '_3918R _2GwyK')]//*[contains(text(), 'Beats')]")
    WebElement producerBeats;

    @FindBy(xpath = "//h4[contains(text(), 'Производитель')]/ancestor::div[contains(@class, '_3918R _2GwyK')]//*[contains(text(), 'LG')]")
    WebElement producerLG;

    @FindBy(xpath = "//div[@class = '_1Mk5a']//*[contains(text(), 'Показать')]")
    WebElement showButton;

    public FilterPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void setPriceSince(String price) {
        fillField(priceSince, price);
        priceSince.sendKeys(Keys.TAB);
    }

    public void setProducer(String item) throws InterruptedException {
        showAllProducersButton.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        switch (item) {
            case "Samsung":
                producerSamsung.click();
                break;
            case "LG":
                producerLG.click();
                break;
            case "Beats":
                producerBeats.click();
                break;
        }
    }

    public void pressShowButton() {
        showButton.click();
    }
}