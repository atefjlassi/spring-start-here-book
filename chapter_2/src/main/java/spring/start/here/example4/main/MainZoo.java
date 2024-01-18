package spring.start.here.example4.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.example4.bean.Zoo;
import spring.start.here.example4.config.ProjectConfig3Zoo;

public class MainZoo {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig3Zoo.class);
    var p = context.getBean(Zoo.class);
    System.out.println("Zoo's name: " + p.getName());
    System.out.println("Zoo's parrot: " + p.getParrot());
  }

}
