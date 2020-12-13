package Day4;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker extends TestBase{

    @BeforeMethod
    public void openDatepicker(){
        driver.get("https://seleniumui.moderntester.pl/datepicker.php");
    }

    @Test
    public void calendarTest(){
        selectDate("10", "October", 2019);
        Assert.assertEquals(getSelectedDate(), "10/10/2020");

    }

    private void selectDate(String expectedDay, String expectedMonth, int expectedYear){
        //przesunąc kalendarz na zadany rok i miesiąc i z listy dni tego miesiąca wybrać zadaną datę
    }

    private String getSelectedDate(){
        return driver.findElement(By.id("datepicker")).getAttribute("value");  //getText tu nie zadziała
    }

    public String getMonth(){
        return driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
    }

    public int getYear(){
        return Integer.parseInt(driver.findElement(By.cssSelector(".ui-datepicker-year")).getText());
    }

    public void goNext(String expectedMonth, int expectedYear){
        while (!expectedMonth.equals(getMonth()) || expectedYear != getYear()) {
            driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
            veryBadSleep();
        }
    }

    public void goPrev(String expectedMonth, int expectedYear){
        while (!expectedMonth.equals(getMonth()) || expectedYear != getYear()) {
            driver.findElement(By.cssSelector(".ui-datepicker-prev")).click();
            veryBadSleep();
        }
    }

}


//Jak wyciągnąć listę dni aktualnego miesiąca
//date-month = i tutaj aktualny index miesiąca:
//aktualny index - albo index 13 dnia każdego miesiąca albo porównanie do tablicy/słownika miesięcy
//ewentualnie wyciągamy wszystkie dni aktualnego miesiąca selektorem //tr/td[not(contains(@class, 'ui-datepicker-other-month '))]