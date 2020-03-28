/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabean;

/**
 *
 * @author User
 */
import java.text.DateFormatSymbols;
public class Date {
private int month;
private int day;
private int year;

    public Date(int theMonth, int theDay, int theYear) {
        month=checkMonth(theMonth);
        year=checkYear(theYear);
        day=checkDay(theDay);
        //System.out.printf("Date object constructor for date %s\n", toString());
    }
    private int checkYear(int testYear){
        if(testYear>0)
            return testYear;
        else
        {System.out.printf("Invalid year(%d) set to 1.\n", testYear);
        return 1;
        }
    }
    private int checkMonth(int testMonth){
        if(testMonth>0 && testMonth <=12)
            return testMonth;
        else
        {System.out.printf("Invalid month(%d) set to 1.\n", testMonth);
        return 1;
        }
    }
    public String getMonth(){
        return new DateFormatSymbols().getMonths()[month-1];
    }
private int checkDay(int testDay){
int daysPerMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
if(testDay>0 && testDay <= daysPerMonth[month])
    return testDay;
if(month==2 && testDay==29 && (year% 400 ==0 || (year%4==0 && year%100!=0)))
    return testDay;

    System.out.printf("Invalid day (%d) set to 1.\n", testDay);
    return 1;
}
public String toString(){
    return String.format("%s %s %s", day, getMonth(), year);
}
}