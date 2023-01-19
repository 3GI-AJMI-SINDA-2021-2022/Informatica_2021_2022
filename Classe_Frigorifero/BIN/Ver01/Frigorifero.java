
/**
 * Aggiungi qui una descrizione della classe Frigorifero
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Frigorifero
{
    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFrizer;
    private double prezzo;
    private boolean acceso;
    private int consumokwat;
    private int temperaturaFrigo;
    private int temperaturaFrizer;
    
    public String output;
    
    //COSTRUTTORI
    public Frigorifero(){
            marca = "indefinito";
            modello = "indefinito";
            litriFrigo = 0;
            litriFrizer = 0;
            prezzo = 0.0;
            acceso = false;
            consumokwat = 0;
            temperaturaFrigo = 0;
            temperaturaFrizer = 0;
    }
    public Frigorifero(String ma, String mo, int lFrigo, int lFrizer, double pr, boolean a, int c, int tFrigo, int tFrizer){
            if(ma != null){
                marca = ma;
            }else{
                marca = "indefinito";
            }
            if(ma != null){
                modello = mo;
            }else{
                modello = "indefinito";
            }
            if(lFrigo >= 0){
                litriFrigo = lFrigo;
            }else{
                litriFrigo = 0;
            }
            if(lFrizer >= 0){
                litriFrizer = lFrizer;
            }else{
                litriFrizer = 0;
            }
            if(pr >= 0.0){
                prezzo = pr;
            }else{
                prezzo = 0.0;
            }
            if(a == true){
                acceso = true;
            }else{
                acceso = false;
            }
            if(c >= 0){
                consumokwat = c;
            }else{
                consumokwat = 0;
            }
            if(tFrigo >= 0){
                temperaturaFrigo = tFrigo;
            }else{
                temperaturaFrigo = 0;
            }
            if(tFrizer >= 0){
                temperaturaFrizer = tFrizer;
            }else{
                temperaturaFrizer = 0;
            }
    }
    //toString
    public String toString(){
         output = "";
            output += "marca: " + this.marca + ", modello " + this.modello + ", litri Frigo: " 
                + litriFrigo + ", litri del Frizer: " + litriFrizer + ", prezzo: " + this.prezzo 
        if(acceso){
            output += + ", consumo KW: " + this.consumokwat + ", temperatura frigo: " + temperaturaFrigo + ", temperatura Frizer: " + temperaturaFrizer;
       }
        return output;
    }
}
