import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        MonthCode monthCode1=new MonthCode();
        Year year1=new Year();
        TotalLeapYear totalLeapYear1=new TotalLeapYear();
        YearCode yearCode1=new YearCode();





        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the birthday date");
        int bdyDate=scanner.nextInt();

        System.out.println("Enter the birthday year last two digit");
        int bdyYr=scanner.nextInt();

        System.out.println("Enter the month code");
        int monthCode=scanner.nextInt();

        System.out.println("Enter the year code");
        int yrCode=scanner.nextInt();

        System.out.println("Enter the total leaf year coming in the bdy year");
        int leafyr=scanner.nextInt();

        int day=(bdyDate+bdyYr+monthCode+yrCode+leafyr)%7;
//        System.out.println(day);
        if (day==0){
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Sunday");
        } else if (day==1) {
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Monday");
        } else if (day==2) {
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Tuesday");
        } else if (day==3) {
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Wednesday");
        } else if (day==4) {
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Thursday");
        } else if (day==5) {
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Friday");
        } else if (day==6) {
            System.out.println("Day of the date "+bdyDate+"-"+bdyYr+" is "+"Saturday");
        }

    }
}
