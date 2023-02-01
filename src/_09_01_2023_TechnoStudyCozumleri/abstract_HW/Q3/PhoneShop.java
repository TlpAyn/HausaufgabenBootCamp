package _09_01_2023_TechnoStudyCozumleri.abstract_HW.Q3;

import java.util.Scanner;

public class PhoneShop {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Apple için kapasite tercihinizi  giriniz     ( 128-256 (GB) )  = ");
        String cap= oku.nextLine();
        System.out.print("Apple için ekran boyutu tercihinizi giriniz  ( 5.5/6.5 (inch)) = ");
        String size= oku.nextLine();

        apple apple=new apple();
        apple.options(cap,size);

        System.out.print("Samsung için kapasite tercihinizi  giriniz     ( 256-512 (GB) )  = ");
        String capS= oku.nextLine();
        System.out.print("Samsung için ekran boyutu tercihinizi giriniz  ( 5.5/7.5 (inch)) = ");
        String sizeS= oku.nextLine();

        samsung samsung=new samsung();
        samsung.options(capS,sizeS);

        System.out.println("Toplam ödeme = "+phone.getSum(phone.card)+"$");











    }
}
