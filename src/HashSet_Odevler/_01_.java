package HashSet_Odevler;

import java.util.Arrays;
import java.util.HashSet;

public class _01_ {
    public static void main(String[] args) {
//        Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//                hashset ; 4,2,3,1,7
//        cevap: 5
        HashSet<Integer> Hs =new HashSet<>(Arrays.asList(4,5,6,7,8,9,10));
        totalCount(Hs);
    }
    private static void totalCount(HashSet<Integer> b) {
        int total =0;
        for (int i = 0; i < b.size(); i++) {
            total =total+1;
        }
        System.out.println(total);
}
}
