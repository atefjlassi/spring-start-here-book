package spring.start.here.main;

import spring.start.here.model.Comment;
import spring.start.here.proxies.EmailCommentNotificationProxy;
import spring.start.here.repositories.DBCommentRepository;
import spring.start.here.controllers.services.CommentService;

public class Main {
  public static void main(String[] args) {
    var commentRepository = new DBCommentRepository();
    var commentNotificationProxy = new EmailCommentNotificationProxy();
    var commentService = new CommentService(commentRepository, commentNotificationProxy);

    var comment = new Comment().author("Laurentiu").text("Demo commentaire");
    commentService.publishComment(comment);
  }

}
