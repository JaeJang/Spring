package demoone;

public class MyApp {

    public static void main(String[] args) {
        Coach foo = new BaseballCoach();
        Coach goo = new TrackCoach();

        System.out.println(foo.foo());
    }
}
