import org.junit.Assert;
import org.junit.Test;

public class TestPage extends Main {

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String STRING_SEARCH = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.search(STRING_SEARCH);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        Assert.assertTrue(href.contains("iphone-13"));
    }
}
