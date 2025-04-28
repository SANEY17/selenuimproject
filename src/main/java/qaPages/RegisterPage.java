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
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstNameElement;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastNameElement;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	WebElement emailElement;
	
	@FindBy(xpath="//input[@id='contact']")
	WebElement contactElement;
	
	@FindBy(xpath="//input[contains(@id,'company-name')]")
	WebElement companyElement;
	
	@FindBy(xpath="//input[@name='text']")
	WebElement messageElement;
	
	@FindBy(xpath="//button[.='Send Us An Inquiry']")
	WebElement enquiryElement;
	
	
	
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
	
	public void setEmail() {
		
		emailElement.sendKeys(getEmail());
	}
	
	public void setCompany() {
		
		companyElement.sendKeys(getCompany());
	}
	
	public void setContact() {
		
		contactElement.sendKeys(getContact());
	}
	
	public void setMessage() {
		messageElement.sendKeys(getMessage());
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
	

	public String getEmail() {
		
		loadSecretInformation();
		String email = prop.getProperty("email");
		return email;
	}
	
	
	public String getContact() {
		
		loadSecretInformation();
		String contact = prop.getProperty("contact");
		return contact;
	}
	
	public String getCompany() {
		
		loadSecretInformation();
		String company = prop.getProperty("company");
		return company;
	}
	
	public String getMessage() {
		
		loadSecretInformation();
		String message = prop.getProperty("message");
		return message;
	}
	
	public void Enquiry() {
		
		enquiryElement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
