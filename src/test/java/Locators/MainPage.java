package Locators;

public class MainPage {
    private WebDriver driver;

    // Заголовок страницы
    private By headerLogo = By.className("Header_LogoScooter");
    // Кнопка «Заказать» верхняя
    //Header_Header__214zg сначала найти это
    private By orderTop = By.className("Button_Button__ra12g"); //проверить что кнопка уникальна. не уникальна, на до  по xpath

    // создай локатор для поля «Занятие» в профиле пользователя
    private By orderBottom = By.className("Button_Middle__1CSJM");


    public HomePageMesto(WebDriver driver) {
        this.driver = driver;
    }

    // Кнопка «Заказать» верхняя
    // Форма заказа
    // Кнопка «Статус заказа»
    // Форма отслеживания заказа
    // Кнопка «Заказать» нижняя
    // Форма заказа
    // Список "Вопросы о важном"


}
