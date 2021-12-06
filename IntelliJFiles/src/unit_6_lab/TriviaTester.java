package unit_6_lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaTester {
    public static void main(String[] args) throws FileNotFoundException {
        File questions = new File("Trivia.txt");
        Scanner inF = new Scanner(questions);
        String q = inF.nextLine();
        String choiceA = inF.nextLine();
        String choiceB = inF.nextLine();
        String choiceC = inF.nextLine();
        String choiceD= inF.nextLine();
        String correctA= inF.nextLine();
        int ptValue= inF.nextInt();
        inF.nextLine();

        Question q1 = new Question(q,choiceA,choiceB,choiceC,choiceD);
        System.out.println(q1);



    }
}