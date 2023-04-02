package Task4;

public class ProDocumentWorker extends DocumentWorker{
    public void openDocument(){
        System.out.println("Документ відкритий");
    }
    public void editDocument(){
        System.out.println("Документ відредаговано");
    }
    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}
