package com.adactin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Proj {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Delllaptop\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.name("username")).sendKeys("haree231");
		driver.findElement(By.name("password")).sendKeys("hansika");
		driver.findElement(By.id("login")).click();

		WebElement loction = driver.findElement(By.name("location"));
		Select s = new Select(loction);
		s.selectByValue("London");
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement rooms = driver.findElement(By.id("room_type"));
		Select s2 = new Select(rooms);
		s2.selectByValue("Deluxe");
		WebElement NoR = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(NoR);
		s3.selectByValue("2");
		WebElement Cin = driver.findElement(By.name("datepick_in"));
		Cin.sendKeys("28/03/2022");
		WebElement Cout = driver.findElement(By.name("datepick_out"));
		Cout.sendKeys("31/03/2022");
		WebElement adultR = driver.findElement(By.name("adult_room"));
		Select s4 = new Select(adultR);
		s4.selectByValue("2");
		WebElement childR = driver.findElement(By.name("child_room"));
		Select s5 = new Select(childR);
		s5.selectByValue("2");
		driver.findElement(By.id("Submit")).click();


		driver.findElement(By.name("radiobutton_0")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.name("first_name")).sendKeys("Hariharan");
		driver.findElement(By.name("last_name")).sendKeys("hansika");
		driver.findElement(By.name("address")).sendKeys("no:69 Vivekananthar St, Dubai main road, dubai-09");
		driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByValue("VISA");
		WebElement ccexmonth = driver.findElement(By.name("cc_exp_month"));
		Select s7 = new Select(ccexmonth);
		s7.selectByValue("8");
		WebElement ccexyear = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(ccexyear);
		s8.selectByValue("2022");
		driver.findElement(By.name("cc_cvv")).sendKeys("234");
		driver.findElement(By.name("book_now")).click();
		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver; 
		File scr = ts.getScreenshotAs(OutputType.FILE); 
		File dest = new File("./hari/miniproj.png");
		FileHandler.copy(scr, dest);
		
	}	





}
