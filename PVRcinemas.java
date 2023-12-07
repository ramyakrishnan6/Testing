package marathon;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("img[src='https://originserver-static1-uat.pvrcinemas.com/pvrcms/city/Chennai_new.png']")).click();
			driver.findElement(By.xpath("//div[contains(@class,'icon')]")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		   WebElement selec = driver.findElement(By.name("genre"));
		     Select op=new Select(selec);
		   op.selectByVisibleText("ANIMATION");
		   WebElement selec1 = driver.findElement(By.name("lang"));
		     Select op1=new Select(selec1);
		   op1.selectByVisibleText("ENGLISH");
		   driver.findElement(By.xpath("//button[text()='Apply']")).click();
		 //  driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		 //  driver.findElement(By.xpath("//div[contains(@class, 'movie-wrapper')]")).click();
		 // driver.findElement(By.xpath("//div[contains(@class,'movie-wrapper')]")).click();
		   driver.findElement(By.cssSelector("<img[src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=12']")).click();
		   WebElement sel = driver.findElement(By.id("cinemaName"));
		     Select op2=new Select(sel);
		   op2.selectByVisibleText("PVR AEROHUB");
		   WebElement sel2 = driver.findElement(By.name("timings"));
		     Select op3=new Select(sel2);
		   op3.selectByVisibleText("09:00 PM - 12:00 AM");
		   int ticketnum=2;
		   driver.findElement(By.name("noOfTickets")).sendKeys(String.valueOf(ticketnum));
		   driver.findElement(By.name("name")).sendKeys("Ramya");
		   driver.findElement(By.name("email")).sendKeys("ramyaakrishna6@gmail.com");
		   int num=1234567891;
		   driver.findElement(By.name("mobile")).sendKeys(String.valueOf(num));
		   WebElement selectt = driver.findElement(By.name("food"));
		     Select op4=new Select(selectt);
		   op4.selectByVisibleText("yes");
		   driver.findElement(By.name("comment")).sendKeys("Nil");
		   driver.findElement(By.xpath("//span[text()='Copy To Self')")).click();
		   driver.findElement(By.xpath("//button[text()='SEND REQUEST']"));
	
		   
	}

}


