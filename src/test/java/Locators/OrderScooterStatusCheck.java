package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrderScooterStatusCheck {

    // Кнопка «Статус заказа»
    private By orderStatusButton = By.cssSelector(".Header_Nav__AGCXC .Header_Link__1TAG7");

    // Поле для номера заказа, отслеживание заказа
    private By orderStatusField = By.cssSelector(".Header_SearchInput__3YRIQ");

    // Кнопка "Посмотреть статус", pop-up после успешного заказа
    private By orderStatusCheckButton = By.cssSelector(".Order_NextButton__1_rCA > button:nth-child(1)");

    // Кнопка "Посмотреть", страница данных о заказе
    private By orderStatusSeeButton = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");

    // Страница результата отслеживания заказа
    private By orderStatusCheckResult = By.className("Track_OrderColumns__2r_1F");
    // текст "Такого заказа нет" если номер неправильный, а если правильный - информация о заказе.
    // Сравнить все поля,которые ввела, с полями в заказе

}
