package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(xpath ="//input[@id='txtUsername']")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(xpath="//input[@id='btnLogin']")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id='spanMessage']")
    public WebElement errorMessage;


    public LoginPage(){   //Create constructor for this class to be able to recall it from another class
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }
}
