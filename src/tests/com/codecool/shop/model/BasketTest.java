package com.codecool.shop.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class BasketTest {

    private Product product;
    private Basket basket;

    @BeforeEach
    public void getProduct() {
        product = new Product(1, "a", 0f,"PLN",
                null, null, null);
    }

    @Test
    public void testAddBasketItemIfNotInBasket() {
        BasketItem basketItem = new BasketItem(this.product, 1);
        Basket basket = new Basket();
        ArrayList<BasketItem> basketItems = new ArrayList<>();
        basketItems.add(basketItem);
        basket.add(this.product, 1);
        assertEquals(basketItems.get(0).getProduct(),
                basket.getItems().get(0).getProduct());
        assertEquals(basketItems.get(0).getQuantity(),
                basket.getItems().get(0).getQuantity());
    }
}

