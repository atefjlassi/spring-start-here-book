package example4.main;

import example4.beans.Parrot;
import example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Parrot bean = context.getBean(Parrot.class);

    System.out.println(bean);
    System.out.println(bean.getName());
  }

}
