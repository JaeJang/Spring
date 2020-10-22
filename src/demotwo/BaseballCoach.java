package demotwo;


public class BaseballCoach implements Coach {

    private final TestService testService;

    public BaseballCoach(TestService testService) {
        this.testService = testService;
    }

    public String foo() {
        return "Baseball Foo";
    }

    @Override
    public String getTestMethod() {
        return testService.testMethod();
    }

}
