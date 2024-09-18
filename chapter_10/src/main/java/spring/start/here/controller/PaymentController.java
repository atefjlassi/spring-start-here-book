package spring.start.here.controller;

import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.start.here.exception.NotEnoughMoneyException;
import spring.start.here.model.ErrorDetails;
import spring.start.here.model.PaymentDetails;
import spring.start.here.service.PaymentService;

@RestController
public class PaymentController {

  private final PaymentService paymentService;
  private static Logger logger = Logger.getLogger(PaymentController.class.getName());

  public PaymentController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }


  @PostMapping("/payment")
  public ResponseEntity<?> makePayment1() {
    try {
      PaymentDetails paymentDetails = paymentService.processPayment();
      return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
    } catch (NotEnoughMoneyException e) {
      ErrorDetails errorDetails = new ErrorDetails();
      errorDetails.setMessage("Not enough money to make the payment.");
      return ResponseEntity.badRequest().body(errorDetails);
    }
  }

  @PostMapping("/payment2")
  public ResponseEntity<PaymentDetails> makePayment2() {
    PaymentDetails paymentDetails = paymentService.processPayment();
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
  }

  // @GetMapping("/payment3") we can use get with request body after update HTTP spec AND IT WORK
  /**
   * Can an HTTP GET endpoint use a request body?
   * I often hear this question from students. Why is using HTTP GET with a request body
   * the subject of confusion? Before 2014, the HTTP protocol specification didn’t allow
   * a request body for HTTP GET calls. No implementation for the client or server side
   * allowed you to use a request body with an HTTP GET call.
   * The HTTP specification changed in 2014, and it now allows the use of the request
   * body with an HTTP GET call. But sometimes students find old articles on the internet
   * or read book editions that were not updated, and this seems to create confusion
   * years later.
   * You can read more details about the HTTP GET method in section 4.3.1 of the HTTP
   * specification, RFC 7231: https://tools.ietf.org/html/rfc7231#page-24.
   */
  @PostMapping("/payment3")
 public ResponseEntity<PaymentDetails> makePayment3(@RequestBody PaymentDetails paymentDetails) {
    logger.info("Received payment " + paymentDetails.getAmount());
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentDetails);
  }
}
