import java.util.ArrayList;

/**
 * Created by kasutaja on 24.01.2017.
 */
public class Kassa {
    String kassapidaja;
    ArrayList tooted = new ArrayList();

    public Kassa(String kassapidaja)
    {
        this.kassapidaja = kassapidaja;
    }
    public void lisaToode(String toode)
    {
        tooted.add(toode);
    }
    public void eemaldaToode(String toode)
    {
        tooted.remove(toode);
    }
    public void prindiOstutsekk()
    {
        System.out.println(tooted);
    }
    public void prindiKassapidajaNimi()
    {
        System.out.println(kassapidaja);
    }
}
