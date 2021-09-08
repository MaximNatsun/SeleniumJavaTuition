package ru.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.aplana.autotest.steps.BaseSteps;

import static org.junit.Assert.assertTrue;

public class InsurancePage extends BasePage {

    @FindBy(xpath = "//h1[contains(@class, 'kitt-heading')]")
    public WebElement title;

    @FindBy(xpath = "//div[contains(@class, 'page-teaser-dict__button')]//*[contains(@data-test-id, 'PageTeaserDict_button')]")
    public WebElement button;

    public InsurancePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickOnButton(String item) {
        button.findElement(By.xpath(".//*[contains(text(), '"+item+"')]")).click();
    }

    public void checkTitle(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(@class, 'kitt-heading')]"))));
        String actualTitle = driver.findElement(By.xpath("//h1[contains(@class, 'kitt-heading')]")).getText();
        assertTrue(String.format("Ожидаемый заголовок равен [%s]. Фактический заголовок - [%s]", expectedTitle, actualTitle),
                actualTitle.contains(expectedTitle));
    }
}
