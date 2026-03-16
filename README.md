# Selenium Automation – Product Purchase Flow

## Task Title

Automate Product Purchase Flow

---

# Objective

The objective of this task is to automate a basic product purchase flow on the SauceDemo website using **Selenium WebDriver with Java**.

The automation script performs login, adds products to the cart, proceeds to checkout, completes the purchase, and verifies that the order confirmation message is displayed.

---

# Website

https://www.saucedemo.com/

---

# Login Credentials

Username:

```
standard_user
```

Password:

```
secret_sauce
```

---

# Technologies Used

* Java
* Selenium WebDriver
* Maven
* JUnit
* IntelliJ IDEA
* ChromeDriver

---

# Framework Design

This project follows a **Page Object Model (POM)** structure to maintain clean and scalable test automation code.

Project structure:

```
selenium-saucedemo
│
├── pom.xml
│
└── src
    └── test
        └── java
            ├── base
            │   └── BaseTest.java
            │
            ├── pages
            │   ├── LoginPage.java
            │   ├── ProductsPage.java
            │   ├── CartPage.java
            │   └── CheckoutPage.java
            │
            └── tests
                └── PurchaseTest.java
```

---

# Test Scenario

The automation script performs the following steps:

## 1. Login

* Open the SauceDemo website
* Enter username and password
* Click Login
* Verify that the Products page is displayed

---

## 2. Add Products to Cart

* Add two products to the cart
* Verify that the cart count is updated

---

## 3. Open Cart

* Click the cart icon
* Verify that selected products appear in the cart

---

## 4. Checkout

* Click the Checkout button
* Enter the following details:

  * First Name
  * Last Name
  * Postal Code
* Click Continue

---

## 5. Complete Order

* Click Finish
* Verify the order confirmation message:

```
Thank you for your order!
```
## 🎥 Automation Execution Demo

This video demonstrates the automated purchase flow using Selenium WebDriver.

▶ Watch the demo:

https://github.com/Pranjalmishr1/selenium-saucedemo/raw/main/automation-demo.mp4.mp4
---

# Requirements Implemented

This automation project fulfills all assignment requirements:

✔ Selenium WebDriver used for browser automation
✔ Assertion used to validate order confirmation
✔ Explicit Wait implemented using WebDriverWait
✔ Page Object Model (POM) design structure

---

# How to Run the Test

Follow the steps below to run the automation test:

### 1. Clone the repository

```
git clone https://github.com/Pranjalmishr1/selenium-saucedemo.git
```

---

### 2. Open the project

Open the project in **IntelliJ IDEA**.

---

### 3. Install Maven dependencies

Maven will automatically download dependencies from the `pom.xml` file.

---

### 4. Run the test

Navigate to:

```
src/test/java/tests/PurchaseTest.java
```

Right-click on **PurchaseTest.java** and select:

```
Run PurchaseTest
```

---

# Expected Result

The automation will:

* Launch Chrome browser
* Login to SauceDemo
* Add products to the cart
* Complete the checkout process
* Verify the order confirmation message
* Close the browser

---

# Repository

GitHub Repository:

https://github.com/Pranjalmishr1/selenium-saucedemo

---

# Author

Pranjal Mishra
