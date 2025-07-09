package withoutpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagewithpagefactory {
	WebDriver driver1;

	// constructor
	Loginpagewithpagefactory(WebDriver d) {

		driver1 = d;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement logbtn;

	public void enterusername(String uname) {
		username.sendKeys(uname);

	}

	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickloginbutton() {
		logbtn.click();
	}
}
