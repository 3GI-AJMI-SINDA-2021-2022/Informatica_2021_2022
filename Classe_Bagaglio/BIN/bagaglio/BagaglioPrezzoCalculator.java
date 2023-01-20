Completare la classe BagaglioPrezzoCalculator integrando i metodi senza codice.

public class BagaglioPrezzoCalculator    {
        private static final double COSTO_PER_KG=5.00;
        private static final double SOVRAPPREZZO=10.00;
        privateBagaglio bag;
        public Bagaglio(){
            bag=new Bagaglio();
        }
        public void start(){
            this.descriviAttività();
            this.prendiInput();
            //this.calcolaPrezzo(); se non salvi il valore in una variabile, a cosa ti serve richiamarlo?
            this.visualizzaRisultati();
        }
        public double calcolaPrezzo(){
	      if(bag.sovraprezzo()){
	      return (bag.getWeight()*COSTO_PER_KG + SOVRAPPREZZO);
	}else{
	      
              return (bag.getWeight()*COSTO_PER_KG);
	      }

	}
        public void descriviAttività(){
	    System.out.println("In questa attività vengono svolti dei controlli sul peso dei bagagli, per ogni chilo pagherete "+ COSTO_PER_KG +" euro. Se i chili consentiti vengono superati bisogna pagare "+ SOVRAPPREZZO + " euro ");

	}
        public void prendiInput(){
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci il peso del bagaglio");
                bag.setWeight(input.nextDouble());
        }
        public void visualizzaRisultati(){
            	bag.toString();
        }
}
