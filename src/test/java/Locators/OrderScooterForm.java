package Locators;
import org.openqa.selenium.By;

public class OrderScooterForm {

    // Форма заказа
    // дождаться прогрузки и проверить доступность
    private By orderForm = By.className("Order_Content__bmtHS");

    // Поле "Имя"
    private By nameField = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
    //не понимаю, как сокращать локаторы((

    // Поле "Фамилия"
    private By surnameField = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input);

    // Поле "Адрес"
    private By addressField = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");

    // Поле "Метро", список, кликнуть
    private By metroField = By.className("select-search");
    // Поле метро, выбрать
    private By metroChoose = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
    //выпадающий список с метро,как выбрать конкретное значение?

    // Поле "Телефон"
    private By phoneNumberField = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
    //+7

    // Кнопка "Далее"
    private By nextButton = By.xpath("/html/body/div/div/div[2]/div[3]/button");


    //вторая страница формы
    // Календарь "Когда привезти"
    private By calendar = By.className("Order_MixedDatePicker__3qiay");
    // Выбрать дату
    private By calendarDate = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div/input");
    //здесь календарь, как работать с календарем?

    // Поле "Срок аренды"
    private By rentalPeriod = By.className("Dropdown-root");
    //здесь выпадающий список, как выбирать из списка

    // выбрать Срок аренды
    private By rentalPeriodChoose = By.cssSelector("Dropdown-root/div[4]/input");
    //здесь выпадающий список, как выбирать из списка. Тут 100% не правильно

    // Поле "Цвет самоката"
    private By scooterColor = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]");
    //здесь два чек бокса. Почему можно одновремено выбрать оба, если самокат заказывается один?

    // Поле "Комментарий для курьера"
    private By orderComment = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/input");

    // Кнопка "Назад"
    private By backButton = By.xpath("/html/body/div/div/div[2]/div[3]/button[1]");

    // Кнопка "Заказать"
    private By orderDone = By.className("/html/body/div/div/div[2]/div[3]/button[2]");

    // Pop-up "Хотите оформить заказ?"
    private By confirmationPopUp = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]");

    // Pop-up "Хотите оформить заказ?", кнопка НЕТ
    private By confirmationRejectButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[1]");

    // Pop-up "Хотите оформить заказ?", кнопка ДА
    private By confirmationApproveButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");

    // Подтверждение заказа - дождаться загрузки
    private By confirmationApprovePopUp = By.cssSelector("./html/body/div/div/div[2]/div[5]");

    // Номер заказа
    private By orderNumber = By.className("/html/body/div/div/div[2]/div[5]/div[1]/div");
    //здесь как-то достать текст из второго абзаца

    public OrderScooterForm(WebDriver driver){
        this.driver = driver;
    }







}
