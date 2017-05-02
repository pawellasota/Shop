package com.codecool.shop.dao;

import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anna on 02.05.17.
 */
public class ProductDaoSqlite implements ProductDao {

    @Override
    public void add(Product product) {

    }

    @Override
    public Product find(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        ProductCategory category = new ProductCategory("Category", "Department", "Description");
        Supplier supplier = new Supplier("Supplier", "Description");
        Product product1 = new Product("product 1", 2.5f, "PLN", "description", category, supplier);
        Product product2 = new Product("product 2", 2.5f, "PLN", "description", category, supplier);
        Product product3 = new Product("product 3", 2.5f, "PLN", "description", category, supplier);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        return products;
    }

    @Override
    public List<Product> getBy(Supplier supplier) {
        return null;
    }

    @Override
    public List<Product> getBy(ProductCategory productCategory) {
        return null;
    }
}