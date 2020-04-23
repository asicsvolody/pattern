package ru.yakimov.builder;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Product implements ProductBuilder{

    private double price;
    private String name;
    private String factory;

    public static ProductBuilder build() {
        return new Product();
    }

    @Override
    public ProductBuilder price(double price) {
        this.price = price;
        return this;
    }

    @Override
    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder factory(String factory) {
        this.factory = factory;
        return this;
    }

    @Override
    public String productInString() {
        return String.format("Product %s: %s RUR, made is %s", name, price, factory);
    }


}
