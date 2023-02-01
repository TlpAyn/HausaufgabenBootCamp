import java.util.Scanner;

public class _24_11_2022Odev1 {
    public static void main(String[] args) {
     //  1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner input = new Scanner(System.in);
        int number;
        int counter= 0;
        int total =0;

        while (counter<20){

            System.out.println("Enter a number ");
            number=input.nextInt();
            if(number%2==1)
                total =total+number;
            counter++;
        }
        System.out.println("Result = " + total);


       // 2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner input2 = new Scanner(System.in);
        int counter2 = 0;
        int counter2b =0;

        while (counter2<4){

            System.out.println(" Enter a number = ");
            int number2 = input2.nextInt();
            counter2++;
            if(number2 % 2== 1 )
                counter2b++;

        }
        System.out.println("Total Odd Numbers = " + counter2b);


        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner input3 = new Scanner(System.in);
        System.out.println(" Enter a number = ");
        int number3= input3.nextInt();
        int total3 = 0;
        int counter3=0;
        while (counter3<number3){
            total3=total3+counter3;
            counter3++;
        }
        System.out.println(" Total = " +total3);



       // 4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner input4 = new Scanner(System.in);
        int counter4 = 0;
        int total4 = 0;
        while (counter4<3){
            System.out.println(" enter a number =");
            int number4 = input4.nextInt();
            if(number4<30 && number4>10)
                total4 = total4+number4;


            counter4++;
        }
        System.out.println("Sum of Numbers =  "+ total4);



       // 5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        Scanner input5 = new Scanner(System.in);
        int counter5 = 0;
        int counter5b = 0;

        while (counter5<100){

            if (counter5%10 == 5 )
                counter5b++;

            counter5++;
        }
        System.out.println(" Sonu bes olan sayilar = "+ counter5b);


        /*6- Bir sayı bulmaca oyunu yapılmak isteniyor
         bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,

        Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,

                bilemediniz yazıp tutulan sayıyı bildirsin.

        Eğer bilirse tebrikler yazsın.*/

        Scanner input6= new Scanner(System.in);

        int tutulansayi = (int)(Math.random()*10)+10;
        int counter6 =0;

        System.out.println(" Enter a number = ");
        int tahminEdilen = input6.nextInt();


        if(tahminEdilen==tutulansayi )
            System.out.println(" Tebrikler = ");

        else
            System.out.println("yeniden deneyiniz = ");
        int tahminedilern2 = input6.nextInt();
        if(tahminedilern2==tutulansayi)
            System.out.println("Tebrikler = ");
        else
            System.out.println("Yeniden deneyiniz = ");
        int tahminedilen3 = input6.nextInt();
        if(tahminedilen3==tutulansayi)

            System.out.println(" tebrikler = ");
        else
            System.out.println(" Tahmin edemediniz =");
        System.out.print(" tutulan sayi = "+ tutulansayi );

    }











    }

