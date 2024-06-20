package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHome {
WebDriver driver;
	
	By logoutButton =By.xpath("/html/body/div[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[16]/div/a");
	
	public UserHome(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void navigationLogout()
	{
		 try {
	            Thread.sleep(10000); // 10 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 	driver.findElement(logoutButton).click();
	}
}
