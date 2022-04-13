package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomeTest extends BaseTest {
    @Test
    public void openHomePage(){
        loginPage
                .open()
                .login(LOGIN, PASSWORD);
        homePage
        .clickHome();
        boolean isOpenHomePage = homePage
        .isPageOpen();
        assertTrue(isOpenHomePage,"Страница не открыта");
    }
}
