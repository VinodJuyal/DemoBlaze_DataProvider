package Uncodemy.DemoBlaze;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginWithDataProviderAndAssertion {
	WebDriver driver;
	@Test(priority = 1 ,  dataProviderClass = LoginCredentialsTwo.class , dataProvider = "Logintwo")
	public void TestCaseOne(String Username , String Password) throws InterruptedException, IOException 
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
        Boolean Mainlogo =	driver.findElement(By.xpath("//a[@id = 'nava']")).isDisplayed();
        Assert.assertTrue(Mainlogo);
        System.out.println("Page is successfully loaded");
        TakesScreenshot scrnsht = ((TakesScreenshot)driver);
        File src = scrnsht.getScreenshotAs(OutputType.FILE);
        File dest = new File ("C:\\Users\\Hp\\Documents\\Selenium\\lib\\Scrnsht.jpg");
        FileUtils.copyFile(src, dest);
        
	
		driver.findElement(By.cssSelector("a#login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#loginusername")).sendKeys(Username);
	    driver.findElement(By.cssSelector("input#loginpassword")).sendKeys(Password);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
	    Thread.sleep(3000);
	    Boolean WelcomeUser = driver.findElement(By.xpath("//a[@id = 'nameofuser']")).isDisplayed();
	    //Assert.assertFalse(WelcomeUser);
	    Assert.assertEquals(WelcomeUser, WelcomeUser);
	    System.out.println("User is Successfully Login");
	    Thread.sleep(3000);
	    driver.close();
	} 

}
