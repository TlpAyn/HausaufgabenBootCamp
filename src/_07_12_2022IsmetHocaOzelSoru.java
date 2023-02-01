public class _07_12_2022IsmetHocaOzelSoru {
    public static void main(String[] args) {

       /* Bizim 3 tane saatimiz vardır.
                bir tanesi tam doğru çalışıyor,
                bir tanesi her saatte 20 dk geri kalıyor.
                bir tanesi her saate 15 dk ileri gidiyor.
                Bu 3 saate saat 16 da çalışmaya başlıyorlar.

                Bu saatler kaç saat ve dakika sonra tekrar
        aynı saati gösterirler aynı anda.*/


        // Matematiksel olarak 1.Saatte  60dk birim , 2.Saat 40 birim, 3. Saat 75 birim hizindadir.
        // 60/40/75 en buyuk ortak boleni     /Sadelestir -> 12,   8,   15 , (12x8x15)/60 = 24 saat sonra ayni saaati gosterecekler

        // Kodlama olarak ; ????????????????????

        //  Saat1    1.dk da 60/60, 2. dk 120/60,...... her dakika tam sayi/
        //  Saat2    1. dk 40/60  2. dk 80/60 .....    her 3 dakikada tam sayi
        //  Saat3    1. dk 75/60  2. dk 150/60 .......  her 5 dakikada bir tam sayi

        //"bir gunde kac dakika var " 60*24 = 1440 dk o zaman mod 1440 a gore alacagiz.

        //  double[] Saat1 = new double[1450];
        //for (double i = 0; i <1450 ; i=i+1) {
        //  System.out.println("i = " + i);



// her i  her 12 saniyeyi gostermektedir .12 saatte 43.200 saniye var/ 24 saatte 86.400 saniye


        int[] Saat1 = new int[99999];
        int Saat1BaslangicSaniyesi = 0;
        for (int i = 0; i < 99999; i=i+12) {
            Saat1[i] = Saat1BaslangicSaniyesi + i;
            System.out.println(Saat1[i]);
        }

        int[] Saat2 = new int[99999];
        int Saat2BaslangicSaniyesi = 0;

        for (int i = 0; i < 99999; i=i+8) {
            Saat2[i] = Saat2BaslangicSaniyesi + i;
            System.out.println(Saat2[i]);
        }
        
        int[] Saat3 = new int[99999];
        int Saat3BaslangicSaniyesi = 0;

        for (int i = 0; i < 99999; i=i+15) {
            Saat3[i] = Saat3BaslangicSaniyesi + i;
            System.out.println(Saat3[i]);
        }


        // her 12saniyeyi gosteren for dongusu
        int sayac=0;
        for (int i = 0; i <99999 ; i++) {
            if(Saat1[i]==Saat2[i]){
                sayac++;

        }
        }
        System.out.println("sayac = " + sayac);
        
    }
}
