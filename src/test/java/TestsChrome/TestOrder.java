package TestsChrome;

import Locators.OrderScooterForm;
import Locators.ScooterMainPage;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;


        // не понимаю как вызвать бефор и тест
public class TestOrder {

            @Before
            public void startUp() {
                WebDriverManager.chromedriver().setup();
            }

            private WebDriver driver;

            public TestOrder(WebDriver driver) {
                this.driver = driver;
            }

            @Test

            public void scooterOrder() {
                // переход на страницу тестового приложения
                driver.get("https://qa-scooter.praktikum-services.ru");

                // создать объект класса главной страницы приложения
                ScooterMainPage objMainPage = new ScooterMainPage(driver);
                // дождаться загрузки данных на главной странице
                objMainPage.waitForLoadPage();
                // кликнуть на кнопку куки
                objMainPage.clickCookiesYes();
                // кликнуть на кнопку заказа
                objMainPage.clickOrderButtonTop();


                // создать объект класса заказа
                OrderScooterForm objOrderForm = new OrderScooterForm(driver);
                objOrderForm.order(
                        "Анастасия",
                        "Автотестович",
                        "Москва, бульвар Рокоссовского, 2",
                        "+79999999999",
                        "Важный комментарий");


                objOrderForm.clickOrderDone();
                objOrderForm.clickConfirmationApproveButton();

                // сохранить номер заказа
                objOrderForm.saveOrderNumber(); // как его сохранить в переменную?
            }

            @After
            public void teardown() {
                // Закрой браузер
                driver.quit();
            }
        }