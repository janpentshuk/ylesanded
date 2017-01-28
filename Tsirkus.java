import java.util.Arrays;

/**
 * Created by kasutaja on 24.01.2017.
 */
public class Tsirkus {
    /**
     * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
     * alustavad alt vasakult ja jõuavad üles vasakule.
     *
     * Näide 5*5 laual:
     * 30 29 28 27 26
     * 21 22 23 24 25
     * 20 19 18 17 16
     * 11 12 13 14 15
     * 10 9  8  7  6
     * 1  2  3  4  5
     */

    public void tsirk()
    {
        int [][] tsirkus = new int [10][10];

        int arvalla = 100;
        int arvyles = 96;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                if(i%2==0)
                {
                    tsirkus[i][j]=arvalla;
                    arvalla--;
                }
                else
                {
                    tsirkus[i][j]=arvyles;
                    arvyles++;
                }
            }
            arvalla-=5;
            arvyles-=15;

        }


        printMaatriks(tsirkus);
    }

    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
