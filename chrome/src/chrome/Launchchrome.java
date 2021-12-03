package chrome;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
  System.setProperty("WebDriver.chrome.driver","../chrome/chromedriver.exe");
  driver =new ChromeDriver();
  driver.get("https://backbone.chetu.com/");
  
	}

}
