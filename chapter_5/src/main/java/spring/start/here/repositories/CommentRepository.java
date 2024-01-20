package spring.start.here.repositories;

import org.springframework.stereotype.Repository;
import spring.start.here.model.Comment;

/**
 * DECLARING PROTOTYPE-SCOPED BEANS USING STEREOTYPE ANNOTATIONS
 * @Scope(BeanDefinition.SCOPE_PROTOTYPE)
 */
@Repository
public interface CommentRepository {

  void storeComment(Comment comment);

}
