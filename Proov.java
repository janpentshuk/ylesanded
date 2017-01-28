import java.util.Scanner;

public class Proov {
    public static void main(String[] args) {

       // massiiv();
        //arvusisestus();
        //pizza();
        //pyramiid();
        //tsykkel();
        //kymmetaisarvu();
        //peaproge();
        matrix();
    }
    public static void arvusisestus()
    {
        //2.	Koosta programm, mis sisestab kaks arvu ja annab vastuse
        // (võrdsed, esimene on suurem või teine on suurem).
        Scanner sisestus = new Scanner(System.in);
        System.out.println("Sisesta arv 1!");
        int esimene = sisestus.nextInt();
        System.out.println("Sisesta arv 2!");
        int teine = sisestus.nextInt();

        if (esimene>teine)
        {
            System.out.println(esimene + " on suurem kui " + teine);
        }
        else if(esimene==teine)
        {
            System.out.println("Arvud on võrdsed");
        }
        else
        {
            System.out.println(teine + " on suurem kui " + esimene);
        }

    }


    public static void massiiv()
    {
        /**
         * Created by kasutaja on 24.01.2017.
         * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
         */
        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};

        for (int i = 0; i <naide.length ; i++) {
            naide[i]*=2;
        }


        int arvkokku = 0;
        for (int i = 0; i <naide.length ; i++) {
            arvkokku+=naide[i];
        }
        System.out.println(arvkokku/naide.length);

    }
    public static void pizza()
    {
        //3.	Koosta programm, sisendiks on rahasumma rahakotis
        // ning pitsasaia maksumus. Programm ütleb, mitu pitsasaia
        // saab osta, kui palju raha jääb veel järgi.
        // Kui rahasumma on väiksem kui pitsasaia hind,
        // siis antakse vastav teade.

        Scanner sisend = new Scanner(System.in);
        System.out.println("Palju sul raha on?");
        int raha = sisend.nextInt();
        System.out.println("Palju võiks üks pirukas maksta?");
        int pirukahind = sisend.nextInt();

        if(pirukahind>raha)
        {
            System.out.println("Sul pole raha piisavalt");
        }
        else
        {
            int saiadearv = raha/pirukahind;
            int kulunudraha = saiadearv*pirukahind;
            int rahajargi = raha-kulunudraha;
            System.out.println("Saad osta " + saiadearv + " pirukat ja järgi jääb " + rahajargi + " .");
        }
    }
    public static void pyramiid()
    {
        //prindi välja tärnidest püramiid. yleval 1 tärn, all 9 tärni, kokku 5 rida

        int a = 4;
        int b =2;

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <a ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <b ; j++) {
                System.out.print("* ");
            }
            a--;
            b++;
            System.out.println();
        }
    }

    public static void tsykkel()
    {
        //5.	for tsükkel (10000 korda), imiteeritakse täringuviskamist. Loendatakse, mitu korda visati kuut.
        //tulemus = 1 +(int)(Math.random()*6);

        int kordaja = 0;
        int silmadearv;
        for (int i = 0; i <10000 ; i++) {
            silmadearv = (int)(Math.random()*7);
            if(silmadearv==6)
            {
                kordaja++;
            }

        }
        System.out.println("Kokku visati kuut " + kordaja + " korda.");
    }

    public static void kymmetaisarvu()
    {
        //6.	Koosta programm, mis küsib kasutajalt 10 täisarvu.
        // Arvud sisestatakse massiivi. Programm peab leidma, mitu
        // paarisarvu sisestati ning väljastama nende arvude järjenumbrid.
        Scanner sisend = new Scanner(System.in);
        int [] arvud = new int [10];
        for (int i = 0; i <10 ; i++) {
            System.out.println("Palun sisesta arv");
            arvud[i]=sisend.nextInt();
        }
        int mitupaarisarvu = 0;
        for (int i = 0; i < arvud.length; i++) {
            if(arvud[i]%2==0) {
                System.out.println("Paarisarv sisestati " + i + " kohal");
                mitupaarisarvu++;

            }

        }
        System.out.println("Kokku oli paarisarve " + mitupaarisarvu);
    }
    public static void peaproge()
    {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta mingi arv");
        int arv = sisend.nextInt();
        Proov pr = new Proov();
        pr.mitutarni(arv);
    }
    public void mitutarni(int tarnid)
    {
        for (int i = 0; i <tarnid ; i++) {
            System.out.print("* ");
        }
    }

    public static void kolmnime()
    {
        //Küsi kasutajalt kolme inimese vanused ja ütle, kes on vanim, kes keskmine, kes noorim
        // kui mõned on võrdsete vanustega, siis ütle seda
    }

    public static void matrix()
    {
        /* |  1  2  3  4  5  6  7  8  9
            -------------------------------
            1 1  2  3  4  5  6  7  8  9
        2 |   2  4  6  8 10 12 14 16 18
        3 |   3  6  9 12 15 18 21 24 27
        4 |   4  8 12 16 20 24 28 32 36
        5 |   5 10 15 20 25 30 35 40 45
        6 |   6 12 18 24 30 36 42 48 54
        7 |   7 14 21 28 35 42 49 56 63
        8 |   8 16 24 32 40 48 56 64 72
        9 |   9 18 27 36 45 54 63 72 81
          */

        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }
    }


}
