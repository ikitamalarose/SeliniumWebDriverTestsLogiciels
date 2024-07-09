package sn.ikitama;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Selenium WebDriver Tests for the Time Tracking Dashboard.
 *
 * <p>This script tests various views (Daily, Weekly, Monthly) of the time tracking dashboard.
 *
 * @author Larose IKITAMA
 */
public class TimeTrackingDashboardTest {

    public static void main(String[] args) {
        // Initialize logger for logging test results
        final Logger LOGGER = Logger.getLogger(TimeTrackingDashboardTest.class.getName());

        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver Chrome\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the page
            driver.get("https://time-tracking-dashboard-challenge-sooty.vercel.app/");

            // Maximize the browser window
            driver.manage().window().fullscreen();


            // Wait for 5 seconds to observe the initial state
            Thread.sleep(5000);

            // Test "Daily" option
            WebElement dailyOption = driver.findElement(By.id("daily"));
            dailyOption.click();
            // Add assertions to verify the data displayed for "Daily" view


            // Wait for 4 seconds to observe the Daily view
            Thread.sleep(4000);

            // Test "Weekly" option
            WebElement weeklyOption = driver.findElement(By.id("weekly"));
            weeklyOption.click();
            // Add assertions to verify the data displayed for "Weekly" view


            // Wait for 4 seconds to observe the Weekly view
            Thread.sleep(4000);

            // Test "Monthly" option
            WebElement monthlyOption = driver.findElement(By.id("monthly"));
            monthlyOption.click();
            // Add assertions to verify the data displayed for "Monthly" view


            // Wait for 4 seconds to observe the Monthly view
            Thread.sleep(4000);

            // Example assertion: Check if the first card displays the correct data for the selected view
            WebElement firstCard = driver.findElement(By.cssSelector(".card__container"));
            WebElement totalHours = firstCard.findElement(By.cssSelector(".total-hours"));
            String displayedHours = totalHours.getText();
            if ("103hrs".equals(displayedHours)) {
                System.out.println("Test Passed for Weekly View!");
            } else {
                System.out.println("Test Failed for Weekly View! Displayed hours: " + displayedHours);
            }


            // Wait for 6 seconds before closing the browser
            Thread.sleep(6000);
        }
        catch (InterruptedException e) {
            // Log interrupted exception
            LOGGER.log(Level.SEVERE, "Interrupted exception occurred", e);
        }
        finally {
            // Close the browser
            driver.quit();
        }

    }
}
