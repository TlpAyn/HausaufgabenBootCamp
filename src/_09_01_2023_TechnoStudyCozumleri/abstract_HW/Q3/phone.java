package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q3;

import java.util.ArrayList;

public abstract class phone {
    public static ArrayList<String> card=new ArrayList<>();

    public static int getSum(ArrayList<String> list){
        int total=0;
        for (String str: list){
            int pay;
            pay = Integer.parseInt(str.replaceAll("\\$", ""));
            total+=pay;
        }
        return total;
    }
    public abstract void options(String capacity,String screenSize);
}
