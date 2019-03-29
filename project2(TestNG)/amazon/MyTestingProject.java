package com.com.flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyTestingProject 
{
	WebDriver driver;
	@Test(priority=1)
	 public void a() throws InterruptedException
     {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   String url="https://www.amazon.in/";
	   driver.get(url);
	  
     }
	
  @Test(priority=2)
  public void b() throws InterruptedException 
  {
	  WebElement signIn=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"));
	  signIn.click();
	  
	  Thread.sleep(1000);
	  WebElement email=driver.findElement(By.xpath("//*[@id='ap_email']"));
	  email.sendKeys("8951072433");
	  Thread.sleep(1000);
	  WebElement submit=driver.findElement(By.xpath("//*[@id='continue' and @type='submit']"));
	  submit.click();
	  Thread.sleep(1000);
	  WebElement pass=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	  pass.sendKeys("jame1996");
	  WebElement sign=driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	  sign.click();
	  Thread.sleep(1000);
	}
   
  @Test(priority=3)
  public void echoDot() throws InterruptedException
  {

	  WebElement shopby=driver.findElement(By.xpath("//span[text()='Shop by']"));
	  WebElement echoAlexa=driver.findElement(By.xpath("//span[text()='Echo & Alexa']"));
	  WebElement echoDot=driver.findElement(By.xpath("//span[text()='All-new Echo Dot']"));
	  
	  Actions a=new Actions(driver);
	  a.moveToElement(shopby).build().perform();
	  Thread.sleep(5000);
	  a.moveToElement(echoAlexa).build().perform();
	  Thread.sleep(5000);
	  a.moveToElement(echoDot).build().perform();
	  Thread.sleep(4000);
	  echoDot.click();
	  
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  
  }
  

  @Test(priority=4)
  public void orderBook() throws InterruptedException
  {
   String book="//*[text()=\"Wings of Fire: An Autobiography of Abdul Kalam\"]";
   WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
   search.sendKeys("apj abdul kalam biography in english");
   WebElement submit=driver.findElement(By.xpath("//*[@class=\"nav-input\" and @type=\"submit\"]"));
   submit.click();
   Thread.sleep(1000);

   WebElement bookclick=driver.findElement(By.xpath(book));
   bookclick.click();

   Thread.sleep(5000);
   String parentWindow=driver.getWindowHandle();
   Set<String>allWindow=driver.getWindowHandles();

   for(String curWindow:allWindow)
   {
	   driver.switchTo().window(curWindow);
   }

   //String regularPrice="//span[text()=\"Regular Price\"]";
   //driver.findElement(By.xpath(regularPrice)).click();
   String addToCart="//*[@id=\"add-to-cart-button\"]";
   WebElement clickadd=driver.findElement(By.xpath(addToCart));
   clickadd.click();
   //driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
   Thread.sleep(5000);
   driver.close();
   driver.switchTo().window(parentWindow);
   //driver.close();
    
   
   //Thread.sleep(5000);
   
  }
  @Test(priority=5)
  public void c() throws InterruptedException
  {

	  WebElement shopby=driver.findElement(By.xpath("//span[text()='Shop by']"));
	  WebElement mobiles=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
	  WebElement allmobiles=driver.findElement(By.xpath("//span[text()='All Mobile Phones']"));
	  
	  Actions a=new Actions(driver);
	  a.moveToElement(shopby).build().perform();
	  Thread.sleep(5000);
	  a.moveToElement(mobiles).build().perform();
	  Thread.sleep(5000);
	  a.moveToElement(allmobiles).build().perform();
	  Thread.sleep(4000);
	  allmobiles.click();
	 
	  WebElement sumcheck=driver.findElement(By.xpath("//*[@name=\"s-ref-checkbox-Samsung\"]"));
	  sumcheck.click();
	  
	 WebElement lowprice=driver.findElement(By.xpath("//*[@id=\"low-price\"]"));
	  lowprice.sendKeys("500");
	  Thread.sleep(5000);
	  WebElement highprice=driver.findElement(By.xpath("//*[@id=\"high-price\"]"));
	  highprice.sendKeys("2000");
	  Thread.sleep(5000);
	  WebElement go=driver.findElement(By.xpath("//span[@id='a-autoid-1-announce']/.."));
	  go.click();
	  Thread.sleep(5000);
	  
	  WebElement mob=driver.findElement(By.xpath("//*[@data-attribute=\"Samsung Guru 1200 (GT-E1200, Black)\"]"));
	  mob.click();
	  Thread.sleep(5000);
	  
	  String parentWindow=driver.getWindowHandle();
	  System.out.println(parentWindow);
	   Set<String>allWindow=driver.getWindowHandles();
      
	   for(String curWindow:allWindow)
	   {
		   driver.switchTo().window(curWindow);
		   System.out.println(curWindow);
	   }
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();//add cart
	  Thread.sleep(5000);
	  driver.close();
	   driver.switchTo().window(parentWindow);
	   Thread.sleep(5000);
	  
  }
  
  
  
  @Test(priority=6)
  public void logout() throws InterruptedException
  {
	  WebElement hello=driver.findElement(By.xpath("//span[text()=\"Hello, \"]"));
	  WebElement signout=driver.findElement(By.xpath("//span[text()=\"Sign Out\"]"));
	  
	 
	  
	  Actions a=new Actions(driver);
	  a.moveToElement(hello).build().perform();
	  
	  Thread.sleep(5000);
	  a.moveToElement(signout).build().perform();
	  signout.click();
	  Thread.sleep(5000);
	  driver.quit();
	}
  
 }
