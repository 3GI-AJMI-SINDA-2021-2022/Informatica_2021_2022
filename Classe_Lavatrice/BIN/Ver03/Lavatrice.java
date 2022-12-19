
public class Lavatrice
{
    private String marca;
    private String modello;
    private double prezzo;
    private int programma;
    private int temperatura;
    private int giriCentrifuga;
    private int kg;
    private boolean acceso;
    private double tempo;
    
    public Lavatrice(){
        this.marca = "anonimo";
        this.modello = "anonimo";
        this.prezzo = 0;
        this.programma = 0;
        this.temperatura = 0;
        this.giriCentrifuga = 0;
        this.kg = 0;
        this.acceso = false;
        this.tempo = 0;
    }
    public Lavatrice(String m, String mod, double p, int t, int c, int kg,boolean a, double tempo, int pro){
        if(m!=null){
        this.marca=m;
        }else{
        this.marca="anonimo";
        }
        if(mod!=null){
        this.modello=mod;
        }else{
        this.modello="anonimo";
        }
        if(p<0.0){
        this.prezzo=0.0;
        }else{
        this.prezzo=p;
        }
        if(t>0){
        this.temperatura=t;
        }else{
        this.temperatura=0;
        }
        if(c>0){
        this.giriCentrifuga=c;
        }else{
        this.giriCentrifuga=0;
        }
        if(tempo<0.0){
        this.tempo=t;
        }else{
        this.tempo=0;
        }
        if(kg>0){
        this.kg=kg;
        }else{
        this.kg=0;
        }
        if(pro>0){
        this.programma=pro;
        }else{
        this.programma=0;
        }
        if(a){
        this.acceso=a;
        }else{
        this.acceso=false;
        }
    }
        public void accesa(){
        this.acceso=true;
    }
    public void spenta(){
        this.acceso=false;
    }
    public void setTemperatura(int t){
        this.temperatura=t;
    }
    public void aumentaTemperatura(){
        this.temperatura+=1;
    }
    public void diminuisciTemperatura(){
        this.temperatura-=1;
    }
    public void setMarca(String m){
        this.marca=m;
    }
    public void setModello(String mod){
        this.modello=mod;
    }
    public void setgiriCentrifuga(int c){
        this.giriCentrifuga=c;
    }
    public void setPrezzo(double p){
        this.prezzo=p;
    }
    public void setTempo(){
        this.tempo=tempo;
    }
    public void setKg(int kg){
        this.kg=kg;
    }
    public void setProgramma(int pro){
        this.programma=pro;
    }
    public int getTemperatura(){
        return temperatura;
    }
    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
    public int getgiriCentrifuga(){
        return giriCentrifuga;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public double getTempo(){
        return tempo;
    }
    public int getKg(){
        return kg;
    }
    public int getProgramma(){
        return programma;
    }
    public String toString(){
        String out= "la lavatrice:  ";
        out+= "di marca" +this.marca+ "/n";
        out+= "modello" +this.modello+ "/n";
        out+= "prezzo" +this.prezzo+ "/n";
        if(this.acceso){
            out+= "è accesa";
        }else{
            out+= "è spenta";
        }
        out+= "il programma impostato è:" +this.programma+ "/n";
        out+= "la temperatura scelta è:" +this.temperatura+ "/n";
        out+= "i giri della centrifuga sono:" +this.giriCentrifuga+ "/n";
        out+= "i kg di bucato sono:" +this.kg+ "/n";
        out+= "il programma impiegherà:" +this.tempo+ "ore";
        return out;
    }
    
}
