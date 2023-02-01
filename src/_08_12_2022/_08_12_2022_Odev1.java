package _08_12_2022;

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

        ArrayList<Integer> sayilar =new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println("sayilarin toplami = "+ getSum(sayilar));

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

        ArrayList<String> sehirIsimleri =new ArrayList<>(Arrays.asList("New jersey", "New york","Ohio","Florida","Boston"));
        System.out.println(getLength(sehirIsimleri));
        
        
        System.out.println("---------------------------------------");


        // 8 - İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //   Arraylist'te s1'i s2 olarak değiştirin
        //Return String arrayList

ArrayList<String> s1ves2 =new ArrayList<>(Arrays.asList("s1","s2"));
changelnArraylist(s1ves2);
    }

    private static void changelnArraylist(ArrayList<String> s1ves2) {
        s1ves2.set(0,"s2");
        System.out.println("s1ves2 = " + s1ves2);
    }

    public static String changelnArraylist(String s1, String s2) {

        ArrayList<String> Yerdegistirme = new ArrayList<>();
        Yerdegistirme.add(s1);
        Yerdegistirme.add(s2);
        Yerdegistirme.set(0, "s2");
        return Yerdegistirme.get(0) + " " + Yerdegistirme.get(1);


    }




    public static ArrayList<Integer> getLength(ArrayList<String> sehirIsimleri) {

        ArrayList<Integer> SehirlerinSayilari =new ArrayList<>();

        for (int i = 0; i < sehirIsimleri.size(); i++) {
            SehirlerinSayilari.add(sehirIsimleri.get(i).length());
        }
        return SehirlerinSayilari;
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

   
    public static int getSum(ArrayList<Integer> sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.size(); i++) {
            toplam = toplam + sayilar.get(i);
        }
        return toplam;
    }


}

