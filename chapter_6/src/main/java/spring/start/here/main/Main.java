package spring.start.here.main;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.config.ProjectConfig;
import spring.start.here.model.Comment;
import spring.start.here.service.CommentService;

public class Main {
  private static Logger logger = Logger.getLogger(Main.class.getName());
  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
    var service = c.getBean(CommentService.class);
    Comment comment = new Comment();
    comment.setText("Demo comment");
    comment.setAuthor("Natasha");
    logger.info("########### intercept publishComment ########");
    var value = service.publishComment(comment);
    logger.info(value);

    logger.info("########### intercept deleteComment ########");
    service.deleteComment(comment);
    service.editComment(comment);
    /**
     * Weaving an aspect. Instead of giving you a reference to the real bean, Spring gives
     * you a reference to a proxy object, intercepts the method calls, and manages the aspect logic.
     * eg: class spring.start.here.service.CommentService$$EnhancerBySpringCGLIB$$fcb7d2b
     */
    // System.out.println(service.getClass());
  }

}