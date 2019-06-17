package DriverUtils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.*;

public class WebdriverSetup {
    public WebDriver driver;

    public  WebDriverWait wait;

//    public WebElement logo = driver.findElementByCssSelector("#header_logo > a > img");

    public String generatedMail = (mail(12)+"@gmail.com");




    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/oleksandrartemenko/Downloads/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("http://automationpractice.com");
    }


    public static String mail(int l) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String randomString = "";String k;

        Random rand = new Random();
        char[] text = new char[l];

        for (int i=0; i< l; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for (int i =0; i<text.length; i++) {
            randomString += text[i];
        }
        return randomString;
    }


 
//    @After
//    public void close() {
//        driver.quit();
//    }





}

