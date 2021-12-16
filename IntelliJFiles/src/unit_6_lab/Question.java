package unit_6_lab;


public class Question {
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;
    private int points;


    //constructor

    public Question(String question,String answer1, String answer2, String answer3, String answer4, String correctAnswer, int points){
        this.question=question;
        this.answer1=answer1;
        this.answer2=answer2;
        this.answer3=answer3;
        this.answer4=answer4;
        this.correctAnswer= correctAnswer;
        this.points=points;
    }


    /**
     * @return  formatted String of the qs and answers
     */
    //toString
    public String toString(){
        String out= question;
        out+= "\nA. " + answer1;
        out+= "\nB. " + answer2;
        out+= "\nC. " + answer3;
        out+= "\nD. " + answer4;
        return out;

    }


    //getters and setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static boolean newQuestion(Question question, Question[] arr){
        boolean val = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != null && arr[i].equalsQuestion(question)){
                val = false;
            }
        }
        return val;
    }
    public boolean equalsQuestion(Question other){
        if(this.question.equalsIgnoreCase(other.getQuestion()) &&
                this.question.equalsIgnoreCase(other.getQuestion()) &&
                this.answer1.equalsIgnoreCase(other.getAnswer1()) &&
                this.answer2.equalsIgnoreCase(other.getAnswer2()) &&
                this.answer3.equalsIgnoreCase(other.getAnswer3()) &&
                this.answer4.equalsIgnoreCase(other.getAnswer4()) &&
                this.correctAnswer.equalsIgnoreCase(other.getCorrectAnswer()) &&
                this.points == other.getPoints()){
            return true;
        }
        return false;
    }

}
