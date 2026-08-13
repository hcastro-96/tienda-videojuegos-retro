package com.tienda.service;
import com.tienda.model.Product;
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
        for (Product product : productList) {
            System.out.println(product);
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
