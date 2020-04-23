/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

package ru.yakimov.builder;

public interface ProductBuilder{
     ProductBuilder price(double price);
     ProductBuilder name(String name);
     ProductBuilder factory(String factory);
     String productInString();
}
