package sn.ikitama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Selenium WebDriver Tests for Newsletter Sign-Up Form.
 *
 * <p>This script tests the functionality of a newsletter sign-up form,
 * including validation of email submissions and dismissal of success messages.
 *
 * @author  Larose IKITAMA
 */
public class NewsletterSignUpTest {

    public static void main(String[] args){
        // Initialize logger for logging test results
        final Logger LOGGER = Logger.getLogger(NewsletterSignUpTest.class.getName());

        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDriver Chrome\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the page
            driver.get("https://newsletter-sign-up-with-success-message-challenge-tau.vercel.app/");

            // Maximize the browser window
            driver.manage().window().fullscreen();

            // Wait for 5 seconds to observe the initial state
            Thread.sleep(5000);

            // Find the email input field and submit button
            WebElement emailInput = driver.findElement(By.id("email"));
            WebElement submitButton = driver.findElement(By.id("btnSubmit"));

            // Test invalid email submission
            emailInput.sendKeys("invalid-email");
            submitButton.click();

            // Wait for 4 seconds to observe the error message
            Thread.sleep(4000);

            // Verify the error message is displayed
            WebElement errorEmailMessage = driver.findElement(By.id("error-email"));
            String errorMessage = errorEmailMessage.getText();
            if ("Email is not in a valid format".equals(errorMessage)) {
                LOGGER.info("Invalid email test passed!");
            } else {
                LOGGER.severe("Invalid email test failed! Error message: " + errorMessage);
            }

            // Test valid email submission
            emailInput.clear();
            emailInput.sendKeys("validemail@example.com");
            submitButton.click();

            // Wait for 4 seconds to observe the success message
            Thread.sleep(4000);

            // Verify the success message is displayed
            WebElement successMessage = driver.findElement(By.id("card-success-message"));
            if (successMessage.isDisplayed()) {
                LOGGER.info("Valid email test passed!");
            } else {
                LOGGER.severe("Valid email test failed!");
            }


            // Verify the success email is correct
            WebElement successEmail = driver.findElement(By.id("user-email"));
            String displayedEmail = successEmail.getText();

            if ("validemail@example.com".equals(displayedEmail)) {
                LOGGER.info("Success email test passed!");
            } else {
                LOGGER.severe("Success email test failed! Displayed email: " + displayedEmail);
            }


            // Test dismissing the success message
            WebElement dismissButton = driver.findElement(By.id("btnDismissMessage"));
            dismissButton.click();

            // Wait for 4 seconds to observe the state after dismissing the success message
            Thread.sleep(4000);

            // Verify the sign-up form is displayed again
            WebElement signUpForm = driver.findElement(By.id("card-sign-up"));
            if (signUpForm.isDisplayed()) {
                LOGGER.info("Dismiss message test passed!");
            } else {
                LOGGER.severe("Dismiss message test failed!");
            }


            // Wait for 6 seconds before closing the browser
            Thread.sleep(6000);

        } catch (InterruptedException e) {
            // Log interrupted exception
            LOGGER.log(Level.SEVERE, "Interrupted exception occurred", e);
        }
        finally {
            // Close the browser
            driver.quit();
        }
    }
}
