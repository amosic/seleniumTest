package search;

import org.hamcrest.Matcher;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




import java.util.List;
import java.lang.String;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class SimpleSearchTest {

    @Test //annotarea Test din pachetul org.junit, biblioteca junit se va ocupa de aceasta metoda va face ca testul sa poata fi "run"(executat)
    public void simpleSearchWithOneKeyword(){

        //Firefox and Login test script
       /* System.setProperty("webdriver.gecko.driver","geckodriver");

        WebDriver driver2 = new FirefoxDriver();
        driver2.get("http://localhost:5050/user/login");

        driver2.findElement(By.name("username")).sendKeys("amosic");
        driver2.findElement(By.name("password")).sendKeys("osiceanu"+ Keys.ENTER);
        //Assert.assertTrue("User logged in successfully? ", driver2.getTitle().trim().equals("Lista Prodotti"));*/

//Register and New User in Firefox
       /* driver2.get("http://localhost:5050/user/signup");

        driver2.findElement(By.id("nome")).sendKeys("Ana Maria");
        driver2.findElement(By.id("cognome")).sendKeys("Osiceanu");
        driver2.findElement(By.id("email")).sendKeys("am.osiceanu@gmail.com");
        driver2.findElement(By.id("username")).sendKeys("amosicAO");
        driver2.findElement(By.id("password")).sendKeys("osicAO"+Keys.ENTER);
        driver2.get("http://localhost:5050/prodotti/");
        driver2.findElement(By.linkText("Logout")).click();*/

        //Chrome and Login test script


        /*driver.get("http://localhost:5050/user/login");

        System.out.println(driver.getPageSource());
        driver.findElement(By.name("username")).sendKeys("amosic");
        driver.findElement(By.name("password")).sendKeys("osiceanu"+ Keys.ENTER);*/

//Register a New User in Chrome
        WebDriver driver =  new ChromeDriver();
       driver.get("http://localhost:5050/user/signup");
        String searchKeyword = "cognome";



      // System.out.println(driver.getPageSource());
       /* driver.findElement(By.id("nome")).sendKeys("Ana");
        driver.findElement(By.id("cognome")).sendKeys("Osiceanu");
        driver.findElement(By.id("email")).sendKeys("am.osiceanu@gmail.com");
        driver.findElement(By.id("username")).sendKeys("amosicAO");
        driver.findElement(By.id("password")).sendKeys("osic"+Keys.ENTER);

      /*  driver.findElement(By.id("nome")).sendKeys("Ana Maria");
        driver.findElement(By.id("cognome")).sendKeys("Osiceanu");
        driver.findElement(By.id("email")).sendKeys("am.osiceanu@gmail.com");
        driver.findElement(By.id("username")).sendKeys("amosicAO");
        driver.findElement(By.id("password")).sendKeys("osicAO"+Keys.ENTER);*/

        /*driver.get("http://localhost:5050/prodotti/");
        driver.findElement(By.linkText("Logout")).click();*/

       /* WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        String searchKeyword = "vase";
        driver.findElement(By.id("search")).sendKeys(searchKeyword+ Keys.ENTER);

        List<WebElement> productNames = driver.findElements(By.cssSelector("h2.product-name a"));

        System.out.println("Stored " + productNames.size() + " product-name a");

for (WebElement productName : productNames){
    assertThat("Some of the product's names do not contain the searched keyword.",
            productName.getText(), containsString(searchKeyword.toUpperCase())); //cum obtin "CoreMatchers.class din containsString??
};
*/


       //eg HTML fasttrackit: <input id="search" type="search" name="q" value="vase" class="input-text required-entry" maxlength="128" placeholder="Search entire store here..." autocomplete="off">
        //        //driver.findElement(By.name("q"));

        /* List<WebElement> productNames = driver.findElements(By.cssSelector("h2.product-name > a"));

        driver.findElement(By.xpath("")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='product-info' and ./descendant::*[text()='Herald Glass Vase']]//button[@title='Add to Cart']");*/




    }


}
