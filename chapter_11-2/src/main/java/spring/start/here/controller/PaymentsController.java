package spring.start.here.controller;

import java.util.UUID;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import spring.start.here.model.Payment;
import spring.start.here.proxy.PaymentProxyRestTemplate;
import spring.start.here.proxy.PaymentProxyWebClient;
import spring.start.here.proxy.PaymentsProxy;

@RestController
public class PaymentsController {

  private final PaymentsProxy paymentsProxy;
  private final PaymentProxyRestTemplate paymentProxyRestTemplate;
  private final PaymentProxyWebClient paymentProxyWebClient;
  private static Logger logger = Logger.getLogger(PaymentsController.class.getName());
  public PaymentsController(PaymentsProxy paymentsProxy,
    PaymentProxyRestTemplate paymentProxyRestTemplate, PaymentProxyWebClient paymentProxyWebClient) {
    this.paymentsProxy = paymentsProxy;
    this.paymentProxyRestTemplate = paymentProxyRestTemplate;
    this.paymentProxyWebClient = paymentProxyWebClient;
  }

  @PostMapping("/payment")
  public Payment createPayment(@RequestBody Payment payment) {
    String requestId = UUID.randomUUID().toString();
    logger.info("start payment from payment app..");
    Payment payment_ = paymentsProxy.createPayment(requestId, payment);
    logger.info("received payment from payment service");

    return payment_;
  }

  @PostMapping("/payment/resttemplatemode")
  public Payment createPayment2(@RequestBody Payment payment) {
    return paymentProxyRestTemplate.createPayment(payment);
  }
  @PostMapping("/payment/webclient")
  public Mono<Payment> createPayment3(@RequestBody Payment payment) {
    return paymentProxyWebClient.createPayment(UUID.randomUUID().toString(), payment);
  }


}
