import Locators.OrderScooterForm;

// не понимаю кто кому наследует
public class OrderData {

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
            setOrderComment(comment);

        }
}

