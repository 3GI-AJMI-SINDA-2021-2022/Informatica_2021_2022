import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.*;

public classContatoreGasCalculator {

    private ArrayList <Contatore> lista;
    private staticfinal double COSTO = 2.5;

    public ContatoreCalculator() {
        lista = new ArrayList<Contatore>();
    }

    public ContatoreCalculator(ArrayList<Contatore>lis) {
	lista = new ArrayList <Contatore> ();
	if (lis != null) {
    for( Contatore c : lis){
		lista.add(new Contatore(c));
	}
        }


    public void start() {
        descriviApp();
        inputDati();
        visualizzaRisultati();
        scriviFile();
    }

    public voidDescriviApp() {
	String out = "";
        out += "L'applicazione prende i dati storici dei contatori \n";
        out += "ed elabora la bolletta dei consumi di ogni contatore \n";
        out += "dopo aver preso in ingresso le nuove letture dei consumi. ";
	System.out.println(out);
    }

    public voidInputDati() {
        Scanner s = new Scanner(System.in);
        double inp;
        System.out.println("dammi il nome del file con i dati storici");
        StringfileN;
        fileN = s.next();
        if (fileN != null) {
            leggiFile(fileN);
         }
    }

    public voidVisualizzaRisultati() {
        double ris;
        for (Contatore c : lista) {
          ris = c.calcolaBolletta();
          System.out.println("\nI valori delcontatore sono: \n" + c.toString() + 
            "\n");
          System.out.println("il consumo risulta: " + ris + "\n");
          System.out.println("L'importo del gas a mq : " + COSTO + "\n");
          System.out.println("L'importo della bolletta è: " + ris * COSTO);

       }
    }

    public voidLeggiFile(StringfileName) {
	String data;
	String[] valori;
        File myObj;
	if (fileName != null) {
		try {
			myObj = new File(fileName);
                		Scanner myReader = new Scanner(myObj);
			while (myReader.hasNext()) {
                    		data = myReader.next();
                    		valori = data.split(";");
				memorizzaContatoreNellaLista(valori);
               		 }

            	} catch (FileNotFoundException e) {
			System.out.println("An erroroccurred.");
           	 }
        	}

    }

    public voidScriviFile() {
        	Scanner s = new Scanner(System.in);
	        FileWriterfileOut = null;
        	double inp;
            System.out.println("dammi il nome del file con i dati storici");
            StringfileN;
            fileN = s.next();
            if (fileN != null) {
                try {
                    // apre il file in scrittura
                    fileOut = new FileWriter(fileN);    
                    String  str;
                    for (Contatore c : this.lista) {
                        str = "" + c.getConsumiPrec() + ";" + 
                        c.getConsumiAtt() + ";";
                        str += +c.calcolaBolletta()+'\n';
                        fileOut.write(str);
                        }
                    fileOut.close(); // chiude il file
                    } catch (Exception e) {
                    System.out.println("An erroroccurred.");
            	}
        	}

	System.out.println("\nBye bye!");

    }

    public voidMemorizzaContatoreNellaLista(String[] v) {
        	Contatore c = new Contatore();
	if (v != null) {
		c.setConsumoaAttuale(Double.parseDouble(v[0]));
		c.setConsumoaAttuale(Double.parseDouble(v[1]));
		this.lista.add(c);
        }
    }
    }
}