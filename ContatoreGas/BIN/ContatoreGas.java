//Sia data la classe ContatoreGas, sviluppare la classe BollettaCalculator.
Public class ContatoreGas {
        private double consumoAttuale;
        private double consumoPrecedente;
        public ContatoreGas(){
            this.consumoAttuale=0.0;
            this.consumoPrecedente=0.0;
        }
        public ContatoreGas(double consAtt){
            if(consAtt>=0){
                this.consumoAttuale= consAtt;
            }else{
                this.consumoAttuale= 0.0;
            }
            this.consumoPrecedente=0.0;
        }
        public void setRilevazioneAttuale(double consAtt){
            if(consAtt>=0){
                this.rilevazionePrec= this.rilevazioneAtt;
		if(rilevazioneAtt + consAtt > MAX_CONS){
			this.rilevazioneAtt = rilevazioneAtt + consAtt - (MAX_CONS);
		}else{
			this.rilevazioneAtt=consAtt;
		}
	     }	

        }
        public boolean letturaContatore(double consumo){
            if(consumo>=0.0){
                setRilevazioneAttuale(consumo);
                return true;
            }else{
                return false;
            }
        }
        public void setRilevazionePrecedente(double consPrec){
            if(consPrec>=0){
                this.consumoPrecedente= consPrec;
            }
        }
        public double getConsumoAtt(){
            return consumoAttuale;
        }
        public double getConsumoPrec(){
            return consumoPrecedente;
        }
        public String toString(){
                //completare
        }
}
