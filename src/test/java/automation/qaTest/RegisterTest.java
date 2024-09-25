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
			register.chooseMaleOption();
			Thread.sleep(2000);
			register.getEmail();
			Thread.sleep(3000);
			register.getVerificationNumber();
			Thread.sleep(3000);
			register.submitBtn();
		}
	 
	}
	 

