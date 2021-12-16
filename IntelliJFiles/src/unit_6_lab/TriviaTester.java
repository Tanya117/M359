package unit_6_lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        TriviaGame trivia = new TriviaGame();

        System.out.println("***********************");
        System.out.println("Welcome to Java Trivia!");
        System.out.println("***********************");
        System.out.println("\nWhat is your name?");
        System.out.println("Enter your name: "); // asks user for their name
        String name = input.nextLine();

        System.out.println("Hello " +name);
        System.out.println("Rules" + "\n\t-\tEnter the correct answer" +
                "\n\t-\tAfter each question you will see your correct answer streak" +
                "\n\t-\tAfter each question you will see if you got the question right or wrong..." +
                "\n\t\t    ~ If you got the question wrong it will tell you what the right answer was" +
                "\n\t\t    ~ If you got the question right it will reward you with the set amount of" +
                " points allotted to that question" +
                "\n\t-\tFinally you will see your total points after each question as well as at the end" +
                " of the game");
        System.out.println("TO START ENTER *start*");
        String a = input.nextLine();
        if(a.equalsIgnoreCase("start")){
            trivia.gameTester();
        }
    }
}

