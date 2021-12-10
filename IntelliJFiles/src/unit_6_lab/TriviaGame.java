package unit_6_lab;

public class TriviaGame {
    private String question;
    private int streak;
    private int totalPoints;

    public TriviaGame(int streak, int totalPoints){
        this.question= question;
        this.streak=streak;
        this.totalPoints=totalPoints;
    }

    //getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}

