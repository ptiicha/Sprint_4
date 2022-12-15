package Locators;

public class OrderScooterForm {

    // Форма заказа
    private By orderForm = By.className(" ");

    // Поле "Имя"
    private By nameField = By.className(" ");

    // Поле "Фамилия"
    private By surnameField = By.className(" ");

    // Поле "Адрес"
    private By addressField = By.className(" ");

    // Поле "Метро"
    private By metroField = By.className(" ");
    //выпадающий список с метро

    // Поле "Телефон"
    private By phoneNumberField = By.className(" ");
    //+7

    // Кнопка "Далее"
    private By nextButton = By.className(" ");


    //вторая страница формы
    // Поле "Когда привезти"
    private By calendarDate = By.className(" ");
    //здесь календарь, как работать с календарем

    // Поле "Срок аренды"
    private By rentalPeriod = By.className(" ");
    //здесь выпадающий список, как выбирать из списка

    // Поле "Цвет самоката"
    private By scooterColor = By.className(" ");
    //здесь два чек бокса. Почему можно одновремено выбрать оба, если самокат заказывается один?

    // Поле "Комментарий для курьера"
    private By orderComment = By.className(" ");

    // Кнопка "Назад"
    private By backButton = By.className(" ");

    // Кнопка "Заказать"
    private By orderDone = By.className(" ");

    // Pop-up "Хотите оформить заказ?"
    private By confirmationPopUp = By.className(" ");

    // Pop-up "Хотите оформить заказ?", кнопка НЕТ
    private By confirmationRejectButton = By.className(" ");

    // Pop-up "Хотите оформить заказ?", кнопка ДА
    private By confirmationApproveButton = By.className(" ");


}
