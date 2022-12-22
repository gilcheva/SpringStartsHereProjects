package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}