package ru.yakimov.singleton;

/**
 * Created by IntelliJ Idea.
 * User: Якимов В.Н.
 * E-mail: yakimovvn@bk.ru
 */

public class Logger {

    private static Logger instance;

    private DatabaseWriter databaseWriter;

    private Logger(DatabaseWriter writer) {
        this.databaseWriter = writer;
    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized (Logger.class){
                if(instance == null)
                    instance = new Logger(new DatabaseWriterImpl());
            }
        }
        return instance;
    }

    public void writeInfo(String msg){
        databaseWriter.writeInfoLog(msg);
    }

    public void writeError(String msg, Exception ex){
        databaseWriter.writeErrorLog(msg, ex);

    }
}
