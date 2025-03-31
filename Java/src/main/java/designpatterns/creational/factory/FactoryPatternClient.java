package src.main.java.designpatterns.creational.factory;

import java.util.Scanner;

public class FactoryPatternClient {
    public static void main(String[] args) {
        //Create Document Interface - Product Interface
        //Create Subclasses of Document Types implementing Document Interface - Text, Spreadsheet, etc. - Concrete Product Class
        // Create abstract factory method which return product class object. - Creator Class
        // Create subclasses that override the abstract factory method
        // Client Class
        Application application;
        System.out.println("Please enter the type of application : ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        switch(type.toUpperCase()) {
            case "TEXT":
                application = new TextApplication();
                break;
            case "SHEET":
                application = new SpreadsheetApplication();
                break;
            default:
                throw new IllegalArgumentException("Invalid Application Type");
        }

        //Factory Method to create a new document
        application.newDocument();
    }
}
