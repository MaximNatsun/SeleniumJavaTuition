package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProgramsInsurancePage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'product-catalog__section product-catalog__gradient-right kitt-grid kitt-grid_fixed kitt-padding_bottom_extra ')]")
    WebElement insuranceTravelers;

    public AllProgramsInsurancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectProgramInsurancePage(String menuItem) {
        insuranceTravelers.findElement(By.xpath(".//*[contains(text(), '"+menuItem+"')]")).click();
    }
}
