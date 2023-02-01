package _09_01_2023_Grup1._09_01_2023_Homework.soru_2;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[2];

        System.out.print("İlk sayıyı giriniz : ");
        numbers[0] = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        numbers[1] = input.nextInt();

        Sum sum = new Sum();
        System.out.println("Sum = " + sum.calculating(numbers));

        Divide divide = new Divide();
        System.out.println("Divide = " + divide.calculating(numbers));

        Multiply multiply = new Multiply();
        System.out.println("Multiply = " + multiply.calculating(numbers));

        Substract substract = new Substract();
        System.out.println("Substract = " + substract.calculating(numbers));
    }
}
