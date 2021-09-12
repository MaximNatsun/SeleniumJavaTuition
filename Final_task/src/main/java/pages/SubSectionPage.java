package pages;

import io.cucumber.java.mn.Харин;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class SubSectionPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class, '_2Wdsc')]//*[contains(text(), 'Все фильтры')]")
    WebElement allFiltersButton;

    @FindBy(xpath = "//div[contains(@class, '_3JNss _1BSH6 v3cFc')]/button[@type = 'button']")
    WebElement numberOfShowedResults;

    @FindBy(xpath = "//div[contains(@class, '_3JNss _1BSH6 v3cFc')]//*[contains(text(), 'Показывать по 12')]")
    WebElement show12results;

    @FindBy(xpath = "//input[@id = 'header-search']")
    WebElement headerSearch;

    public SubSectionPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickOnAllFiltersButton() {
        allFiltersButton.click();
    }

    public void clickOnNumberOfShowedResults() {
        numberOfShowedResults.click();
    }

    public void clickOnShow12Results() throws InterruptedException {
        Thread.sleep(1000);
        show12results.click();
        Thread.sleep(2000);
    }

    public void searchFirstItem(String item) {
        fillField(headerSearch, item);
        headerSearch.sendKeys(Keys.ENTER);
    }

    public String getTitleOfFirstItemTv() {
        return "(//article[contains(@data-autotest-id, 'product-snippet')])[1]//a[contains(@title, 'Телевизор')]";
    }

    public String getTitleOfFirstItemHeadPhones() {
        return "(//article[contains(@data-autotest-id, 'product-snippet')])[1]//a[contains(@title, 'наушники')]";
    }
}
