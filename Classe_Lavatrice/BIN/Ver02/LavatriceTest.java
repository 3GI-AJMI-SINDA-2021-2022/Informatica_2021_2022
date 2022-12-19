
import java.util.*;
public class LavatriceTest
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        String marca = "Indesit";
        String modello = "EWE 81284 W IT";
        double prezzo = 370.99;
        int programma;
        int temperatura;
        int giriCentrifuga;
        int kg;
        boolean acceso;
        double tempo;
        
        Lavatrice l1 = new Lavatrice();
        
        char rispostaUtente;
        
        do{
            System.out.println("La lavatrice è accesa? s/n");
            rispostaUtente = input.nextLine().charAt(0);
        }while(rispostaUtente != 's' && rispostaUtente != 'n');
        
        if(rispostaUtente == 's'){
            l1.accesa();
        }else{
            l1.spenta();
        }
        
        l1.setModello("EWE 81284 W IT");
        l1.setTemperatura(50);
        l1.setKg(8);
        l1.setPrezzo(370.99);
        
        l1.toString();
    }
}
