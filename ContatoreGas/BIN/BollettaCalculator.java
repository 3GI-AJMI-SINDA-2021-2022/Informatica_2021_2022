public class BollettaCalculator    {
        private static final int VALORE_MAX=9999;
        private int ContatoreGas;
        public BollettaCalculator(){
            ContatoreGas c = new ContatoreGas();
        }
        public void start(){
            this.descriviApp();
            this.prendiInput();
            this.visualizzaRisultati();
            System.out.println(this.visualizzaRisultati);
        }
        public void descriviApp(){
	        System.out.println("In questa app verranno svolti dei calcoli per arrivare al consumo della bolletta");
        }
        public void prendiInput(){
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci il consumo della bolletta");
            c.setRilevazioneAttuale(input.nextDouble());
            while(c.getconsumo()>VALORE_MAX){
                c.setRilevazioneAttuale(input.nextDouble());
            }
        }
        public double visualizzaRisultati(){
            return (c.getConsumoAtt()-c.getConsumoPrec());
        }
}
