package tests;

import models.Tags;
import models.TagsFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TagsTest extends BaseTest {
    @Test
    public void openTagsPage() {
        loginPage
                .open()
                .login(LOGIN, PASSWORD);
        tagsPage
                .clickOnButtonManagerTags();
        boolean isOpenTagsPage = tagsPage
                .isPageOpen();
        assertTrue(isOpenTagsPage, "страница управления тегами не открыта");
        tagsPage
        .clickOnEditTags();
        boolean isOpenEditTags = editTags
                .isPageOpen();
        assertTrue(isOpenEditTags, "страница редактирования тегов не открыта");
        editTags
                .clearTagName();
        Tags tags = TagsFactory.get();
        editTags
                .createNewNameTags(tags)
                .clickOnButtonSubmit();
    }
}