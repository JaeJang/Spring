package demotwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTwo.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoach2 = context.getBean("myCoach", Coach.class);

        TrackCoach trackCoach = context.getBean("myCoach2", TrackCoach.class);

        SportCoach sportCoach = context.getBean("sportCoach", SportCoach.class);
        SportCoach sportCoach2 = context.getBean("sportCoach", SportCoach.class);

        System.out.println(theCoach.foo());
        System.out.println(theCoach.getTestMethod());

        System.out.println(trackCoach.getTestMethod());
        System.out.println(trackCoach.getEmailAndTeam());

        System.out.println(sportCoach.getEmailAndTeam());

        System.out.println(sportCoach == sportCoach2);
        System.out.println(sportCoach);
        System.out.println(sportCoach2);

        System.out.println(theCoach == theCoach2);
        System.out.println(theCoach);
        System.out.println(theCoach2);
        context.close();
    }
}
