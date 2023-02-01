package HashSet_Odevler;

import java.util.HashSet;

public class _06_OzelSoru {
    public static void main(String[] args) {
//        Özel Soru:
//        6- Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
//        random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
//        sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> hs =new HashSet<>();
        randomDoldur(hs);
    }

    private static void randomDoldur(HashSet<Integer> hs) {

        while( hs.size()<10){
            hs.add((int) (Math.random() * 20));
        }
        System.out.println("hs = " + hs);
//        for (int i = 0; i < 10; i++) {
//            hs.add((int) (Math.random() * 20));
        }

    }

