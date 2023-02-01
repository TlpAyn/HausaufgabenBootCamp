package DüsenTopSorusu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("********************Düsen Top Sorusu**********************");

        System.out.println("Lutfen topu birakmak istediginiz yuksekligi giriniz ");
        double yukseklik = input.nextInt();
        int sicramaSayisi=0;


        while(yukseklik>1){
            yukseklik =  (yukseklik / 4) * 3;
            sicramaSayisi++;
        }
        System.out.printf("Sicrama Sayisi= "+ sicramaSayisi);
    }
}
