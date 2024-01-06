package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MySkillAutomationTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.get("https://myskill.id/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement eLearningButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/e-learning']")));
        eLearningButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://myskill.id/");

        WebElement bootcampButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/bootcamp']")));
        bootcampButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://myskill.id/");

        WebElement mentoringButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/mentoring/review']")));
        mentoringButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://myskill.id/");


        WebElement corporateButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/corporate-service']")));
        corporateButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://myskill.id/");

        WebElement masukButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".MuiButton-root.MuiButton-outlined")));
        masukButton.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://myskill.id/");

        driver.quit();
    }
}
