package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[@id='main-page']")
    WebElement mainMenu;

    @FindBy(xpath = "//div[@id='main-page']//div[contains(@class, 'site-header')]")
    WebElement subMenuInsurance;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectMainMenu(String menuItem) {
        mainMenu.findElement(By.xpath(".//nav[contains(@class, 'kitt-top-menu')]//*[contains(text(), '"+menuItem+"')]")).click();
    }

    public void selectSubMenuInsurance(String menuItem) {
        subMenuInsurance.findElement(By.xpath(".//li[contains(@class, 'kitt-top-menu')]//*[contains(text(), '"+menuItem+"')]")).click();
    }
}
