package _09_01_2023_Grup1._09_01_2023_Homework.soru_3;
import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("*** Apple Store ***\n"+
                "64 GB ve 5.5 inch  ==> 1\n" +
                "64 GB ve 6.5 inch  ==> 2\n"+
                "128 GB ve 5.5 inch ==> 3\n"+
                "128 GB ve 6.5 inch ==> 4\n"+
                "Almak istediğiniz modeli seçiniz : ");
        String str1 = input.nextLine();
        System.out.print("Almak istediğiniz ikinci modeli seçiniz : ");
        String str2 = input.nextLine();

        Apple apple=new Apple();
        apple.options(str1,str2);


        System.out.print("*** Samsung Store ***\n"+
                "256 GB ve 5.5 inch ==> 1\n" +
                "256 GB ve 7.5 inch ==> 2\n"+
                "512 GB ve 5.5 inch ==> 3\n"+
                "512 GB ve 6.5 inch ==> 4\n"+
                "Almak istediğiniz modeli seçiniz : ");
        String str3 = input.nextLine();
        System.out.print("Samsung için ikinci nodeli seçiniz : ");
        String str4 = input.nextLine();

        Samsung samsung=new Samsung();
        samsung.options(str3,str4);

        System.out.println("Phone.getSum(Phone.cart) = " + Phone.getSum(Phone.cart));


    }

}
