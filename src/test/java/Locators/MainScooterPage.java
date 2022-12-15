package Locators;

public class MainScooterPage {
    private WebDriver driver;

    // Заголовок страницы
    private By headerLogo = By.className("Header_LogoScooter");

    // Кнопка «Заказать» верхняя
    //Header_Header__214zg сначала найти это
    private By orderButtonTop = By.className("Button_Button__ra12g"); //проверить что кнопка уникальна. не уникальна, на до  по xpath

    // // Кнопка «Заказать» нижняя
    private By orderButtonMiddle = By.className("Button_Middle__1CSJM");


    // Кнопка «Статус заказа»
    private By orderStatusButton = By.className(" ");


    // Список "Вопросы о важном"
    private By questionsList = By.className(" ");

    public HomePageMesto(WebDriver driver) {
        this.driver = driver;
    }


}
