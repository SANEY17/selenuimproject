package automation.qaTest;

import org.testng.annotations.Test;

import Base.BaseClass;
import qaPages.RegisterPageasProvider;

		public class RegisterTestasProvider extends BaseClass{
	
			@Test
	
			public void verifyRegisterPageasProvider() throws InterruptedException {
		
				RegisterPageasProvider register = new RegisterPageasProvider(driver);
				register.setFirstName();
				Thread.sleep(2000);
				register.setLastName();
				Thread.sleep(2000);
				register.setEmail();
				Thread.sleep(2000);
				register.setPassword();
				Thread.sleep(2000);
				register.setConfirmPassword();
				Thread.sleep(2000);
				register.setMoblie();
				Thread.sleep(2000);
				register.agree();
				Thread.sleep(2000);
		
	}

}