package BluePrintOfCalender;

import java.util.Scanner;

public class DayTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //**************************************************************************************************************
        //    Birth date
        //**************************************************************************************************************
        System.out.println("Note:");
        System.out.println("You have to enter only one digit of your birth date, if in your birth date contain one digit... ");
        System.out.println("You have to enter only one digit of your birth month, if in your birth month contain one digit... ");
        System.out.println("You have to enter all digits of your birth year... ");
        System.out.println("If your birthday on 01 Jan 1999 or 14 Oct 1999... ");
        System.out.println("Then simply enter 1-1-1999 or 14-10-1999... ");
        System.out.println();
        //*************************************************************************************************************
        System.out.println("Enter your birth date...");
        int bdyDate = scanner.nextInt();
        //**************************************************************************************************************
        //    Month code
        //**************************************************************************************************************
        System.out.println("Enter your birth month in number...");
        int month = scanner.nextInt();
        if (month == 1) {
            month = 0;
        } else if (month == 2) {
            month = 3;
        } else if (month == 3) {
            month = 3;
        } else if (month == 4) {
            month = 6;
        } else if (month == 5) {
            month = 1;
        } else if (month == 6) {
            month = 4;
        } else if (month == 7) {
            month = 6;
        } else if (month == 8) {
            month = 2;
        } else if (month == 9) {
            month = 5;
        } else if (month == 10) {
            month = 0;
        } else if (month == 11) {
            month = 3;
        } else if (month == 12) {
            month = 5;
        }
        //**************************************************************************************************************
        //    year
        //**************************************************************************************************************
        System.out.println("Enter your birth year...");
        int year = scanner.nextInt();
        int Ly = 0;
        int digit = year % 10;
        year = year / 10;

        int digit1 = year % 10;
        year = year / 10;
        Ly = Integer.parseInt((digit1 + "" + digit));
        //**************************************************************************************************************
        //    year code
        //**************************************************************************************************************
        int yearCode = 0;
        if (year % 4 == 0) {
            yearCode = 6;
        }
        //----------------------------------------------------------------------
        int yearCode1 = 0;
        if ((year - 1) % 4 == 0) {
            yearCode1 = 4;
        }
        //----------------------------------------------------------------------
        int yearCode2 = 0;
        if ((year + 3) % 4 == 1) {
            yearCode2 = 2;
        }
        //---------------------------------------------------------------------
        int yearCode3 = 0;
        if (((year + 3) - 1) % 4 == 1) {
            yearCode3 = 0;
        }
        //**************************************************************************************************************
        //   leap yr code
        //**************************************************************************************************************
        int LPY = Ly / 4;
        //**************************************************************************************************************
        int dayofbdy = (bdyDate + month + Ly + LPY + yearCode) % 7;

        if (dayofbdy == 0) {
            System.out.println("You were born on Sunday");
        } else if (dayofbdy == 1) {
            System.out.println("You were born on Monday");
        } else if (dayofbdy == 2) {
            System.out.println("You were born on Tuesday");
        } else if (dayofbdy == 3) {
            System.out.println("You were born on Wednesday");
        } else if (dayofbdy == 4) {
            System.out.println("You were born on Thursday");
        } else if (dayofbdy == 5) {
            System.out.println("You were born on Friday");
        } else if (dayofbdy == 6) {
            System.out.println("You were born on Saturday");
        }
    }
}
