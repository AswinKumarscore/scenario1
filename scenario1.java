package scenario1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class scenario1 {


WebDriver driver;
String url = "https://www.flipkart.com/";
@Before
public void setUp() {

               System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
                driver = new ChromeDriver();

//Open the AUT
           driver.get(url);
}

@Test
public void test() throws InterruptedException {
//Fetch the page title
String pageTitle = driver.getTitle();
System.out.println("Page title: " + pageTitle);
Thread.sleep(5000);


driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("vu tv");
Thread.sleep(3000);
//clicking button
driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
Thread.sleep(3000);


driver.findElement(By.xpath("//div[contains(text(),'Vu Premium 108 cm (43 inch) Ultra HD (4K) LED Smart Android TV')]")).click();
Thread.sleep(3000);
String price=driver.findElement(By.xpath("//div[contains(text(),'₹26,999')]")).getText();
System.out.println("price of vu tv is "+price);
Thread.sleep(2000);

Thread.sleep(8000);
 
driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();

driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();

String totalprice=driver.findElement(By.xpath("//span[contains(text(),'₹53,998')]")).getText();
System.out.println("total price of two vu tv is "+totalprice);








}


}

