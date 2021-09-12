package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage {

    @FindBy(xpath = "//div[contains(@class, '_3mU1o')]//*[contains(text(), 'Электроника')]")
    WebElement electronics;

    @FindBy(xpath = "//div[contains(@class, 'G4KLq')]")
    WebElement searchBar;

    @FindBy(xpath = "//button[contains(@data-tid, '8e34e3c2 8166f242')]")
    WebElement searchButton;

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickOnElectronicsMenu() {
        electronics.click();
    }
}
