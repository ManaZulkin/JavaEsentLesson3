package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter key");
        String key = in.nextLine();
        DocumentWorker documentWorker = new DocumentWorker();
        if (key.equals("pro")) documentWorker = new ProDocumentWorker();
        else if(key.equals("exp")) documentWorker = new ExpDocumentWorker();

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
