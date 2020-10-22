package demotwo;

public class TrackCoach implements Coach {

    private TestService testService;

    private String emailAddress;
    private String team;

    @Override
    public String foo() {
        return "Track Coach Foo";
    }

    @Override
    public String getTestMethod() {
        return testService.testMethod();
    }

    public String getEmailAndTeam() {
        return this.team + " , " + this.emailAddress;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public void setEmailAddress(String email) {
        this.emailAddress = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void initMethod() {
        System.out.println("TrackCoach custom init method");
    }

    public void destroyMethod() {
        System.out.println("TrackCoach custom destroy method");
    }

}
