package spring.start.here.proxies;

import spring.start.here.model.Comment;

public interface CommentNotificationProxy {

  void sendComment(Comment comment);
}
