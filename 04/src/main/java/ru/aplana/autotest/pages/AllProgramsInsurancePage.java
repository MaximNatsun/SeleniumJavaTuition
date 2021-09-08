package ru.aplana.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.steps.BaseSteps;

public class AllProgramsInsurancePage extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'product-catalog__section product-catalog__gradient-right kitt-grid kitt-grid_fixed kitt-padding_bottom_extra ')]")
    WebElement insuranceTravelers;

    public AllProgramsInsurancePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectProgramInsurancePage(String menuItem) {
        insuranceTravelers.findElement(By.xpath(".//*[contains(text(), '"+menuItem+"')]")).click();
    }
}
