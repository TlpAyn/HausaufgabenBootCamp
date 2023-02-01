package Proje2_TasKagitMakasOyunu;

import java.util.Scanner;

public class A01_TasKagitMakasOyunu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int kulPuan=0;
        int bilPuan=0;
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!\n" +
                "1-Taş 2-Kağıt 3-Makas \n" +
                "Bitirmek icin 0 basin");
        while (true){
            System.out.print("seciminiz: ");
            int secim=scan.nextInt();
            int bilSecim=(int) (Math.random()*3)+1;
            if (secim==1){
                if (bilSecim==1){
                    System.out.println("Berabere");
                } else if (bilSecim==2) {
                    System.out.println("Bilgisayar secimi :"+bilSecim+" dir . Kaynettiniz");
                    bilPuan++;
                } else {
                    System.out.println("Bilgisayar secimi :"+bilSecim+" dir . Kazandiniz");
                    kulPuan++;
                    
                }

            }
            else if(secim==2){
                if (bilSecim==2){
                    System.out.println("Berabere");
                } else if (bilSecim==1) {
                    System.out.println("Bilgisayar secimi :"+bilSecim+" dir . Kazandiniz");
                    kulPuan++;
                } else {
                    System.out.println("Bilgisayar secimi :"+bilSecim+" dir . Kaybettiniz");
                   bilPuan++;

                }

            }
            else if (secim==3){
                if (bilSecim==3){
                    System.out.println("Berabere");
                } else if (bilSecim==1) {
                    System.out.println("Bilgisayar secimi :"+bilSecim+" dir . Kaybettiniz");
                    bilPuan++;
                } else {
                    System.out.println("Bilgisayar secimi :"+bilSecim+" dir . Kazandiniz");
                    kulPuan++;

                }

            }else {
                System.out.println("Hatali giris yaptiniz tekrar deneyin");
                continue;
            }
            if (kulPuan==3){
                System.out.println("Oyunu "+kulPuan+"-"+bilPuan+"ile kazandiniz");break;
            }
            else if(bilPuan==3){
                System.out.println("Oyunu "+bilPuan+"-"+kulPuan+"ile kaybettiniz");
           break; }
        }
    }
}
