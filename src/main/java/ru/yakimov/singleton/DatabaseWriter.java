/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

package ru.yakimov.singleton;

public interface DatabaseWriter {

    void writeErrorLog(String msg, Exception ex);
    void writeInfoLog(String msg);

}
