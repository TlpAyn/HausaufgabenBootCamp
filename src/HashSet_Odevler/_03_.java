package HashSet_Odevler;

import java.util.Arrays;
import java.util.HashSet;

public class _03_ {
    public static void main(String[] args) {
//        commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.

        HashSet<String> hs =new HashSet<>(Arrays.asList("Germany","England" , "South Africa" ,"Brazil","USA"));
        HashSet<String> hs1 =new HashSet<>(Arrays.asList("Germany", "China" ,"Brazil", "France" ,"USA"));

        commonValues(hs,hs1);

    }
    private static void commonValues(HashSet<String>hs,HashSet<String>hs1) {
        hs.retainAll(hs1);
        System.out.println(hs);



    }
}
