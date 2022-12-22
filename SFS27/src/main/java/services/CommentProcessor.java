package services;

import lombok.Getter;
import lombok.Setter;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Getter
@Setter
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;

    private Comment comment;

    public void processComment(){
        //changing the comment attribute
    }

    public void validateComment(){
        //validating and changing the comment attribute
    }

}
