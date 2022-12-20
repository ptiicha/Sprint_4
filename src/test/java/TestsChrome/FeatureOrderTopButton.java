package TestsChrome;

import Locators.PageObjects.OrderScooterForm;
import Locators.PageObjects.ScooterMainPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class FeatureOrderTopButton {

            @Before
            public void startUp() {
                WebDriverManager.chromedriver().setup();
            }

            private WebDriver driver;

            public FeatureOrderTopButton(WebDriver driver) {
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
                String ordNumber = objOrderForm.saveOrderNumber();
                String s1 = ordNumber;   // поскольку в тексте с номером заказа есть буквы, попыталась достать только цифры
                String[] s2_array = s1.split("\\D+");
                Integer orderNumbers = Integer.parseInt(String.join("", s2_array));
                System.out.println("Номер заказа: " + orderNumbers);
            }

            @After
            public void teardown() {
                // Закрой браузер
                driver.quit();
            }
        }