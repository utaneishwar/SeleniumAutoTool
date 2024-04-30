import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TusharSuggestProgram {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("selenium");
		   WebElement image = driver.findElement(By.xpath("(//*[@class='wM6W7d WggQGd'])[3]"));
		Thread.sleep(5000);
           image.click();
	}

}
