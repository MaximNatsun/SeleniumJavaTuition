package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendAppPage extends BasePage {

    @FindBy(xpath = "//div[@class='col-12 centered-col']")
    public WebElement makeRequestButton;

    @FindBy(xpath = "//fieldset[contains(@class, 'no-offset non-border')]")
    public WebElement insuranceCover;

    public SendAppPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnInsuranceCover(String item) {
        insuranceCover.findElement(By.xpath(".//h3[contains(text(), '"+item+"')]")).click();
    }

    public void waitSendAppClickable(String item) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary btn-large')][text()='"+item+"']"))));
    }

    public void clickOnSendAppButton(String item) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
                driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary btn-large')][text()='"+item+"']")));
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary btn-large')][text()='"+item+"']")))).click();
    }
}