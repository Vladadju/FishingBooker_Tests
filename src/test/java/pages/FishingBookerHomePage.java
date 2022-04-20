package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FishingBookerHomePage extends BasePage {
    public FishingBookerHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[contains(text(), 'List Your Boat')]")
    WebElement listYourBoatButton;
    @FindBy(xpath = "//span[contains(text(), 'Log In')]")
    WebElement logInButton;
    @FindBy(xpath = "//a[contains(text(), 'Sign Up')]")
    WebElement signUpButton;




    public void clickListYourBoat(){
        click(listYourBoatButton);
    }
    public void clickLogInButton(){
        click(logInButton);
    }
    public void clickSignUpButton(){
        click(signUpButton);
    }

}
