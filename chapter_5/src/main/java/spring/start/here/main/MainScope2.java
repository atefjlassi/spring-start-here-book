package spring.start.here.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.start.here.config.ProjectConfiguration;
import spring.start.here.model.Comment;
import spring.start.here.services.CommentService;
import spring.start.here.services.ProductService;

public class MainScope2 {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
    var comment = new Comment().author("Laurentiu").text("Demo Comment");

    /**
     * spring singleton scopes.
     */
    System.out.println("##### Singleton Scopes ####");

    var commentService = context.getBean(CommentService.class);
    var commentService_ = context.getBean(CommentService.class);
    boolean b1 = commentService == commentService_;
    System.out.println(b1);

    System.out.println("##### Prototype Scopes ####");
    var productService = context.getBean(ProductService.class);
    var productService_ = context.getBean(ProductService.class);

    boolean b2 = productService_ == productService;
    System.out.println(b2);

  }

}
