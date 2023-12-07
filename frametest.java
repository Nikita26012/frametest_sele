package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frametest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
	dr.get("https://demo.automationtesting.in/Frames.html");
	
	dr.switchTo().frame(0);
	String g=dr.findElement(By.xpath("/html/body/section/div/h5")).getText();
	System.out.print("text is "+g);
	
	
	}

}
