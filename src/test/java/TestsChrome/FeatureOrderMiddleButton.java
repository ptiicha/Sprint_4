package TestsChrome;

import Locators.PageObjects.ScooterMainPage;
import Locators.PageObjects.OrderScooterForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

    public class FeatureOrderMiddleButton {

        @Before
        public void startUp() {
            WebDriverManager.chromedriver().setup();
        }

        private WebDriver driver;

        public FeatureOrderMiddleButton(WebDriver driver) {
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
            objMainPage.clickOrderButtonMiddle(); // доскроллить сюда


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

        }

        @After
        public void teardown() {
            // Закрой браузер
            driver.quit();
        }
    }
}
