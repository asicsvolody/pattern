package ru.yakimov.mediator;

import java.util.Scanner;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public interface IReider {
    String read() throws Exception;
    void closeSource();
    void openSource();
}
