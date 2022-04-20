package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#username")
    WebElement emailAddress;
    @FindBy(css = "#password")
    WebElement password;
    // get first (0) selector
    @FindBy(css = "input[class$='button yellow']")
    List<WebElement> logInButton;
    // get second (1) selector
    @FindBy(css = "button[class='fbkr-link link-sm blue']")
    List<WebElement> forgotPasswordButton;
    @FindBy(xpath = "//div[contains(text(),'Log In with Facebook')]")
    WebElement logInWithFacebookButton;
    @FindBy(xpath = "//div[contains(text(),'Log In with Google')]")
    WebElement logInWithGoogle;






}
