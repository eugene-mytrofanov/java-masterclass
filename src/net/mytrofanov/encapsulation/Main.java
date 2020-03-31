package net.mytrofanov.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(100.00, false);


        System.out.println("Initial toner level is " + printer.getTonerLevel());
        System.out.println("Initial number of printed pages " + printer.getPaperPagesPrinted());
        printer.printPages(10);
        System.out.println("Total printed pages: " + printer.getPaperPagesPrinted());
        System.out.println("The toner level is " + printer.getTonerLevel());

        printer.printPages(20);
        System.out.println("Total printed pages: " + printer.getPaperPagesPrinted());
        System.out.println("The toner level is " + printer.getTonerLevel());

        Printer duplexPrinter = new Printer(50.00, true);
        System.out.println("New duplex printer");

        System.out.println("Initial toner level is " + duplexPrinter.getTonerLevel());
        System.out.println("Initial number of printed pages " + duplexPrinter.getPaperPagesPrinted());
        duplexPrinter.printPages(10);
        System.out.println("Total printed pages: " + duplexPrinter.getPaperPagesPrinted());
        System.out.println("The toner level is " + duplexPrinter.getTonerLevel());

        duplexPrinter.printPages(25);
        System.out.println("Total printed pages: " + duplexPrinter.getPaperPagesPrinted());
        System.out.println("The toner level is " + duplexPrinter.getTonerLevel());
    }
}
