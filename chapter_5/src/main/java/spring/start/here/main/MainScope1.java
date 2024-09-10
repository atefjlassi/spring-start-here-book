package spring.start.here.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.config.ProjectConfiguration;
import spring.start.here.controllers.services.CommentService;
import spring.start.here.controllers.services.UserService;

public class MainScope1 {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    /**
     * test if repository is the same or not
     * With and Without @Scope annotation
     */
    var commentService = context.getBean(CommentService.class);
    var userService = context.getBean(UserService.class);
    boolean b1 = commentService.getCommentRepository() == userService.getCommentRepository();
    System.out.println(b1);
  }

}
