package unit_6_lab;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class TriviaGame {
    private static Question[] questionsA = new Question[12];
    private static int correctStreak;
    private static int askedQuestions;
    private static int totalPoints;
    private static Question[] oldQuestions = new Question[12];


    public TriviaGame()  throws FileNotFoundException {
        correctStreak = 0;
        totalPoints = 0;
        readFile();

    }


    public void readFile() throws FileNotFoundException {
        File file = new File ("Trivia.txt");
        Scanner fileIn = new Scanner(file);
        int i = 0;
        while(fileIn.hasNextLine()){

            String question = fileIn.nextLine();
            String answer1 = fileIn.nextLine();
            String answer2 = fileIn.nextLine();
            String answer3 = fileIn.nextLine();
            String answer4 = fileIn.nextLine();
            String correctAnswer = fileIn.nextLine();
            int pts = fileIn.nextInt();

            Question q = new Question(question,answer1,answer2,answer3,answer4, correctAnswer, pts);
            questionsA[i] = q;
            i++;
            if(fileIn.hasNextLine()){
                fileIn.nextLine();
            }
            if(i == 12){
                break;
            }
        }

    }

    public static void gameTester() throws FileNotFoundException {
        askedQuestions = 0;
        totalPoints = 0;
        correctStreak = 0;
        Scanner scanner = new Scanner(System.in);
        while(askedQuestions < questionsA.length - 1 ){
            int questionNum = (int) (Math.random() *12);
            if(Question.newQuestion(questionsA[questionNum], oldQuestions)){
                oldQuestions[askedQuestions] = questionsA[questionNum];
                askedQuestions++;

                Question currentQuestion = questionsA[questionNum];
                System.out.println(questionsA[questionNum]);
                System.out.println("Enter your answer");
                String answer = scanner.nextLine();
                if(answer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())) {
                    correctStreak++;
                    totalPoints += currentQuestion.getPoints();
                    System.out.println("Correct Answer!");
                    System.out.println("You earned " + currentQuestion.getPoints());
                    System.out.println("You have " + totalPoints);
                    System.out.println("You are at a " + correctStreak + " streak");
                    System.out.println("Would you like to keep playing (END or PLAY)");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("END")) {
                        break;
                    }
                }
                else{
                    correctStreak = 0;
                    System.out.println("Wrong Answer!");
                    System.out.println("You have " + totalPoints);
                    System.out.println("You are at a " + correctStreak + " streak");
                    System.out.println("Would you like to keep playing (END or PLAY)");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("END")) {
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("You finished the game with " + totalPoints + " points");
        System.out.println("Your best streak was " + correctStreak + " questions");

    }
}

