package world;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
	
	public WebDriver driver;
	
  @BeforeClass
  public void before() {
	  
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launching google site
		
		driver.get("https://github.com/login");
  }
  
  @Test(priority=0)
  
  public void action(){
	  
	  String d=driver.getCurrentUrl();
		
		if(d.contains("https")){
			
			System.out.println("Site is secured");
		}
		
		else{
			System.out.println("Site is secured");
		
			}
  }
  
  @Test(priority=1)
  
  public void login(){
	  
	  driver.findElement(By.xpath("//*[@name='login']")).sendKeys("bhanuprakash.bommana@gmail.com");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@name='password']")).sendKeys("bhanu@bbi_mca123");
	  
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@value='Sign in']")).click();
	  
  }
  
  @AfterClass
  public void close(){
	  
	  driver.close();
  }
		
		
}
