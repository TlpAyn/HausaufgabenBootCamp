import java.util.Arrays;
import java.util.HashSet;

public class HashSet_Sorusu {
    public static void main(String[] args) {

//        changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//**ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
        HashSet<String> hs= new HashSet<>(Arrays.asList("banana","strawberry","kiwi","pineapple"));
        String str1="banana";
        String str2="peach";
        changeSet(hs,str1,str2);
        for (int i = 0; i <hs.size() ; i++) {
        }
        System.out.println("hs = " + hs);
    }

    private static HashSet changeSet(HashSet<String> hs, String str1, String str2) {
        if(hs.contains(str1)){
            hs.remove(str1);
            hs.add(str2);
        }
        return hs;
    }
}
