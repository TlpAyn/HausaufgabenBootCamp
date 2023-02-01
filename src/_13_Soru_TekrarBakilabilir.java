public class _13_Soru_TekrarBakilabilir {
    public static void main(String[] args) {

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
        // Int dizi olusturduk

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
