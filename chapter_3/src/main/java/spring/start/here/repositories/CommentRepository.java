package spring.start.here.repositories;

import spring.start.here.model.Comment;

public interface CommentRepository {

  void storeComment(Comment comment);

}
