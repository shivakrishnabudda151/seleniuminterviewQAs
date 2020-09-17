package interviewQandA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotWE {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();


driver.get("https://www.facebook.com/");

WebElement email1 = driver.findElement(By.id("email"));
WebElement pwd1 = driver.findElement(By.id("pass"));
email1.sendKeys("shiva");
pwd1.sendKeys("budda");
takeScreenShot(email1, "email");
takeScreenShot(pwd1, "password");



	}
	public static void takeScreenShot(WebElement element,String filename) throws IOException
	{
		
		File scr =((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr, new File("./target/screenshots/"+ filename + ".png"));
	}

}
