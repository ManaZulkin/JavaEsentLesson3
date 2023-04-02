package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        System.out.println("Enter text for printing");
        text = in.nextLine();
        System.out.println("-------------------");
        System.out.println("Printing....");
        System.out.println("-------------------");
        Printer printer = new Printer();
        printer.print(text);
        printer = new PrinterBlue();
        printer.print(text);
        printer = new PrinterYealow();
        printer.print(text);
    }
}
