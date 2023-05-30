package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\JUARA CODING SQA 9\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        driver.get("https://shop.demoqa.com");
        System.out.println("Enter URL Home Shop Demoqa");
        System.out.println(driver.getTitle());
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.xpath("/html/body/p/a")).click();

        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("revan_zn");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Shopqa1122");
        System.out.println("Input username and password");

        WebElement submitButton = driver.findElement(By.name("login"));
        submitButton.click();
        System.out.println("Button login clicked");

        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a")).click();
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")).click();
        js.executeScript("window.scrollBy(0,700)");

        WebElement selectMenu = driver.findElement(By.id("pa_color"));
        Select select = new Select(selectMenu);
        select.selectByVisibleText("Pink");

        WebElement selectSize = driver.findElement(By.id("pa_size"));
        Select select1 = new Select(selectSize);
        select1.selectByVisibleText("36");
        System.out.println("Select Product");


        driver.findElement(By.xpath("//*[@id=\"product-1497\"]/div[1]/div[2]/form/div/div[2]/button")).click();
        System.out.println("Button add to cart clicked");


        delay(3);
        driver.quit();
        System.out.println("Close Browser");

    }

    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000); // delay 3 detik
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}