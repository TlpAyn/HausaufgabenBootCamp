import java.util.ArrayList;
import java.util.Arrays;

public class _08_12_2022_Odev1_5SoruYeni {
    public static void main(String[] args) {
//        (Soru acik degil, biraz da acilmali )  ismi getCount() olan bir method oluşturun.
//        Parametre olarak bir String ArayList  ve  bir tane String
//        Return tipi int olmalı.
//        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//        Örneğin;
//        ArrayList = Orange , Kiwi , Peach , Banana , Orange
//        String Orange:
//        Count = 2 olmalı. (Orange 2 kez yazılmış)


        ArrayList<String> Meyveler = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));

        System.out.println("Meyve Adedi =" + getCount(Meyveler, "Orange"));
    }

    public static Integer getCount(ArrayList<String> Meyveler, String meyve) {
        int counter = 0;
        for (int i = 0; i < Meyveler.size(); i++) {
            if (Meyveler.get(i) == meyve) {
                counter = counter + 1;
            }
        }

        return counter;
    }
}
