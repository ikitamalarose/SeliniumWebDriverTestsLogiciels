# Selenium WebDriver Tests

This repository contains automated tests using Selenium WebDriver for two distinct projects:

1. Newsletter sign-up form with success message.
2. Time tracking dashboard.

## Table of Contents

- [**Configuration**](#configuration)
- [**Running Tests**](#running-tests)
- [**Project Structure**](#project-structure)
- [**Test Details**](#test-details)
    - [Newsletter Sign-Up Form](#newsletter-sign-up-form)
    - [Time Tracking Dashboard](#time-tracking-dashboard)
- [**Useful Links**](#useful-links)
- [**Checking Google Chrome Version**](#checking-google-chrome-version)
  - [Quick Tip](#quick-tip)
- [**Author**](#Author)

## Configuration

1. Clone the repository:
   ```bash
    git clone <repository-url>
    cd  <repository-name>
   ```

2. Install dependencies:

    - Download and install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)
    - Download and install  Maven if not already installed.


3. Configure WebDriver:

    - Download [ChromeDriver](https://sites.google.com/chromium.org/driver/downloads) that matches your Chrome version.
    - Extract the archive and place`chromedriver.exe` in a directory of your choice.
    - Update the path to `chromedriver.exe`in the test scripts (`NewsletterSignUpTest.java` and `TimeTrackingDashboardTest.java`).

## Running Tests

1. Navigate to the project directory:

    ```bash
    cd <repository-name>
    ```

2. Execute the tests
   
## Project Structure

```css

<nom-du-repository>/
│
├── src/
│   └── main/
│       └── java/
│           └── sn/
│               └── ikitama/
│                   ├── NewsletterSignUpTest.java
│                   └── TimeTrackingDashboardTest.java
│
├── pom.xml
└── README.md

```

## Test Details

### Newsletter Sign-Up Form

Tests for the newsletter sign-up form verify the following:

- **Submission of invalid email :** Verifies the appropriate error message is displayed.
- **Submission of valid email :** Verifies the success message is displayed and the correct email is shown in the success message.
- **Dismissal of success message :** Verifies the sign-up form is displayed again after dismissing the success message.

### Site Repository URL

- [Newsletter Sign-Up Form](https://github.com/ikitamalarose/newsletter-sign-up-with-success-message-challenge.git)

### Time Tracking Dashboard

Tests for the time tracking dashboard verify the following:

- **Daily view :** Verifies the data displayed for the daily view is correct.
- **Weekly view :** Verifies the data displayed for the weekly view is correct.
- **Monthly view :**  Verifies the data displayed for the monthly view is correct.

### Site Repository URL

- [Time Tracking Dashboard](https://github.com/ikitamalarose/time-tracking-dashboard-challenge.git)

## Useful Links

- [SeleniumWebDriver](https://www.selenium.dev/downloads/)
- [Java Development kit (JDK)](https://www.oracle.com/java/technologies/downloads/)
- [chromeDriver](https://sites.google.com/chromium.org/driver/downloads) 

## Checking Google Chrome Version

To ensure compatibility between `ChromeDriver` and `Google Chrome`, follow these steps to check your Chrome version:

1. Open Google Chrome.
2. Click the three vertical dots in the top right to open the menu.
3. Select Help > About Google Chrome.
4. The Chrome version will be displayed. Ensure you download the corresponding version of ChromeDriver.

    ### Quick Tip:
    You can also type `chrome://version` into the Chrome address bar to directly view version information.

## Author
- GitHub - [@ikitamalarose](https://github.com/ikitamalarose)
- Twitter - [@ikitamalarose](https://www.twitter.com/ikitamalarose)
- Email - [laroseikitama@gmail.com](mailto:laroseikitama@gmail.com)