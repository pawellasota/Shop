package com.codecool.shop.view;

import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;

import java.util.List;

public class ProductView {

    public void displayProductsList(List<Product> products) {
        for(Product p: products) {
            System.out.println(p.getName());
        }
    }

    public void displayCategoriesList(List<ProductCategory> categories) {
        System.out.println("Categories list");
        for(ProductCategory category: categories) {
            System.out.println(category.getId() + ") " + category.getName());
        }
    }

    public void displaySuppliersList(List<Supplier> suppliers) {
        System.out.println("Suppliers list");
        for(Supplier supplier: suppliers) {
            System.out.println(supplier.getId() + ") " + supplier.getName());
        }
    }

}