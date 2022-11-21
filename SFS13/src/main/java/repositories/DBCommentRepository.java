package repositories;

import model.Comment;

public class DBCommentRepository implements CommentReopository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
