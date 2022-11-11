import java.util.Scanner;

public class YearCode {
    int m1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth year...just like 1999");
        int year = sc.nextInt();
        int digit = year % 10;
        year = year / 10;
        int a = year;

        int digit1 = year % 10;
        year = year / 10;
        int a1 = year;
//        System.out.println(year);

        int yearCode = 0;
        if (year % 4 == 0) {
            yearCode = 6;
            System.out.println(yearCode);
        }
//        else {
//            System.out.println("year code can not be 6");
//        }
        //-------------------------------------------------------------------------
        int yearCode1 = 0;
        if ((year - 1) % 4 == 0) {
            yearCode1 = 4;
            System.out.println(yearCode1);
        }
//        else {
//            System.out.println("yearcode can not be 4");
//        }


        //----------------------------------------------------------------------
        int yearCode2 = 0;
        if ((year + 3) % 4 == 1) {
            yearCode2 = 2;
            System.out.println(yearCode2);
        }
//        else {
//            System.out.println("yearcode can not be 2");
//        }

        //------------------------------------------------------------
        int yearCode3 = 0;
        if (((year + 3) - 1) % 4 == 1) {
            yearCode3 = 0;
            System.out.println(yearCode3);
        }
//        else {
//            System.out.println("yearcode can not be 4");
//        }
        return year;

    }

    public static void main(String[] args) {
        YearCode yearCode = new YearCode();
        yearCode.m1();


    }
}
