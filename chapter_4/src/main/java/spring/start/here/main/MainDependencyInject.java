package spring.start.here.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.config.ProjectConfiguration;
import spring.start.here.model.Comment;
import spring.start.here.services.CommentService;

public class MainDependencyInject {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
    var comment = new Comment().author("Laurentiu").text("Demo Comment");

    var commentService = context.getBean(CommentService.class);

    commentService.publishComment(comment);
  }

}
