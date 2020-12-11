# Widgets tests
Here you will find 9 tests to automate where you learn how to interact with different widgets. All of them can be found at http://seleniumui.moderntester.pl under `Widgets` menu


## 1. Accordion
1. Open each section and print out the text inside

## 2. Autocomplete
1. Type 'a' in the search input
2. Print out all available options
3. Select random option 
4. Check if text in search input is the same as text of the selected option 


## 3. Datepicker
Select the dates below. After each selection check if the correct date is shown in 'Date' input:

1. 30.10.2018
2. 25.09.2018
3. 25.09.2018 (yes, again the same date)
4. 01.01.2018
5. 01.02.2018
6. Today

Comment: these dates combine all different ways of 'walking' on the date picker, so please try to do all of them in one test

## 4. Menu
1. Click on Music -> Jazz -> Modern

## 5. Modal dialog
1. Click 'Create new user'
2. Fill form
3. Click on 'Create an account' 
4. Check if a new row with correct 'Name', 'Email' and 'Password' has been added
5. Create a Data provider that will provide parameters for test*


## 6. Progressbar*
1. Wait until the text in progress bar will be "Complete!"

## 7. Selectable
1. Select random speed
2. Select option from "Select a file" by the text of the option
3. Select option from "Select a number" by the index of the option
4. Select random option from "Select a title"

## 8. Slider
Move the slider to such values and after each shift of the slider check if the correct value is displayed:

1. 50
2. 80
3. 80
4. 20
5. 0

## 9. Tooltip
1. Print out the message from the tooltip