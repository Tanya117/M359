package unit_6_lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaTester {
    public static void main(String[] args) throws FileNotFoundException {
        File questions = new File("Trivia.txt");
        Scanner inF = new Scanner(questions);
        inF.nextLine();

        int num = inF.nextLine();
        inF.nextLine();

    }
}