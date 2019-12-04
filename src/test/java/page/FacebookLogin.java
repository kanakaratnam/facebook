package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin 
{
	@FindBy(id="email")
	public WebElement uid;
	
	@FindBy(xpath="//*[@type='password']")
	public WebElement upw;
	
	@FindBy(xpath="//*[@aria-label='Log In']")
	public WebElement next;
	
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void uid1()
	{
		uid.sendKeys("kanakaratnam n");
	}
	public void upw()
	{
		upw.sendKeys("ratnam@33");
	}
	public void next()
	{
		next.click();
	}
	
	
	
	
	
}
