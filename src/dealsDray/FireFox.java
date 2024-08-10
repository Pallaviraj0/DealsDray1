package dealsDray;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFox {
public static void main(String[] args) throws IOException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.getcalley.com/");
	TakesScreenshot tss = (TakesScreenshot)driver;
	File temp = tss.getScreenshotAs(OutputType.FILE);
	File perm = new File("./errorShotA/" + timeStamp + "getCallery.png");
    FileUtils.copyFile(temp, perm);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.getcalley.com/calley-lifetime-offer/");
	TakesScreenshot tss1 = (TakesScreenshot)driver;
	File temp1 = tss1.getScreenshotAs(OutputType.FILE);
	File perm1 = new File("./errorShotB/" + timeStamp + "getcallylifetime.png");
	FileUtils.copyFile(temp1, perm1);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.getcalley.com/see-a-demo/");
	TakesScreenshot tss2 = (TakesScreenshot)driver;
	File temp2 = tss2.getScreenshotAs(OutputType.FILE);
	File perm2 = new File("./errorShotC/" + timeStamp + "getcalleyseeademo.png");
	FileUtils.copyFile(temp2, perm2);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.getcalley.com/calley-teams-features/");
	TakesScreenshot tss3 = (TakesScreenshot)driver;
	File temp3 = tss3.getScreenshotAs(OutputType.FILE);
	File perm3 = new File("./errorShotD/" + timeStamp + "getcalleyteamsfeatures.png");
	FileUtils.copyFile(temp3, perm3);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.getcalley.com/calley-pro-features/");
	TakesScreenshot tss4 = (TakesScreenshot)driver;
	File temp4 = tss4.getScreenshotAs(OutputType.FILE);
	File perm4 = new File("./errorShotE/" + timeStamp + "getcaiieyprofeatures.png");
	FileUtils.copyFile(temp4, perm4);
	driver.manage().window().minimize();
	driver.close();
}



}

