import java.util.Objects;
import java.util.Scanner;

public class MonthCode {

    /* public static final int january = 0;
     public static final int february = 3;
     public static final int march = 3;
     public static final int april = 6;
     public static final int may = 1;
     public static final int june = 4;
     public static final int july = 6;
     public static final int august = 2;
     public static final int september = 5;
     public static final int october = 0;
     public static final int november = 3;
     public static final int december = 5;*/
    void m5() {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter first three letter of the month...just like jan,feb,mar");
        String month = sca.next();
        if (Objects.equals(month, "jan")) {
            int mothCode = 0;
            System.out.println(mothCode);
        } else if (Objects.equals(month, "feb")) {
            int monthcode1 = 3;
            System.out.println(monthcode1);
        } else if (Objects.equals(month, "mar")) {
            int monthcode2 = 3;
            System.out.println(monthcode2);
        } else if (Objects.equals(month, "apr")) {
            int monthcode3 = 6;
            System.out.println(monthcode3);
        } else if (Objects.equals(month, "may")) {
            int monthcode4 = 1;
            System.out.println(monthcode4);
        } else if (Objects.equals(month, "jun")) {
            int monthcode5 = 4;
            System.out.println(monthcode5);
        } else if (Objects.equals(month, "jul")) {
            int monthcode6 = 6;
            System.out.println(monthcode6);
        } else if (Objects.equals(month, "aug")) {
            int monthcode7 = 2;
            System.out.println(monthcode7);
        } else if (Objects.equals(month, "sep")) {
            int monthcode8 = 5;
            System.out.println(monthcode8);
        } else if (Objects.equals(month, "oct")) {
            int monthcode9 = 0;
            System.out.println(monthcode9);
        } else if (Objects.equals(month, "nov")) {
            int monthcode10 = 3;
            System.out.println(monthcode10);
        } else if (Objects.equals(month, "dec")) {
            int monthcode11 = 5;
            System.out.println(monthcode11);
        }
//        else {
//            System.out.println("Plz enter first three letter of the month...just like jan,feb,mar");
//        }

    }


    public static void main(String[] args) {
        MonthCode monthCode = new MonthCode();
        monthCode.m5();
    }

}
