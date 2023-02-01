package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q2;

public class multply extends Calculator{
    @Override
    public int calculating(int a, int b) {
        System.out.print("Multply "+a+","+b+"=");
        return a*b;
    }
}
