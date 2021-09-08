package ru.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.aplana.autotest.steps.BaseSteps;

public class SendAppPage extends BasePage {

    @FindBy(xpath = "//fieldset[contains(@class, 'no-offset non-border')]")
    WebElement insuranceCover;

    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary btn-large')][text()='Оформить']")
    public WebElement button;

    public SendAppPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickOnInsuranceCover(String item) {
        insuranceCover.findElement(By.xpath(".//h3[contains(text(), '"+item+"')]")).click();
    }

    public void clickOnSendAppButton() {
        button.click();
    }
}