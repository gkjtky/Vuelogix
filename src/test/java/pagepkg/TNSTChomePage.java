package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TNSTChomePage {
	WebDriver driver;
	
	By loginpage =By.xpath("/html/body/div[2]/table[1]/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[28]/div/a");
	
	public TNSTChomePage(WebDriver driver)
	{
		
		this.driver=driver;
	} 
	
	public void navigationLogin()
	{
	driver.findElement(loginpage).click();
	}
}
