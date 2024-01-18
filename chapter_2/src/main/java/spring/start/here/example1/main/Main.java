package spring.start.here.example1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.example1.beans.Parrot;
import spring.start.here.example1.beans.Person;
import spring.start.here.example1.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = context.getBean(Person.class);
    Parrot parrot = context.getBean(Parrot.class);

    System.out.println("Person's name: " + person.getName());
    System.out.println("Parrot's name: " + parrot.getName());
    System.out.println("Person's parrot: " + person.getParrot());

    // to be continued from the page number 60, 3.2 section Using the @Autowired annotation to inject beans
  }

}
