package mini.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_proj {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkatesh\\eclipse-workspace\\Mini_proj\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	WebElement username = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/form/table/tbody/tr[2]/td[2]/input"));
	username.sendKeys("venkatesh920");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("bala1234");
	
	File scr1 = ts.getScreenshotAs(OutputType.FILE);
	File s=new File("C:\\Users\\Venkatesh\\eclipse-workspace\\Mini_proj\\Screenshot\\log.png");
	FileUtils.copyFile(scr1,s);
	
	WebElement log = driver.findElement(By.id("login"));
	log.click();
	
	WebElement loc = driver.findElement(By.id("location"));	
	loc.sendKeys("Melbourne");
	
	WebElement hotel = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td[2]/select"));
	Select s1= new Select(hotel);
	s1.selectByValue("Hotel Sunshine");
	
	WebElement mem = driver.findElement(By.id("room_type"));
	Select s2 =new Select(mem);
	s2.selectByValue("Super Deluxe");
	
	WebElement room = driver.findElement(By.id("room_nos"));
	Select s3=new Select(room);
	s3.selectByValue("3");
	
	WebElement che = driver.findElement(By.id("datepick_in"));
	che.clear();
	che.sendKeys("11/04/2022");
	
	WebElement out = driver.findElement(By.id("datepick_out"));
	out.clear();
	out.sendKeys("12/04/2022");
	
	WebElement adultroom = driver.findElement(By.id("adult_room"));
	Select s4 =new Select(adultroom);
	s4.selectByValue("2");
	
	WebElement child = driver.findElement(By.id("child_room"));
	Select s5= new Select(child);
	s5.selectByValue("2");
	
	File sub1 = ts.getScreenshotAs(OutputType.FILE);
	File sub2 = new File("C:\\Users\\Venkatesh\\eclipse-workspace\\Mini_proj\\Screenshot\\sub.png");
	FileUtils.copyFile(sub1, sub2);
	
	
	Thread.sleep(2000);
	WebElement sub = driver.findElement(By.id("Submit"));
	sub.click();
	
	WebElement radio = driver.findElement(By.id("radiobutton_0"));
	radio.click();
	
	File cont = ts.getScreenshotAs(OutputType.FILE);
	File con2=new File("C:\\Users\\Venkatesh\\eclipse-workspace\\Mini_proj\\Screenshot\\con3.png");
	FileUtils.copyFile(cont, con2);
	
	Thread.sleep(2000);
	WebElement con = driver.findElement(By.id("continue"));
	con.click();
	
	WebElement first = driver.findElement(By.id("first_name"));
	first.sendKeys("Venkatesh");
	
	WebElement last = driver.findElement(By.name("last_name"));
	last.sendKeys("Bala");
	
	WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
	add.sendKeys("Chennai,tamilnadu");
	
	WebElement card = driver.findElement(By.id("cc_num"));
	card.sendKeys("1234432156788765");
	
	WebElement cardtype = driver.findElement(By.id("cc_type"));
	Select s6=new Select(cardtype);
	s6.selectByValue("MAST");
	
	WebElement expmo = driver.findElement(By.id("cc_exp_month"));
	Select s7=new Select(expmo);
	s7.selectByIndex(5);
	
	WebElement expyear = driver.findElement(By.id("cc_exp_year"));
	Select s8=new Select(expyear);
	s8.selectByValue("2022");
	
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("234");
	
	File final_1 = ts.getScreenshotAs(OutputType.FILE);
	File final2=new File("C:\\Users\\Venkatesh\\eclipse-workspace\\Mini_proj\\Screenshot\\book.png");
	FileUtils.copyFile(final_1, final2);
	
	Thread.sleep(2000);
	WebElement book = driver.findElement(By.id("book_now"));
	book.click();
	
	File final_3 = ts.getScreenshotAs(OutputType.FILE);
	File final4=new File("C:\\Users\\Venkatesh\\eclipse-workspace\\Mini_proj\\Screenshot\\confirm.png");
	FileUtils.copyFile(final_3, final4);
	
	Thread.sleep(2000);
	WebElement logout= driver.findElement(By.xpath("//a[@href='Logout.php']"));
	logout.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
}