import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _4_SoruAhmetHocaSON {
    public static void main(String[] args) {
        // Ornek 4 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..
        //int[] numbers = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        int[] numbers = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4, 8, 45, 8, 8, 45, 8, 45, 7};
        TekrarEdenSayilar(numbers);
    }
    private static void TekrarEdenSayilar(int[] numbers) {
        HashSet<Integer> TumSayilar = new HashSet<>();
        HashMap<Integer, Integer> TumsayilarMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            TumSayilar.add(numbers[i]);
        }
        for (Integer a : TumSayilar) {
            // System.out.println("a = " + a);
            int sayac = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == a) {
                    sayac++;
                    
                    TumsayilarMap.put(a, sayac);
                }
            }
        }
        for (Map.Entry<Integer, Integer> kv : TumsayilarMap.entrySet()) {
            System.out.println("Sayi " + kv.getKey() + " - " + kv.getValue() + " adettir.");
        }

    }

}