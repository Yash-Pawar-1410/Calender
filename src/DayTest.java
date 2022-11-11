import java.util.Objects;
import java.util.Scanner;

public class Day {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //**************************************************************************************************************
        //    Birth date
        //**************************************************************************************************************
        System.out.println("Enter the birthday date");
        int bdyDate = scanner.nextInt();


        //**************************************************************************************************************
        //    Month code
        //**************************************************************************************************************
        System.out.println("Enter the month in number...just like 1,2");
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
        System.out.println("Enter birth year...just like 1999");
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
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Sunday");
        } else if (dayofbdy == 1) {
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Monday");
        } else if (dayofbdy == 2) {
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Tuesday");
        } else if (dayofbdy == 3) {
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Wednesday");
        } else if (dayofbdy == 4) {
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Thursday");
        } else if (dayofbdy == 5) {
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Friday");
        } else if (dayofbdy == 6) {
            System.out.println("Day of the date " + bdyDate + "-" + month + "-" + year + digit1 + digit + " is " + "Saturday");
        }
    }
}
