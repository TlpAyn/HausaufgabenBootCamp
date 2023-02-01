package BordroOdevi;

import java.util.ArrayList;
import java.util.Scanner;

public class _15_12_2022BordroOdevi {
    public static void main(String[] args) {
        // Bir bordro programı yapılmak isteniyor.
        // Her calisanin bordroNo(int), tamAdi(String) ve maasi(int) vardır.
        // Kullanıcıdan 20 calisan için bu bilgileri alınız.
        // Bir metodda bütün calisanlar yazdırınız.
        // Bir metodda maas ortalamasını yazdırınız.
        // Bir metodda en fazla ve en az maas alanların simlerini yazdırınız.

        Scanner input =new Scanner(System.in);
        Scanner inputStr =new Scanner(System.in);
        ArrayList<calisan> cslr =new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            calisan emekciler = new calisan();
            System.out.print("Calisan Adi = ");
            emekciler.TamAdi=inputStr.nextLine();
            System.out.print("BordroNo = ");
            emekciler.bordroNo=input.nextInt();
            System.out.print("maas = ");
            emekciler.maas = input.nextInt();

            cslr.add(emekciler);
        }

        calisanlariYazdir(cslr);
        OrtalamaMasslar(cslr);
        enCokMaasAlan(cslr);
        enAzMaasAlan(cslr);



    }

    private static void enAzMaasAlan(ArrayList<calisan> cslr) {
        int enkMaas=110;
        for (int i = 0; i < cslr.size(); i++) {
            if(cslr.get(i).maas< enkMaas){
                enkMaas= cslr.get(i).maas;
            }
        }
        System.out.println("enkMaas = " + enkMaas);
    }

    private static void enCokMaasAlan(ArrayList<calisan> cslr) {
        int enbMaas=0;
        for (int i = 0; i < cslr.size(); i++) {
            if(cslr.get(i).maas> enbMaas){
                enbMaas= cslr.get(i).maas;
            }
        }
        System.out.println("enbMaas = " + enbMaas);
    }
    private static void OrtalamaMasslar(ArrayList<calisan> cslr) {
       int avarage;
        int toplam =0;
        for (int i = 0; i < cslr.size(); i++) {

            toplam =toplam +cslr.get(i).maas;
        }
        avarage= toplam/ cslr.size();
        System.out.println("avarage = " + avarage);
    }
    private static void calisanlariYazdir(ArrayList<calisan> cslr) {
        for (calisan c :cslr) {
            System.out.println("c.maas = " + c.TamAdi);
            System.out.println("c.maas = " + c.maas);
            System.out.println("c.maas = " + c.bordroNo);
        }
    }
}
