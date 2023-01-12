package televisore;
import java.util.Scanner;
import televisore.Televisore;
/**
 *Realizzare la classe (model) Televisore e la classe TelevisoreTest con
 *il main che istanzia un televisore e richiama i metodi previsti nella classe.
 * 
 * @author Ajmi Sinda
 * @version 1.0
 */
public class TelevisoreTest{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    Scanner inString = new Scanner (System.in);
    Televisore tv1 = new televisore.Televisore();
    System.out.println("Inserisci Pollici del televisore");
    int p=input.nextInt();
    System.out.println("Scrivi il colore del televisore");
    String col=inString.nextLine();
    System.out.println("Inserisci il canale del televisore");
    int c=input.nextInt();
    System.out.println("Inserisci il volume del televisore");
    int v=input.nextInt();
    System.out.println("Inserisci lo schermo del televisore");
    int s=input.nextInt();
    System.out.println("Inserisci la luminosità del televisore");
    int l=input.nextInt();
    System.out.println("Il televisore è acceso? se è acceso è uguale a true, altrimenti false");
    boolean a=input.nextBoolean();
    System.out.println(tv1.toString());
    
    }
}
    
    
  
    
