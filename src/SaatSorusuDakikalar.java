public class SaatSorusuDakikalar {
    public static void main(String[] args) {


            int top_dakika_a,top_dakika_b,top_dakika_c;
            int a_saat,a_dakika,b_saat,b_dakika,c_saat,c_dakika;
            int i=0;
            int bitis,baslangic=16;
            boolean tamam=false;

            System.out.println("baslangic saat = "+baslangic+" : 00");

            do
            {   i++;

                top_dakika_a=(i*60);
                a_saat=top_dakika_a/60;
                a_dakika=top_dakika_a%60;
                a_saat=a_saat%12;

                top_dakika_b=(i*40);
                b_saat=top_dakika_b/60;
                b_dakika=top_dakika_b%60;
                b_saat=b_saat%12;

                top_dakika_c=(i*75);
                c_saat=top_dakika_c/60;
                c_dakika=top_dakika_c%60;
                c_saat=c_saat%12;

                if ((a_saat==b_saat)&&(b_saat==c_saat)) tamam=true;

            } while (tamam!=true);
            bitis=(baslangic+a_saat)%12;

            System.out.println("tekrar ayni saati gösterme = "+bitis+" : "+b_dakika);
            System.out.println("------------------------------------");
            System.out.println("Gecen süre = "+i+" saat "+a_dakika+" dakika\n");

            System.out.println("1. saatin gecirdigi dakika= "+top_dakika_a);
            a_saat=(top_dakika_a/60);
            System.out.println("1. saatin gecirdigi saat= "+a_saat+" dakika= "+a_dakika);

            System.out.println("2. saatin gecirdigi dakika= "+top_dakika_b);
            b_saat=(top_dakika_b/60);
            System.out.println("2. saatin gecirdigi saat= "+b_saat+" dakika= "+b_dakika);

            System.out.println("3. saatin gecirdigi dakika= "+top_dakika_c);
            c_saat=(top_dakika_c/60);
            System.out.println("2. saatin gecirdigi saat= "+c_saat+" dakika= "+c_dakika);

            System.out.println("\n1. saat \ndogru calisiyor\nbaslangic = "+baslangic+" : 00");
            System.out.println("gecen süre = "+a_saat+" saattir");
            a_saat=(a_saat+baslangic)%24;
            System.out.println("tekrar bulusma saati = "+a_saat+" : "+a_dakika);
            System.out.println("-----------");

            System.out.println("2. saat \nher saat 40 dk geri kaliyor\nbaslangic = "+baslangic+" : 00");
            System.out.println("gecen süre = "+b_saat+" saattir");
            b_saat=(b_saat+baslangic)%24;
            System.out.println("tekrar bulusma saati = "+b_saat+" : "+b_dakika);
            System.out.println("-----------");

            System.out.println("3. saat \nher saat 15 dk ileri gidiyor\nbaslangic = "+baslangic+" : 00");
            System.out.println("gecen süre = "+c_saat+" saattir");
            c_saat=(c_saat+baslangic)%24;
            System.out.println("tekrar bulusma saati = "+c_saat+" : "+c_dakika);

        }


    }





