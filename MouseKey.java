package week4.Homework;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
public class MouseKey {

	
	public static void main(String[] args) throws IOException
	{
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'(Refurbished) OnePlus 9 Pro 5G (Morning Mist, 8GB ')]"));
		String price =driver.findElement(By.xpath("//span[normalize-space()='31,486']")).getText();
		//String price= element.getText();
		System.out.println("Price of the product:  " +price);
          //  WebElement mouseOver = driver.findElement(By.xpath("//span[contains(text(),'2.8 out of 5 stars')]"));
          String rating=driver.findElement(By.xpath("//span[contains(text(),'2.8 out of 5 stars')]")).getText();
          System.out.println("Rating of the product:  " +rating);
          //  Actions ac= new Actions(driver);
		
		  // ac.moveToElement(mouseOver).perform();
          driver.findElement(By.xpath("//span[contains(text(),'(Refurbished) OnePlus 9 Pro 5G (Morning Mist, 8GB ')]")).click();
	
        //step1:    Get the window Handles
          Set<String> windowHandles = driver.getWindowHandles();   
         
          //step2:   Convert the set to list
          List<String>lstWindow =new ArrayList<String>(windowHandles);
        
          //step3: SwitchTo method 
          driver.switchTo().window(lstWindow.get(1));//child
            System.out.println(driver.getTitle());
          
                  
          
          
         WebElement mouseOver = driver.findElement(By.xpath("//span[@id='a-autoid-6']//input[@type='submit']"));
          		
  		
  		//take particular element 
  		File scr = mouseOver.getScreenshotAs(OutputType.FILE);
  		
  		//step 2-create folder for attched the snapshot
  		File des=new File("./snapps/snap3.png");
  		
  		//step3-merge file
  		FileUtils.copyFile(scr, des);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//String amount=driver.findElement(By.xpath("//span[@id='sw-subtotal-item-count']")).getText();
		//WebElement cart=driver.findElement(By.id("sw-subtotal-item-count"));
//System.out.println(cart);
		driver.close();
	}

}
