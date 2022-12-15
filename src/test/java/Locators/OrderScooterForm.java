package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderScooterForm {
    private WebDriver driver;
    public OrderScooterForm(WebDriver driver){
        this.driver = driver;
    }

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


    // методы для заказа


    // заполнить данные первой страницы
    public void setNameField(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurnameField(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    // кликнуть на поле метро
    public void clickMetroField() {
        driver.findElement(metroField).click();
    }
    // выбрать метро из списка
    public void clickMetroChoose() {
        driver.findElement(metroChoose).click();
    }

    public void setPhoneNumberField(String phone) {
        driver.findElement(phoneNumberField).sendKeys(phone);
    }
    // кликнуть на кнопку "Далее"
    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    // заполнить данные второй страницы
    // кликнуть на календарь
    public void clickCalendar() {
        driver.findElement(calendar).click();
    }

    // выбрать дату на календаре
    public void clickCalendarDate() {
        driver.findElement(calendarDate).click();
    }

    // срок аренды
    public void clickRentalPeriod() {
        driver.findElement(rentalPeriod).click();
    }

    // выбрать срок аренды
    public void clickRentalPeriodChoose() {
        driver.findElement(rentalPeriodChoose).click();
    }

    // выбрать цвет самоката
    public void clickScooterColor() {
        driver.findElement(scooterColor).click();
    }

    // коммент
    public void setOrderComment(String comment) {
        driver.findElement(orderComment).sendKeys(comment);
    }
    // Кнопка "Заказать"
    public void clickOrderDone() {
        driver.findElement(orderDone).click();
    }
    // дождаться открытия попапа с подтверждением confirmationPopUp - как?

    // Кнопка "Да", подтверждение заказа
    public void clickConfirmationApproveButton() {
        driver.findElement(confirmationApproveButton).click();
    }

    // дождаться попап с подтверждением заказа
    public void waitForOrderNumber() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(confirmationApprovePopUp).isEnable()));
    }
    // извлечь номер заказа
    public String saveOrderNumber() {
        driver.findElement(orderNumber).getText(); // не могу придумать, как отсюда взять только вторую строчку с номером заказа
    }


    public void order(String name, String surname, String address, String phone, String comment){
        setNameField(name);
        setSurnameField(surname);
        setAddressField(address);
        clickMetroField();
        clickMetroChoose();
        setPhoneNumberField(phone);
        clickNextButton(); // нужно ли тут ждать когда прогрузится вторая страница заказа
        clickCalendar();
        clickCalendarDate();
        clickRentalPeriod();
        clickRentalPeriodChoose();
        clickScooterColor();
        setOrderComment();
        clickOrderDone();
        clickConfirmationApproveButton();
    }
}
