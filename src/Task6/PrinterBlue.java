package Task6;

public class PrinterBlue extends Printer{
    void print(String text){
        System.out.println("\u001B[34m" + text);
    }
}
