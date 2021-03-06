import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


/**
 * Created by Ksenia on 19.10.2016.
 */
public class WebDriverTest {

    @Test
    public void findElementsTests() throws InterruptedException {
        FirefoxProfile profile = new FirefoxProfile();

        WebDriver driver = new FirefoxDriver(profile);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");


        WebElement gameButton = driver.findElement(By.xpath(By.linkText("Игры")); //1. Ссылка на "Игры" в хэдере


        WebElement gameButton2 = driver.findElement(By.xpath("//td[@class = 'news__tabs__item news__tabs__item_double']//a[@name = 'clb683645']")); //2. Ссылка на "Игры" под полем поиска
        gameButton2.click();

        WebElement usernameInput = driver.findElement(By.id("mailbox__login")); //Залогиниться seleniumtests10; 060788avavav
        usernameInput.sendKeys("seleniumtests10");
        WebElement passwordInput = driver.findElement(By.name("Password"));
        passwordInput.sendKeys("060788avavav");
        WebElement loginButton = driver.findElement(By.className("mailbox__auth__button"));
        loginButton.click();

        WebElement newLetter = driver.findElement(By.cssSelector(".b-toolbar__item a.b-toolbar__btn.js-shortcut"));//1. Кнопка "Написать письмо"

        WebElement del = driver.findElement(By.cssSelector(".ico.ico_toolbar.ico_toolbar_remove")); //2. Кнопка "Удалить"
        del.click();

        WebElement spam = driver.findElement(By.xpath("//i[@class = 'ico ico_toolbar ico_toolbar_spam']")); //3. Кнопка "Спам"
        spam.click();

        WebElement incomingLetters = driver.findElement(By.cssSelector(".b-nav__item__text.b-nav__item__text_unread")); //4. Ссылка "Входящие"
        incomingLetters.click();

        WebElement sent = driver.findElement(By.cssSelector(By.linkText("Отправленные")); //5. Ссылка "Отправленные"
        sent.click();

        newLetter.click();

        WebElement theme = driver.findElement(By.cssSelector(".compose-head__field>.b-input")); //1. Инпут на тему
        theme.click();

        WebElement address = driver.findElement(By.cssSelector(".compose-head__field [tabindex=\"4\"]")); //2. Инпут на адресата
        address.click();

        WebElement foto = driver.findElement(By.cssSelector(".ico.ico_system.ico_system_camera")); //3. Ссылка на Ваше фото справа
        foto.click();

        WebElement bold = driver.findElement(By.cssSelector(".mceIcon.mce_bold"));//4. Ссылка на кнопку жирного шрифта
        bold.click();
    }


    @Test
    public void loginTest() throws InterruptedException {
        FirefoxProfile profile = new FirefoxProfile();
        WebDriver driver = new FirefoxDriver(profile);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");

        WebElement usernameInput = driver.findElement(By.id("mailbox__login")); //Залогиниться seleniumtests10; 060788avavav
        usernameInput.sendKeys("seleniumtests10");
        WebElement passwordInput = driver.findElement(By.name("Password"));
        passwordInput.sendKeys("060788avavav");
        WebElement loginButton = driver.findElement(By.className("mailbox__auth__button"));
        loginButton.click();

        // 2. Сделать логаут, проверить, что он прошёл успешно

        WebElement logout = driver.findElement(By.cssSelector("#PH_logoutLink"));
        logout.click();
        loginButton = driver.findElement(By.className("mailbox__auth__button"));
        Assert.assertTrue(loginButton.isDisplayed());

    }
}

