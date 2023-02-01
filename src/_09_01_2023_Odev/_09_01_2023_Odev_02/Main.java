package _09_01_2023_Odev._09_01_2023_Odev_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number ");
        int num1 = input.nextInt();
        System.out.println("Give me a number ");
        int num2 = input.nextInt();

     Sum s = new Sum();
     Divide d = new Divide();
     Substrackt sb = new Substrackt();
     Multiply mp = new Multiply();

        System.out.println(s.calculating(num1,num2));
        System.out.println(d.calculating(num1,num2));
        System.out.println(sb.calculating(num1,num2));
        System.out.println(mp.calculating(num1,num2));

    }
}
