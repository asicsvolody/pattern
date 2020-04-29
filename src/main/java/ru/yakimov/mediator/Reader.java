package ru.yakimov.mediator;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Vladimir Yakimov.
 * e-mail: VYakimov@elar.ru
 */

public class Reader implements IReider{

    private Scanner scanner = null;

    private String str = null;


    @Override
    public void openSource() {
        scanner = new Scanner(System.in);
    }


    @Override
    public String read() throws Exception {
        if(scanner == null)
            throw new Exception("Scanner not open");
        System.out.println("Write 'exit' for exit");
        System.out.println("Add your message.");
        try {
            str = scanner.nextLine();
        }catch (NoSuchElementException ex){
            str = "";
        }
        return str;
    }

    @Override
    public void closeSource() {
        if (scanner!= null)
            scanner.close();

    }


}
