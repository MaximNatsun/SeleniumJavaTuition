import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class InsuranceTest {
    WebDriver driver;
    String baseUrl;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        baseUrl = "http://www.sberbank.ru/ru/person";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[contains(@class, 'kitt-cookie-warning__close')]")).click();
    }

    @Test
    public void testInsurance() {
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);

        driver.findElement(By.xpath("//li[contains(@class, 'kitt-top-menu')]//*[contains(text(), 'Страхование')]")).click();
        driver.findElement(By.xpath("//li[contains(@class, 'kitt-top-menu')]//*[contains(text(), 'Все страховые программы')]")).click();
        driver.findElement(By.xpath("//h3[@class='product-catalog__miniheader'][text()='Страхование путешественников']/..//*[contains(@class, 'product-catalog')]")).click();

        WebElement title = driver.findElement(By.xpath("//h1[contains(@class, 'kitt-heading')]"));
        wait.until(ExpectedConditions.visibilityOf(title));
        assertEquals("Страхование путешественников", title.getText());

        // жмем на кнопку "Оформить Онлайн"
        driver.findElement(By.xpath("//a[contains(@data-test-id, 'PageTeaserDict_button')]")).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary btn-large')]"))));
        driver.findElement(By.xpath("//h3[contains(text(), 'Минимальная')]")).click();
        click(By.xpath("//button[contains(@class, 'btn btn-primary btn-large')][text()='Оформить']"));

        // заполняем данные застрахованного
        fillField(By.id("surname_vzr_ins_0"), "Иванов");
        fillField(By.id("name_vzr_ins_0"), "Иван");
        fillField(By.id("birthDate_vzr_ins_0"), "25.11.1990");
        driver.findElement(By.xpath("(//I[@class='tick'])[1]")).click();

        // заполняем данные страхователя
        fillField(By.id("person_lastName"), "Сидоров");
        fillField(By.id("person_firstName"), "Петр");
        fillField(By.id("person_middleName"), "Игоревич");
        fillField(By.id("person_birthDate"), "12.04.1989");
        driver.findElement(By.xpath("(//I[@class='tick'])[2]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Мужской')]")).click();
        fillField(By.id("passportSeries"), "3012");
        fillField(By.id("passportNumber"), "335353");
        fillField(By.id("documentDate"), "30.01.2016");
        driver.findElement(By.xpath("(//I[@class='tick'])[3]")).click();
        fillField(By.id("documentIssue"), "УВД Тестового района по г. Тест");

        // проверяем корректность заполненных полей
        assertEquals("Иванов", driver.findElement(By.id("surname_vzr_ins_0")).getAttribute("value"));
        assertEquals("Иван", driver.findElement(By.id("name_vzr_ins_0")).getAttribute("value"));
        assertEquals("25.11.1990", driver.findElement(By.id("birthDate_vzr_ins_0")).getAttribute("value"));
        assertEquals("Сидоров", driver.findElement(By.id("person_lastName")).getAttribute("value"));
        assertEquals("Петр", driver.findElement(By.id("person_firstName")).getAttribute("value"));
        assertEquals("Игоревич", driver.findElement(By.id("person_middleName")).getAttribute("value"));
        assertEquals("12.04.1989", driver.findElement(By.id("person_birthDate")).getAttribute("value"));
        assertEquals("3012", driver.findElement(By.id("passportSeries")).getAttribute("value"));
        assertEquals("335353", driver.findElement(By.id("passportNumber")).getAttribute("value"));
        assertEquals("30.01.2016", driver.findElement(By.id("documentDate")).getAttribute("value"));
        assertEquals("УВД Тестового района по г. Тест", driver.findElement(By.id("documentIssue")).getAttribute("value"));

        // нажимаем продолжить и проверяем наличие сообщения об ошибке
        click(By.xpath("//button[contains(@class, 'btn btn-primary page__btn')][contains(text(), 'Продолжить')]"));
        assertEquals("При заполнении данных произошла ошибка",
                driver.findElement(By.xpath("//*[contains(@class, 'alert-form alert-form-error')]")).getText());
        assertEquals("Поле не заполнено.",
                driver.findElement(By.xpath("//div[contains(@class, 'form-group form-group_label-fill')]//input-phone2[@name='phone']")).getText());
        assertEquals("Поле не заполнено.",
                driver.findElement(By.xpath("//div[contains(@class, 'form-group form-group_label-fill')]//input-email[@name='email']")).getText());
        assertEquals("Поле не заполнено.",
                driver.findElement(By.xpath("//div[contains(@class, 'form-group form-group_label-fill')]//input-email[@name='repeatEmail']")).getText());
     }

    public void fillField(By locator, String value) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    private void click(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(locator));
        Wait<WebDriver> wait = new WebDriverWait(driver, 10, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
