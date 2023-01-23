public class BollettaCalculator    {
        private static final int VALORE_MAX=9999;
        private ContattoreGas c;
        public BollettaCalculator(){
            c = new ContatoreGas();
        }
        public void start(){
            this.descriviApp();
            this.prendiInput();
            this.visualizzaRisultati();
	}
        public void descriviApp(){
	        System.out.println("In questa app verranno svolti dei calcoli per calcolare l'importo della bolletta del gas");
        }
        public void prendiInput(){
            Scanner input = new Scanner(System.in);
	    double val;
            System.out.println("Inserisci il consumo della bolletta");
            val=input.nextDouble());
            while(!letturaConsumi(val)){
                val= input.nextDouble());
            }
        }
        public void visualizzaRisultati(){
            System.out.println(c.calcolaBolletta());
        }
}
