import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;
import java.io.File;
import java.lang.Integer;

public class LibriCalculator {
    private ArrayList<Libri> lista;

    public LibriCalculator(){
        lista = new ArrayList<Libri>();
    }

    public void start() {
        leggiFile();
        visualizzaOggetti();
        ordinaArray();
        scegliAutore();
    }

    private void leggiFIle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci directory del file : ");
        String locazioneFile = input.nextLine();
        try{
            File file = new File(locazioneFile);
            Scanner lettura = new Scanner(file);
            while (lettura.hasNext()){
                String linea = lettura.nextLine();
                String[] lineaSplit = linea.split(";");
                immagazzinaEdInserisci(lineaSplit);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void immagazzinaEdInserisci(String [] valori){
        Libri l = new Libro();
        l.setTitolo(valori[0]);
        l.setRegista(valori[1]);
        l.setNumPagine(Integer.parseInt(valori[2]));
        lista.add(l);
    }

    private void visualizzaOggetti(){
        for (Libri l : lista){
            System.out.println(l.toString());
            System.out.println("----------------------------------------------------");

        }
    }

    private void ordinaArray(){
        int[] arrayNumeroPagine = new int[lista.size()];
        String[] titoliLibri = new String[lista.size()];

        int i = 0;
        for (Libri l : lista){
            arrayNumeroPagine[i] = l.getNumPagine();
            i++;
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Array ordinato per lunghezza di pagine (dal più breve al più lungo): ");
            for (int k = 0; k < lista.size(); k++){
                for (int j = 1; j < lista.size(); j++){
                    if (arrayNumeroPagine[j] < arrayNumeroPagine[j-1]){
                        int temp = arrayNumeroPagine[j-1];
                        arrayNumeroPagine[j-1] = arrayNumeroPagine[j];
                        arrayNumeroPagine[j] = temp;                 
                    }
                }
            }
            for (int k = 0; k < lista.size(); k++){
                for (Libri l : lista){
                    if (arrayNumeroPagine[k] == l.getNumPagine()){
                        titoliLibri[k] = l.getTitolo();
                    }
                }
            }
            for (int k = 0; k < lista.size(); k++){
                System.out.println(titoliLibri[k] + "\t");
                System.out.println(arrayNumeroPagine[k]);
            }
            System.out.println("Il libro più lungo è : " + titoliLibri[lista.size()-1] + " : ed ha :" + arrayNumeroPagine[lista.size()-1] + "pagine");
    }

    private void scegliAutore(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci autore da controllare : ");
        String controlloAutore = input.nextLine();
        for (Libri l : lista){
            if (controlloAutore.equals(l.getAutore())){
                System.out.println(l.getAutore() + " : " + l.getTitolo());
            }
        }
    }












}