import java.util.Scanner;

public class _29_11_2022_Yildizli {
    public static void main(String[] args) {



     //  1-    0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._

        for(int i = 0 ; i<100;i=i+2) {

            System.out.println(" 0 ile 100 arasindaki tum cift sayilar = " + i);

            i+=i;


        }
        //2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.

        for( int i2 =1; i2<100;i2=i2+2){
            System.out.println(" 0 ile 100 arasindaki tek sayilar = "+ i2);


        }




       //  3- # 100'den 0'a kadar bütün tek sayıları yazdırınız. 99-98-97-96.... `100 ve 0 dahil değildir.`

        for(int i3= 99; i3>0 ;i3=i3-2){

            System.out.println(" 100 den 0 a kadar ki tek sayilar = "+ i3);

        }



        //4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın. `İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10`
        for(int i4 = 0;i4<10;i4++){
            System.out.println(" ilk 10 dogal sayi = "+ i4);

        }



      // 5- **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız. Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
        // Eğer sayı çift sayıysa;
        // **This number is even and number is 0**
        // Eğer sayı tek sayıysa;
        // **This number is odd and number is 1**
        // yazdırmalıdır.
        // `Sonuç böyle olmalıdır.`
        // ``This number is even and number is 0
        // This number is odd and number is 1
        // This number is even and number is 2
        // This number is odd and number is 3

        for(int i5= 0; i5<100;i5++){
            if(i5 %2 == 0){
                System.out.println("This number is even and number is ="+ i5);
            }
            else{
                System.out.println("This number is odd and number is = "+i5);
            }
        }


      // 6- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız. `Sonuç bu şekilde olmalıdır.
        for(int i6=0; i6<100;i6++){
            if(i6 %20 == 0){
                System.out.println(" sayi hem 4 hem de 5 e bolunebiliyor = " + i6);
            }
        }



     // 7-
        // Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
        //_length(uzunluk): 7_
        //_width(genişlik): 5_
        //_Output:_

        Scanner Input7= new Scanner(System.in);
        System.out.println(" Uzunluk Giriniz = " );
        int uzunluk = Input7.nextInt();

        System.out.println(" Genislik Giriniz = " );
        int genislik  = Input7.nextInt();
        String isaret ="";

        for(int x=0 ; x<genislik; x++){  // burada yatay eksendeki # miktarini bulduk
            isaret =isaret+"#";
        }
        for (int y = 0;y<uzunluk; y++){
            System.out.println(isaret);
        }











        // 8- # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
        //Sonuç böyle olmalıdır.

        Scanner Input8= new Scanner(System.in);
        System.out.println(" Satir sayisi= " );
        int satirsayisi = Input8.nextInt();

        String X="";
        for(int i8 = 0;i8<satirsayisi;i8++){

            System.out.println("x"+X);
            X=X+"x";

        }


     // 9-# _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._Sonuç böyle olmalıdır;
/*
       *
      * *
     * * *
    * * * *
   * * * * *
*/
        // Bu soru simetrik piramit seklinde olmadi.Bir daha bakilacak !

        Scanner Input9= new Scanner(System.in);
        System.out.println(" ( Lutfen Tek sayi giriniz )= " );
        int teksayi9 = Input9.nextInt();

        String X9 ="x ";


        if (teksayi9 %2 == 1){     // Sayi Tek ise islem gerceklesecek

            for(int i9 = 0; i9<teksayi9; i9++){

                System.out.println(X);

                X=X9+"x x ";
            }
        }

        //  10 - # do while loop kullanınız.  > 0 ile 30 arasındaki bütün çift sayıları yazdırınız.


        int sayi10= 2;
        do{
            System.out.println(sayi10);
            sayi10=sayi10+2;
        }
        while (sayi10<30  );
        }
}







