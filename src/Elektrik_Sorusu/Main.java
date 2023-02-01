package Elektrik_Sorusu;

import java.util.Scanner;

public class Main {

        /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */
        public static void main(String[] args) {

        Musteri m = new Musteri();
        m.name= "Hasan Altun";
        m.elektrikHesabi = new Elektrik_Hesabi();
        m.elektrikHesabi.tuketimEkle(40);
        m.elektrikHesabi.tuketimEkle(50);
        m.elektrikHesabi.tuketimEkle(93);
        m.TuketimEkle();





    }
}
