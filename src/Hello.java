import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("year");
        int year= sc.nextInt();
        System.out.println("Date");
        int bdyDate= sc.nextInt();
        System.out.println("month");
        int month= sc.nextInt();
        System.out.println("last  digit of yr");
        int Ly= sc.nextInt();
        System.out.println("leap");
        int LPY= sc.nextInt();
        System.out.println( "yr code");
        int yearCode= sc.nextInt();
        if (year%4==0){
            if(bdyDate<=28){
                int  dayofbdy = ((bdyDate + month + Ly + LPY + yearCode) % 7)-1;
                System.out.println(dayofbdy);
            }
        }
        else {

            int dayofbdy1 = ((bdyDate + month + Ly + LPY + yearCode) % 7);
            System.out.println(dayofbdy1);
        }
        }
//               // int  dayofbdy1 = ((bdyDate + month + Ly + LPY + yearCode) % 7)-1;


        }
    //}
//}

