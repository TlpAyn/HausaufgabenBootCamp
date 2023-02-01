package Odevler.Odev2;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayiyi isteyiniz");
        int a=scan.nextInt();
        System.out.print("Ikinci sayiyi isteyiniz");
        int b=scan.nextInt();
        Sum sum=new Sum();
        System.out.println("toplam= "+sum.calculating(a, b));
       Divide d=new Divide();
        System.out.println("Bolme= " +d.calculating(a, b));
        Multiply m=new Multiply();
        System.out.println("Carpim= "+m.calculating(a,b));
        Substract s=new Substract();
        System.out.println("Fark= "+s.calculating(a,b));


    }
}
