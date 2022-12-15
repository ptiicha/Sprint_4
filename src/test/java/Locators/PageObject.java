package Locators;
import org.openqa.selenium.By;

public class PageObject {
    public PageObject(WebDriver driver) {

        this.driver = driver;
    }

    public void waitForLoadPage() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(cookiesYes).isEnable()));
    }
}

