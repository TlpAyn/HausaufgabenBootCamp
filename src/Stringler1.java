import java.util.Scanner;

public class Stringler1 {
    public static void main(String[] args) {


 //1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

 Scanner input = new Scanner(System.in);
        System.out.println(" Ad = ");
        String ad = input.nextLine();

        System.out.println("Soyad");
        String soyad = input.nextLine();

        System.out.println(ad + " "+ soyad); // s1.concat( " " + s2 )





//2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        System.out.println(" Keleime giriniz = " );
        String kelime = input.nextLine();
        boolean KelimBosMu = kelime.equals(" ");
        System.out.println("KelimBosMu = " + KelimBosMu);




// 3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)

           System.out.println("Kelime Giriniz (icinde A harfi olsun ) = " );
           String word = input.nextLine();

           // AXbaXndone (8) (10) ,

           int uzunlukI = word.length();
           String yeniDeger = word.replace("A", "AX");
           String yeniDeger2 = yeniDeger.replace("a", "aX");
           int uzunlukSon = yeniDeger2.length();

           System.out.println("A harflerinin toplam adedi =" + (uzunlukSon- uzunlukI));






// 4- girilen bir kelimenin ilk ve son harfini bulunuz.  // hata veriyor bak !

        System.out.println(" Lutfen bir kelime giriniz = ");
        String kelime1 = input.nextLine();
        char ilkharf = kelime1.charAt(0);
        int uzunluk1 = kelime1.length();
        char sonharf = kelime.charAt(uzunluk1);
        System.out.println("ilkkelime = " + ilkharf);
        System.out.println("sonkelime = " + sonharf);




// 5- girilen bir cümledeki ilk kelimeyi yazdırınız

        System.out.println(" Lutfen bir Cumle giriniz = ");
        String Cumle = input.nextLine();
        int bosluk = Cumle.indexOf(" ");
        System.out.println("ilk kelime =" + Cumle.substring(0 , bosluk));



// 6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız


        System.out.println(" Lutfen bir Cumle giriniz( en ay uc kelime ) = ");
        String CumleX = input.nextLine();



        // saaaaZssssZggggZhhhhhh
        int bosluk1 = CumleX.indexOf(" ");

        String CumleNeu = CumleX.replaceFirst(" ", "Z");
        int bosluk2 = CumleNeu.indexOf(" ");


        String ilkKelimeX = CumleNeu.substring(0,bosluk1);
        String ikinciKelimeX = CumleNeu.substring(bosluk1 +1, bosluk2);

        System.out.println("Ilk Kelime = " + ilkKelimeX );
        System.out.println("Ikinci Kelime = " + ikinciKelimeX );







//7- Girilen bir cümlede kaç kelime olduğunuz bulunuz


        System.out.println(" Lutfen bir Cumle giriniz = ");
        String Cumle3 = input.nextLine();

        int uzunluka = Cumle3.length();
        String yeniCumle3 = Cumle3.replace(" ", "");
        int uzunlukb = yeniCumle3.length();

        // Cumlede kelime sayisi bosluk sayisinin bir fazlasidir.
        int KelimeSayisi = uzunluka - uzunlukb +1;

        System.out.println("Kelime sayisi = "+ KelimeSayisi   );







//8- Girilen bir cumledeki kelimelerin ilk harflerini hazdırınız

        // ?????? 404 Error


//9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
        System.out.println(" Lutfen ad,soyad ve soyadinizi giriniz = ");
        String adSoyad = input.nextLine();

        // Uykum geldi :/

        int ilkbosluk = adSoyad.indexOf(" ");
        int sonbosluk = adSoyad.lastIndexOf(" ");
        String add = adSoyad.substring(0, ilkbosluk);
        System.out.println(" ad ve ikinci ad  ve soyad = " + add.charAt(0) + "."+ " "+ adSoyad.charAt(ilkbosluk + 1) + "."+ " " + adSoyad.charAt(sonbosluk +1) + ".");





    }
}
