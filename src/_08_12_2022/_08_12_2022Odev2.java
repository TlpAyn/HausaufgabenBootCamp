package _08_12_2022;

public class _08_12_2022Odev2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Soru 1------------------------------------");


        // 1-Ismi **randomNum** olan bir method oluşturun.
        // Parametre olarak **int max** almalı.
        // Bu method, 0 ile max arasında random bir değer döndürmelidir.
        // Random numarayı döndürünüz.


        int a = 30;
        int b = 24;
        int maxRandom = randomNum(a, b);
        System.out.println("maxRandom = " + maxRandom);
        System.out.println();
        System.out.println("Soru 2------------------------------------");


        //2-"OrtaKelime" isminden bir method oluşturun.
        // Bu method String'i parametre olarak almalı.
        // Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        // Ortadaki kelimeyi return yapınız.
        // Örnek: Ben Java'yı seviyorum.
        // print : Java'yı

        String cumle = "Havalar guzel fakat gittikce daha da soguyacak";

      OrtaKelime(cumle);

        System.out.println();
        System.out.println("Soru 3------------------------------------");


        //3  reverseString isminde bir method oluşturun.
        // Bu method bir String'i parametre olarak alsın.
        // Ve bu method, girilen String'i tersten yazsın.
        // Terste yazılmış halini yazdırınız.
        // Örn: String = "Java'yı Seviyorum."
        // Print: .muroyiveS ıy'avaJ

        String cumle3 = "Hersey guzel olacak";
        reverseString(cumle3);


        System.out.println();
        System.out.println("Soru 4------------------------------------");

        //4 adı  reverseWord olan bir method oluşturun
        // Bu methodun String olarak bir parametresi olmalıdır
        // Ve bu cümledeki kelimelerle tersine çevirmeli
        // Ters halini yazdırın.
        // Örnek 1 :
        // Dize: Java yazın
        // dönüş şöyle olmalıdır:  yazın Java

        String cumle4 =" Hersey guzel olacak olmasa da olacak";
        reverseWord(cumle4);




        System.out.println();
        System.out.println("Soru 5------------------------------------");


        // 5 EvenOddNums isminde bir method oluşturun.
        // Bu yöntem String olan bir parametreyi kabul etsin.
        // Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        // Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        // toplam sonucu yazdırın.
String sayi5 = "1234512390";
int sayilarinToplami ;



    }
    // 5 EvenOddNums isminde bir method oluşturun.
    // Bu yöntem String olan bir parametreyi kabul etsin.
    // Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
    // Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
    // toplam sonucu yazdırın.
    public static void EvenOddNums(String sayi){
        int sayix=Integer.parseInt(sayi);
        for (int i = 0; i < sayi.length(); i++) {


        }



    }


    public static void reverseWord(String cumle) {
        String[] CumleDizi=cumle.split(" " );
        for (int i = CumleDizi.length-1; 0 < CumleDizi.length-1 ; i--) {
            System.out.print(CumleDizi[i]+"\t");
        }

    }

    public static void reverseString(String Ornek) {
        String tersten = "";
        int uzunluk = Ornek.length();
        for (int i = uzunluk; i > 0; i--) {
            tersten = tersten + Ornek.charAt(i - 1);
        }
        System.out.println("tersten = " + tersten);

    }


    public static void OrtaKelime(String cumle) {
        String[] kelimeler = cumle.split(" ");
        int kelimelerUzunluk = kelimeler.length;
        int ortadakiDizi = (kelimelerUzunluk / 2);
        System.out.println("ortadakiDizi = " + kelimeler[ortadakiDizi]);



    }

    public static int randomNum(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        } else max = a;
        int random = (int) (Math.random() * max);
        return random;
    }


}
