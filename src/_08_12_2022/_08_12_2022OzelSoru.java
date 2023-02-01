package _08_12_2022;

import java.util.Arrays;
import java.util.Scanner;
public class _08_12_2022OzelSoru {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen x kordinati giriniz = ");
        int Numx =input.nextInt();
        System.out.println("Lutfen y kordinati giriniz = ");
        int Numy =input.nextInt();

        // Dikdortgenin Kordintlari
        int[] X_Kordinati={-2,1,0,1,2,3,4,5,6,7,8};
        int[] Y_Kordinati={-1,0,1,2,3,4};

        int resX=Arrays.binarySearch(X_Kordinati,Numx);    // Degerler icindeyse pozitif verecek / Disindaysa negatif
        int resY=Arrays.binarySearch(Y_Kordinati,Numy);

        boolean testX= resX>0 ? true : false;
        boolean testY= resY>0 ? true : false;

        if(testX==true && testY==true){
            System.out.println(" Kordinat Dikdortgenin ICINDE!");
        }
        else
            System.out.println( " Kordinat Dikdortgenin DISINDA! ");
    }
}
