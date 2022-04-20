package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#first-name")
    WebElement firstName;
    @FindBy(css = "#last-name")
    WebElement lastName;
    @FindBy(css = "#username")
    WebElement emailAddress;
    @FindBy(css = "#password")
    WebElement createAPassword;
    @FindBy(xpath = "//div[contains(text(),'Sign Up with Facebook')]")
    WebElement signUpWithFacebook;
    @FindBy(xpath = "//div[contains(text(),'Sign Up with Google')]")
    WebElement signUpWithGoogle;


}
