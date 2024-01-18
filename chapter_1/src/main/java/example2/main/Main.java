package example2.main;

import example2.beans.Parrot;
import example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // create an instance of spring context

    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    /**
     * Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of
     * type 'example2.beans.Parrot' available: expected single matching bean but found 3: parrot1,parrot2,parrot3
     *
     * (remember, the method represents the bean).
     */
    Parrot parrot = context.getBean("parrot2",Parrot.class);
    System.out.println(parrot.getName());


  }

}
