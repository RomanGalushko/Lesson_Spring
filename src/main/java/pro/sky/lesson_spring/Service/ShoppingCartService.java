package pro.sky.lesson_spring.Service;

import java.util.ArrayList;

public interface ShoppingCartService {

    ArrayList<Integer> addGoodsShoppingCart(ArrayList<Integer> id);

    ArrayList<Integer> getItemsFromShoppingCart();
}