package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME_INPUT = By.xpath("//input[@id='login']");
    public static final By PASSWORD = By.xpath("//input[@id='password']");
    public static final By LOGIN_BUTTON = By.xpath("//div[@class='btn-text-content']");


    public LoginPage (WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }


    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public LoginPage  login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new LoginPage (driver);
    }
}
