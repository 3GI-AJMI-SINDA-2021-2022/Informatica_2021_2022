Sia data la seguente classe StatoTest:
public class StatoTest {
    public static void main(String[] args) {
        int rest;
        String nome;
        Stato stato1 = new Stato(“Polonia”, 20000.0, 50.0);
        Stato stato2 = new Stato("Italia", 10000.0, 63.0); 
        if (stato1.confronta(10.0, 10000.0)) {
            System.out.println("stato1 ha una densita di popolazione compresa 
        tra 10.0 abitanti/km2 e 10000.0 abitanti/km2");
        } else {
            System.out.println("stato1 NON ha una densita di popolazione compresa 
        tra 10.0 abitanti/km2 e 10000.0 abitanti/km2");
        }
        if (stato2.confronta((1000.0, 2000.0) {
            System.out.println("stato2 ha una densita di popolazione compresa 
        tra 1000.0 abitanti/km2 e 2000.0 abitanti/km2");
        } else {
            System.out.println("stato2 NON ha una densita di popolazione compresa 
        tra 1000.0 abitanti/km2 e 2000.0 abitanti/km2");
        }
            rest = stato1.confronta(stato2);
            if (rest == -1) {
                 System.out.println ("lo stato1 ha una densita di popolazione minore di stato2");
             } else if (rest == 0) {
                           System.out.println ("i due stati hanno uguale densita di popolazione");
                       } else {
                           System.out.println ("lo stato1 ha un densita di popolazione maggiore di stato2");
                       }
             }
            System.out.println ("lo stato piu esteso è: " + stato1.piuEsteso(stato2));
   }


public class Stato {

    private String nome;
    private double superficie; 
    private double popolazione;
    public Stato() {
        nome = "anonimo";
        superficie = 0.0;
        popolazione = 0.0;
    }
    public Stato(String nome, double superficie, double popolazione) {
        if(nome!= null){
            this.nome = nome;
        }else{
            this.nome = "anonimo";
        }
        if(superficie>0){
            this.superficie = superficie;
        }else{
            this.superficie = 0.0;
        }
        If (popolazione>0){
            this.popolazione = popolazione;
        }else{
            this.popolazione = 0.0;
        }
    }
    public String getNome() {
        return nome;
    }
    public double getSuperficie() {
        return superficie;
    }
    public double getPopolazione() {
        return popolazione;
    }
    public void setNome(String nome) {
        if(nome!= null){
            this.nome = nome;
        }
    }
    public void setSuperficie(double superficie) {
        if(superficie>0){
            this.superficie = superficie;
        }
    }
    public void setPopolazione(double popolazione) {
        If (popolazione>0){
            this.popolazione = popolazione;
        }
    }
    public String toString() {
        return "Stato {nome: " + nome + ", superficie: " + superficie + "km2, popolazione: " + popolazione + 
       "mln, densita: " + this.densita() + " abitanti/km2}";
    }
   

 public double densita() {
        return (this.getPopolazione() *1000000) / this.getSuperfice());
}
public int confronta(Stato s) {
        
if(this.densità()<s.densità()){
           return -1;
}else if(this.densità()==s.densità()){
           return 0;
}else{
           return 1;
}












    }
    public boolean confronta(double a, double b) {
        
if(this.densità() > a && this.densità() < b){
          return true;
}else{
         return false;
}









    }
    public Stato piuEsteso(Stato s) {


if(this.superficie > s.getSuperficie()){
            return this;
}else{
            return s;
}










