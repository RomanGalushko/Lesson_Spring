package pro.sky.lesson_spring.Goods;

import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@SessionScope
public class Goods {

    private static ArrayList<Integer> items = new ArrayList<>();

    public Goods(ArrayList<Integer> items) {
        this.items = items;
    }

    public static ArrayList<Integer> getItems() {
        return items;
    }
}