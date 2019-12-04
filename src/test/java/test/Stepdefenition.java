package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.FacebookLogin;

public class Stepdefenition 
{
public FacebookLogin fb_login;
public Scenario result;
public ChromeDriver driver;


@Before
   public void launch_bro(Scenario result)
   {
	   this.result=result;
	   System.setProperty("webdriver.chrome.driver","D:\\ratnam1\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	}
	@Given("^valid url$")
	public void valid_url() throws Throwable 
	{	
		driver.get("https://facebook.com");
		result.write("url test paeed");
	    System.out.println("entered valid url");
	}

	@When("^i enter valid usernames as \"([^\"]*)\" and password as\"([^\"]*)\"$")
	public void i_enter_valid_usernames_as_and_password_as(String arg1, String arg2) throws Throwable 
	{	
		 
		driver.findElement(By.id("email")).sendKeys("kanakaratnam n");
		driver.findElement(By.id("pass")).sendKeys("ratnam@33");
		WebDriverWait wait=new WebDriverWait(driver, 5000);
		Thread.sleep(5000);
	}

	@Then("^validate login$")
	public void validate_login() throws Throwable 
	{ 	
		
	//	driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
		Screen sc=new Screen();
		Pattern p1=new Pattern("C:\\Users\\verdentum\\Pictures\\sikuli images\\1.PNG");
		sc.click(p1);
		Thread.sleep(10000);
	}

	@Given("^login to facebook$")
	public void login_to_facebook() throws Throwable
	{		
		 
		driver.findElement(By.id("email")).sendKeys("kanakaratnam n");
		driver.findElement(By.id("pass")).sendKeys("ratnam@33");
		WebDriverWait wait=new WebDriverWait(driver, 5000);
		driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();
		Screen sc=new Screen();
		Pattern p1=new Pattern("C:\\Users\\verdentum\\Pictures\\sikuli images\\1.PNG");
		sc.click(p1);
	}

	@Then("^send message$")
	public void send_message() throws Throwable
	{
		driver.findElement(By.xpath("//*[text()='Not Now']")).click();
		
	}


	
}
