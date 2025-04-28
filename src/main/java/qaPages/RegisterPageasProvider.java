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

		public class RegisterPageasProvider extends BaseClass {
	
			WebDriver driver;
			private String secretFilePath = "./src/main/java/configs/secret.properties";
			Properties prop;
			FileInputStream credentials;
	
			@FindBy(xpath="//input[@name='firstName']")
			WebElement firstNameElement;
	
			@FindBy(xpath="//input[@name='lastName']")
			WebElement lastNameElement;
			
			@FindBy(xpath="//input[@name='email']")
			WebElement emailElement;
			
			@FindBy(xpath="//input[@name='password']")
			WebElement passwordElement;
			
			@FindBy(xpath="//input[@name='confirmPassword']")
			WebElement confirmPasswordElement;
			
			@FindBy(xpath="//input[@name='mobileNumber']")
			WebElement mobileElement;
			
			@FindBy(xpath="//button[contains(@type,'checkbox')]")
			WebElement agreeElement;
			
			
			
			
			
	
	
			public RegisterPageasProvider(WebDriver driver) {
		
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
			
			public void setPassword() {
				
				passwordElement.sendKeys(getPassword());
			}
			
			public void setConfirmPassword() {
				
				confirmPasswordElement.sendKeys(getConfirmPassword());
				
			}
			
			public void setMoblie() {
				
				mobileElement.sendKeys(getMobile());
				
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
			
			public String getPassword() {
				
				loadSecretInformation();
				String password = prop.getProperty("password");
				return password;
			}
			
			public String getConfirmPassword() {
				
				loadSecretInformation();
				String ConfirmPassword = prop.getProperty("confirmpassword");
				return ConfirmPassword;
			}
			
			public String getMobile() {
				
				loadSecretInformation();
				String Mobile = prop.getProperty("contact");
				return Mobile;
			}
			
			public void agree() {
				
				agreeElement.click();
			}
			
			
			
			
			
		}
	
	

		
