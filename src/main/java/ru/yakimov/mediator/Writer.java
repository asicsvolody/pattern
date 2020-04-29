package ru.yakimov.mediator;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class Writer implements IWriter{

    @Override
    public void write(String str) {
        System.out.println(str);
    }
}
