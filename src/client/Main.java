package client;

import context.Request;
import handler.RequestHandler;
import pojo.Apple;
import pojo.Fruit;
import pojo.Mango;
import pojo.Strawberry;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 题目1
        BigDecimal result = RequestHandler.handle(initShop());
        System.out.println(result);

        // 题目2
        result = RequestHandler.handle(initShop1());
        System.out.println(result);

        // 题目3
        result = RequestHandler.handle(initShop2());
        System.out.println(result);

        // 题目4
        result = RequestHandler.handle(initShop3());
        System.out.println(result);
    }

    public static Request initShop() {
        Request request = new Request();
        List<Fruit> fruits = new ArrayList<>();
        request.setFruits(fruits);
        Apple apple = new Apple();
        apple.setName("苹果");
        apple.setPrice(new BigDecimal(8));
        apple.setOrderedCount(5);
        fruits.add(apple);
        Strawberry strawberry = new Strawberry();
        strawberry.setName("草莓");
        strawberry.setPrice(new BigDecimal(13));
        strawberry.setOrderedCount(3);
        fruits.add(strawberry);
        return request;
    }

    public static Request initShop1() {
        Request request = new Request();
        List<Fruit> fruits = new ArrayList<>();
        request.setFruits(fruits);
        Apple apple = new Apple();
        apple.setName("苹果");
        apple.setPrice(new BigDecimal(8));
        apple.setOrderedCount(5);
        fruits.add(apple);
        Strawberry strawberry = new Strawberry();
        strawberry.setName("草莓");
        strawberry.setPrice(new BigDecimal(13));
        strawberry.setOrderedCount(3);
        fruits.add(strawberry);
        Mango mango = new Mango();
        mango.setName("芒果");
        mango.setPrice(new BigDecimal(20));
        mango.setOrderedCount(2);
        fruits.add(mango);
        return request;
    }

    public static Request initShop2() {
        Request request = new Request();
        List<Fruit> fruits = new ArrayList<>();
        request.setFruits(fruits);
        Apple apple = new Apple();
        apple.setName("苹果");
        apple.setPrice(new BigDecimal(8));
        apple.setOrderedCount(5);
        apple.setDiscountCommodity(true);
        apple.setDiscount(0.8d);
        fruits.add(apple);
        Strawberry strawberry = new Strawberry();
        strawberry.setName("草莓");
        strawberry.setPrice(new BigDecimal(13));
        strawberry.setOrderedCount(3);
        fruits.add(strawberry);
        Mango mango = new Mango();
        mango.setName("芒果");
        mango.setPrice(new BigDecimal(20));
        mango.setOrderedCount(2);
        fruits.add(mango);
        return request;
    }

    public static Request initShop3() {
        Request request = new Request();
        request.setHasOffer(true);
        request.setFullSubCondition(100);
        request.setFullSubMoney(10);
        request.setOfferMode("full_sub");
        List<Fruit> fruits = new ArrayList<>();
        request.setFruits(fruits);
        Apple apple = new Apple();
        apple.setName("苹果");
        apple.setPrice(new BigDecimal(8));
        apple.setOrderedCount(5);
        apple.setDiscountCommodity(true);
        apple.setDiscount(0.8d);
        fruits.add(apple);
        Strawberry strawberry = new Strawberry();
        strawberry.setName("草莓");
        strawberry.setPrice(new BigDecimal(13));
        strawberry.setOrderedCount(3);
        fruits.add(strawberry);
        Mango mango = new Mango();
        mango.setName("芒果");
        mango.setPrice(new BigDecimal(20));
        mango.setOrderedCount(2);
        fruits.add(mango);
        return request;
    }
}
