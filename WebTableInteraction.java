package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[contains(text(),'Mgr Chennai Ctr')]")).click();
	     driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[contains(text(),'Madurai')]")).click();
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		/*String firstRowData = driver.findElement(By.xpath("//a[contains(text(),'KANYAKUMARI EXP')]")).getText();
		System.out.println("first row first data : "+firstRowData);
		
		//List<WebElement> colValue = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/th[2]"));
		//int rowsize = colValue.size();
		//System.out.println("col size :"+rowsize);
		for (int i = 0; i < colValue.size(); i++) {
			String coldata = colValue.get(i).getText();
			System.out.println(coldata);*/
	
		//ArrayList<String> gfg = new ArrayList<String>();
		
		WebElement table = 
				driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));

		List<WebElement> trs = table.
				findElements(By.tagName("tr"));
		System.out.println(trs.size());
		List<String> list = new ArrayList<String>();
		for (WebElement rows : trs)
		{
			List<WebElement> cols = rows.
					findElements(By.tagName("td"));
			list.add(cols.get(1).getText());
			
			Collections.sort(list);
			//for (String trainNames : list) {
				//System.out.println(trainNames);
			
			List<String> sortedList = new ArrayList<String>();
			driver.findElement(By.linkText("Train Name")).click();
			WebElement sortedTable = 
					driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
			List<WebElement> sortedRows = sortedTable.findElements(By.tagName("tr"));
			for (WebElement sortedDatas : sortedRows) {
				List<WebElement> tds = sortedDatas.findElements(By.tagName("td"));
				sortedList.add(tds.get(1).getText());
			
			
			}
		}}}