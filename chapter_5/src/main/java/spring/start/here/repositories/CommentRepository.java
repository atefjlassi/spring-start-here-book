package spring.start.here.repositories;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import spring.start.here.model.Comment;

/**
 * DECLARING PROTOTYPE-SCOPED BEANS USING STEREOTYPE ANNOTATIONS
 * @Scope(BeanDefinition.SCOPE_PROTOTYPE)
 */
@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CommentRepository {

  void storeComment(Comment comment) {}

}
