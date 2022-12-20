package TestsChrome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locators.PageObjects.FAQList;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.*;

public class FeatureFAQList {

    @RunWith(Parameterized.class)
    public class checkFAQlist {

        private final String checkedText;
        private final String expectedText;

        public void FAQlistTest (String checkedText, String expectedText) {
            this.checkedText = checkedText;
            this.expectedText = expectedText;
        }

        @Parameterized.Parameters
        public static Object[][] getTestData() {
            return new Object[][] {
                    {accordionItem1,"Сутки — 400 рублей. Оплата курьеру — наличными или картой."}, // сравнить с текстом из локаторов
                    {accordionItem2,"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    {accordionItem3,"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    {accordionItem4,"Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    {accordionItem5,"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    {accordionItem6,"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    {accordionItem7,"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    {accordionItem8,"Да, обязательно. Всем самокатов! И Москве, и Московской области."},
            };
        }

        @Test
        public void shouldBeCorrect() {
            FAQList objFAQList = new FAQList();
            int actual = accordionItem1; // не понимаю,как проверить их все
            assertEquals(expected, actual); // сравнили ожидаемый и фактический результат. Не понимаю, как должно быть

            new WebDriverWait(driver, 3)
                    .until(ExpectedConditions.visibilityOfElementLocated(By.className("accordion"))); //дождаться видимости списка
        }
}
