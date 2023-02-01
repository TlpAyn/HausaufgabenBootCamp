import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Canli_Sozluk {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        Map<String, String> sozluk = new TreeMap<>();


        int number =0;
        do {
            System.out.print("MENÜ\n1- EKLEME\n2- Düzeltme\n3- Listeleme\n4- Arama\n5- Silme\n6- Çıkış\nSeçiminiz=");
            number = input.nextInt();
            switch (number) {
                case 1:// 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
                    System.out.print("Lutfen Kelimeyi Giriniz =");
                    String kelime = inputStr.nextLine();
                    System.out.print("Lutfen Kelimenin Manasini Giriniz=");
                    String manasi = inputStr.nextLine();
                    sozluk.put(kelime, manasi);
                    break;

                case 2:// 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
                    System.out.println("Düzeltme yapilacak kelimeyi giriniz");
                    String duzeltme = inputStr.nextLine();
                    System.out.println("Lutfen eski manasini giriniz");
                    String eskimana = inputStr.nextLine();
                    System.out.println("Lutfen yeni manasini giriniz");
                    String yenimana = inputStr.nextLine();

                    duzeltilecekKeime(sozluk,duzeltme,eskimana,yenimana);
                    break;
                case 3:
                    System.out.println(" Listeleme Secildi.\nTum ");
                    kelimelisteleme(sozluk);
                    break;

                case 4:
                    System.out.println("Arama secildi.\n Aramak istediginiz kelimeyi giriniz");
                    String arananKelime= inputStr.nextLine();
                    ArananaKelime(sozluk,arananKelime);// 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
                case 5:
                    System.out.println(" Lutfen silinecek kelimeyi giriniz ");
                    String silinecek =inputStr.nextLine();
                    silme(sozluk,silinecek);
                    break;
                case 6:
                    cikisislemiGerceklestirildi();break;
                default: hataligiris();
            }
        } while (number != 6);



    }

    private static void ArananaKelime(Map<String, String> sozluk, String arananKelime) {
        for (Map.Entry<String,String> hepsi :sozluk.entrySet()) {
            if(hepsi.getKey().startsWith(arananKelime)){
                System.out.println(hepsi.getKey());
            }
        }
    }

    private static void duzeltilecekKeime(Map<String, String> sozluk, String duzeltme, String eskimana, String yenimana) {
        sozluk.replace(duzeltme,eskimana,yenimana);
    }

    private static void silme(Map<String, String> sozluk, String silinecek) {


        if( sozluk.containsKey(silinecek)){
            sozluk.remove(silinecek);
            System.out.println(silinecek+ " kelimesi silindi");
        }
        else
            System.out.println("boyle bir kelime bulunmamaktadir. ");

       // (sozluk.containsKey(silinecek)) ? sozluk.remove(silinecek) : System.out.println(BulunmayanKelime);

       // sozluk.remove(silinecek);



    }

    private static void kelimelisteleme(Map<String, String> sozluk) {
        for ( Map.Entry<String,String> liste :sozluk.entrySet()) {
            System.out.println(liste.getKey()+ " : " + liste.getValue());
        }
    }

    private static void hataligiris() {
        System.out.println("hatali giris yaptiniz , tekrar giriniz");
    }

    private static void cikisislemiGerceklestirildi() {
        System.out.println(" cikis islemi gerceklestitildi");
    }
}
