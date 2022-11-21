import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Gal");
        comment.setText("testing comment");

        commentService.publishComment(comment);
    }
}
