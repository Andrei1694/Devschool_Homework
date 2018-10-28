package Tema1.MinutesToYears;

public class Calculator {
    public void printYearsAbdDays(int minutes) {
        int hours, days, years;

        hours = minutes / 60;
        minutes %= 60;

        days = hours / 24;
        hours %= 24;

        years = days / 365;
        days %= 365;

        System.out.println("Ore: " + hours + " minutes: " + minutes + " days: " + days + " years: " + years);
    }
}
