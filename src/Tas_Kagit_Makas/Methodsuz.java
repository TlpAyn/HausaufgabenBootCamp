package Tas_Kagit_Makas;

import java.util.Scanner;

public class Methodsuz {
    public static void main(String[] args) {
        System.out.println(" **************Tas Kagit Makas Oyunu***************");
        System.out.println("1-Tas,2 Kagit, 3 Makas,");
        System.out.println("Lutfen Sayi giriniz ");

        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        int computerChoise = (int)(Math.random()*3);

        if (secim == 1){
            if (computerChoise==1){
                System.out.println("Ortada");
            } else if (computerChoise==2) {
                System.out.println("kazandiniz");
            } else if (computerChoise==3) {
                System.out.println("kaybettiniz");
            }

        } else if (secim ==2) {
            if (computerChoise==1){
                System.out.println("Kazandiniz");
            } else if (computerChoise==2) {
                System.out.println("Ortada");
            } else if (computerChoise==3) {
                System.out.println("kaybettiniz");
            }
        } else if (secim == 3) {
            if (computerChoise==1){
                System.out.println("Kaybettiniz");
            } else if (computerChoise==2) {
                System.out.println("kazandiniz");
            } else if (computerChoise==3) {
                System.out.println("ortada");
            }
        }

    }
}
