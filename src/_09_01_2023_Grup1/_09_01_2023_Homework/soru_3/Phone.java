package _09_01_2023_Grup1._09_01_2023_Homework.soru_3;

import java.util.ArrayList;

public abstract class Phone {
    static ArrayList<String> cart = new ArrayList<>();

    static int getSum(ArrayList<String> cart) {
        int sum = 0;
        for (String str : cart){
            sum+=Integer.parseInt(str.replaceAll("[^0-9]", ""));}
        return sum;
    }

    abstract void options(String str1, String str2);

}
