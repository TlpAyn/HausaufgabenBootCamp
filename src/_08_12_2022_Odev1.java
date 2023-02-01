import java.util.ArrayList;
import java.util.Arrays;

public class _08_12_2022_Odev1 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");


        //1 - Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        //Bütün 2'leri 6'yla değiştirin.
        //Array'i yazdırınız.
        int[][] array = {
                {2, 3, 2},
                {2, 3, 2},
                {7, 2, 5}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 6;
                    System.out.print(array[i][j]);
                } else
                    System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");

        //2- Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        //2D array'de olan elemanları toplayınız.
        //toplamı yazdırınız.
        //Sonuç 32 olmalıdır.

        int[][] array2 = {
                {5, 2, 1},
                {10, 2, 3, 6},
                {1, 2}
        };
        int total2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                total2 = total2 + array2[i][j];
            }

        }
        System.out.println("total2 = " + total2);
        System.out.println("---------------------------------------");

        //3-Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        //[{"new jersey","atlanta","ohio"} ,
        //{"Pittsburgh" ,"ohio","new york","ohio"} ,
        //{"ohio","new york"}]
        //Bütün ohio'ları Florida'yla değiştiriniz.
        //Array'i yazdırınız.

        String[][] array3 = {
                {"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york",}
        };

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (array3[i][j].equals("ohio")) {
                    array3[i][j] = "Florida";    //array3[i][j].replaceAll("ohio", "Florida");
                }
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

        //4-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bU arrayList'i yazdırın.

        ArrayList<Integer> TekliArray = new ArrayList<>();
        int[][] array4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {

                TekliArray.add(array4[i][j]);

            }
        }
        System.out.println("TekliArray = " + TekliArray);
        System.out.println("---------------------------------------");


        /*
    //5- (Soru acik degil, biraz da acilmali )  ismi getCount() olan bir method oluşturun.
Parametre olarak bir String ArayList  ve  bir tane String
Return tipi int olmalı.
ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
Örneğin;
ArrayList = Orange , Kiwi , Peach , Banana , Orange
String Orange:
Count = 2 olmalı. (Orange 2 kez yazılmış) */

        int adet = 0;
        int meyvelerinSayisi = getCount(adet);
        System.out.println(meyvelerinSayisi);
        System.out.println("---------------------------------------");


        // 6-getSum() isminde bir method oluşturun.Parametresi ArrayList olmalı
        //Return tipi int olmalı.ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.Örneğin;
        //Arraylist = 1,2,3,4,5
        //return 15 olmalı
        int toplamx = 0;
        int toplam6 = getSum(toplamx);
        System.out.println("Sayilarin toplami " + toplam6);
        System.out.println("---------------------------------------");

//7-
//getLength() isminde bir method oluşturun.
//Parametre olarak String ArrayList
//Return tipi Integer ArrayList
//ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//Tüm elementlerin uzunluğunu döndürün
//Örneğin;
//ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//Tüm Stringlerin uzunluklarını yazdırın;
//cevap: 10 ,  8 , 4 , 7 , 6 olmalı
        int uzunluklar = 99;
        System.out.println(getLength(uzunluklar));
        System.out.println("---------------------------------------");


        // 8 - İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //   Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList

        String s1 = "s1";
        String s2 = "s2";
        System.out.println("changelnArraylist(s1,s2) = " + changelnArraylist(s1, s2));
    }

    public static String changelnArraylist(String s1, String s2) {

        ArrayList<String> Yerdegistirme = new ArrayList<>();
        Yerdegistirme.add(s1);
        Yerdegistirme.add(s2);
        Yerdegistirme.set(0, "s2");
        return Yerdegistirme.get(0) + " " + Yerdegistirme.get(1);


    }


    //getLength() isminde bir method oluşturun.
//Parametre olarak String ArrayList
//Return tipi Integer ArrayList
//ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//Tüm elementlerin uzunluğunu döndürün
//Örneğin;
//ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//Tüm Stringlerin uzunluklarını yazdırın;
//cevap: 10 ,  8 , 4 , 7 , 6 olmalı


    public static int getLength(int y) {
        int donecek = 0;
        ArrayList<String> KelimeUzunlugu = new ArrayList<>();
        KelimeUzunlugu.add("New jersey");
        KelimeUzunlugu.add("New york");
        KelimeUzunlugu.add("Ohio");
        KelimeUzunlugu.add("Florida");
        KelimeUzunlugu.add("Boston");

        String[] kelimeuzunluk = new String[KelimeUzunlugu.size()]; // burada Arraylisti ,Array re cevirdik .
        KelimeUzunlugu.toArray(kelimeuzunluk);   // Tek tek uzunluk bulmak icin

        kelimeuzunluk = KelimeUzunlugu.toArray(kelimeuzunluk);

        for (int i = 0; i < kelimeuzunluk.length; i++) {
            System.out.print(kelimeuzunluk[i].length() + " ");

        }
        return donecek;
    }

    public static int getCount(int k) {
        ArrayList<String> TekrarliMeyveler = new ArrayList<>();
        TekrarliMeyveler.add("Orange");
        TekrarliMeyveler.add("Kiwi");
        TekrarliMeyveler.add("Peach");
        TekrarliMeyveler.add("Banana");
        TekrarliMeyveler.add("Orange");
        int donecek = 0;
        int orange = 0;
        int Kiwi = 0;
        int Peach = 0;
        int Banana = 0;

        for (int i = 0; i < TekrarliMeyveler.size(); i++) {
            if (TekrarliMeyveler.get(i) == TekrarliMeyveler.get(0)) {
                orange++;
            } else if (TekrarliMeyveler.get(i) == TekrarliMeyveler.get(1)) {
                Kiwi++;
            } else if (TekrarliMeyveler.get(i) == TekrarliMeyveler.get(2)) {
                Peach++;
            } else if (TekrarliMeyveler.get(i) == TekrarliMeyveler.get(3)) {
                Banana++;
            }
        }

        System.out.println(Banana + "adet Banana");
        System.out.println(Kiwi + "adet Kiwi");
        System.out.println(Peach + "adet Peach");
        System.out.println(orange + "adet Orange");

        return donecek;
    }

    // 6-getSum() isminde bir method oluşturun.Parametresi ArrayList olmalı
    //Return tipi int olmalı.ArrayList teki tüm sayıları birbiri ile toplayın.
    //return olarak toplam sonucu döndürün.Örneğin;
    //Arraylist = 1,2,3,4,5
    //return 15 olmalı
    public static int getSum(int s1) {
        int toplam = 0;
        ArrayList<Integer> Sayilar6 = new ArrayList<>();
        Sayilar6.add(1);
        Sayilar6.add(2);
        Sayilar6.add(3);
        Sayilar6.add(4);
        Sayilar6.add(5);
        System.out.println("Sayilar6 = " + Sayilar6);
        for (int i = 0; i < Sayilar6.size(); i++) {
            toplam = toplam + Sayilar6.get(i);

        }
        return toplam;
    }


}

