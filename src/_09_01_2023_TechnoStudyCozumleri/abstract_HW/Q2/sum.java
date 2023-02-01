package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q2;

public class sum extends Calculator{
    @Override
    public int calculating(int a, int b) {
        System.out.print("Sum for "+a+","+b+"=");
        return (a+b);
    }
}
