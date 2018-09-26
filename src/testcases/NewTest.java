package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  //Thread.sleep(5000);
	  //WebDriverWait wait = new WebDriverWait(driver, 30);
	  //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div[2]/div[2]/div[1]/div/div/div/a")));
	  
	  driver.findElement(By.xpath("//a[@class='privacy-overlay__close']")).click();
	  WebElement element = driver.findElement(By.xpath(("/html/body/section/div[2]/div[2]/div[1]/div/div/div/a")));
	  Actions actions = new Actions(driver);
	  actions.moveToElement(element).click().perform();
	  
	  //element.click();
	  //driver.findElement(By.xpath("//a[@class='see_more']")).click();
	  //String artist = "Calvin Harris";
	  //String artist_link = driver.findElement(By.xpath("//span[2][contains(text(),'Calvin Harris')")).getText(); 
	  //assertEquals(artist,artist_link);
	  //driver.findElement(By.xpath("//span[2][contains(text(),'Calvin Harris')")).click();
	
	  //('//*[@id="song_promo_59049"]/div/div[2]/h3/span[2]'))
	  
	  //List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	  //ArrayList[] list = driver.findElements(By.xpath("//*[contains(id(),'song_promo_']/div/div[2]/h3/span[2]/a[1]")).getText();
	  //ArrayList[] artist_list = driver.findElements(By.xpath("//*[contains(id(),'song_promo_']/div/div[2]/div/p"));
	  //List<WebElement> artist_list = driver.findElements(By.xpath("//a[@class='first']"));
	  
	  List<WebElement> artist_detail = driver.findElements(By.xpath("//div[@class='song__text-content']"));
	  //List<WebElement> artist_time = driver.findElements(By.xpath("//p[@class='publish_date']"));
	  List<String> alist = new ArrayList<String>();
	  //List<String> tlist = new ArrayList<String>();
		  for(WebElement e : artist_detail) {
			  //alist.add(e.getText());
			  List<String> artistList = new ArrayList<String>(Arrays.asList(e.getText().split(" ")));
 			  for (int i=0; i<artistList.size();i++) {
				  if (i>0) {
				  String first_name = artistList.get(i-1);
				  String last_name = artistList.get(i);
				  String artist_name = first_name + " " + last_name;
				  if(artist_name.matches("Calvin Harris")) {
					  System.out.println(e.getText());
					  assertEquals(artist_name,"Calvin Harris");
					  }		
				  }
			  }
			  
			  //System.out.println(e.getText());
		  /*System.out.println(e.getText());
	  System.out.println(e);
	  System.out.println(driver.findElement(By.xpath("//p[@class='publish_date visible']")).getText());*/
	  }
		/*  for(WebElement t : artist_time) {
			  tlist.add(t.getText());
			  System.out.println(t.getText());
		  }
		  
		  for (int i=0; i<(alist.size()+1);i++) {
			  String artist_name = alist.get(i);
			  String play_time = tlist.get(i);
			  if(artist_name.matches("Calvin Harris")) {
				  System.out.println("The Song played by "+artist_name+" was at time : "+play_time);
			  }
		  }
		  
		
		String t1 = driver.findElement(By.xpath("//*[@id='song_promo_59049']/div/div[2]/div/p")).getText();
		String t2 = driver.findElement(By.xpath("//*[@id='song_promo_60357']/div/div[2]/div/p")).getText();
		String t3 = driver.findElement(By.xpath("//*[@id='song_promo_59049']/div/div[2]/div/p")).getText();
		
		System.out.printf("Time played : %s\n%s\n%s",t1,t2,t3);*/
//-------------------------------------------------
		  	//X Path that Gives Time:
			//div[@class='song__text-content']/descendant::div//p[@class='publish_date visible']
			  
			//X Path that Gives Artist Name:
			//div[@class='song__text-content']/descendant::h3/descendant::span[@class='artist']
			  /*
		  	  List<WebElement> artist_name = driver.findElements(By.xpath("//div[@class='song__text-content']/descendant::h3/descendant::span[@class='artist']"));
			  for(WebElement f : artist_name) {
			  System.out.println(f.getText());
			  }
			  
			  List<WebElement> artist_time = driver.findElements(By.xpath("//div[@class='song__text-content']/descendant::div//p[@class='publish_date visible']"));
			  for(WebElement g : artist_time) {
			  System.out.println(g.getText());
			  }*/
//----------------------------------------------------
			  	//X Path that Gives Time:
				//div[@class='song__text-content']/descendant::div//p[@class='publish_date visible']
				  
				//X Path that Gives Artist Name:
				//div[@class='song__text-content']/descendant::h3/descendant::span[@class='artist']
				
		  /*
			  	  List<WebElement> artist_name = driver.findElements(By.xpath("//div[@class='song__text-content']/descendant::h3/descendant::span[@class='artist']"));
				  for(WebElement f : artist_name) {
				  System.out.println(f.getText());
				  }
				  
				  List<WebElement> artist_time = driver.findElements(By.xpath("//div[@class='song__text-content']/descendant::div//p[@class='publish_date visible']"));
				  for(WebElement g : artist_time) {
				  System.out.println(g.getText());
				  }
			*/
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  driver.manage().window().maximize();	
	  driver.get("https://www.capitalfm.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
