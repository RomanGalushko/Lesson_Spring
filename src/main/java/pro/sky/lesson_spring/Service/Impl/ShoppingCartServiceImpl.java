package pro.sky.lesson_spring.Service.Impl;

import pro.sky.lesson_spring.Goods.Goods;
import pro.sky.lesson_spring.Service.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private Goods goods;

    @Override
    public ArrayList<Integer> addGoodsShoppingCart(ArrayList<Integer> id) {
        goods.getItems().addAll(id);
        return id;
    }

    @Override
    public ArrayList<Integer> getItemsFromShoppingCart() {
        return goods.getItems();
    }
}