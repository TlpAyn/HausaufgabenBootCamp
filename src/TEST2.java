import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TEST2 {
    public static void main(String[] args) {

//                removing() isminde bir method oluşturun.
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//                Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//        Return tipi linkedhashset
//                Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//                **Germany ve USA 'i sil.**

//        Set'i döndür.

        String bir= "Germany";
         String iki = "USA";
        LinkedHashSet<String> lhs= new LinkedHashSet<>(Arrays.asList( "Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        removing(lhs,bir,iki);
        System.out.println("lhs = " + lhs);

    }

    private static void removing(LinkedHashSet<String> lhs, String bir, String iki) {
        if(lhs.contains(bir)){
            lhs.remove(bir);
            if (lhs.contains(iki)){
                lhs.remove(iki);
            }
        }
    }
}
