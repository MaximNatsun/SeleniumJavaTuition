package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsurancePage extends BasePage {

    @FindBy(xpath = "//h1[contains(@class, 'kitt-heading')]")
    public WebElement title;

    @FindBy(xpath = "//div[contains(@class, 'page-teaser-dict__button')]//*[contains(@data-test-id, 'PageTeaserDict_button')]")
    public WebElement button;

    public InsurancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(title));
        this.driver = driver;
    }

    public void clickOnButton(String item) {
        button.findElement(By.xpath(".//*[contains(text(), '"+item+"')]")).click();
    }

    public String getTitle() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(@class, 'kitt-heading')]"))));
        return driver.findElement(By.xpath("//h1[contains(@class, 'kitt-heading')]")).getText();
    }
}
