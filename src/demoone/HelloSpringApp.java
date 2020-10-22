package demoone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextOne.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Assi theAssi = context.getBean("myAssi", Assi.class);

        System.out.println(theCoach.foo());
        System.out.println(theAssi.goo());

        context.close();
    }
}
