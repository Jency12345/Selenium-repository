import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrm {
public static void main(String[] args) throws AWTException, InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://localhost/orangehrm/orangehrm-5.6/orangehrm-5.6/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("Jency@12345");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	driver.findElement(By.name("firstName")).sendKeys("Jency");
	driver.findElement(By.name("lastName")).sendKeys("J");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("12345");
	driver.manage().window().maximize();
	StringSelection sel = new StringSelection("C:\\Users\\LENOVO\\baby.JPG");
	 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	
     driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i")).click();
     Robot robot = new Robot();
     Thread.sleep(1000);
      // Press Enter
     robot.keyPress(KeyEvent.VK_ENTER);
    
    // Release Enter
     robot.keyRelease(KeyEvent.VK_ENTER);
  // Press CTRL+V
     robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    
    // Release CTRL+V
     robot.keyRelease(KeyEvent.VK_CONTROL);
     robot.keyRelease(KeyEvent.VK_V);
     Thread.sleep(1000);
   	 
 	// Press Enter
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	
}

}
