import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "D:\\OneDrive - Speridian Technologies\\LEARNING\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rinjurachel610@gmail.com");   //By ID
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("sajisosamma");   //BY Xpath
		driver.findElement(By.cssSelector("#pass")).sendKeys("sajisosamma1");   //By css selector
		//driver.findElement(By.name("pass")).sendKeys("sajisosamma");       // By name
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'loginform\']/div[2]/div[2]")).getText());
		
	//driver.close();

		//driver.findElement(By.linkText("Forgotten password?")).click();    //By link text
        
       // driver.get("https://login.salesforce.com");
		
		
        
        
	
		
		
		
		
		
		
		
		}

}
