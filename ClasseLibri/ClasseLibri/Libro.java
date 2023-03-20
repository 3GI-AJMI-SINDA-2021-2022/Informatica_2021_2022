public class Libro {

    private String titolo;
    private String autore;
    private int numPagine;


    public Libro() {
	this.titolo = "anonimo";
	this.autore = "anonimo";
	this.numPagine = 0;
    }

    public Libro(String t, String a, String numPag) {
	    if(t!=null){
            this.titolo = t;
        }else{ 
            this.titolo="anonimo";
        }
	    if(titolo!=null){ 
            this.autore = a;
        }else{
            this.autore="anonimo";
        }
	    if(numPag>=0){ 
            this.numPagine = numPag;
        }else{ this.numPag=0;
        
        }
    }

    
    public void setTitolo(String t) {
	    if(titolo!=null){ 
            this.titolo = t;
        }else{ 
            this.titolo="anonimo";
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String a) {
	    if(autore!=null){
            this.autore = a;
        }else{
            this.autore="anonimo";
        }
    }

    public String getAutore() {
	    return this.autore;
    }

    
    public void setNumPagine(int numPag) {
	    if(numPag>=0){
            this.numPagine = numPag;
        }else{
            this.numPag= "anonimo";
        }
    }

    public int getNumPagine() {
	    return numPagine;
    }

    @Override
    public String toString() {
	    return "Libro {titolo= " + this.titolo + ", autore= " + this.autore+ 	
	    ", numPagine= " + this.numPagine + "}";
    }

}