package DriftCoffee;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Finalprj {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		

		System.setProperty("webdriver.gecko.driver","C:\\Users\\KIRAN\\Desktop\\selenium jar\\geckodriver.exe" );
		WebDriver w = new FirefoxDriver();
		
		//Open URL
		   
	    w.get("https://driftcoffee.kitchen");
	    Thread.sleep(2000);
	    
	    //getCurrentUrl 
	    
	    System.out.println("Current URL is: " + w.getCurrentUrl());
	    
	    //getTitle
	    
	    System.out.println("Title of page is: " + w.getTitle());
	    
	    //Login
	    
	    w.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    
	    System.out.println("Current URL of Login Page: " + w.getCurrentUrl());
	    
	    System.out.println("Title of Login Page: " + w.getTitle());
	    
	    //Create Account
	    
	    w.findElement(By.linkText("Create account")).click();
	    w.findElement(By.id("first_name")).sendKeys("Shivangi");
	    w.findElement(By.id("last_name")).sendKeys("Tribhuvan");
	    w.findElement(By.id("email")).sendKeys("shiv@gmail.com");
	    w.findElement(By.id("password")).sendKeys("shivangi12");
	    
	    w.findElement(By.xpath("//*[@id=\"create_customer\"]/div[5]/input")).click(); 
	    
        TakesScreenshot t=(TakesScreenshot) w;
		
		File src=t.getScreenshotAs(OutputType.FILE);
		
		Files.copy(src, new File("\\Users\\KIRAN\\Desktop\\Sceenshot\\b4.png"));

	    
	    w.navigate().to("https://driftcoffee.kitchen");
	    
	   //Login to Account
	    
	    w.findElement(By.linkText("Log in")).click();
	    Thread.sleep(2000);
	    
	    w.findElement(By.id("customer_email")).sendKeys("shiv@gmail.com");
	    w.findElement(By.id("customer_password")).sendKeys("shivangi12");
	    w.findElement(By.xpath("//*[@id=\"customer_login\"]/div[3]/p/input")).click(); 
	    
	    System.out.println("Login Successfully Done");
	    
	    //Return to store
	    
	    w.findElement(By.linkText("Return to Store")).click();
	    
	    //Your Account
	    
	    w.findElement(By.linkText("Your Account")).click();
		    
	    //View Addresses
	    
	    w.findElement(By.xpath("//*[@id=\"view_address\"]")).click();
	    
	    w.findElement(By.linkText("Add a New Address")).click();
	    w.findElement(By.name("address[first_name]")).sendKeys("Shivangi");
	    w.findElement(By.name("address[last_name]")).sendKeys("Tribhuvan");
	    w.findElement(By.name("address[company]")).sendKeys("TCS");
	    w.findElement(By.name("address[address1]")).sendKeys("Niwara Nagari");
	    w.findElement(By.name("address[address2]")).sendKeys("Niwara Nagari");
	    w.findElement(By.name("address[city]")).sendKeys("Pune");
	    
	    Select s=new Select(w.findElement(By.name("address[country]")));
	    s.selectByIndex(1);
	    
	    w.findElement(By.name("address[zip]")).sendKeys("411000");
	    w.findElement(By.name("address[phone]")).sendKeys("8888888888");
	    w.findElement(By.name("address[default]")).click();
	    w.findElement(By.xpath("//*[@id=\"address_form_new\"]/div/p/input")).click();
	    Thread.sleep(2000);
	    
	    //Return to Account Details
	    
	    w.findElement(By.linkText("Return to Account Details")).click();
	    
	    w.findElement(By.xpath("//*[@id=\"view_address\"]")).click();
	   
	    //Add a New Address
	    
	    w.findElement(By.linkText("Add a New Address")).click();  
	    
	    w.findElement(By.xpath("//*[@id=\"address_form_new\"]/div/p/input")).click();
	    Thread.sleep(2000); 
	    
	    
        //Return to Account Details
	    
	    w.findElement(By.linkText("Return to Account Details")).click();
	    
	    //Logout
	    
	    w.findElement(By.linkText("Log out")).click();
	    System.out.println("Logout Successfully Done");
	    

		    //More
			  
			 w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
			  
			  //Catering
			  
			 w.findElement(By.linkText("Catering")).click();
			  
			  //getCurrentUrl 
			    
			   System.out.println("Current URL is: " + w.getCurrentUrl());
			  
			  //get Title
			  
			  System.out.println("Title of page is: " + w.getTitle());
			  
			  JavascriptExecutor js=(JavascriptExecutor)w;
			  Thread.sleep(2000);
			  js.executeScript("window.scrollBy(0,500)", "");
			  
			  //View Map Mayfaire
			  
			  w.findElement(By.linkText("View Map")).click();
			  Thread.sleep(2000);
			  
	         //get Title
			  
			  System.out.println("Title of page is: " + w.getTitle());
			  
			  //Search 
			  
			  w.findElement(By.id("searchbox-searchbutton")).click();  
			  Thread.sleep(2000);
		 
			  w.navigate().to("https://driftcoffee.kitchen");
			  
			  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
			  
			  //View Map Autumn Hall
			  
			  w.findElement(By.linkText("Catering")).click();
			  
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  w.findElement(By.xpath("//*[@id=\"template\"]/div/section/div[3]/a")).click();
			  Thread.sleep(2000);
			   
			  Set<String> windows=w.getWindowHandles();
				
				Iterator<String> it=windows.iterator();
				
				String parent_window=it.next();
				
				String child_window=it.next();
				
				w.switchTo().window(parent_window);
				Thread.sleep(2000);
				
				w.switchTo().window(child_window);
				Thread.sleep(2000);
				
				w.switchTo().window(parent_window);
				Thread.sleep(2000);
			   
			 
			 		  
			  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
			  
			 
			  //Blog
			  
			 w.findElement(By.linkText("Blog")).click();
			 
			 //Autumn Hall
			 
			 w.findElement(By.linkText("Autumn Hall")).click();
			 
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  w.findElement(By.xpath("//span[contains(text(),'Read more')]")).click();
			  
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,900)", "");
			  
			  w.findElement(By.xpath("//*[@id=\"shopify-section-article-template\"]/div[2]/div/div[1]/div/div[1]/div[2]/a")).click();
			  
			  JavascriptExecutor js4=(JavascriptExecutor)w;
			  Thread.sleep(2000);
			  
			  js4.executeScript("window.scrollBy(0,900)", "");
			  
			  w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template2\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/h3")).click();
			  
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,900)", "");
			  
			w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template2\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]/h3")).click();
			
	        w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template2\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[3]/h3")).click();
			 
	        //Coffee
	        
	        w.navigate().to("https://driftcoffee.kitchen/blogs/news/tagged/coffee");
			  
			Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  w.findElement(By.xpath("//*[@id=\"shopify-section-blog-template\"]/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/a/span")).click();
			 
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  //Giveback
			  
			  w.navigate().to("https://driftcoffee.kitchen/blogs/news/tagged/giveback");
			  
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,900)", "");
			  
			  w.findElement(By.xpath("//*[@id=\"shopify-section-blog-template\"]/div/div/div[3]/div[1]/div[1]/div/div/div[2]/div/a/span")).click();
			  
			  //Menu
			  
			  w.navigate().to("https://driftcoffee.kitchen/blogs/news/tagged/menu");
			  
			 
			  //News and Update
			  
			  w.findElement(By.linkText("News and Updates")).click();
			  
			  //Order Ahead App
			  
			  w.findElement(By.linkText("Order Ahead App")).click();
			  
			  //Wilmington
			  
			  w.findElement(By.xpath("//*[@id=\"shopify-section-blog-template\"]/div/div/div[2]/ul/li[7]/a")).click();
			  
			  
			  //F.A.Q
			  
			  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
			  w.findElement(By.xpath("//*[@id=\"menu-tier-2\"]/ul/li[3]/a")).click();
			  
			  Thread.sleep(2000);
			  
			  js.executeScript("window.scrollBy(0,900)", "");
			  
			  w.findElement(By.linkText("Ceremony Coffee Roasters")).click();
			  Thread.sleep(3000);
			  
			 Set<String> windows1=w.getWindowHandles();
				
				Iterator<String> it1=windows1.iterator();
				
				String parent_window1=it1.next();
				
				String child_window1=it1.next();
				
				w.switchTo().window(parent_window1);
				Thread.sleep(2000);
				
				w.switchTo().window(child_window1);
				Thread.sleep(2000);
				
				w.switchTo().window(parent_window1);
				Thread.sleep(2000);
			   
		
				
			  //About
			  
			  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
			  
			  w.findElement(By.linkText("About")).click();
			 
			  //Contact
			  
			  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[6]/a")).click();
			 
			  w.findElement(By.linkText("Contact")).click(); 
			  
			 
			  w.navigate().back();
			  
			  System.out.println("End of Page");
	    
	 //--------------------------------------------------------------------------------------------------------------
	    
	        //click on cafes
	  		w.findElement(By.partialLinkText("Cafes")).click();
	  		
	  	   //getCurrentUrl 
		    System.out.println("Current URL is: " + w.getCurrentUrl());
		    
		    //getTitle
		    System.out.println("Title of page is: " + w.getTitle());
	  		
	  		//click on view all
	  		w.findElement(By.partialLinkText("View A")).click();
	  		
	  	    //getCurrentUrl 
		    System.out.println("Current URL is: " + w.getCurrentUrl());
		    
		    //getTitle
		    System.out.println("Title of page is: " + w.getTitle());
	  		
	  		Thread.sleep(3000);
	  		
	  		w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")).click();
	  		w.findElement(By.xpath("//a[contains(text(),'Order Ahead')]")).click();
	  		w.navigate().back();
	  		w.navigate().back();
	  		w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/img[1]")).click();
	  		w.findElement(By.xpath("//a[contains(text(),'Order Ahead')]")).click();
	  		w.navigate().back();
	  		w.navigate().back();
	  		w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]/img[1]")).click();
	  		w.findElement(By.xpath("//a[contains(text(),'Order Ahead')]")).click();
	  		w.navigate().back();
	  		w.navigate().back();
	  		
	  		// clink on Bodega breakfast sandwich link
	  		w.findElement(By.linkText("Bodega breakfast sandwich")).click();
	  		
	  		//click on order ahead
	  		w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template3\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/a")).click();
	  		
	  		Thread.sleep(3000);
	  		
	  		//click on app store
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();
	  		 Thread.sleep(2000);
	  		 
	  		 Set <String> windows2= w.getWindowHandles();         
	  		 Iterator <String> it2= windows2.iterator();
	         String parent_window2=it2.next();         
	  		 String child_window2 =it2.next();
	         w.switchTo().window(parent_window2);
	  		 w.switchTo().window(child_window2);
	  		 w.switchTo().window(parent_window2);
	  		 
	  		 
	  		 //click on google play
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]/img[1]")).click();
	  		 Thread.sleep(2000); 
	  		 Set <String> windows3= w.getWindowHandles(); 
	  		 Iterator <String> it3= windows3.iterator();
	  		 String parent_window3=it3.next();  
	  		 String child_window3 =it3.next();
	         w.switchTo().window(parent_window3);
	  		 w.switchTo().window(child_window3);
	  		 w.switchTo().window(parent_window3);
	  		
	  		 /*
	  		 //royalty and rewards
	  		w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[3]/p[2]/a[1]/img[1]")).click();
	  		w.findElement(By.xpath("//*[@id=\"fancybox-close\"]")).click();
	  		*/
	  		 
	  		 //click on here about us
	  		 w.findElement(By.xpath("//*[@id=\"shopify-section-ordernow-template\"]/div[2]/div/div[3]/div[2]/div[2]/p[5]/a[1]")).click();
	  		 
	  		 //click on catering and events
	  		 w.findElement(By.xpath("//a[contains(text(),'Catering and Event packages here')]")).click();
	  		 
	  		 js.executeScript("window.scrollBy(0,4000)","");
	  		 Thread.sleep(3000);
	  		 js.executeScript("window.scrollBy(0,-4000)","");
	  		 
	  		//getCurrentUrl 
			 System.out.println("Current URL is: " + w.getCurrentUrl());
			    
			 //getTitle
		      System.out.println("Title of page is: " + w.getTitle());
	  		 
	  		Thread.sleep(3000);
	  		
	  		//click on 1st map
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/section[1]/div[2]/div[2]/a[1]")).click();
	  		 Thread.sleep(3000);
	  		 w.navigate().back();
	  		 
	  		 //click on 2nd map
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/section[1]/div[3]/a[1]")).click();
	  		 Thread.sleep(3000);
	  		 Set <String> windows4= w.getWindowHandles();         
	  		Iterator <String> it4= windows4.iterator();
	  	    String parent_window4=it4.next();         
	  		String child_window4=it4.next();
	  		
	  	    w.switchTo().window(parent_window4);
	  	    Thread.sleep(2000);
	  	    
	  		w.switchTo().window(child_window4);
	  		Thread.sleep(2000);
	  		
	  		w.switchTo().window(parent_window4);
	  		Thread.sleep(2000);
	  		w.navigate().back();
	  		
	  		
	  		 /*
	  		 //for events
	  		 //to enter into iframe
	  			w.switchTo().frame(w.findElement(By.xpath("//iframe[@id='90738518095870']")));
	  			//with valid data
	  			w.findElement(By.id("first_11")).sendKeys("abc");
	  			w.findElement(By.id("last_11")).sendKeys("pqr");
	  			w.findElement(By.id("input_13_area")).sendKeys("022");
	  			w.findElement(By.id("input_13_phone")).sendKeys("8888888888");
	  			w.findElement(By.id("input_12")).sendKeys("abc@gmail.com");
	  			w.findElement(By.id("input_42")).sendKeys("kbc");
	  			w.findElement(By.id("input_32_0")).click();
	  			w.findElement(By.id("lite_mode_34")).sendKeys("45132011");
	  			w.findElement(By.id("input_36")).sendKeys("23");
	  			w.findElement(By.id("input_38")).clear();
	  			w.findElement(By.id("input_38")).sendKeys("30pm");
	  			w.findElement(By.id("input_40")).clear();
	  			w.findElement(By.id("input_40")).sendKeys("32pm");
	  			w.findElement(By.id("input_41")).sendKeys("sgafstafs gasftyqtsuishqyd fsfstqyyshiq");
	  			w.findElement(By.id("input_9")).click();
	  			
	  			Thread.sleep(2000);
	  			w.navigate().back();
	  			
	  	    w.findElement(By.linkText("Catering and Event packages here")).click();
	  		w.switchTo().frame(w.findElement(By.xpath("//iframe[@id='90738518095870']")));
	  		//with invalid data
	  		w.findElement(By.id("first_11")).sendKeys("@ab2c");
	  		w.findElement(By.id("last_11")).sendKeys("#p3qr");
	  		w.findElement(By.id("input_13_area")).sendKeys("022");
	  		w.findElement(By.id("input_13_phone")).sendKeys("8888888888888888888888");
	  		w.findElement(By.id("input_12")).sendKeys("abcgmail@.com");
	  		w.findElement(By.id("input_12")).clear();
	  		w.findElement(By.id("input_12")).sendKeys("abc@gmail.com");
	  		w.findElement(By.id("input_42")).sendKeys("kbc");
	  		w.findElement(By.id("input_32_0")).click();
	  		w.findElement(By.id("lite_mode_34")).sendKeys("45132011");
	  		w.findElement(By.id("input_36")).sendKeys("0.1");
	  		w.findElement(By.id("input_38")).clear();
	  		w.findElement(By.id("input_38")).sendKeys("30pm");
	  		w.findElement(By.id("input_40")).clear();
	  		w.findElement(By.id("input_40")).sendKeys("32pm");
	  		w.findElement(By.id("input_41")).sendKeys("sgafstafs gasftyqtsuishqyd fsfstqyyshiq");
	  		
	  		TakesScreenshot t1=(TakesScreenshot) w;
	  		File src1=t1.getScreenshotAs(OutputType.FILE);
	  	    Files.copy(src1, new File("D:\\Mahima\\Screenshot\\even_invalid.png"));
	  		
	  		w.findElement(By.id("input_9")).click();
	  		Thread.sleep(2000);
	  		w.navigate().back();
	  		
	  		 w.findElement(By.linkText("Catering and Event packages here")).click();
	  		 w.switchTo().frame(w.findElement(By.xpath("//iframe[@id='90738518095870']")));
	  		 w.findElement(By.linkText("Create your own JotForm")).click();
	  		 Iterator <String> it2= windows.iterator();
	  		 String parent_window4=it2.next();  
	  		 String child_window5 =it2.next();
	         w.switchTo().window(parent_window4);
	  		 w.switchTo().window(child_window5);
	  		 w.switchTo().window(parent_window4);
	  		 w.navigate().back();
	  		 
	  		 //with blank data
	  		 TakesScreenshot t2=(TakesScreenshot) w;
	  		 File src2=t2.getScreenshotAs(OutputType.FILE);
	  		 Files.copy(src2, new File("D:\\Mahima\\Screenshot\\get_blank.png"));
	         w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/input[1]")).click();
	         TakesScreenshot t3=(TakesScreenshot) w;
	  		 File src3=t3.getScreenshotAs(OutputType.FILE);
	           Files.copy(src3, new File("D:\\Mahima\\Screenshot\\get_blank2.png"));
	           w.navigate().back();
	  		 */
	  		
	           
	  		 Thread.sleep(3000);
	  		 
	  		//page get in touch
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]")).sendKeys(" ");	
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/input[1]")).sendKeys(" ");
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/textarea[1]")).sendKeys(" ");
	         w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/input[1]")).click();
	           
	        //take screenshot after submit
	         TakesScreenshot t5=(TakesScreenshot) w;
	  		 File src5=t5.getScreenshotAs(OutputType.FILE);
	  		 Files.copy(src5, new File("\\Users\\KIRAN\\Desktop\\Sceenshot\\b9.png"));
	  		 w.navigate().back();
	  		 Thread.sleep(3000);
	  		 w.navigate().back();
	  		 
	  		 //for faq
	  		 
	  		 Thread.sleep(30000);
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/p[5]/a[2]")).click();
	  		System.out.println(w.getCurrentUrl());
	  		System.out.println(w.getTitle());
	  		 
	  		 
	  		 w.findElement(By.linkText("iPhone")).click();
	  		 Set <String> windows5= w.getWindowHandles(); 
	  		 Iterator <String> it5= windows5.iterator();
	  		 String parent_window5=it5.next();  
	  		 String child_window5 =it5.next();
	         w.switchTo().window(parent_window5);
	  		 w.switchTo().window(child_window5);
	  		 w.switchTo().window(parent_window5);
	  		
	  		 
	  		 //autuman hall
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
	  		 w.findElement(By.xpath("//a[contains(text(),'View Full Menu')]")).click();
	  		 w.navigate().back();
	  		 Thread.sleep(3000);
	  		 w.findElement(By.xpath("//span[contains(text(),'Older Post')]")).click();
	  		 w.findElement(By.xpath("//a[contains(text(),'Back to News')]")).click();
	  		 w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
	  		 w.findElement(By.xpath("//a[contains(text(),'Vegan')]")).click();
	  		 
	  		 TakesScreenshot t6=(TakesScreenshot) w;
	  		 File src6=t6.getScreenshotAs(OutputType.FILE);
	  		 Files.copy(src6, new File("\\Users\\KIRAN\\Desktop\\Sceenshot\\b8.png"));
	  		 
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.findElement(By.xpath("//span[contains(text(),'Newer Post')]")).click();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 
	  		 Thread.sleep(3000);
	  		 
	  		 //coffee
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click();
	  		 w.navigate().back();
	  		 //giveback
	  		 w.findElement(By.partialLinkText("Giveba")).click();
	  		 w.navigate().back();
	  		 //menu
	  		 w.findElement(By.partialLinkText("Menu")).click();
	  		 w.navigate().back();		 
	  		 //news
	  		 w.findElement(By.partialLinkText("News and Updat")).click();
	  		 w.navigate().back();
	  		 //ahead
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")).click();
	  		 w.navigate().back();
	  		 //wiminton
	  		 w.findElement(By.partialLinkText("Wilmingt")).click();
	  		 w.navigate().back();
	  		 
	  		 Thread.sleep(3000);
	  		 
	  		 //ekplore
	  		 w.findElement(By.linkText("Order Ahead App")).click();
	  		 w.findElement(By.linkText("Cafes")).click();
	  		 w.findElement(By.linkText("Jobs")).click();
	  		 //w.findElement(By.linkText("Events")).click();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 
	  		 Thread.sleep(3000);
	  		 
	  		//clink on coffee
	  		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/h3[1]/span[1]")).click();
	  		Thread.sleep(2000);
	  		
	  		//click on brunch
	  		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template3\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]/h3/span")).click();
	  		Thread.sleep(2000);
	  		
	  		//click on lunch
	  		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/h3[1]/span[1]")).click();
	  		Thread.sleep(2000);
	  		
	  		//click on drink
	  		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]/h3[1]/span[1]")).click();
	  		w.navigate().back();
	  		w.navigate().back();
	  		Thread.sleep(2000);
	  		 
	  		 //click on cafes
	  		 w.findElement(By.partialLinkText("Cafes")).click();
	  		 //click on autumn hall
	  		 w.findElement(By.partialLinkText("Autumn Ha")).click();
	  		 //click on order ahead
	  		 w.findElement(By.xpath("//a[contains(text(),'Order Ahead')]")).click();
	  		 
	  		 //click on app store
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();
	  		 Set <String> windows6= w.getWindowHandles();         
	  		 Iterator <String> it6= windows6.iterator();
	         String parent_window6=it6.next();         
	  		 String child_window6 =it6.next();
	         w.switchTo().window(parent_window6);
	  		 w.switchTo().window(child_window6);
	  		 w.switchTo().window(parent_window6);
	  		 
	  		//click on google play
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]/img[1]")).click();
	  		 Set <String> windows7= w.getWindowHandles();         
	  		 Iterator <String> it7= windows7.iterator();
	         String parent_window7=it7.next();         
	  		 String child_window7=it7.next();
	         w.switchTo().window(parent_window7);
	  		 w.switchTo().window(child_window7);
	  		 w.switchTo().window(parent_window7);
	  		 
	  		 //about us
	  		 w.findElement(By.linkText("here")).click();
	  		//getCurrentUrl 
			 System.out.println("Current URL is: " + w.getCurrentUrl());  
			 //getTitle
		      System.out.println("Title of page is: " + w.getTitle());
		      
	  		 // catering link
	  		 w.findElement(By.linkText("Catering and Event packages here")).click();
	  		//getCurrentUrl 
			 System.out.println("Current URL is: " + w.getCurrentUrl());  
			 //getTitle
		      System.out.println("Title of page is: " + w.getTitle());
	  		 w.navigate().back();
	  		 
	  		 //page get in touch
	  		 //with invalid name
	  		 w.findElement(By.xpath("//input[@id='contact_name']")).sendKeys("123@aas");
	  		 w.findElement(By.xpath("//input[@id='contact_email']")).sendKeys("abc@yahoo.com");
	  		 w.findElement(By.xpath("//textarea[@id='message']")).sendKeys("hagt 45sshh 58");
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/input[1]")).click();
	  		Thread.sleep(2000);
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 
	  		 //click on faq
	  		 Thread.sleep(3000);
	  		 
	  		 w.findElement(By.xpath("//*[@id=\"shopify-section-ordernow-template\"]/div[2]/div/div[3]/div[2]/div[2]/p[5]/a[2]")).click();
	  		//getCurrentUrl 
			 System.out.println("Current URL is: " + w.getCurrentUrl());  
			 //getTitle
		      System.out.println("Title of page is: " + w.getTitle());
	  		 
	  		 //iphone
	  		 w.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
	  		 Set <String> windows8= w.getWindowHandles();         
	  		 Iterator <String> it8= windows8.iterator();
	         String parent_window8=it8.next();         
	  		 String child_window8=it8.next();
	         w.switchTo().window(parent_window8);
	  		 w.switchTo().window(child_window8);
	  		 w.switchTo().window(parent_window8);
	  		 
	  		 Thread.sleep(3000);
	  		 
	  		 //autumn hall
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
	  		 //menu at bottom
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();
	  		 //ahead app at bottom
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[3]")).click();
	  		 //wilminting at bottom
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[4]")).click();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 
	  		 //ahead app, cafes, job, events
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[1]/a[1]")).click();
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[2]/a[1]")).click();
	  		 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[3]/a[1]")).click();
	  		 w.findElement(By.xpath("//*[@id=\"shopify-section-article-template\"]/div[2]/div/div[2]/div[2]/div[2]/ul/li[4]/a")).click();
	  		 w.navigate().back();
	  		 w.navigate().back();
	  		 Thread.sleep(2000);
	  		 
	  		 //click on brunch coffee and drinks
	  		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		 w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		 w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	  		 w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/h3[1]/span[1]")).click();
	  		 w.navigate().back();
	  		 Thread.sleep(2000);
	  		 
	  		 //cafes
	  		 w.findElement(By.partialLinkText("Cafes")).click();
	  		 //myfaires
	  		 w.findElement(By.xpath("//body/div[@id='shopify-section-header']/div[1]/div[3]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
	  		 
	  		 //order ahead
	  		 w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template3\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/a")).click();
	  	     w.navigate().back();
	  	     
	  	     w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/h3[1]/span[1]")).click();
	  		 w.navigate().back();
	  		 
	  		 Thread.sleep(3000);
	  		 
	  		//cafes
	  		 w.findElement(By.partialLinkText("Cafes")).click();
	  		 //ocen isale beach
	  		 w.findElement(By.xpath("//body/div[@id='shopify-section-header']/div[1]/div[3]/div[1]/div[2]/ul[1]/li[4]/a[1]")).click();
	  		 //order ahead
	  		 w.findElement(By.xpath("//*[@id=\"shopify-section-cafe-template\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/a")).click();
	  		 w.navigate().back();
	  		 
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/h3[1]/span[1]")).click();
	  		 Thread.sleep(1000);
	  		 w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]/h3[1]/span[1]")).click();
	  		 w.navigate().back();
	  		 Thread.sleep(2000);	 
	  		 
	  		//click on shops
	  		  w.findElement(By.partialLinkText("Shop")).click();
	  		//getCurrentUrl 
			  System.out.println("Current URL is: " + w.getCurrentUrl());  
			//getTitle
			  System.out.println("Title of page is: " + w.getTitle());
			      
	  			//click on cap
	  			w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[2]/div[3]/div[1]/div[10]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();

	  			//click on add to cart
	  			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/input[1]")).clear();
	  			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys(" ");
	  			w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[2]/input[2]")).click();
	  			Thread.sleep(2000);
	  			w.navigate().back();
	  			
	  			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]")).click();
	  			Thread.sleep(2000);		
	  			w.navigate().back();
	  
	  			//click on keep shopping
	  			//w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/a[1]")).click();
	  			
	  			//click on to our heros
	  			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[9]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	  			//click on previous
	  			w.findElement(By.xpath("//*[@id=\"shopify-section-product-template\"]/div/div[2]/div/div[2]/span/a[1]")).click();
	  			//click on view our progress
	  			w.findElement(By.xpath("//*[@id=\"shopify-section-product-template\"]/div/div[4]/div[2]/div[2]/a[2]")).click();
	  			Thread.sleep(3000);
	  			w.navigate().back();
	  			
	  			//click on add to cart
	  			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/form[1]/div[2]/input[2]")).click();
	  			//click on cart
	  			//w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/a[2]")).click();
	  			w.navigate().back();
	  			w.navigate().back();
	  			//click on cart which is present in top up of the page
	  			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/a[1]")).click();
	  			//click on cancel
	  			w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/form[1]/ul[1]/li[1]/a[1]")).click();
	  			w.switchTo().alert().accept();
	  			w.navigate().back();
	  			w.navigate().back();
	  			
	  			Thread.sleep(3000);
	  			
	  			//click on t shirt
	  			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	  			//click on next
	  			w.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/span[1]/a[2]")).click();
	  			//select the size
	  			Select s1=new Select(w.findElement(By.xpath("//select[@id='option-size']")));
	  			s1.selectByValue("Medium");
	  			//quality text field should be blank
	  			w.findElement(By.id("quantity")).clear();
	  			//click on add to cart
	  			w.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/form[1]/div[2]/input[2]")).click();
	  			
	  			//click on cart
	  			//w.findElement(By.linkText("Cart")).click();
	  			
	  			//click on cart top up the page
	  			w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
	  			Thread.sleep(3000);
	  			//click on shop pay
	  			w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/span[2]/*[1]")).click();
	  			//click on back
	  			//w.findElement(By.xpath("//*[@id=\"app\"]/section/div[1]/div[2]/button")).click();
	  			
	  			w.navigate().back();
	  			w.navigate().back();
	  			w.navigate().back();
	  			w.navigate().back();
	  			
	  	
	  			//click on jobs
			w.findElement(By.partialLinkText("Jobs")).click();
			//click on 1st link
			w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]")).click();
			//enter into iframe
		    w.switchTo().frame(w.findElement(By.xpath("//iframe[@id='82878733332162']")));
		    
		    //enter all detailes in form
			w.findElement(By.id("first_11")).sendKeys("25@abc");
			w.findElement(By.id("last_11")).sendKeys("#pqr55");
			w.findElement(By.id("input_16_addr_line1")).sendKeys("205/A jhuyy, hfgtry");
			w.findElement(By.id("input_16_addr_line2")).sendKeys("mg road");
			w.findElement(By.id("input_16_city")).sendKeys("Mumbai@");
			w.findElement(By.id("input_16_state")).sendKeys("Gujarath55");
			w.findElement(By.id("input_16_postal")).sendKeys("303075@#");
			
			Select s2=new Select(w.findElement(By.id("input_16_country")));
			s2.selectByValue("Albania");
			
			w.findElement(By.id("input_12")).sendKeys("abc@gmail.com");
			
			//WebElement uf=w.findElement(By.id("input_24"));
			//uf.sendKeys("‪C:\\Users\\Admin\\Desktop\\demo.docx");
			//w.findElement(By.id("input_24")).sendKeys("‪C:\\Users\\Admin\\Desktop\\demo.docx");
			
			w.findElement(By.id("input_13_area")).sendKeys("91");
			w.findElement(By.id("input_13_phone")).sendKeys("‪84784559@hgdwwd");
			w.findElement(By.id("input_19_0")).click();
			w.findElement(By.id("input_20_0")).click();
			w.findElement(By.id("input_21_1")).click();
			w.findElement(By.id("input_22")).sendKeys("‪ahdhh hgsytudbd ihiytr");
			w.findElement(By.id("input_23")).sendKeys("gsysy kuwytsrggx fwywgdywgdddddddddddd");
			w.findElement(By.id("input_9")).click();
			
			w.navigate().back();
			Thread.sleep(2000);
			
			/*
	  			//click on 2nd link
	  			w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/a[1]")).click();
	  			//enter into iframe
	  			w.switchTo().frame(w.findElement(By.xpath("//iframe[@id='211388079678168']")));
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/span[1]/input[1]")).sendKeys("25@abc");
	  			w.findElement(By.xpath("//*[@id=\"last_3\"]")).sendKeys("#pqr55");;
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[3]/div[1]/span[1]/input[1]")).sendKeys("8888888888");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[4]/div[1]/span[1]/input[1]")).sendKeys("abc@gmail.com");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[6]/div[1]/textarea[1]")).sendKeys("good 589");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[7]/div[1]/textarea[1]")).sendKeys("mhiy gayusgsy gsjsgysbsg sgydhg");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")).sendKeys("C:\\Users\\Admin\\Desktop\\demo.docx");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[10]/div[1]/div[1]/span[1]/label[1]")).click();
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[11]/div[1]/div[1]/span[2]/label[1]")).click();
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[12]/div[1]/div[1]/span[2]/label[1]")).click();
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[13]/div[1]/textarea[1]")).sendKeys("‪ahdhh ihiytr");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[14]/div[1]/textarea[1]")).sendKeys("‪hdggdd gdthdd4 dhwydhwd 8799 hwgdyuwduw oiterpbg 8755@ fweiwjdwdg teiebejdbh rowrhdbh");
	  			w.findElement(By.xpath("/html[1]/body[1]/form[1]/div[1]/ul[1]/li[15]/div[1]/div[1]/button[1]")).click();
	  			w.navigate().back();
	  			w.navigate().back();
	  			
	  			Thread.sleep(2000);
	  			*/
	  			
	//--------------------------------------------------------------------------------------------------------------------------------------------------  			

	  			
	  			//Tc02 - To check the Functionality of Drift App Module 
	  					
	  					w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[1]/a")).click();
	  					
	  					 JavascriptExecutor js1 = (JavascriptExecutor) w;
   
	  				     js1.executeScript("window.scrollTo(0,800)", "scroll");
	  				     
	  				     System.out.println(w.findElement(By.xpath("//*[@id=\"shopify-section-ordernow-template\"]/div[2]/div/h1[2]/span/strong")).getText());
	  				       
	  			//TC03 To check the functionality of Drift order Ahead and loyalty App
	  				     
	  				     Thread.sleep(2000);
	  				     
	  				     w.findElement(By.xpath("//*[@id=\"shopify-section-ordernow-template\"]/div[2]/div/div[1]/a[1]/img")).click();
	  				     
	  				     Thread.sleep(3000);
	  				     
	  				     Set<String> windows9 = w.getWindowHandles();
	  				     
	  				     Iterator <String> it9= windows9.iterator();
	  				       
	  				     String Parent_win=it9.next();
	  				     
	  				    w.findElement(By.xpath("//*[@id=\"shopify-section-ordernow-template\"]/div[2]/div/div[1]/a[2]/img")).click();
	  				    
	  			        Thread.sleep(3000);	    
	  	      
	  				    w.switchTo().window(Parent_win); 
	  				    
	  				   
	  			//TC04 – To check the functionality of Here Link option
	  				    
	  				       
	  				     js.executeScript("window.scrollTo(0,10000)", "scroll");
	  				     
	  				     
	  				     w.findElement(By.linkText("here")).click();
	  				     
	  				     
	  				     System.out.println(w.getTitle());
	  				     
	  				     
	  				     System.out.println(w.getCurrentUrl());
	  				          
	  				     js.executeScript("window.scrollTo(0,600)", "scroll");
	  				     
	  				     
	  			//TC05	   To check the functionality of send button (Fail)
	  				     
	  				     w.findElement(By.id("contact_name")).sendKeys("");
	  				     
	  				     w.findElement(By.id("contact_email")).sendKeys("12@gml.com");
	  				     
	  				     w.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("sjsjsj");
	  				     
	  				     w.findElement(By.xpath("//*[@id=\"contact_form\"]/div[4]/input")).click();
	  				     
	  				       TakesScreenshot t7 = (TakesScreenshot) w;
	  				       
	  				       File src7 = t7.getScreenshotAs(OutputType.FILE);
	  				        
	  				       
	  				       Files.copy(src7, new File ("\\Users\\KIRAN\\Desktop\\Sceenshot\\b1.png"));
	  				       
	  				       w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[1]/a")).click();
	  				       
	  				       JavascriptExecutor js3 = (JavascriptExecutor) w;

	  				       
	  					   js3.executeScript("window.scrollTo(0,1800)", "scroll");
	  					   
	  					   Thread.sleep(2000);
	  					   
	  					   
	  			//TC06	To check the Functionality of Order Now Option	   
	  					   
	  					  w.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/div/ul[1]/li[2]/a")).click();
	  					  Thread.sleep(6000);
	  					  
	  					  w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[4]/div/span[2]/span[1]/span")).click();
	  					  
	  					  
	  					  Select s3 = new Select(w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[6]/div/select")));
	  					  
	  					  s3.selectByValue("231798");
	  				     
	  					  
	  				      w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[11]/button")).click();
	  					
	  			//TC07 To check The functionality of Login button 
	  				      
	  				      Thread.sleep(30000);
	  				     
	  				      w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div[1]/div[3]/a/span")).click();
	  				      
	  				      Thread.sleep(4000);
	  				      
	  				     w.findElement(By.xpath("//span[contains(text(),'Not a member yet? Tap here to Register')]")).click();
	  				     
	  				     Thread.sleep(4000);
	  				     
	  				     w.findElement(By.xpath("/html/body/div[3]/md-dialog/md-toolbar/div/button/md-icon")).click();
	  				     
	  				     
	  			//TC08 To check the functionality of add option 


	  				     Thread.sleep(4000);
	  				     
	  				     w.findElement(By.xpath("//*[@id=\"heading3\"]/h4/a")).click();
	  				     
	  				     w.findElement(By.linkText("Lunch")).click();
	  				     
	  				     
	  				     w.findElement(By.xpath("//*[@id=\"collapse_232109\"]/div[1]/div/div[5]/div[2]/div/div/div/button/span")).click();
	  				     
	  				     
	  				     Thread.sleep(4000);
	  				     
	  				     w.findElement(By.xpath("/html[1]/body[1]/div[3]/md-dialog[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/i[1]")).click();
	  				    
	  				     Thread.sleep(3000);
	  				     
	  				     
	  				     w.findElement(By.xpath("//body/div[3]/md-dialog[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")).click();  
	  				     
	  				     
	  				     Thread.sleep(2000);
	  				     
	  				     w.findElement(By.xpath("//*[@id=\"heading1\"]/h4/a")).click();
	  				     
	  				     
	  				     w.findElement(By.linkText("Coffee - Cold")).click();
	  				    			     
	  				     
	  				      Thread.sleep(3000);
	  				      
	  				     
	  				    // w.findElement(By.xpath("//*[@id=\"collapse_232104\"]/div[2]/div/div[5]/div[2]/div/div/div/button/span")).click();
	  				     
	  				     
	  				   //  w.findElement(By.xpath("//body/div[3]/md-dialog[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")).click();
	  				     
	  				   //  Thread.sleep(4000);
	  		
	  			//TC09 TO check the functionality of checkout Button 
	  				     
	  				    w.findElement(By.xpath("//*[@id=\"cartContainerWrpId\"]/div[2]/div/div[2]/div[1]/button/span")).click();
	  				    
	  				    Thread.sleep(3000);
	  				    
	  				    w.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
	  				    
	  			//TC010 – To check the functionality of Back to Cart button
	  				    
	  				  Thread.sleep(30000);
	  				  
	  				  w.findElement(By.xpath("//button[@id='edit-back-to-cart']")).click();
	  				  
	  	    	 //TC011 To check the functionality of change Preference option


	  				  Thread.sleep(2000); 
	  			
	  				w.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/span/span")).click();
	  				
	  				Thread.sleep(3000);
	  				
	  				w.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[1]/span")).click();
	  			
	  				Thread.sleep(2000);
	  				
	  				w.navigate().back();
	  				
	  				Thread.sleep(3000);
	  				
	  				w.navigate().back();
	  				
	  				Thread.sleep(2000);
	  				
	  				w.navigate().back();
	  				
	  		//TC012 To check the functionality of Flat Rate Shipping option
	  				
	  				w.findElement(By.xpath("//*[@id=\"store-messages\"]/div/div[1]/a/h6")).click();
	  				
	  				
	  				 Select s4 = new Select(w.findElement(By.xpath("//*[@id=\"option-grind\"]")));
	  				 
	  				 
	  				 s4.selectByValue("Fine(espresso/stovetop)");
	  				  
	  				 Thread.sleep(2000);
	  				 
	  			     
	  				w.findElement(By.xpath("//*[@id=\"shopify-section-product-template\"]/div/div[6]/div[2]/div[1]/form/div[2]/input[2]")).click();
	  				
	  				
	  				Thread.sleep(3000);
	  				
	  				
	  				w.findElement(By.xpath("//*[@id=\"cart-summary-overlay\"]/div[2]/div[3]/a[2]")).click();
	  				
	  				Thread.sleep(2000);
	  				
	  				w.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	  				
	  				Thread.sleep(2000);
	  				
	  				 Alert A2 = w.switchTo().alert();
	  				 
	  			     System.out.println(A2.getText());
	  			     
	  			     A2.accept();
	  			       
	  			     w.findElement(By.xpath("//*[@id=\"store-messages\"]/div/div[2]/a/h6")).click();
	  			     
	  			//TC013 To check the functionality of about option 


	  			     
	  			       
	  				 js.executeScript("window.scrollTo(0,2500)", "scroll");
	  				 
	  				 Thread.sleep(2000);
	  				 
	  				 w.findElement(By.linkText("About")).click();
	  				 
	  			//TC014	  To check the functionality of job option 
	  				 
	  				 w.findElement(By.linkText("Jobs")).click();
	  			       
	  				 js.executeScript("window.scrollTo(0,2500)", "scroll");
	  				 
	  			
	  				 w.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[3]/div[1]/div[7]/div[2]/a[1]")).click();
	  				 
	  			//TC015 To check the functionality of blog option
	  				 
	  		
	  				w.navigate().back();
	  				
	  				w.findElement(By.linkText("Blog")).click();
	  				
	  				w.navigate().back();
	  				
	  			//TC016 To check the functionality of contact option 
	  				
	  				Thread.sleep(3000);
	  				
	  				w.findElement(By.xpath("//body/div[@id='pagefooter']/div[@id='shopify-section-footer']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click();
	  				
	  				w.navigate().back();
	  				
	  				//Thread.sleep(2000);
	  				
	  				//w.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/svg[1]/g[1]/g[1]/path[1]")).click();
	  				
	  				//w.navigate().back();
	  				
	  				Thread.sleep(2000);
	  				
	  				w.findElement(By.xpath("//body/div[@id='pagefooter']/div[@id='shopify-section-footer']/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/*[1]")).click();
	  				
	  				w.navigate().back();
	  				Thread.sleep(2000);
	  				
	  				w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[2]/a[1]/h6[1]")).click();
	  				
	  				w.navigate().back();
	  				
	  				Thread.sleep(2000);
	  				
	  				w.navigate().back();
	  				
	  				Thread.sleep(3000);
	  				w.findElement(By.xpath("//h6[contains(text(),'Free Shipping on Gift Cards')]")).click();
	  				
	  				Thread.sleep(2000);
	  				
	  				w.navigate().back();
	  				
	  				w.navigate().back();
	  				
	  			    w.close();	  		

	}

}
