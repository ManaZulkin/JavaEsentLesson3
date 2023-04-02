package Task2;

public class ClassRoom {
    protected Pupil pupil;
    protected String name;
    protected int score;
    public ClassRoom(Pupil pupil, String name){
        this.name = name;
        this.pupil = pupil;
    }
    public ClassRoom(Pupil pupil, String name, int score){
        this.name = name;
        this.pupil = pupil;
        this.score = score;
    }
    public void classList(){
        System.out.println(name);
    }
    public void classProgres(){
        System.out.println("Pupil " + name + " Middle score is " + score);
        if (score == 0 || score > 5) {
            System.out.println("You enter not correct data");
        }
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
    }
}
