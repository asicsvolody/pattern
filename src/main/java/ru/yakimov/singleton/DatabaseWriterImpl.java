package ru.yakimov.singleton;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class DatabaseWriterImpl implements DatabaseWriter{
    @Override
    public void writeErrorLog(String msg, Exception ex) {
        // write to database
    }

    @Override
    public void writeInfoLog(String msg) {
        // write to database

    }
}
