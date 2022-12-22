import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var cs1 = c.getBean(CommentService.class);

    }
}
