
/**
 * Aggiungi qui una descrizione della classe FrigoriferoTest
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class FrigoriferoTest
{
    public static void main(String[] args){
        Frigorifero frigo = new Frigorifero();
        Frigorifero frigo2 = new Frigorifero();
        
        frigo.setPrezzo(200.00);
        frigo2.setConsumoKWat(40);
        
        System.out.println(frigo.toString());
        System.out.println(frigo2.toString());
    }
}
