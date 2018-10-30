package signIn;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	protected static WebDriver driver;
	List<String> FirstName = new ArrayList<String>();
	List<String> LastName = new ArrayList<String>();
	List<String> MobileNumber=new ArrayList<String>();
	List<String> Email=new ArrayList<String>();
	List<String> Password=new ArrayList<String>();
	List<String> ConfirmPassword=new ArrayList<String>();
	public String expected="Email Already Exists.";

	public void putRegister()
	{	
		// Creating a list for first name
		FirstName.add("Anitha");   
		FirstName.add("Archana");   
		System.out.println(FirstName);  

		// Creating a list for second name
		LastName.add("Karuna"); 
		LastName.add("Pandit"); 
		System.out.println(LastName);
		
		// Creating a list for Mobile Number
		MobileNumber.add("9848022338"); 
		MobileNumber.add("9023456718"); 
		System.out.println(MobileNumber);
		
		// Creating a list for Email
		Email.add("anitha@gmail.com"); 
		Email.add("archana@gmail.com"); 
		System.out.println(Email);
		
		// Creating a list for Password
		Password.add("Anitha@1"); 
		Password.add("Archana@1"); 
		System.out.println(Password);
		
		// Creating a list for Confirm Password
		ConfirmPassword.add("Anitha@1"); 
		ConfirmPassword.add("Archana@1"); 
		System.out.println(ConfirmPassword);	
	}
	
	public SignUp(WebDriver driver)
	{
		SignUp.driver =driver;
	}

//	public void verifymessage() throws InterruptedException
//	{
//		System.out.println("message located");
//		Thread.sleep(2000);
//		String actual = driver.findElement(By.xpath("//*[@id='headersignupform']/div[2]/div")).getText();
//		if(actual.equals(expected))
//		{
//			System.out.println("Error message Verification - Passed");
//		}
//		else
//		{
//			System.out.println("Error message Verification - Failed");
//			driver.quit();
//		}
//	}
	
	public void verifyFirstName() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[3]/input")).sendKeys(FirstName.get(0));
		System.out.println("First Name is located");
	}

	public void verifyLastName() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[4]/input")).sendKeys(LastName.get(0));
		System.out.println("Last Name is located");
	}
	
	public void verifyMobileNumber() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[5]/input")).sendKeys(MobileNumber.get(0));
		System.out.println("Mobile Number is located");
	}
	
	public void Email() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[6]/input")).sendKeys(Email.get(0));
		System.out.println("Email Id is located");
	}
	
	public void Password() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[7]/input")).sendKeys(Password.get(0));
		System.out.println("Password is located");
	}

	public void ConfirmPassword() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[8]/input")).sendKeys(ConfirmPassword.get(0));
		System.out.println("ConfirmPassword is located");
	}
	
	public void verifySignUpButton() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[9]/button")).click();
		System.out.println("signUp button located");
		//driver.get("http://www.phptravels.net/account/");
		System.out.println("SignUp page is navigating to Account page");
	}
	
	public void verifymessage() throws InterruptedException
	{
		System.out.println("message located");
		//Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//*[@id='headersignupform']/div[2]/div")).getText();
		if(actual.equals(expected))
		{
			System.out.println("Error message Verification - Passed");
		}
		else
		{
			System.out.println("Error message Verification - Failed");
		}
	}
}	

