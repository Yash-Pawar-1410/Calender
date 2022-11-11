import java.util.Scanner;

public class Test1 {
    void m2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();
        int Ly=0;
        int digit= year%10;
        year=year/10;

        int digit1= year%10;
        year=year/10;

        Ly= Integer.parseInt((digit1+""+digit));

        System.out.println(Ly);
    }

    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.m2();


    }
}
