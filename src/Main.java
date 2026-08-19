import com.sun.source.doctree.SinceTree;
import com.tienda.model.Product;
import com.tienda.model.RetroConsole;
import com.tienda.model.VideoGame;
import com.tienda.service.Inventory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Test de Scanner

        Inventory inventory = new Inventory();
        Scanner lector = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n-- MENU PRINCIPAL -- \n1: Agregar Videojuego \n2: Agregar Consola \n3: Ver Catálogo \n0: Salir");
            int menuOption = lector.nextInt();
            lector.nextLine();

            switch (menuOption) {
                case 1:
                    System.out.println("Ingrese el nombre del videojuego: ");
                    String gameTitle = lector.nextLine();
                    System.out.println("Que género es?");
                    String gameGenre = lector.nextLine();
                    System.out.println("Es multijugador? (si/no)");
                    String respuestaMP = lector.nextLine();
                    boolean isMultiplayer = respuestaMP.equalsIgnoreCase("si");
                    System.out.println("Ingrese la consola del videojuego: ");
                    String consoleGame = lector.nextLine();
                    System.out.println("Ingrese el año de lanzamiento: ");
                    int gameYear = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese el valor: ");
                    double gamePrice = lector.nextDouble();
                    lector.nextLine();
                    System.out.println("Ingrese el stock en depósito: ");
                    int gameStock = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese la región del videojuego (NTSC/PAL): ");
                    String region = lector.nextLine();

                    // Instanciar el videojuego ingresado por el usuario
                    VideoGame newVideoGame = new VideoGame(gameTitle, gameYear, consoleGame, isMultiplayer, gameGenre, region, gamePrice, gameStock);

                    inventory.addProduct(newVideoGame);

                    System.out.println("Videojuego agregado con éxito!");
                    break;

                case 2:
                    System.out.println("Ingrese la consola: ");
                    String consoleTitle = lector.nextLine();
                    System.out.println("Ingrese el año de la consola: ");
                    int consoleYear = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese el valor de la consola: ");
                    double consolePrice = lector.nextDouble();
                    System.out.println("Ingrese el Stock de consolas en depósito: ");
                    int consoleStock = lector.nextInt();
                    lector.nextLine();
                    System.out.println("Es portátil? (si/no)");
                    String respuestaPortable = lector.nextLine();
                    boolean consolePortable = respuestaPortable.equalsIgnoreCase("si");
                    System.out.println("Ingrese formato válido (CD/DVD/Cartucho)");
                    String mediaType = lector.nextLine();
                    System.out.println("Ingrese la generación de la consola: ");
                    int consoleGen = lector.nextInt();
                    lector.nextLine();

                    // Instanciar la consola agregada por el usuario
                    RetroConsole newConsole = new RetroConsole(consoleTitle, consoleYear, consolePrice, consoleStock, consolePortable, mediaType, consoleGen);

                    inventory.addProduct(newConsole);

                    System.out.println("Consola Retro agregada con éxito!");
                    break;

                case 3:
                    inventory.showCatalog();
                    break;

                case 0:
                    System.out.println("Finalizando sesión...");
                    exit = true;
                    break;

                default:
                    System.out.println("La opción ingresada no es válida. Intente nuevamente");

            }
        }

        lector.close();
/*
        // Instanciar objetos -Hardcoding test-
        // Consolas
        Product ps1 = new RetroConsole("PlayStation 1", 1994, 150000, 15, false, "CD", 5);
        Product ps2 = new RetroConsole("PlayStation 2", 2000, 400000, 30, false, "DVD", 6);
        Product gba = new RetroConsole("Game Boy Advance", 2001, 100000, 30, true, "Cartucho", 6);
        Product psp = new RetroConsole("PlayStation Portable", 2004, 200000, 25, true, "UMD", 7);
        Product snes = new RetroConsole("Super Nintendo", 1990, 300000, 10, false, "Cartucho", 4);

        // Videojuegos
        Product re1 = new VideoGame("Resident Evil", 1996, "PlayStation 1", false, "Survival Horror", "NTSC", 20000, 50);
        Product marioWorld = new VideoGame("Super Mario World", 1990, "Super Nintendo", true, "Plataformas", "NTSC", 15000, 45);
        Product pkmEsmeralda = new VideoGame("Pókemon Esmeralda", 2004, "Game Boy Advance", true, "RPG", "NTSC", 60000, 60);
        Product gtaSA = new VideoGame("Grand Theft Auto: San Andreas", 2004, "PlayStation 2", true, "Mundo Abierto", "NTSC", 80000, 120);
        Product gow = new VideoGame("God of War", 2005, "PlayStation 2", false, "Hack and Slash", "NTSC", 40000, 100);
        Product tekken3 = new VideoGame("Tekken 3", 1998, "PlayStation 1", true, "Lucha", "NTSC", 30000, 60);
        Product gtaVCS = new VideoGame("Grand Theft Auto: Vice City Stories", 2006, "PlayStation Portable", false, "Mundo Abierto", "NTSC", 50000, 90);

        // Inventario
        Inventory inventory = new Inventory();
        inventory.addProduct(ps1);
        inventory.addProduct(ps2);
        inventory.addProduct(psp);
        inventory.addProduct(gba);
        inventory.addProduct(snes);
        inventory.addProduct(re1);
        inventory.addProduct(marioWorld);
        inventory.addProduct(gtaSA);
        inventory.addProduct(gtaVCS);
        inventory.addProduct(gow);
        inventory.addProduct(tekken3);

        // Prueba de metodos de Inventory
        inventory.showCatalog();
*/
    }
}
