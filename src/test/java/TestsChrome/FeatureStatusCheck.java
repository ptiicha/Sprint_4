package TestsChrome;

import Locators.PageObjects.ScooterMainPage;
import Locators.PageObjects.OrderScooterStatusCheck;
import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.openqa.selenium.*;
import TestsChrome.FeatureOrderTopButton;

public class FeatureStatusCheck {

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;

    public FeatureStatusCheck(WebDriver driver) {
        this.driver = driver;
    }

    @Test

    public void checkStatus() {
        // переход на страницу тестового приложения
        driver.get("https://qa-scooter.praktikum-services.ru");

        // создать объект класса главной страницы приложения
        ScooterMainPage objMainPage = new ScooterMainPage(driver);
        // дождаться загрузки данных на главной странице
        objMainPage.waitForLoadPage();
        // кликнуть на кнопку куки
        objMainPage.clickCookiesYes();
        // кликнуть на кнопку заказа

        OrderScooterStatusCheck objStatusCheck = new OrderScooterStatusCheck(driver);
        objStatusCheck.clickOrderStatusButton(); // кликнуть на кнопку проверки статуса
        objStatusCheck.clickStatusField();
        // пытаюсь вставить номер заказа, который извлекаю в FeatureOrderTopButton, почему не получается?
        driver.findElement(By.tagName("input")).sendKeys(orderNumbers);
        objStatusCheck.clickGoButton();



    }
}
