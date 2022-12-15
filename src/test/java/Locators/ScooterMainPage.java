package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScooterMainPage {
    private WebDriver driver;

    // Заголовок страницы
    private By headerLogo = By.className("Header_LogoScooter");

    // Кнопка согласия на cookies "да все привыкли"
    private By cookiesYes = By.className("App_CookieButton__3cvqF");

    // Кнопка «Заказать» верхняя
    private By orderButtonTop = By.cssSelector(".Header_Nav__AGCXC > button:nth-child(1)");

    // Кнопка «Заказать» нижняя
    private By orderButtonMiddle = By.className("Button_Middle__1CSJM");

    // Кнопка «Статус заказа»
    private By orderStatusButton = By.cssSelector(".Header_Link__1TAG7");

    // Список "Вопросы о важном"
    private By questionsList = By.className("accordion");

    public ScooterMainPage(WebDriver driver) {

        this.driver = driver;
    }
    public void waitForLoadPage() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(cookiesYes).isEnable()));
    }

    // принять куки
    public void clickCookiesYes() {
        driver.findElement(cookiesYes).click();
    }

    // кликнуть на верхнюю кнопку заказа
    public void clickOrderButtonTop() {
        driver.findElement(orderButtonTop).click();
    }

}
