package demotwo;

public class SportCoach {

    private String email;

    private String team;

    public String getEmailAndTeam() {
        return this.team + " , " + this.email;
    }

    public void setEmailAddress(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
