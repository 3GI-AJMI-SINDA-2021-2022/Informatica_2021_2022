public class ContatoreGas {

    private static final double MAX_VAL = 99999.999;
    private double consumoAttuale;
    private double consumoPrecedente;

    public Contatore() {
	    this.consumoPrecedente = 0.0;
	    this.consumoAttuale = 0.0;
    }

    public Contatore(double consAtt) {
	if (consAtt>= 0.0) {
		    this.setconsumoPrecedente(this.consAtt);
	        this.setconsumoaAttuale(consAtt);
        } else {
		    this.consumoPrecedente = 0.0;
		    this.consumoAttuale = 0.0;
        }
    }
    public Contatore(Contatore c) {
	if (c!= null) {
		    this.setconsumoPrecedente(c.consumoPrecedente);
	        this.setconsumoAttuale(c.consumoAttuale);
        } else {
		    this.consumoPrecedente = 0.0;
		    this.consumoAttuale = 0.0;
        }
    }

    public voidsetConsumoPrecedente(double v) {
	if (v >= 0.0) {
		this.consumoPrecedente = v;
        }
    }

    public double getConsumiPrec() {
	return this.consumoPrecedente;
    }

    public double getConsumiAtt() {
	return this.consumoAttuale;
    }

    public voidsetConsumoAttuale(double v) {
	if (v >= 0.0) {
	if (v > MAX_VAL) {
		this.consumoAttuale = v - MAX_VAL;
           } else {
		this.consumoAttuale = v;
            }
        }
    }

    public double calcolaBolletta() {
        double consumo;
        consumo = this.consumoAttuale - this.consumoPrecedente;
	if (consumo < 0.0) {
            consumo = (MAX_VAL - consumoPrecedente) + consumoAttuale;
        }
	return (consumo);

    }

    @Override
    public StringtoString() {
	String out = 	"____________________________________________________\n";
        out += "Il contatore ha il consumo precedente = " + this.consumoPrecedente + 	"\n";
        out += "Il contatore ha il consumo attuale = " + this.consumoAttuale + "\n";

	return out;
    }
}