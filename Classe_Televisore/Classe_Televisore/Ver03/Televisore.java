package televisore;
/**
 *Realizzare la classe (model) Televisore e la classe TelevisoreTest con
 *il main che istanzia un televisore e richiama i metodi previsti nella classe.
 * 
 * @author Ajmi Sinda
 * @version 1.0
 */
public class Televisore{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private int pollici;
    private String schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminos;
    private boolean acceso;

    /**
     * Costruttore degli oggetti di classe  Televisore
     */
    public Televisore(){
        // inizializza le variabili d'istanza
        this.pollici=0;
        this.schermo= "anonimo";
        this.colore= "anonimo";
        this.volume= 0;
        this.luminos= 0;
        this.acceso= false;
        this.canale=0;
    }
    public Televisore (int p, String s, String col, int v,
    int l, boolean a, int c){
        // metti qui il tuo codice
        if(p>=0){
            this.pollici=p;
        }else{
            this.pollici=0;
        }
        if(s!=null){
            this.schermo=s;
        }else{
            this.schermo= "default";
        }
        if(col!=null){
            this.colore=col;
        }else{
            this.colore= "default";
        }
        if(v>=0){
            this.volume=v;
        }else{
            this.volume=0;
        }
        if(l>=0){
            this.luminos=l;
        }else{
            this.luminos=0;
        }
        if(a){
            this.acceso=a;
        }else{
            this.acceso=false;
        }
        if (c>0){
            this.canale=c;
        }else{
            this.canale=0;
        }
        
    }
    public void accendi(){
        this.acceso=true;
    }
    public void spegni(){
        this.acceso=false;
    }
    
    //addizionale
    public void setPollici(int p){
        this.pollici=p;
    }
    public void setSchermo(String s){
        this.schermo=s;
    }
    public void setColore(String c){
        this.colore=c;
    }
    public void setCanale(int c){
        this.canale=c;
    }
    public void setVolume(int v){
        this.volume=v;
    }
    public void setLuminos(int l){
        this.luminos=l;
    }
    public boolean getStato(){
        return this.acceso;
    }
    public int getPollici(){
        return this.pollici;
    }
    public String getSchermo(){
        return this.schermo;
    }
    public String getColore(){
        return this.colore;
    }
    public int getCanale(){
        return this.canale;
    }
    public int getVolume(){
        return this.volume;
    }
    public int getLuminos(){
        return this.luminos;
    }
    public void aumentaCanale(){
        this.canale+=1;
    }
    public void diminuisciCanale(){
        this.canale-=1;
    }
    public void aumentaVolume(){
        this.volume+=1;
    }
    public void diminuisciVolume(){
        this.volume-=1;
    }
    public void aumentaLuminos(){
        this.luminos+=1;
    }
    public void diminuisciLuminos(){
        this.luminos-=1;
    }
}


