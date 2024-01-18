package spring.start.here.example1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.start.here.example1.beans.Parrot;
import spring.start.here.example1.beans.Person;

@Configuration
public class ProjectConfig {

  @Bean
  public Parrot parrot() {
    Parrot p = new Parrot();
    p.setName("Koko");
    return p;
  }

  @Bean
  public Person person(Parrot parrot_) { // spring inject the parrot bean into this parameter
    Person p = new Person();
    p.setName("Ella");

    // first way:
    // wiring through method = make link between the beans with a direct method call
    // p.setParrot(parrot());

    // second way:
    // wiring through a parameter = make link between the beans through parameter ..person(Parrot parrot_)
    p.setParrot(parrot_);
    return p;
  }
}
