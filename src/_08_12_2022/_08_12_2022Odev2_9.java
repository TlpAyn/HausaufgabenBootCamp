package _08_12_2022;

public class _08_12_2022Odev2_9 {
    public static void main(String[] args) {

//        **isUnique** adında bir method oluşturun.
//        Parametre olarak int array alır.
//        ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
//        örneğin, list isminde bir array'imiz varsa,
//        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir
//        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.

        int[] list = {3, 90, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        System.out.println("Bu dizi benzersiz mi ? " + IsUnique(list));
    }
    public static boolean IsUnique (int[] list) {
        int sayac = 0;
        boolean deger = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    sayac = sayac + 1;
                }
            }
            deger = sayac == 0 ? true : false;
        }
        return deger;
    }
}
