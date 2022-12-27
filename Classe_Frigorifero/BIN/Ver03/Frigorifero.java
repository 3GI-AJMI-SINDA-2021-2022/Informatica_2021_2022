


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
            if(mo != null){
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
        if(acceso){
            output = "";
            output += "marca: " + this.marca + ", modello " + this.modello + ", litri Frigo: " + litriFrigo + ", litri del Frizer: " + litriFrizer + ", prezzo: " + this.prezzo + ", consumo KW: " + this.consumokwat + ", temperatura frigo: " + temperaturaFrigo + ", temperatura Frizer: " + temperaturaFrizer;
        }else{
            output = "";
            output += "marca: " + this.marca + ", modello " + this.modello + ", litri Frigo: " + litriFrigo + ", litri del Frizer: " + litriFrizer + ", prezzo: " + this.prezzo;
        }
        return output;
    }
    //set
    public void setMarca(String ma){
        if(ma!=null) this.marca=ma;
    }
    public void setModello(String mo){
        this.modello=mo;
    }
    public void setLitriFrigo(int lFrigo){
        this.litriFrigo=lFrigo;
    }
    public void setLitriFrizer(int lFrizer){
       this.litriFrizer=lFrizer;
    }
    public void setPrezzo(double p){
       this.prezzo=p;
    }
    public void setConsumoKWat(int c){
        this.consumokwat=c;
    }
    public void setTemperaturaFrigo(int tFrigo){
        this.temperaturaFrigo=tFrigo;
    }
    public void setTemperaturaFrizer(int tFrizer){
            this.temperaturaFrizer=tFrizer;
    }
    //get
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public int getLitriFrigo(){
        return litriFrigo;
    }
    public int getLitriFrizer(){
        return litriFrizer;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public int getConsumoKWat(){
        return consumokwat;
    }
    public int getTemperaturaFrigo(){
        return temperaturaFrigo;
    }
    public int getTemperaturaFrizer(){
        return temperaturaFrizer;
    }
    //metodi per accendere e spegnere la lavatrice
    public void accendi(){
        this.acceso = true;
    }
    public void spegni(){
        this.acceso = false;
    }
}
