package main;

import beans.Parrot;
import config.ProjectConfig;
import beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot1",Parrot.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Parrot's name: " + parrot);
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
