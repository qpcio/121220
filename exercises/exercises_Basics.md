# Basic web elements
Here you will find 8 tests to automate where you can learn the basics of Selenium. All of them can be found at http://seleniumui.moderntester.pl under the `Basic` menu

## 1. Alerts

### 1.1 Simple Alert Pop up
**Test steps:**
1. Click on 'Simple Alert' button
2. Click 'OK' button on alert
3. Check that "OK button pressed" text has been shown

### 1.2 Prompt Alert box
**Test steps:**
1. Click on 'Prompt Pop up' button
2. Type "Lord Vader" in the alert text box
3. Click 'OK' button on alert
4. Check that "Hello Lord Vader! How are you today?" text has been shown


### 1.3 Confirm Alert box
**Test steps:**
1. Click on 'Confirm Pop up' button
2. Click 'OK' button on alert
3. Check that "You pressed OK!" has been shown
4. Click again on 'Confirm Pop up' button
5. Click 'Anuluj'/'Cancel' button on alert
6. Check that "You pressed Cancel!" text has been shown

### 1.4 Delayed alert*
**Test steps:**
1. Click on 'Delayed alert' button
2. Wait for an alert to appear
3. Click 'OK' button on alert
4. Check that "OK button pressed" text has been shown

**optional task*


## 2. Form
**Test steps:**
1. Fill First name
2. Fill Last name
3. Fill Email
4. Choose a random 'Sex' radiobutton
5. Fill age
6. Choose a random 'Year of experience' radiobutton
7. Choose 'Automation Tester' profession
8. Select random option from 'Continents'
9. Select "Switch Commands" and "Wait Commands" from 'Selenium Commands'
10. Upload some File
11. Click 'Sign in' button
12. Check that "Form send with success" text has been shown


## 3. Iframes
**Test steps:**
1. Switch to the first iframe and fill form
2. Switch to the second iframe and fill form
3. Switch to the main frame and click on 'Basic' button in the main menu

## 4. Tables
**Test steps:**
1. Get all rows from table to List<WebElement>
2. Print out 'Rank', 'Peak' and 'Mountain range' of mountains that are in "Switzerland" and are higher than 4000 m 

## 5. Windows/Tabs
**Test steps:**
1. Click on 'New Browser Window' button
2. Switch to a new window
3. Execute test from 4th exercise on the newly opened window
4. Close window
5. Click 'New Message Window' button
6. Switch to a new window
7. Print out the text that is written in a new window
8. Close window
9. Click on 'New Browser Tab' button
10. Switch to a new tab
11. Execute test from 4th exercise on the new opened window
12. Close tab