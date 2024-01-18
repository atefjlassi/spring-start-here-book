package example3.main;

import example3.beans.Parrot;
import example3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    // Parrot parrot = context.getBean("Riki", Parrot.class);
    Parrot parrot = context.getBean(Parrot.class);
    System.out.println(parrot.getName());


  }

}
