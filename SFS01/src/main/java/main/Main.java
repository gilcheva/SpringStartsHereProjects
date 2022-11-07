package main;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);

//        Parrot p = context.getBean("parrot1",Parrot.class);

//        Parrot p2 = context.getBean("miko",Parrot.class);
//
//        Parrot p3 = context.getBean("kikono",Parrot.class);
//
//        Parrot p4 = context.getBean("viko",Parrot.class);


        String s = context.getBean(String.class);

        Integer i = context.getBean(Integer.class);

        System.out.println(p.getName());
//        System.out.println(p2.getName());
//        System.out.println(p3.getName());
//        System.out.println(p4.getName());
        System.out.println(s);
        System.out.println(i);

    }
}
