package unit_9_lab;

public class Workout {
    private String name;
    private int workNum;
    private int duration;

    public Workout(String name, int workNum, int duration){
        this.name=name;
        this.workNum=workNum;
        this.duration=duration;
    }

    public String toString(){
        String str= "hi";
        return str;
    }

    public int startExercise(){
        System.out.println("Starting workout");
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkNum() {
        return workNum;
    }

    public void setWorkNum(int workNum) {
        this.workNum = workNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

