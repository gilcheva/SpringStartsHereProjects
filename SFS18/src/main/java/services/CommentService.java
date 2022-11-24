package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentReopository;

@Component
public class CommentService {

    private CommentReopository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentReopository commentRepository, @Qualifier("PUSH")CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
