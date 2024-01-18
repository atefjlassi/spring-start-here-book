package example5.main;

import example5.beans.Parrot;
import example5.config.ProjectConfig;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

  static List<Parrot> parrots = List.of(
    new Parrot("Parrot 1", "Orange"),
    new Parrot("Parrot 2", "Orange"),
    new Parrot("Parrot Y", "Green"),
    new Parrot("Parrot X", "Green")
  );

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(
      ProjectConfig.class);

    parrots.forEach(parrot -> {
      if (parrot.isGreen()) {
        context.registerBean("parrot_1", Parrot.class, () -> parrot,
          beanDefinition -> beanDefinition.setPrimary(true));
      }
    });

    Parrot parrot = context.getBean(Parrot.class);
    System.out.println(parrot);

  }
}
