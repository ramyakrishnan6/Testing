package withoutpage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageTest1 {
	private static final Logger log = LogManager.getLogger(LoginpageTest1.class);

	public static void main(String[] args) {
		log.info("Initializing ChromeDriver");
		WebDriver driver1 = new ChromeDriver();
		log.info("Navigating to saucedemo");
		Loginpagewithpagefactory lp1 = new Loginpagewithpagefactory(driver1);
		driver1.get("https://www.saucedemo.com");
		lp1.enterusername("standard_user");
		lp1.enterpassword("secret_sauce");
		lp1.clickloginbutton();
		log.info("Test completed, quitting driver");

	}

}
