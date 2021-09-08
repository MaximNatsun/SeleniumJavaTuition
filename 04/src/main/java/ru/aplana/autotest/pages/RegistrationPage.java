package ru.aplana.autotest.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.aplana.autotest.steps.BaseSteps;

import static org.junit.Assert.assertTrue;

public class RegistrationPage extends BasePage{

    @FindBy(id = "surname_vzr_ins_0")
    public WebElement surnameInsurant;

    @FindBy(id = "name_vzr_ins_0")
    public WebElement nameInsurant;

    @FindBy(id = "birthDate_vzr_ins_0")
    public WebElement birthdateInsurant;

    @FindBy(id = "person_lastName")
    public WebElement lastName;

    @FindBy(id = "person_firstName")
    public WebElement firstName;

    @FindBy(id = "person_middleName")
    public WebElement middleName;

    @FindBy(id = "person_birthDate")
    public WebElement birthDate;

    @FindBy(id = "passportSeries")
    public WebElement passportSeries;

    @FindBy(id = "passportNumber")
    public WebElement passportNumber;

    @FindBy(id = "documentDate")
    public WebElement documentDate;

    @FindBy(id = "documentIssue")
    public WebElement documentIssue;

    @FindBy(xpath = "//div[contains(@class, 'form-group form-group_label-fill')]//label[contains(text(),'Мужской')]")
    public WebElement maleGender;

    @FindBy(xpath = "//button[contains(@class, 'btn btn-primary page__btn')][contains(text(), 'Продолжить')]")
    public WebElement button;

    @FindBy(xpath = "//*[contains(@class, 'alert-form alert-form-error')]")
    public WebElement commonErrorMessage;

    @FindBy(xpath = "//div[contains(@class, 'form-group form-group_label-fill')]//input-phone2[@name='phone']")
    public WebElement errorMessagePhone;

    @FindBy(xpath = "//div[contains(@class, 'form-group form-group_label-fill')]//input-email[@name='email']")
    public WebElement errorMessageEmail;

    @FindBy(xpath = "//div[contains(@class, 'form-group form-group_label-fill')]//input-email[@name='repeatEmail']")
    public WebElement errorMessageConfirmEmail;

    public RegistrationPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillFieldOnPage(String fieldId, String value) {
        switch (fieldId) {
            case "surname_vzr_ins_0":
                fillField(surnameInsurant, value);
                break;
            case "name_vzr_ins_0":
                fillField(nameInsurant, value);
                break;
            case "birthDate_vzr_ins_0":
                fillField(birthdateInsurant, value);
                birthdateInsurant.sendKeys(Keys.TAB);
                break;
            case "person_lastName":
                fillField(lastName, value);
                break;
            case "person_firstName":
                fillField(firstName, value);
                break;
            case "person_middleName":
                fillField(middleName, value);
                break;
            case "person_birthDate":
                fillField(birthDate, value);
                birthDate.sendKeys(Keys.TAB);
                break;
            case "passportSeries":
                fillField(passportSeries, value);
                break;
            case "passportNumber":
                fillField(passportNumber, value);
                break;
            case "documentDate":
                fillField(documentDate, value);
                documentDate.sendKeys(Keys.TAB);
                break;
            case "documentIssue":
                fillField(documentIssue, value);
                break;
            default: throw new AssertionError("Поле '" + fieldId + "' не объявлено на странице");
        }
    }

    public void checkCorrectContent(String value, String fieldId) {
        switch (fieldId) {
            case "surname_vzr_ins_0":
                checkFillField(value, surnameInsurant);
                break;
            case "name_vzr_ins_0":
                checkFillField(value, nameInsurant);
                break;
            case "birthDate_vzr_ins_0":
                checkFillField(value, birthdateInsurant);
                break;
            case "person_lastName":
                checkFillField(value, lastName);
                break;
            case "person_firstName":
                checkFillField(value, firstName);
                break;
            case "person_middleName":
                checkFillField(value, middleName);
                break;
            case "person_birthDate":
                checkFillField(value, birthDate);
                break;
            case "passportSeries":
                checkFillField(value, passportSeries);
                break;
            case "passportNumber":
                checkFillField(value, passportNumber);
                break;
            case "documentDate":
                checkFillField(value, documentDate);
                break;
            case "documentIssue":
                checkFillField(value ,documentIssue);
                break;
            default: throw new AssertionError("Поле '" + fieldId + "' не объявлено на странице");
        }
    }

    public void clickOnContinueAppButton() {
        button.click();
    }

    public void clickOnMaleGender() {
        maleGender.click();
    }
}
