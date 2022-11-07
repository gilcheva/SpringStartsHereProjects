package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot1 (){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean (name="miko")
    @Primary
    Parrot parrot2 (){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean (value="kikono")
    Parrot parrot3 (){
        var p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean ("viko")
    Parrot parrot4 (){
        var p = new Parrot();
        p.setName("Viki");
        return p;
    }

    @Bean
    String hello() {
        return "hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
