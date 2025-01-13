package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void addingItemsToBasket() {
        Basket basket = new Basket();

        Assertions.assertFalse(basket.addToBasket("FILE"));

        Assertions.assertTrue(basket.addToBasket("BGLO"));
    }

    @Test
    public void removingItemFromBasket() {
        Basket basket = new Basket();
        basket.addToBasket("BGLO");
        basket.addToBasket("COFB");

        Assertions.assertTrue(basket.removeItem("BGLO"));
        Assertions.assertFalse(basket.removeItem("BGLO"));
        Assertions.assertEquals(1, basket.listOfItems().size());
    }

    @Test
    public void getListOfItems() {
        Basket basket = new Basket();
        basket.addToBasket("BGLO");
        basket.addToBasket("COFB");

        Assertions.assertEquals(basket.basketList, basket.listOfItems());
    }
}
