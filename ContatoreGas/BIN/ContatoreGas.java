Sia data la classe ContatoreGas, sviluppare la classe BollettaCalculator.
Public class ContatoreGas {
        private double consumoAttuale= 0.0;
        private double consumoPrecedente= 0.0;
        public ContatoreGas(){
            this.consumoAttuale=0.0;
        }
        public ContatoreGas(double consAtt){
            if(consAtt>=0){
                this.consumoAttuale= consAtt;
            }else{
                this.consumoAttuale= 0.0;
            }
        }
        public void setRilevazioneAttuale(double Att){
            if(Att>0 && Att>consumoPrecedente){ 
            //il consumo attuale deve essere maggiore di quello precedente per poter calcolare la bolletta.
                this.consumoPrecedente=this.consumoAttuale;
                this.consumoAttuale= Att;
            }else{
                this.consumoAttuale= 0.0;
            }
        }
        public void setRilevazionePrecedente(double consPrec){
            if(consPrec>=0){
                this.consumoPrecedente= consPrec;
            }else{
                this.consumoPrecedente= 0.0;
            }
        }
        public double getConsumoAtt(){
            return consumoAttuale;
        }
        public double getConsumoPrec(){
            return consumoPrecedente;
        }
}