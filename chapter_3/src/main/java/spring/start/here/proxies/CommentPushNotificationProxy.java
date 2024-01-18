package spring.start.here.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.start.here.model.Comment;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push for comment: " + comment.getText());
  }
}
