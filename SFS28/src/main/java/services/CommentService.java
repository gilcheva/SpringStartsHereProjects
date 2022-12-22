package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentProcessor p;

    public void sendComment(Comment c) {

        p.setComment(c);
        p.processComment();
        p.validateComment();
        c = p.getComment();

        //do something further

    }
}

