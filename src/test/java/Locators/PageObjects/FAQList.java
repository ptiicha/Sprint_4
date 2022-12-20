package Locators.PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class FAQList {

    private WebDriver driver;
    public FAQList(WebDriver driver){
        this.driver = driver;
    }


    // проверка пунктов
    //1 пункт в списке
    private By accordionItem1 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[1]");
    //клик по первому пункту
    public void clickAccordionItem1() {driver.findElement(accordionItem1).click();
    }

    //2 пункт в списке
    private By accordionItem2 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[2]");
    //клик по второму пункту
    public void clickAccordionItem2() {
        driver.findElement(accordionItem2).click();
    }

    //3 пункт в списке
    private By accordionItem3 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[3]");
    //клик по третьему пункту
    public void clickAccordionItem3() { driver.findElement(accordionItem3).click();
    }

    //4 пункт в списке
    private By accordionItem4 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[4]");
    //клик по четвертому пункту
    public void clickAccordionItem4() {
        driver.findElement(accordionItem4).click();
    }

    //5 пункт в списке
    private By accordionItem5 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[5]");
    //клик по пятому пункту
    public void clickAccordionItem5() {
        driver.findElement(accordionItem5).click();
    }

    //6 пункт в списке
    private By accordionItem6 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[6]");
    //клик по шестому пункту
    public void clickAccordionItem6() {
        driver.findElement(accordionItem6).click();
    }

    //7 пункт в списке
    private By accordionItem7 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[7]");
    //клик по четвертому пункту
    public void clickAccordionItem7() {
        driver.findElement(accordionItem7).click();
    }

    //8 пункт в списке
    private By accordionItem8 = By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div[8]");
    //клик по восьмому пункту
    public void clickAccordionItem8() {
        driver.findElement(accordionItem8).click();
    }

}
