package lobodanicolae.Entities;

import lobodanicolae.enums.Genere;
import lobodanicolae.enums.Piataforma;

public class VideoGames extends Games {

    private Piataforma piataforma;
    private int durataOre;
    private Genere genere;

    public VideoGames(String id, String titolo, int anno, double prezzo, Piataforma piattaforma, int durataOre, Genere genere) {
        super(id, titolo, anno, prezzo);
        this.piataforma = piattaforma;
        this.durataOre = durataOre;
        this.genere = genere;
    }

    @Override
    public void stampaDettagli() {
        System.out.println("Videogioco: " + "piataforma" + piataforma + " | Genere: " + genere + " | Durata: " + durataOre + " ore");
    }
}
