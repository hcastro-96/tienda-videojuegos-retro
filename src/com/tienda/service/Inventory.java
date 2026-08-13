package com.tienda.service;
import com.tienda.model.Product;
import com.tienda.model.RetroConsole;
import com.tienda.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // Lista de productos
    private List<Product> productList = new ArrayList<>();

    // Metodo agregar producto
    public void addProduct(Product product){
        productList.add(product);
    }

    // Metodo mostrar catalogo
    public void showCatalog(){
        System.out.println("- Consolas -");
        for (Product product : productList) {
            if (product instanceof RetroConsole) {
                System.out.println(product);
            }
        }

        System.out.println("\n- Videojuegos -");
        for (Product product : productList) {
            if (product instanceof VideoGame) {
                System.out.println(product);
            }
        }
    }

    // Metodo busqueda por titulo
    public void searchByTitle(String title){

        boolean found = false;

        for (Product product : productList){
            if (product.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Producto encontrado: " + product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Este producto no se encuentra en el catálogo");
        }
    }
}
