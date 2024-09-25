package qaPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class RegisterPage extends BaseClass{
	
	WebDriver driver;
	private String secretFilePath = "./src/main/java/configs/secret.properties";
	Properties prop;
	FileInputStream credentials;
	
	@FindBy(xpath="//input[@name='vfb-5']")
	WebElement firstNameElement;
	
	@FindBy(xpath="//input[@name='vfb-7']")
	WebElement lastNameElement;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement radioBtnMale;
	
	@FindBy(xpath="//input[contains(@name,'vfb-14')]")
	WebElement emailElement;
	
	@FindBy(xpath="//input[contains(@class,'vfb-text vfb-medium required {digits:true,maxlength:2,minlength:2} vfb-error')]")
	WebElement verificationElement;
	
	@FindBy(xpath="//input[contains(@class,'vfb-submit')]")
	WebElement submitElement;
 
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loadSecretInformation() {
		
		prop = new Properties();
		try {
			credentials = new FileInputStream(secretFilePath);
			prop.load(credentials);
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setFirstName() {
		
		firstNameElement.sendKeys(getFirstName());
	}
	
	public void setLastName() {
		
		lastNameElement.sendKeys(getLastName());
	}
	
	public String getFirstName() {
		
		loadSecretInformation();
		String firstName = prop.getProperty("firstName");
		return firstName;
	}
	
	
	
	public String getLastName() {
		
		loadSecretInformation();
		String lastName = prop.getProperty("lastName");
		return lastName;
	}
	
	public void chooseMaleOption() {
		
		radioBtnMale.click();
	}
	
	public String getEmail() {
		loadSecretInformation();
		String email=prop.getProperty("r_email");
		return email;
	}
	
	public String getVerificationNumber() {
		loadSecretInformation();
		String verificationNum=prop.getProperty("verificationNum");
		return verificationNum;
	}
	
	public void submitBtn() {
		submitElement.click();
	}
	
	
	
	
	
	
	

}
