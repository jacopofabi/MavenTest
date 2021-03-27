package it.jacopofabi.app;

import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Logger.getGlobal().log(Level.SEVERE, "Hello World");
    }
}
