package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q1;

public class Main {
    public static void main(String[] args) {
        tigers tiger=new tigers();
        System.out.println(tiger.getClass().getSimpleName());
        tiger.talk();
        tiger.walk();

        lions lion=new lions();
        System.out.println(lion.getClass().getSimpleName());
        lion.talk();
        lion.walk();

        homeCats cat=new homeCats();
        System.out.println(cat.getClass().getSimpleName());
        cat.talk();
        cat.walk();






    }
}
