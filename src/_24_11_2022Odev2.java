import java.util.Scanner;

public class _24_11_2022Odev2 {
    public static void main(String[] args) {
        // Mobil developer kursuna devam edecekler ve kendini zorlamak isteyen testerlar için

        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner input7 = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz = ");
        int number7 = input7.nextInt();

        int OnesDigit  = number7%10;
        int TensDigit = (int)(number7/10)% 10;
        int HunderdsDigit = (int)(number7/100)%10;

        System.out.println("OnesDigit = " + OnesDigit);
        System.out.println("TensDigit = " + TensDigit);
        System.out.println("HunderdsDigit = " + HunderdsDigit);

        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        Scanner input8 = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz = ");
        int number8 = input7.nextInt();
        int counter8 = 0;

        while (number8>0){

            number8 = number8/10;
                    counter8 =counter8+1;

        }
        System.out.println(" Sayinin basamak sayisi = " + counter8);





        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.


        int n, reverse = 0;

        System.out.println("Bir tam sayı girin :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while(n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        System.out.println("Ters çevrilen tam sayı " + reverse);





        //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

    }
}
