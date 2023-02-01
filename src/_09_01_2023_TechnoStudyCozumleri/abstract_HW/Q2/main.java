package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q2;

public class main {
    public static void main(String[] args) {

        sum sum=new sum();
        System.out.println(sum.calculating(5,1));
        System.out.println(sum.calculating(585,15));

        devide dev=new devide();
        System.out.println(dev.calculating(8,2));
        System.out.println(dev.calculating(585,15));


        multply mul=new multply();
        System.out.println(mul.calculating(5,2));
        System.out.println(mul.calculating(15,25));

        substract sub=new substract();
        System.out.println(sub.calculating(5,2));
        System.out.println(sub.calculating(5856,856));



    }
}
