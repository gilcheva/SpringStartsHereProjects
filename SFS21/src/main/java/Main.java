import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var a1 = c.getBean(CommentService.class);
        var b1 = c.getBean(UserService.class);

        boolean p = a1.getCommentRepository()==b1.getCommentRepository();

        System.out.println(p);
    }
}
