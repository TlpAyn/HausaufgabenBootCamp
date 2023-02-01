public class Stringler2 {
    public static void main(String[] args) {
        // 1- **I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazd

        String s1 = "I love java";
        int uzunluk = s1.length();
        System.out.println("uzunluk = " + uzunluk);

        // 2- **Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.

        String s2 = "Sprint planning";
        int uzunluk2 = s2.length();
        System.out.println("uzunluk2 = " + uzunluk2);

        // 3- **apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.

        String s3 ="Apple";
        String s30;
        boolean appVarMi = s3.equals("app");
        System.out.println("appVarMi = " + appVarMi);

        // 4- **orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String s4 ="orange";
        System.out.println("s4.equals(\"apple\") = " + s4.equals("apple"));

        // 5-  **apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir._

        String s5 = "apple";
        System.out.println("s5.equalsIgnoreCase(\"apple\") = " + s5.equalsIgnoreCase("apple"));

        // 6 - *Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        String s6 = "Florida";
        int oindex = s6.indexOf("o");
        System.out.println( oindex);

        // 7-  **Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        String s7 = "Thank you";
        int  yindex = s7.indexOf("y");
        System.out.println(yindex);

        // 8 - **Main method** oluşturun.
        //**Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

        String s8 = "Mouse";
        char ucuncuharf = s8.charAt(3);
        System.out.println("ucuncuharf = " + ucuncuharf);

        // 9-  **paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE

        String s9 ="paper";
        System.out.println(s9.toUpperCase());

        // 10 - *OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple

        String s10 = " OraNge";
        System.out.println(s9.toLowerCase());

        //11 - **New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın

        String s11 = "New Jersey";
        System.out.println("s11.toLowerCase() = " + s11.toUpperCase());

        // 12 **New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.

        String s12 = "New Jersey";
        System.out.println("s11.toLowerCase() = " + s12.toUpperCase());

        // 13 - **PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.

        String s13 = "PADDLE";
        System.out.println("s13.toLowerCase() = " + s13.toLowerCase());













    }
}
