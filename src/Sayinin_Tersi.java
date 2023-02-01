import java.util.Scanner;

public class Sayinin_Tersi {
    public static void main(String[] args) {

//9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();


        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {

            System.out.print(sayi % 10+"-");
            sayi = sayi/10;

        }
    }
}