package lobodanicolae;

public class BoardGames extends Games {
    private int numGiocatori;
    private int durataMedia;

    public BoardGames(String id, String titolo, int anno, double prezzo, int numGiocatori, int durataMedia) {
        super(id, titolo, anno, prezzo);
        if (numGiocatori < 2 || numGiocatori > 10)
            throw new IllegalArgumentException("Numero giocatori deve essere tra 2 e 10");
        else {

            this.numGiocatori = numGiocatori;
            this.durataMedia = durataMedia;
        }
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Gioco da Tavolo: " + numGiocatori + " giocatori | Durata media: " + durataMedia + " minuti");
    }
}
