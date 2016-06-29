package etesting.eshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by rgoldie on 28/06/2016.
 */
public class SmokeTest {

   public static void main(String args[]){

     // System.setProperty("webdriver.chrome.driver","C:/Users/rgoldie/Downloads/chromedriver_win32/chromedriver");
    //  WebDriver driver= new ChromeDriver();
    //  driver.get("http://shop.etesting-lab.com/");

      WebDriver driver = new FirefoxDriver();
      driver.get("http://shop.etesting-lab.com/");



   }





}
