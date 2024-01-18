package example1.main;

import example1.beans.Parrot;
import example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // create an instance of spring context

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Parrot parrot = context.getBean(Parrot.class);
    System.out.println(parrot.getName());

    String string = context.getBean(String.class);
    Integer integer = context.getBean(Integer.class);

    System.out.println(string+ " - "+ integer);

  }

}
