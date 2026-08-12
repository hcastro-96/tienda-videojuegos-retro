package com.tienda.model;

public class RetroConsole extends Product {

    // Atributos
    private boolean isPortable;
    private String mediaType;
    private int generation;

    // Constructores
    public RetroConsole(String title, int year, double price, int stock, boolean isPortable, String mediaType, int generation) {
        super (title, year, price, stock);
        this.isPortable = isPortable;
        this.mediaType = mediaType;
        this.generation = generation;

    }

    // Getters
    public boolean isPortable() { return isPortable; }
    public String getMediaType() { return mediaType; }
    public int getGeneration() { return generation; }

}
