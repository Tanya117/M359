package unit_9;

public class Athlete {
    private String name;
    private int age;

    public Athlete(String name, int age){
        this.name=name;
        this.age=age;
    }
//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

 class TeamAthlete extends Athlete{
    private String teamName;
    private String sport;

    public TeamAthlete(String name, int age,String teamName, String sport){
        super(name,age);
        this.teamName=teamName;
        this.sport=sport;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
