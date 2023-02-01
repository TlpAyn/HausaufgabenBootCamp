import java.util.Scanner;

public class _30_01_22Haber_Kanallari_Sorusu {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trtr, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // {"trt","atv"}


       // gunun sorusu : bir döngü ile 5 tane rastgele buldurunuz
        // Todo : fakat bir buldunu tekrar bulmasın

        Scanner input= new Scanner(System.in);

        String[] kanallar = {"Kanala","Kanalb","Kanalc","Kanald","Kanale"};


                 // 0,1,2,3,4
        int rdmSys =5;
        for (int i = 0; i <5; i++) {
            System.out.println("Kanal = "+kanallar[(int)(Math.random()*rdmSys)] );
            rdmSys=rdmSys-1;


            }

            }
        }













