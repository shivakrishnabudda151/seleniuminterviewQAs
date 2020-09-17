package interviewQandA;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinHandlings {
	public static WebDriverManager wm;
	public static WebDriver dr;
	
	
	
	@BeforeMethod
	public void setup()
	{
		wm.chromedriver().setup();
		dr = new ChromeDriver();
		
		
		
	}
	//WindowHandling
	/*@Test
	public void m1()
	{
		dr.get("http://popuptest.com/goodpopups.html");
		dr.findElement(By.xpath("//a[@class='black']")).click();
		Set<String>handler =dr.getWindowHandles();
		Iterator<String> it =handler.iterator();
		String pwid=it.next();
		System.out.println("parent window id "+pwid);
		
		String cwid= it.next();
		System.out.println("Child window id " +cwid);
		dr.switchTo().window(cwid);
		
		System.out.println("Child window title " +dr.getTitle());
		
		dr.close();
		
		dr.switchTo().window(pwid);
		System.out.println("parent window name " +dr.getTitle());
		
		}*/
	
	//Alert switching
	
	/*@Test
	public void m2()
	{
		
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dr.findElement(By.xpath("//input[@name='proceed']")).click();
	    
		
		Alert alt =dr.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	
		
	}*/
	//uploading file using send keys
	
	/*@Test
	public void m3() throws InterruptedException
	{
		dr.get("https://html.com/input-type-file/");
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/shivakrishnabudda/Desktop/shiva-resume .pdf");
	}*/
	
	//Task due- Frames handling
	
	//MouseMovement and drag and drop

	 /*  @Test
	   public void m4() throws InterruptedException
	   {
		   dr.get("https://www.spicejet.com/");
		   Thread.sleep(2000);
		   
		   Actions act = new Actions(dr);
		   act.moveToElement(dr.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		   dr.findElement(By.linkText("Hot Meals")).click();
		   
		   
	   }
	
	*/
	
	/*@Test
	public void m5()
	{
		
		dr.get("https://jqueryui.com/droppable/");
		dr.switchTo().frame(0);
		
		Actions act = new Actions(dr);
		act.clickAndHold(dr.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(dr.findElement(By.xpath("//div[@id='droppable']"))).release()
		.build().perform();
		
		}*/
	//Navigations
	/*@Test
	public void m6()
	{
		
		dr.get("https://www.google.com/");
		dr.get("https://www.amazon.com/");
		
		dr.navigate().to("https://www.amazon.com/");
		
		dr.navigate().back();
		
	}
	*/
	//TakeScreenshot
	/*@Test
	public void m7() throws IOException
	{
		
		dr.get("https://www.amazon.com/");
		
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/shivakrishnabudda/Desktop/Appium/AppiumWorkspace/SeleniumInterviewQestions/ggle.png"));
		
		
	}
	*/
	//Get the background color
	
	@Test
	public void m8()
	{
		
		dr.get("https://blazedemo.com/");
		WebElement wl = dr.findElement(By.xpath("//input[@type='submit']"));
		String bc =wl.getCssValue("background-color");
		System.out.println(bc);
		String hexbc = Color.fromString(bc).asHex();
		System.out.println(hexbc);
	}
	

	
}
