package spring.start.here.services;

import org.springframework.stereotype.Service;
import spring.start.here.repositories.CommentRepository;

@Service
public class CommentService {

  private CommentRepository commentRepository;

  public CommentRepository getCommentRepository() {
    return commentRepository;
  }
}
