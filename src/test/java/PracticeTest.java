import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PracticeTest {
@Test
public void createProduct()
{
	WebDriver driver=null;
	
	String browser = System.getProperty("Browser");
	String url = System.getProperty("url");
	driver.get(url);
	
	System.out.println("product created");
}
}
