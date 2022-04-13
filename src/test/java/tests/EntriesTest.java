package tests;

import models.Entries;
import models.EntriesFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EntriesTest extends BaseTest {
    @Test
    public void EntriesPageTest() {
        loginPage
                .open()
                .login(LOGIN, PASSWORD);
        boolean isEntriesPageOpened = entriesPage
                .isPageOpen();
        assertTrue(isEntriesPageOpened, "Страница  не открыта");
        entriesPage
                .settingWaitOpen();
        Entries entries = EntriesFactory.get();
               entriesPage
        .createNewEntries(entries)
                       .entriesSubmit();

    }
}