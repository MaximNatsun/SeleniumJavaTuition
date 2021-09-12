package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage {

    @FindBy(xpath = "//div[contains(@class, 'services-new__content')]//*[contains(text(), 'Маркет')]")
    WebElement marketIcon;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickOnMarketIcon() {
        marketIcon.click();
    }
}
