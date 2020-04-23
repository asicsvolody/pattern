package ru.yakimov.builder;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Tester {
    public static void main(String[] args) {
        System.out.println(
                Product.build()
                .name("Potato")
                .price(1.0)
                .factory("Russia")
                .productInString()
        );
    }
}
