import java.util.Arrays;

public class _01_12_2022Odev2 {
    public static void main(String[] args) {
        // 1 Bu String'i oluşturun. "Removes white space from both ends of a string"
        // String'deki kelime sayısını yazdırınız.

        String myString1= "Removes white space from both ends of a string";
        int counter1= 0;
        for (int i = 0; i < myString1.length(); i++) {
            if(myString1.charAt(i)==' '){

                counter1++;
            }

        }
        System.out.println("counter1 = " + (counter1+1));

        // 2-  Bir String oluşturun : "Hello World"
        //Stringi tersten yazdırın ve print edin.
        //_Cevap böyle olmalı :  "dlroW olleH"_


        String myString2 = "Hello World";
        int lenght2 =myString2.length();
        for (int i2 = 10; i2 >=0; i2--) {
            System.out.print(myString2.charAt(i2));

        }
// 3İnt Array oluştur ve elemanları   : 25,30,30,35,100
//Array in elemanlarının toplamını yazdır.
//Cevap 220 olmalı.
        int[] array3 ={25,30,30,35,100};
        int total =0;
    for (int i3 = 0; i3 <array3.length; i3++) {
            total +=array3[i3];

        }
        System.out.println("total = " + total);

    //4 -int Array oluşturun.
        //elemanları : 13, 15,14,16,16
        //Arrayin elemanlarını yazdırın.

        int[] array5 = {13, 15,14,16,16};
        for (int i5 = 0; i5 < array5.length; i5++) {
            System.out.println(array5[i5]);

        }
// 5      String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
            //Array'daki eleman sayısını yazdırınız.
                //Cevap 4 olmalı.

        String[] array6 ={ "new jersey","new york","boston","california"};
        System.out.println(array6.length);
        //////////////////////////////////////////// Alternativ
        int counter5 = 0;
        for (int i = 0; i < array6.length; i++) {
            counter5++;
        }
        System.out.println(counter5);
        // 6- String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi
        //Array'leri tüm elemanları yazdırınız.

        String[] array66 = {"Apple", "Orange" , "Babana", "Kiwi"};
        Arrays.sort(array66);
        System.out.println(Arrays.toString(array66));


// 7 - int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//Array'in ortalamasını alınız.
        int toplam =0;
        int[] array7 = { 12, 14 , 21 ,23 , 10 ,4 };
        for (int i7 = 0; i7 < array7.length; i7++) {
            toplam+=array7[i7];
        }
        int avarage7 = toplam/array7.length;
        System.out.println("avarage = " + avarage7);





        // 8-
    //int Array oluşturun ve elemanları : 5,6,8,12,14,19
    //Eğer sayı çiftse topla, tekse çıkar.
    //**Örneğin:**
    // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
    //Toplamlarını yazdırın.

        int array8[]= { 5,6,8,12,14,19};
        int total8= 0;
        for (int i8 = 0; i8 <array8.length; i8++) {

            if(array8[i8]%2==0){
                total8=total8 +array8[i8];
            }
            else {
                total8 = total8 - array8[i8];
            }

        }
        System.out.println("total8 = " + total8);

        // 9--   10 elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazıdırnız.


        int[] array9 ={15 , 25, 22, 18, 30};

        Arrays.sort(array9);

        System.out.println("en buyuk 2. eleman = "+array9[(array9.length-2)]);




        //10 int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //En küçük (minimum) sayıyı yazdırınız.

        int[] array10 = {14,19,5,21};
        Arrays.sort(array10);
        System.out.println(" en kucuk sayi = " + array10[0]);


       // 11-
        int[] array11 = {14,19,5,21};
        Arrays.sort(array11);
        System.out.println(" en buyuk sayi= " + array11[(array11.length-1)]);

        //12 -
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        //Loops (döngüler) kullanın.

        String array12[] = {"Apple", "Orange","Banana"+ "Pineaple" };
        for (int i12 = 0; i12 < array12.length; i12++) {
            if(array12[i12]=="Apple"){
                System.out.println("True");
            }
        }

        //13-Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //Sayıların toplamını yazdırın.

        String MyString13 = "$12 $23 $10 $2 $5 $2";   // tum dolar isaretlerini attik .
        String MyString13b = MyString13.replaceAll("\\$","");
        System.out.println("MyString13b = " + MyString13b);


        String[] Sayilar =MyString13b.split(" "); // Stringi parcalara ayirip , dizilere yerlestirdik
        for (int i13 = 0; i13 < Sayilar.length; i13++) {
            System.out.println(Sayilar[i13]);
        }

        int[] SayilarInt = new int[Sayilar.length]; // String dizisini , Integer dizisine cevirmem icin
                                                    // Int dizi olusturdum

        for (int k13 = 0; k13 < Sayilar.length; k13++) {  // Tum String dizisini Int dizisine for ile aktardim
            SayilarInt[k13] = Integer.parseInt(Sayilar[k13]);

        }

        int toplam13 =0;   // elimde icinde sayilar olan int dizisi var . ve icindekiler itopladim
        for (int j13 = 0; j13 < 6; j13++) {
            toplam13= toplam13 + SayilarInt[j13];
        }


        System.out.println("toplam = " + toplam13);

    }
}
