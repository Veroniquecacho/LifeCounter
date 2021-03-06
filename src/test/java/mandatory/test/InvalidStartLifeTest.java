// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class InvalidStartLifeTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void invalidStartLife() {
    // Test name: invalidStartLife
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:9000/");
    // 2 | setWindowSize | 1440x877 | 
    driver.manage().window().setSize(new Dimension(1440, 877));
    // 3 | click | id=players | 
    driver.findElement(By.id("players")).click();
    // 4 | select | id=players | label=3
    {
      WebElement dropdown = driver.findElement(By.id("players"));
      dropdown.findElement(By.xpath("//option[. = '3']")).click();
    }
    // 5 | click | id=lifePoint | 
    driver.findElement(By.id("lifePoint")).click();
    // 6 | type | id=lifePoint | 200
    driver.findElement(By.id("lifePoint")).sendKeys("200");
    // 7 | click | id=startButton | 
    driver.findElement(By.id("startButton")).click();
    // 8 | assertAlert | The maximum amount of start life is 100. Please choose a smaller number. |
    assertThat(driver.switchTo().alert().getText(), is("The maximum amount of start life is 100.\n Please choose a smaller number."));
    // 9 | click | css=.content | 
    driver.findElement(By.cssSelector(".content")).click();
    // 10 | mouseDownAt | id=lifePoint | 19,24
    {
      WebElement element = driver.findElement(By.id("lifePoint"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 11 | mouseMoveAt | id=lifePoint | 19,24
    {
      WebElement element = driver.findElement(By.id("lifePoint"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 12 | mouseUpAt | id=lifePoint | 19,24
    {
      WebElement element = driver.findElement(By.id("lifePoint"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 13 | click | id=lifePoint | 
    driver.findElement(By.id("lifePoint")).click();
    // 14 | type | id=lifePoint | 100
    driver.findElement(By.id("lifePoint")).sendKeys("100");
    // 15 | click | id=startButton | 
    driver.findElement(By.id("startButton")).click();
  }
}
