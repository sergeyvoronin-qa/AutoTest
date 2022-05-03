import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта appleinsider.ru
 */
public class MainPage {

    private final SelenideElement textBoxInput = $x("//input[@name='s']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    /**
     * Выполняется поиск статей по заданаму запросу, и кликается ENTER
     * @param search
     */
    public void search(String search) {
        textBoxInput.setValue(search);
        textBoxInput.sendKeys(Keys.ENTER);
    }

}
