package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class Login {

    @Test
    public void login() {

        System.setProperty("webdriver.chrome.driver", "F:\\Automation\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.daraz.com.bd/";
        driver.get(url);
        WebElement e1 = driver.findElement(xpath("//*[@id=\"anonLogin\"]/a"));
        e1.click();

        //TC-01
        WebElement e3 = driver.findElement(xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button"));
        e3.click();
        String Expectresultemail = "You can't leave this empty.";
        String Actualresultemail = driver.findElement(xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/span")).getText();
        Assert.assertEquals(Actualresultemail, Expectresultemail);

    }

}
