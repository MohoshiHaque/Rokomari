package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class Login {

    @Test
    public void login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\Automation\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.daraz.com.bd/";
        driver.get(url);

        //TC-01
        String expectTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectTitle);
        Thread.sleep(3000);

        //TC-02
        WebElement e1 = driver.findElement(xpath("//*[@id=\"anonLogin\"]/a"));
        e1.click();
        WebElement e2 = driver.findElement(xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button"));
        e2.click();
        String Expectresultemail = "You can't leave this empty.";
        String Actualresultemail = driver.findElement(xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/span")).getText();
        Assert.assertEquals(Actualresultemail, Expectresultemail);
        Thread.sleep(3000);

        //TC-03
        WebElement e3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input"));
        e3.sendKeys("bugresistance@gmail.com");
        WebElement e4 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input"));
        e4.sendKeys("123456abc");
        e2.click();
        Thread.sleep(3000);


    }

}
