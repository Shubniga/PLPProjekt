package signIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import signIn.SignUp;

public class signUpTest {

	@Test
	public static void verifySignUp() throws Exception
	{
		//setting up the web driver path
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		//creating the object of web driver
		WebDriver driver = new ChromeDriver();
		
		//entering the URL of web page as input for web driver object
		driver.get("http://www.phptravels.net/register/");
		
		//managing the window property of webpage
		driver.manage().window().maximize();
		
		SignUp sign= new SignUp(driver);
		//sign.verifymessage();
		sign.putRegister();
		sign.verifyFirstName();
		sign.verifyLastName();
		sign.verifyMobileNumber();
		sign.Email();
		sign.Password();
		sign.ConfirmPassword();
		sign.verifySignUpButton();
	    sign.verifymessage(); 
		Thread.sleep(1000);
		driver.close();
}
}
