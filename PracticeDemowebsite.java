package Final;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebsite {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\KIRAN\\Desktop\\selenium jar\\geckodriver.exe");
		WebDriver w= new FirefoxDriver();
		
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		w.findElement(By.name("userName")).sendKeys("");
		
		w.findElement(By.name("password")).sendKeys("");
		
		w.findElement(By.name("submit")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		w.findElement(By.name("firstName")).sendKeys("mina");
		
		w.findElement(By.name("lastName")).sendKeys("shankopal");
		
		w.findElement(By.name("phone")).sendKeys("654445456464");
		
		w.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("28373@.com");
		
		w.findElement(By.name("address1")).sendKeys("pune");
		
		w.findElement(By.name("city")).sendKeys("pune");
		
		w.findElement(By.name("state")).sendKeys("73363737");
		
		w.findElement(By.name("postalCode")).sendKeys("iehdjdh");
		
		Select s = new Select(w.findElement(By.name("country")));
		
		s.selectByValue("ANDORRA");
		
		w.findElement(By.name("email")).sendKeys("mina");
		
		w.findElement(By.name("password")).sendKeys("1234");
		
		w.findElement(By.name("confirmPassword")).sendKeys("1234");
		
		
		w.findElement(By.name("submit")).click();
		
		w.navigate().back();
		
       w.findElement(By.name("email")).sendKeys("I");
		
		w.findElement(By.name("password")).sendKeys("ueddh");
		
		w.findElement(By.name("confirmPassword")).sendKeys("ueddh");
		
		
		w.findElement(By.name("submit")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		w.findElement(By.linkText("Home")).click();
		
		w.findElement(By.linkText("Flights")).click();
		
        w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
        Select s9 = new Select(w.findElement(By.name("passCount")));
		s9.selectByValue("2");
		
		
		Select s1 = new Select(w.findElement(By.name("fromPort")));
		s1.selectByValue("New York");
		
		Select s2 = new Select(w.findElement(By.name("fromMonth")));
		s2.selectByValue("4");
		
		Select s3 = new Select(w.findElement(By.name("fromDay")));
		s3.selectByValue("6");
		
		
		Select s4 = new Select(w.findElement(By.name("toPort")));
		s4.selectByValue("London");
		

		Select s5 = new Select(w.findElement(By.name("toMonth")));
		s5.selectByValue("4");
		
		Select s6 = new Select(w.findElement(By.name("toDay")));
		s6.selectByValue("20");
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		
		Select s8 = new Select(w.findElement(By.name("airline")));
		s8.selectByVisibleText("Blue Skies Airlines");
		
		w.findElement(By.name("findFlights")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")).click();
		
		w.findElement(By.linkText("Hotels")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		w.findElement(By.linkText("Car Rentals")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		w.findElement(By.linkText("Cruises")).click();
		
		w.findElement(By.linkText("Destinations")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		w.findElement(By.linkText("Vacations")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		w.findElement(By.linkText("Flash Movie Demo")).click();
		
		w.findElement(By.name("Play")).click();
		
		w.findElement(By.name("Stop")).click();
		
		w.findElement(By.name("Zoomin")).click();
		
		w.findElement(By.name("Zoomout")).click();
		
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();

		w.findElement(By.linkText("Radio & Checkbox Demo")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
		
		w.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		
		w.navigate().back();
        
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		w.findElement(By.linkText("Table Demo")).click();
		
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
        
		w.findElement(By.linkText("Accessing Link")).click();
		
		w.findElement(By.xpath("/html/body/a[1]")).click();
		
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/a[2]")).click();
		
		w.navigate().back();
		
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		w.findElement(By.linkText("Ajax Demo")).click();
		
		w.findElement(By.id("no")).click();
		
		w.findElement(By.id("buttoncheck")).click();
		
		w.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]")).click();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		w.findElement(By.linkText("Inside & Outside Block Level Tag")).click();
		
		w.findElement(By.xpath(" /html/body/p/a")).click();
		
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/a/div/span")).click();
		
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
        
		w.findElement(By.linkText("Delete Customer Form")).click();
		
		w.findElement(By.name("cusid")).sendKeys("24362442");
		
		w.findElement(By.name("res")).click();
		
		w.findElement(By.name("cusid")).sendKeys("mina123");
		
		w.findElement(By.name("submit")).click();
		
		 Alert A4 = w.switchTo().alert();
	         
	     System.out.println(A4.getText());
				 
		 A4.dismiss();
				 
		 Thread.sleep(2000);

		w.findElement(By.name("cusid")).sendKeys("nilam123");
			
		w.findElement(By.name("submit")).click();
			
		Alert A3 = w.switchTo().alert();
         
	    System.out.println(A3.getText());
					 
		 A3.accept();
		 
		 Thread.sleep(2000);
		 
		 Alert A5 = w.switchTo().alert();
         
		 System.out.println(A5.getText());
						 
		 A5.accept();
		 
		 Thread.sleep(2000);
		 
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
        w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[9]/a")).click();
        
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();

	
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a")).click();
		
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.linkText("File Upload")).click();
		
		Thread.sleep(2000);
		
        w.findElement(By.id("terms")).click();
        
        w.findElement(By.id("submitbutton")).click();
        
        Thread.sleep(2000);
        
        w.navigate().back();
        
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[11]/a")).click();
		
		w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
        
		w.findElement(By.linkText("Social Icon")).click();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();

		w.findElement(By.linkText("Selenium Auto IT")).click();
		
        Thread.sleep(6000);
   /////////////////////////////////////////////////////////////////////////////////////////////////     
        w.findElement(By.linkText("SIGN-ON")).click();
		System.out.println(" Sign on button is working");
		w.navigate().back();
		w.findElement(By.linkText("REGISTER")).click();
	    System.out.println(" Register button is working");
        w.navigate().back();
        w.findElement(By.linkText("SUPPORT")).click();
        w.navigate().back();
        System.out.println(" Spport is working ");
        w.findElement(By.linkText("CONTACT")).click();
        System.out.println(" Contact is working ");
        w.findElement(By.linkText("Home")).click();
        System.out.println(" Home is working ");
        w.findElement(By.linkText("Flights")).click();
        System.out.println(" Flight is working ");
        
        w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]")).click();
        w.navigate().back();
        System.out.println(" Hotel is working ");
        
        w.findElement(By.linkText("Car Rentals")).click();
        System.out.println(" Car rental is working ");
        w.navigate().back();
        
        w.findElement(By.linkText("Cruises")).click();
        System.out.println(" Cruises is working ");
        
        w.findElement(By.linkText("Destinations")).click();
        
        System.out.println(" Destination is working ");
        w.navigate().back();
        w.findElement(By.linkText("Vacations")).click();
        System.out.println(" Vacation is Working ");
        w.navigate().back();
	}
		
		
}




