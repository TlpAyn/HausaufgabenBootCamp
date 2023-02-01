import java.util.Scanner;

public class DavuBeyOdevBankaSorusu {
    public static void main(String[] args) {


       /* Arkadaslar hepinize güzel bir Pazar günü dilerim. Umarim herkes iyidir. Konularin üzerine yavaş yavaş ekleme yaparak kurs ilerliyor biraz zorlaşıyor gibi geliyor olabilir bazilarimiza ama günün sonunda göreceğiz ki neler ögrenmisiz.
                Bugün için küçük bir banka ATM Projesine baslayalim.
                Ilk olarak bugün Kullanici girişi kismini ve Menüleri yapalim. Ve bunlari bugüne kadar öğrendiklerimizle yapacagiz.
        Giris kismi :
        ATM ye gelen kişiyi Hosgeldiniz Mesaji ve Sifrenizi Giriniz gibi bir mesaj karsilasin
•    Eger doğru sifre girerse asagidaki gibi Menu ciksin karsisina ve secim yapsin. Secimi yaptıktan sonra ise sadece bir mesaj versin şimdilik. (mesaji her menü seciminde  yazsin ekrana)
        Ornegin 2 tusuna bastigi zaman “2.Para Cekme Menüsündesiniz” gibi

        1 Kendi Hesabina Para yatirma
        2.Para Cekme
        3.Havale
        4.Sifre Degistirme
        5.Cikis
•    Eger Hatali girer ise 3 kere giriş hakki olsun ve
        4. Giriş yaptigi zaman “ Üzgunum Cok sayida hatali giriş yaptiginiz için Kartiniza El konulmuştur Lütfen Subemizden geri aliniz”   mesajini göstersin ve ciksin.
        o    Her sifre girişinde ekranda kacinci girişi olduguda yazsin */

        Scanner input =new Scanner(System.in);
        System.out.println(" Herzlich Wilkommen ");
        System.out.println("Schreiben Sie bitte Ihr Password = ");
        int Password= input.nextInt();
        int counter = 1;

         // Pass : 123456789

        if( Password == 123456789 ){
            System.out.println("Geben Sie bitte die  Nummer ,die Sie auswählen möchten");
            System.out.println(" 1 Kendi Hesabina Para yatirma");
            System.out.println("  2.Para Cekme");
            System.out.println("   3.Havale");
            System.out.println("  4.Sifre Degistirme");
            System.out.println("  5.Cikis ");
            int KundenNummer = input.nextInt();

            switch (KundenNummer){
                case 1:
                    System.out.println(" Para yatirmak icin kendi hesabinizi giriniz. Lutfen Kendi hesabiniz adiniza tanimlanmi hesap olamlidir.");break;
                case 2 :
                    System.out.println(" Lutfen Para cekecegini miktari giriniz = ");break;
                case 3:
                    System.out.println(" Lutfen Havale etmek istedigini Iban numarasini giriniz ");break;
                case 4 :
                    System.out.println(" Degistirmek istediginiz sifreyi lutfen tanimlayiniz ");break;
                case 5 :
                    System.out.println(" emin misiniz ? ");break;

            }


        }
        else if (Password != 123456789 && counter<3) {
            while (counter<3 && Password!=123456789){
                System.out.println("Versuchen Sie es noch einmal");
                int NeuPassword2=input.nextInt();
                counter++;
            }


        }
        if( Password == 123456789 ) {
            System.out.println("Geben Sie bitte die  Nummer ,die Sie auswählen möchten");
            System.out.println(" 1 Kendi Hesabina Para yatirma");
            System.out.println("  2.Para Cekme");
            System.out.println("   3.Havale");
            System.out.println("  4.Sifre Degistirme");
            System.out.println("  5.Cikis ");
            int KundeNummer = input.nextInt();

            switch (KundeNummer) {
                case 1:
                    System.out.println(" Para yatirmak icin kendi hesabinizi giriniz. Lutfen Kendi hesabiniz adiniza tanimlanmi hesap olamlidir.");
                    break;
                case 2:
                    System.out.println(" Lutfen Para cekecegini miktari giriniz = ");
                    break;
                case 3:
                    System.out.println(" Lutfen Havale etmek istedigini Iban numarasini giriniz ");
                    break;
                case 4:
                    System.out.println(" Degistirmek istediginiz sifreyi lutfen tanimlayiniz ");
                    break;
                case 5:
                    System.out.println(" emin misiniz ? ");
                    break;

            }
        }
        else
            System.out.println(" Cok fazla hatali giris yaptiniz ");




    }





}














