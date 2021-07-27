package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
         //public static Logger log= Logger.getLogger(base.class);
         
		// TODO Auto-generated method stub
		public static WebDriver driver; 
		public WebDriver launchbrowser(String url) {
			//log.info("Launching browser");
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
			return driver;
		}
		
		public void sendtext(WebElement element, String string) {
			element.sendKeys(string);
		}
		
		public void btnclick (WebElement element) {
			element.click();
		}
		
		public void enterkey () throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}

		public void quitbrowser() {
			driver.quit();
		}
		
	}


