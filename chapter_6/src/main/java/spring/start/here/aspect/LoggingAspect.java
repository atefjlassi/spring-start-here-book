package spring.start.here.aspect;

import java.util.Arrays;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import spring.start.here.model.Comment;
@Aspect
public class LoggingAspect {

  private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

  // without annotation @ToLog
    @Around("execution(* spring.start.here.service.CommentService.publishComment(..))")
//  @Around("@annotation(spring.start.here.annotation.ToLog)")
  public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    // aspect logic here
    logger.info("Method will execute");

    // If you don’t call proceed(), the aspect never delegates further to the intercepted method
    String methodName = joinPoint.getSignature().getName();
    Object[] arguments = joinPoint.getArgs();
    logger.info("Method " + methodName +
      " with parameters " + Arrays.asList(arguments) +
      " will execute");

    Comment comment = new Comment();
    comment.setText("Some other text!");
    Object [] newArguments = {comment};

    Object returnedByMethod = joinPoint.proceed(newArguments);// delegates to the actual intercepted method:: Calls the intercepted method
    // Object returnedByMethod = joinPoint.proceed()
    logger.info("Method executed and returned " + returnedByMethod);
    //    return returnedByMethod; "SUCCESS"
    return "FAILED";
  }
  /**
   * use annotation
   */
  @Around("@annotation(spring.start.here.annotation.ToLog)")
  public Object log2(ProceedingJoinPoint joinPoint) throws Throwable {

    logger.info("Hi IM the interceptor !!!");
    joinPoint.proceed();
    return null;
  }


  /**
   *
   * @param joinPoint
   * @throws Throwable
   *
   * in case of do not need the returned value
   */
    //  @Around("execution(* spring.start.here.service.*.*(..))")
    //  public void log(ProceedingJoinPoint joinPoint) throws Throwable {
    //    // aspect logic here
    //    logger.info("Method will execute");
    //
    //    // If you don’t call proceed(), the aspect never delegates further to the intercepted method
    //    String methodName = joinPoint.getSignature().getName();
    //    Object[] arguments = joinPoint.getArgs();
    //    logger.info("Method " + methodName +
    //      " with parameters " + Arrays.asList(arguments) +
    //      " will execute");
    //    // page 137
    //    joinPoint.proceed();// delegates to the actual intercepted method:: Calls the intercepted method
    //
    //    logger.info("Method executed");
    //  }

}
