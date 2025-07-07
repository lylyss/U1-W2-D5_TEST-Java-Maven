package lobodanicolae.Entities;

public abstract class Games {
    private String id;
    private String titolo;
    private int anno;
    private double prezzo;

    public Games(String id, String titolo, int anno, double prezzo) {

        if (prezzo < 0) throw new IllegalArgumentException("Il prezzo deve essere maggiore di zero");
        this.id = id;
        this.titolo = titolo;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    public abstract void stampaDettagli();

    //--------- Getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    //---------- Setter

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
