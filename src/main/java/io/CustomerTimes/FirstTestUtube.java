package io.CustomerTimes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestUtube {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/oleksandrartemenko/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("First test");
    }

    @Test
    public void Test1() {

        driver.get("https://kabanchik.ua");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Kabanchik.ua - онлайн-сервис заказа услуг"));
    }

    @After
    public void close() {
        System.out.println("Exit");
        driver.quit();
    }

}
