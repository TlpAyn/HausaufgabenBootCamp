import java.util.Arrays;
import java.util.Scanner;

public class _01_12_2022IsmetHocaOdev {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.

        int[] array = new int[10];
        Scanner input =new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*11);

        }
        System.out.println("Enter a number = ");
        int userNummer = input.nextInt();
        Arrays.sort(array);

        System.out.println("Arrays.binarySearch(array,userNummer) = " + Arrays.binarySearch(array, userNummer));



        }


    }



