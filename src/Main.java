import com.tienda.model.Product;
import com.tienda.model.RetroConsole;
import com.tienda.model.VideoGame;

public class Main {
    public static void main(String[] args) {

        // Instanciar objetos -Hardcoding test-
        // Consolas
        Product ps1 = new RetroConsole("PlayStation 1", 1994, 150000, 15, false, "CD", 5);
        Product ps2 = new RetroConsole("PlayStation 2", 2000, 400000, 30, false, "DVD", 6);
        Product gba = new RetroConsole("Game Boy Advance", 2001, 100000, 30, true, "Cartucho", 6);
        Product psp = new RetroConsole("PlayStation Portable", 2004, 200000, 25, true, "UMD", 7);
        Product snes = new RetroConsole("Super Nintendo", 1990, 300000, 10, false, "Cartucho", 4);

        // Videojuegos
        Product re1 = new VideoGame("Resident Evil", 1996, "PlayStation 1", false, "Survival Horror", "NTSC", 20000, 50);
        Product mariWorld = new VideoGame("Super Mario World", 1990, "Super Nintendo", true, "Plataformas", "NTSC", 15000, 45);
        Product pkmEsmeralda = new VideoGame("Pókemon Esmeralda", 2004, "Game Boy Advance", true, "RPG", "NTSC", 60000, 60);
        Product gtaSA = new VideoGame("Grand Theft Auto: San Andreas", 2004, "PlayStation 2", true, "Mundo Abierto", "NTSC", 80000, 120);
        Product gow = new VideoGame("God of War", 2005, "PlayStation 2", false, "Hack and Slash", "NTSC", 40000, 100);
        Product tekken3 = new VideoGame("Tekken 3", 1998, "PlayStation 1", true, "Lucha", "NTSC", 30000, 60);
        Product gtaVCS = new VideoGame("Grand Theft Auto: Vice City Stories", 2006, "PlayStation Portable", false, "Mundo Abierto", "NTSC", 50000, 90);

    }
}
