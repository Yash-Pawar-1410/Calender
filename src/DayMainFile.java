import java.util.Scanner;

public class DayMainFile {
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
        int originalM = month;
        switch (month) {
            case 1:
                month = 1;
                break;
            case 2:
                month = 4;
                break;
            case 3:
                month = 4;
                break;
            case 4:
                month = 0;
                break;
            case 5:
                month = 2;
                break;
            case 6:
                month = 5;
                break;
            case 7:
                month = 0;
                break;
            case 8:
                month = 3;
                break;
            case 9:
                month = 6;
                break;
            case 10:
                month = 1;
                break;
            case 11:
                month = 4;
                break;
            case 12:
                month = 6;
                break;
        }
        //**************************************************************************************************************
        //   Last two digit of the year
        //**************************************************************************************************************
        System.out.println("Enter your birth year...");
        int year = scanner.nextInt();
        int yr = year;
        int lastDigitOfYr = 0;
        int digit = year % 10;
        year = year / 10;

        int digit1 = year % 10;
        year = year / 10;
        lastDigitOfYr = Integer.parseInt((digit1 + "" + digit));
        //**************************************************************************************************************
        //    Year code
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
        //   Total leap year
        //**************************************************************************************************************
        int totalLeapYr = lastDigitOfYr / 4;
        //**************************************************************************************************************

        if (yr % 400 == 0 || (yr % 100 != 0 && yr % 4 == 0)) {
            if (originalM == 1) {
                month = 0;
            } else if (originalM == 2) {
                month = 3;
            }
            int dayofbdy = ((bdyDate + lastDigitOfYr + month + yearCode + totalLeapYr) % 7);
        }
            //**********************************************************************************************************
            //     Main logic to get day
            //**********************************************************************************************************
        int dayofbdy = ((bdyDate + lastDigitOfYr + month + yearCode + totalLeapYr) % 7);
            //**********************************************************************************************************
            //     Days code
            //**********************************************************************************************************
            switch (dayofbdy) {
                case 2:
                    System.out.println("You were born on Monday");
                    break;
                case 1:
                    System.out.println("You were born on Sunday");
                    break;
                case 3:
                    System.out.println("You were born on Tuesday");
                    break;
                case 4:
                    System.out.println("You were born on Wednesday");
                    break;
                case 5:
                    System.out.println("You were born on Thursday");
                    break;
                case 6:
                    System.out.println("You were born on Friday");
                    break;
                case 0:
                    System.out.println("You were born on Saturday");
                    break;
            }

    }
}










