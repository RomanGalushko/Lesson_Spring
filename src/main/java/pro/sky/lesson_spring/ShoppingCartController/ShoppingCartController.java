package pro.sky.lesson_spring.ShoppingCartController;

import pro.sky.lesson_spring.Service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public ArrayList<Integer> addGoodsShoppingCart(@RequestParam ArrayList<Integer> id) {
        return shoppingCartService.addGoodsShoppingCart(id);
    }

    @GetMapping("/get")
    public ArrayList<Integer> getItemsFromShoppingCart() {
        return shoppingCartService.getItemsFromShoppingCart();
    }
}