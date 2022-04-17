package testing;

import java.util.Arrays;

public class Holiday {
    private String name;
    private int day;
    private String month;

    //a
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    //b

    public static boolean inSameMonth(Holiday A, Holiday B){
        if(A.month.equals(B.month)) return true;
        else return false;
    }

    //c
    public double avgDate(int[] day){
        return Arrays.stream(day).average().getAsDouble();

    }

    //d
    Holiday independenceDay = new Holiday("Independence Day", 4, "July");

    public static void main(String[] args) {
        Holiday A1 = new Holiday("US Labor day", 4, "August");
        Holiday B1 = new Holiday("Canada Labor Day", 4, "May");
        System.out.println("The Us labor Day in the same month with Canada Labor Day: " + inSameMonth(A1, B1));

    }
}