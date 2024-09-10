package spring.start.here.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.config.ProjectConfiguration;
import spring.start.here.controllers.services.OrderService;

public class EagerLazy {

  public static void main(String[] args) {

    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    System.out.println("Before retrieving the CommentService:: Using @lazy");
    OrderService orderService = context.getBean(OrderService.class);
    System.out.println("After   retrieving the CommentService:: Using @lazy");

    System.out.println(orderService.getClass());

  }
}
