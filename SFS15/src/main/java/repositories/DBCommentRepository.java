package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentReopository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
