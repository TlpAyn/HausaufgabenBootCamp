package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q2;

public class substract extends Calculator{
    @Override
    public int calculating(int a, int b) {
        System.out.print("Substract "+a+","+b+"=");
        return a-b;
    }
}
