package AdamAsmca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MAin2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kelimeler = {"otomobil", "araba", "laptop", "kamyon", "sandalye", "bardak", "defter", "kalem", "fare", "telefon", "duvar", "cetvel", "agac", "teleferik", "hastane", "matara", "pisuvar", "tahta", "oturak", "ana", "bilgisayar", "tekerlek", "peynir", "domates", "biber", "erik", "greyfurt", "mandalina"};

        int kelimeSayisi = kelimeler.length;

        String aranan = " _ ";

        int rst = (int) (Math.random() * kelimeSayisi);


        String[] olusturlumus1 = new String[kelimeler[rst].length()];
        String[] olusturlumusBos = new String[kelimeler[rst].length()];


        for (int i = 0; i < kelimeler[rst].length(); i++) {
            olusturlumusBos[i] = " _ ";

        }


        for (int i = 0; i < kelimeler[rst].length(); i++) {

            olusturlumus1[i] = kelimeler[rst].substring(i, i + 1);
        }


        int sayac = 14;


        System.out.println("****************Kelime Oyunu***************");
        System.out.println();
        System.out.println("Lutfen bir harf tahmin ediniz !");

        System.out.println(Arrays.toString(olusturlumusBos));


        do {
            String secim = input.nextLine().toLowerCase();

            for (int i = 0; i < kelimeler[rst].length(); i++)

                if (olusturlumus1[i].equals(secim)) {

                    olusturlumusBos[i] = secim;
                }


            System.out.println(Arrays.toString(olusturlumusBos));

            System.out.println(" Kalan hak =" + sayac);
            System.out.println();

            boolean durum1 = false;

            for (String a : olusturlumusBos) {
                if (a.equals(aranan)) {
                    durum1 = true;
                }
            }
            if (durum1 == false)
                break;


            sayac--;
        } while (sayac > 0);


        boolean durum = false;

        for (String a : olusturlumusBos) {
            if (a.equals(aranan)) {
                durum = true;
            }
        }
        if (durum) {
            System.out.println("Maelesef Kaybettiniz");
            System.out.println("KELIME = " + kelimeler[rst]);
        } else System.out.println("Tebrikler  Kazandiniz ");


        System.out.println("Oyun Bitti ");

    }
}


