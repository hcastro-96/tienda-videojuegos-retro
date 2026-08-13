package com.tienda.model;

public class VideoGame extends Product {

    // Atributos
    private String consoleGame;
    private boolean isMultiplayer;
    private String gameGenre;
    private String region;

    // Constructores
    public VideoGame (String title, int year, String consoleGame, boolean isMultiplayer, String gameGenre, String region, double price, int stock) {
    super (title, year, price, stock);
    this.consoleGame = consoleGame;
    this.isMultiplayer = isMultiplayer;
    this.gameGenre = gameGenre;
    this.region = region;
    }

    // Getters
    public String getConsoleGame(){return consoleGame;}
    public boolean isMultiplayer(){return isMultiplayer;}
    public String getGameGenre(){return gameGenre;}
    public String getRegion(){return region;}

    // toString
    @Override public String toString() {
        return super.toString() + " | Consola: " + consoleGame + " | " + (isMultiplayer ? "Juego Multijugador" : "Juego Singleplayer") + " | Género: " + gameGenre + " | Formato: " + " | Región: " + region;
    }

}
