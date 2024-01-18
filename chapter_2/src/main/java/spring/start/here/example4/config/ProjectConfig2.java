package spring.start.here.example4.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.start.here.example4.bean.Parrot;
import spring.start.here.example4.bean.Person;

@Configuration
public class ProjectConfig2 {

  @Bean
  public Parrot parrot1() {
    Parrot p = new Parrot();
    p.setName("Koko");
    return p;
  }

  @Bean
  public Parrot parrot2() {
    Parrot p = new Parrot();
    p.setName("Miki");
    return p;
  }

  @Bean
  public Person person(@Qualifier("parrot1") Parrot parrot) { // Using the @Qualifier annotation, you clearly mark your intention to inject a specific bean from the context.
    Person p = new Person();
    p.setName("Ella");
    p.setParrot(parrot);
    return p;
  }
}
