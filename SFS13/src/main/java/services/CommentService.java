package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentReopository;

public class CommentService {

    private final CommentReopository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentReopository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
