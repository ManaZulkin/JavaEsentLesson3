package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String coise, name;
        int score;
        ClassRoom[] classRoom = new ClassRoom[4];
        Pupil pupil = new Pupil();
        Scanner in = new Scanner(System.in);
        System.out.println("If you whant to make list of class - enter '1' \nIf you whant to make list with score - enter '2'");
        coise = in.nextLine();
        if (coise.equals("1")){
            for (int i = 0; i < classRoom.length; i++ ){
                System.out.println("Enter name of pupil");
                name = in.nextLine();
                classRoom[i] = new ClassRoom(pupil, name);
            }
            System.out.println("Class list ");
            for (int i = 0; i < classRoom.length; i++){
                classRoom[i].classList();
            }
        }
        else {
            for (int i = 0; i < classRoom.length; i++ ){
                System.out.println("Enter name of pupil");
                name = in.nextLine();
                System.out.println("Enter middle score of " + name);
                score = in.nextInt();
                in.nextLine();
                switch (score) {
                    case (1), (2): {
                        pupil = new BadPupil();
                        break;
                    }
                    case (3), (4): {
                        pupil = new GoodPupil();
                        break;
                    }
                    case (5): {
                        pupil = new ExelentPupil();
                        break;
                    }
                    case (0), (6): {
                        pupil = new Pupil();
                        break;
                    }
                }
                classRoom[i] = new ClassRoom(pupil, name, score);
            }
            System.out.println("Progress for this class");
            for (int i = 0; i < classRoom.length; i++){
                classRoom[i].classProgres();
            }
        }

    }
}
