package spring.start.here.service;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import spring.start.here.annotation.ToLog;
import spring.start.here.model.Comment;

@Service
public class CommentService {

  private Logger logger = Logger.getLogger(CommentService.class.getName());
  public String publishComment(Comment comment){
    logger.info("Publishing comment: "+comment.getText());
    return "SUCCESS";
  }

  @ToLog
  public void deleteComment(Comment comment) {
    logger.info("Deleting comment:" + comment.getText());
  }

  @ToLog
  public void editComment(Comment comment) {
    logger.info("Edit comment" + comment.getText());
  }
}
