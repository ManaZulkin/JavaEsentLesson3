package Task4;

public class ExpDocumentWorker extends ProDocumentWorker{
    public void openDocument(){
        System.out.println("Документ відкритий");
    }
    public void editDocument(){
        System.out.println("Документ відредаговано");
    }
    public void saveDocument(){
        System.out.println("Документ збережений в новому форматі");
    }
}
