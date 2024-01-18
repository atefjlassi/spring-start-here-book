package spring.start.here.repositories;

import org.springframework.stereotype.Component;
import spring.start.here.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository{

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: "+ comment.getText());
  }
}
