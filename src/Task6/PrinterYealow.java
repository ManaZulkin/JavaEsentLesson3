package Task6;

public class PrinterYealow extends Printer{
    void print(String text){
        System.out.println("\u001B[33m" + text);
    }
}
