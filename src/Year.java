import java.util.Scanner;

public class Year {
    void m2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter birth year...just like 1999");
        int year = sc.nextInt();
        int Ly = 0;
        int digit = year % 10;
        year = year / 10;

        int digit1 = year % 10;
        year = year / 10;

        Ly = Integer.parseInt((digit1 + "" + digit));
//        int LPY=Ly/4;
        System.out.println(Ly);
    }

    public static void main(String[] args) {
        Year year = new Year();
        year.m2();


    }
}
