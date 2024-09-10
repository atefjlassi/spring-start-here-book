package spring.start.here.controllers.services;

import org.springframework.stereotype.Component;
import spring.start.here.model.Comment;
import spring.start.here.proxies.CommentNotificationProxy;
import spring.start.here.repositories.CommentRepository;

@Component
public class CommentService {

  private final CommentRepository commentRepository;
  private final CommentNotificationProxy commentNotificationProxy;

  public CommentService(CommentRepository commentRepository,
    CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
