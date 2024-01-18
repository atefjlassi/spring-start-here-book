package spring.start.here.proxies;

import org.springframework.stereotype.Component;
import spring.start.here.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
