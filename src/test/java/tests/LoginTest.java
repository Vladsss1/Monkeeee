package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void login() {
        boolean isLoginPageOpened = loginPage
                .open()
                .login(LOGIN,PASSWORD)
                .isPageOpen();
        assertTrue(isLoginPageOpened,"Страница не открыта");
    }



}
