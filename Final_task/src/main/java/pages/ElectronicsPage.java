package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicsPage {

    @FindBy(xpath = "//div[@class = 'sxrtt a6Vij']")
    WebElement tvMenu;

    public ElectronicsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickOnSubMenu(String subMenu) {
        tvMenu.findElement(By.xpath(".//a[contains(@class, '_2qvOO _2x2zB _9qbcy')][contains(text(), '"+subMenu+"')]")).click();
    }

}
