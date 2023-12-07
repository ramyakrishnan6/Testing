package marathon;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.*;
//import org.openqa.selenium.safari.*;
//import org.openqa.selenium.edge.*;

public class AbhiBus {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//input[@placeholder='From Station'])")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-id='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[contains(@data-id,'Bangalore')]//div[contains(@class,'station-body col')]")).click();
		driver.findElement(By.linkText("Tomorrow")).click();
		String text=driver.findElement(By.xpath("//h5[text()='IntrCity SmartBus']")).getText();
		System.out.println("First Resulting Bus in Page:"+(text));
		//driver.findElement(By.xpath("//span[normalize-space()='Sleeper']")).click();
		String bus=driver.findElement(By.xpath("//h5[text()='IntrCity SmartBus']")).getText();
		System.out.println("First Resulting sleeper Bus:"+ (bus));
		//driver.findElement(By.cssSelector("div[id='service-operator-select-seat-1760075217'] button[class='btn bus-info-btn filled primary sm inactive button']")).click();
		//driver.findElement(By.xpath("//div[@id='seat-availability-info']"));
		driver.findElement(By.xpath("//button[contains(@class,'seat sleeper')]//span[contains(text(),'U7')]")).click();
	    driver.findElement(By.xpath("//p[(text()='Siruseri - Infront of HDFC ATM,')]")).click();
	    driver.findElement(By.linkText("Attibele")).click();
	driver.findElement(By.xpath("//button[contains(@class,'seat sleeper')]//span[contains(text(),'2UC')]")).click();

}
}
