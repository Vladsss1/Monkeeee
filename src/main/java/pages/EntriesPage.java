package pages;

import elements.Input;
import models.Entries;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntriesPage extends BasePage{

    public static final By TITLE_SEARCH = By.xpath("//section[@id='search']/h1");
    public static final By TITLE_TAGS = By.xpath("//section[@id='tags']/h1");
    public static final By TITLE_CALENDAR = By.xpath("//section[@id='calendar']/h1");
    public static final By BUTTON_ENTRIES = By.xpath("//a[@class='entry']");
    public static final By SUBMIT_ENTRIES = By.xpath("//a[@id='back-to-overview']");
    public EntriesPage(WebDriver driver) {
        super(driver);
    }
  @Override
    public boolean isPageOpen(){
        return isExist(TITLE_SEARCH);
  }
    public EntriesPage settingWaitOpen() {
        driver.findElement(BUTTON_ENTRIES).click();
        return this;
    }
    public EntriesPage createNewEntries( Entries entries ) {
        new Input(driver, "entries").writeEntries(entries.getEntries());
        return this;
    }
    public EntriesPage entriesSubmit() {
        driver.findElement(SUBMIT_ENTRIES).click();
        return this;
    }



}

