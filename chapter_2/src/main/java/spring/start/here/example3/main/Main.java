package spring.start.here.example3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.example3.beans.Person;
import spring.start.here.example3.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = context.getBean(Person.class);
    System.out.println(person);
  }

}
