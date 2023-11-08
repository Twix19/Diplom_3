import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPageObject;

public class LoginTest {
    WebDriver driver = setUpDriver();
    LoginPageObject login = new LoginPageObject(driver);
    static final String PATH_TO_CHROME = "chromedriver-win64/chromedriver.exe";
    static final String PATH_TO_YANDEX = "yandexdriver/yandexdriver.exe";
    public WebDriver setUpDriver(){
        System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    @Test
    public void loginWithLogInAccountButton(){
        login.clickloginToAccountButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
        login.loginToAccountIsEvabled();
    }
    @Test
    public void loginWithPersonalAreaButton(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
        login.loginToAreaButtonIsEvabled();
    }
    @Test
    public void loginInRegistrationForm(){
        login.clickPersonalAreaButton();
        login.clickRegistrationButton();
        login.clickComeInButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickLoginButton();
        login.loginInRegistrationFormIsEvabled();
    }
    @Test
    public void loginInRestorePasswordButton(){
        login.clickPersonalAreaButton();
        login.clickRestorePassword();
        login.clickloginEmailButton();
        login.enterloginEmailButton("luvd85@mail.ru");
        login.clickRestoreButton();
        login.clickPasswordButton();
        login.enterPasswordButton("gg43uiug9");
        login.clickCodeFromEmail();
        login.enterCodeFromEmail("26e0bcdc-bed8-4fa1-979e-1ee24f6e5ffc"); //вручную заходим в восстпано пароль вводим почту получаем код и вставляем новый код и парооль сюда
        login.clickSaveButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("luvd85@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("gg43uiug9");
        login.clickComeInButtonInPersonalArea();
        login.loginInRestorePasswordButtonIsEvabled();
    }
    @Test
    public void goToPersonalAccount(){
        login.clickPersonalAreaButton();
        login.checkPersonalAreaIsEvabled();
    }
    @Test
    public void goToConstructor(){
        login.clickPersonalAreaButton();
        login.clickConstructorButton();
        login.constructorIsEnabled();
    }
    @Test
    public void goToStellarBurger(){
        login.clickPersonalAreaButton();
        login.clickStellarBurgersButton();
    }
    @Test
    public void exit(){
        login.clickPersonalAreaButton();
        login.clickloginEmailButton();
        login.enterloginEmailButton("gvfyufi@mail.ru");
        login.clickPasswordButton();
        login.enterPasswordButton("eidhi7bj");
        login.clickComeInButtonInPersonalArea();
        login.clickPersonalAreaButton();
        login.clickExit();
        login.checkExit();
    }


}
