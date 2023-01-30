public class BollettaCalculator    {
        private static final double COSTO_MQ_GAS=3.05;
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
	    System.out.println("Inserisci il consumo precedente della bolletta");
	    val=input.nextDouble());
            while(val<0.0)){
                val= input.nextDouble());
            }
	    c.setConsumoPrec(val);
            System.out.println("Inserisci il consumo attuale della bolletta");
            val=input.nextDouble());
            while(!letturaConsumi(val)){
                val= input.nextDouble());
            }
	    c.setConsumoAtt(val);
        }
        public void visualizzaRisultati(){
            System.out.println(c.calcolaBolletta());
        }
}
