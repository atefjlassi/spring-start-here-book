package spring.start.here.example4.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.example4.bean.Person;
import spring.start.here.example4.config.ProjectConfig2;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
    Person person = context.getBean(Person.class);

    System.out.println(person);
  }

}
