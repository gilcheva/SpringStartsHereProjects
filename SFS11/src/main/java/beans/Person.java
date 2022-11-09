package beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Ella";

    private Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
