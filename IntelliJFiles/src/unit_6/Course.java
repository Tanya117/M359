package unit_6;

public class Course {
    //instance variables
    private String teacher;
    private String grade;
    private String subject;
    private int period;

    //full constructor
    public Course(String teacher, String grade, String subject, int period) {
        this.teacher = teacher;
        this.grade = grade;
        this.subject = subject;
        this.period = period;
    }

    //partial constructor
    public Course(String subject, int period){
        this.teacher ="None";
        this.grade="-";
        this.subject= subject;
        this.period = period;
    }

    /**
     * Supplies a printout for a Course object
     * @return output for Course object
     */
    public String toString(){
        // 1.   grade   subject     teacher
        String output = "";
        output += period + ".\t" + grade;
        if (grade.length() == 1){
            output += " ";
        }
        output += "\t" + subject;
        while (output.length() < 27){
            output += " ";
        }
        output += teacher;
        return output;
    }


    //Getters and Setters

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }


}
