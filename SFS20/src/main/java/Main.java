import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var a1 = context.getBean("service",CommentService.class);
        var b1 = context.getBean("service",CommentService.class);
        var c1 = context.getBean(CommentService.class);
        boolean p = a1==b1;
        boolean q = a1==c1;
        System.out.println(p);
        System.out.println(q);
    }
}
