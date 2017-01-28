/**
 * Created by kasutaja on 24.01.2017.
 */
/**
 * Siin failis kasutatakse objekti Kassa, aga Kassa klassi ei eksisteeri. Sinu ülesanne
 * on see luua.
 *
 * Käesolevat klassi ei tohi muuta - mitte ühtegi tähemärki!
 *
 * Jep, sama ülesanne oli ka proovieksamis.
 */
public class Pood {
    public void kauplus() {

        String kassapidaja = "Laine";
        Kassa kassa = new Kassa(kassapidaja);

        kassa.lisaToode("Piim");
        kassa.lisaToode("Sai");
        kassa.lisaToode("Lillkapsas");
        kassa.lisaToode("Lamuu jäätis");
        kassa.lisaToode("Kanepiküpsis");
        kassa.eemaldaToode("Piim");
        kassa.eemaldaToode("Sai");
        kassa.lisaToode("Leib");

        kassa.prindiOstutsekk();
        kassa.prindiKassapidajaNimi();

        int a =10;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            a--;
        }
    }
}
