package spring.start.here.example2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.example2.beans.Person;
import spring.start.here.example2.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Person p = context.getBean(Person.class);
    System.out.println("Person's name: " + p.getName());
    System.out.println("Person's parrot: " + p.getParrot());
    System.out.println("Person's laptop: " + p.getLaptop());
    System.out.println("Person's TV: " + p.getTv());
  }
}