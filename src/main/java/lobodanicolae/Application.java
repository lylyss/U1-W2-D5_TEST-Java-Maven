package lobodanicolae;

import lobodanicolae.Entities.Genere;
import lobodanicolae.Entities.Piataforma;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Games> gioco = new ArrayList<>();

        gioco.add(new VideoGames("VG01", "Elden Ring", 2022, 59.99, Piataforma.XBOX, 100, Genere.RPG));
        gioco.add(new VideoGames("VG03", "4Story", 2008, 0.0, Piataforma.PC, 999, Genere.MMORPG));
        gioco.add(new VideoGames("VG02", "FIFA 24", 2024, 69.99, Piataforma.PS5, 30, Genere.ESPORT));
        gioco.add(new BoardGames("GT01", "Monopoly", 1935, 29.99, 2, 60));
        gioco.add(new BoardGames("GT02", "Catan", 1995, 34.99, 4, 90));
        gioco.add(new BoardGames("GT03", "L'allegro chirurgo", 1965, 24.99, 2, 10));

        for (Games g : gioco) {
            g.stampaDettagli();
        }

    }
}
