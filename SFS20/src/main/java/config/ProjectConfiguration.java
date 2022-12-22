package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.CommentService;

@Configuration
public class ProjectConfiguration {

    @Bean
    public CommentService service(){
        return new CommentService();
    }
}
