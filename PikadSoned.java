import javafx.stage.Stage;

/**
 * Created by kasutaja on 24.01.2017.
 */
public class PikadSoned {


    /*public static void main(String[] args) {

        //soned();
        Pood poeke = new Pood();
        //poeke.kauplus();
        Tsirkus ts = new Tsirkus();
        //ts.tsirk();



    }*/




    public static void soned() {

        /**
         * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
         */
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        int tahtedekoguarv=0;
        for (int i = 0; i <naide.length ; i++) {
            tahtedekoguarv+=naide[i].length();
        }
        int mitusona= 0;
        int keskmine = tahtedekoguarv/naide.length;

        for (int i = 0; i <naide.length ; i++) {
            if(naide[i].length()>keskmine)
            {
                mitusona++;
            }

        }
        System.out.println("Keskmisest pikemad on " + mitusona);
    }
}
