/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Siraj Siddiqui
 */
public class DemoAutTest {
        
    public DemoAutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

@Test
 public void demoaut() throws Exception{
       System.setProperty("webdriver.chrome.driver", "c:\\data1\\chromedriver.exe");
       //System.setProperty("webdriver.gecko.driver", "c:\\data1\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver=new FirefoxDriver();
        //driver.get("http://newtours.demoaut.com");
        driver.get("http://demo.guru99.com/test/newtours/");
        try{
            assertEquals("Welcome: Mercury Tours", driver.getTitle()); 
            System.out.println("Webpage Launched");
        }catch(Throwable t){
         System.out.println("Webpage Not Launched");
        }
        
        //driver.findElement(By.linkText("Flights")).click();
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("submit")).click();
       // driver.findElement(By.id("closeBtn")).click();
         Thread.sleep(1000);  
       try{
            assertEquals("Login: Mercury Tours", driver.getTitle());
            System.out.println("Login Successful");
            Thread.sleep(1000);
        }catch(Throwable e){
           System.out.println("Login Not Successful");
        }
        driver.findElement(By.linkText("Flights")).click();

        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
             
        Select passenger=new Select(driver.findElement(By.name("passCount")));
        passenger.selectByVisibleText("3");
        Select from=new Select(driver.findElement(By.name("fromPort")));
        from.selectByVisibleText("New York");
        Select monthfrom=new Select(driver.findElement(By.name("fromMonth")));
        monthfrom.selectByVisibleText("May");
        Select fromday=new Select(driver.findElement(By.name("fromDay")));
        fromday.selectByVisibleText("8");
        Select to=new Select(driver.findElement(By.name("toPort")));
        to.selectByVisibleText("Sydney");
        Select tomonth=new Select(driver.findElement(By.name("toMonth")));
        tomonth.selectByVisibleText("June");
        Select today=new Select(driver.findElement(By.name("toDay")));
        today.selectByVisibleText("15");
        //driver.findElement(By.name("servClass")).click();
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
        Thread.sleep(1000);
        Select selectairlines=new Select(driver.findElement(By.name("airline")));
        selectairlines.selectByVisibleText("Blue Skies Airlines");
        driver.findElement(By.name("findFlights")).click();
       try{
            assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
            System.out.println("Select flight page");
       }catch(Throwable t){
           System.out.println("Select Flight page Not Launched");
        }
/*        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("reserveFlights")).click();
        try{
            assertEquals("Book a Flight: Mercury Tours", driver.getTitle());
            System.out.println("Book Flights Page");
        }catch(Throwable t){
            System.out.println("Book Flights page not Launched");
        }
        driver.findElement(By.name("passFirst0")).sendKeys("abc");
        driver.findElement(By.name("passLast0")).sendKeys("def");
        Select meal=new Select(driver.findElement(By.name("pass.0.meal")));
        meal.selectByVisibleText("Muslim");
        Select card=new Select(driver.findElement(By.name("creditCard")));
        card.selectByVisibleText("MasterCard");
        driver.findElement(By.name("creditnumber")).sendKeys("3456790393774");
        Select expmn=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
        expmn.selectByVisibleText("07");
        Select expyr=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
        expyr.selectByVisibleText("2010");
        driver.findElement(By.name("billAddress1")).clear();
        driver.findElement(By.name("billAddress1")).sendKeys("1505 Milwaukee Ave");
        Thread.sleep(1000);
        driver.findElement(By.name("billCity")).clear();
        driver.findElement(By.name("billCity")).sendKeys("Libertyville");
        driver.findElement(By.name("billState")).clear();
        driver.findElement(By.name("billState")).sendKeys("IL");
        Select country=new Select(driver.findElement(By.name("billCountry")));
        country.selectByVisibleText("UNITED STATES");
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("buyFlights")).click();
        assertEquals("Flight Confirmation: Mercury Tours", driver.getTitle());
        System.out.println("Flight Confirmation Page");*/
/*        driver.findElement(By.linkText("SIGN-OFF")).click();
        try{
            assertEquals("Sign-on: Mercury Tours", driver.getTitle());
            System.out.println("Sign On Page");
        }catch(Throwable t){
            System.out.println("Sign on page not Launched");
        }
         if(true && assertEquals("Sign-on: Mercury Tours", driver.getTitle())) {
             System.out.println("Sign On Page");
         } else {
             
             System.out.println("Sign on page not Launched");
         }*/
        driver.findElement(By.linkText("Hotels")).click();
        driver.findElement(By.linkText("Car Rentals")).click(); 
        
        
        //Thread.sleep(2000);
        driver.close();
}
}