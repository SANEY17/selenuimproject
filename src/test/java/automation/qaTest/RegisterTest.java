package automation.qaTest;

import org.testng.annotations.Test;


import Base.BaseClass;
import qaPages.RegisterPage;

public class RegisterTest extends BaseClass {
		@Test
		public void verifyRegisterTest() throws InterruptedException {
			
			RegisterPage register = new RegisterPage(driver);
			register.setFirstName();
			Thread.sleep(2000);
			register.setLastName();
			Thread.sleep(2000);
			register.setEmail();
			Thread.sleep(2000);
			register.setContact();
			Thread.sleep(2000);
			register.setCompany();
			Thread.sleep(2000);
			register.getMessage();
			Thread.sleep(2000);
			register.Enquiry();
			Thread.sleep(2000);
		}
	 
	}
	 

