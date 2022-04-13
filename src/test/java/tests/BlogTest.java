package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BlogTest extends BaseTest {

    @Test
    public void openBlog() {
        blogPage
                .openBlogPage();
        loginPage
                .login(LOGIN,PASSWORD);
        boolean isOpenBlog = blogPage
                .isPageOpen();
        assertTrue(isOpenBlog, "Страница ,блога не открыта");
    }
}
