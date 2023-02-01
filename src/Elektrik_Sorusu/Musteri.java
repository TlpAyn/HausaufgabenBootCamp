package Elektrik_Sorusu;

import java.util.Scanner;

public class Musteri {
    String name;
    Elektrik_Hesabi elektrikHesabi;

    public void TuketimEkle() {
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Lutfen 1. Ay tuketim miktarini giriniz ");
        int t1 = input.nextInt();
        System.out.println("Lutfen 2. Ay tuketim miktarini giriniz ");
        int t2 = input.nextInt();
        System.out.println("Lutfen 3. Ay tuketim miktarini giriniz ");
        int t3 = input.nextInt();

        int toplam = t1 + t2 + t3;
        System.out.println("Toplam Tuketim = " + toplam);
    }


}
