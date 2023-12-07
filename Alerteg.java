package training;

import org.openqa.selenium.*;
	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Alerteg
	{

		public static void main(String[] args) throws InterruptedException
		{
	     ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//span[text()='Show']")).click();
			//Alert syntax
			Alert alert=driver.switchTo().alert();
			String str=alert.getText();
			System.out.println(str);
			Thread.sleep(1000);
			alert.accept();
			String text = driver.findElement(By.id("simple_result")).getText();
			System.out.println(text);
			System.out.println(" ");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			Alert alert1=driver.switchTo().alert();
			String str1=alert1.getText();
			System.out.println(str1);
			Thread.sleep(1000);
			alert.accept();
			String text1 = driver.findElement(By.id("result")).getText();
			System.out.println(text1);
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
			Alert alert3=driver.switchTo().alert();
			String str3=alert3.getText();
			System.out.println(str3);
			Thread.sleep(1000);
			alert.sendKeys("Ramya");
			alert.dismiss();
				String text2 = driver.findElement(By.id("confirm_result")).getText();
				
			System.out.println(text2);
		}
	}