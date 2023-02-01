package HashSet_Odevler;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_ {
    public static void main(String[] args) {
//        5- 2D ArrayList
//
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//
//        Store all the elements in one arraylist and print the arraylist
//
//        Tüm elemanları bir arrayListe yükleyin ve buu arrayList'i yazdırın.
//
//                **Örnek:**
//
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]
//```

        ArrayList<Integer> arr = new ArrayList<>();
int [][] abc = { {1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < abc.length; i++) {
            for (int j = 0; j < abc[i].length; j++) {

                arr.add(abc[i][j]);

            }
        }
        System.out.println("arr = " + arr);
    }
}
