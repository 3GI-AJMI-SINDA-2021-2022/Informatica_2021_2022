Sia data la classe Bagaglio, sviluppare la classe BagaglioPrezzoCalculator secondo il template che segue.
Public class Bagaglio {
        privatestaticfinal MAX_WEIGHT= 20.00;
        private double weight;
        public Bagaglio(){
            this.weight=0.0;
        }
        public Bagaglio(double w){
            this.weight=0.0;
            setBagaglio(w);
        }
        public void setWeight(double v){
            if(v>0){
                This.weight=v;
            }
            
        }
        public double getWeight(){
            return this.weight;
        }
        public boolean sovrapprezzo(){
            return(this.weight>MAX_WEIGHT);
        }
        public String toString(){
            String out=””;
            out+=” il bagaglio pesa: “+this.weight+” kg”;
            return out;
        }
}