package spring.start.here.proxy;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import spring.start.here.model.Payment;

@Component
public class PaymentProxyRestTemplate {

  @Value("${name.service.url}")
  private String paymentsServiceUrl;
  private final RestTemplate rest;

  public PaymentProxyRestTemplate(RestTemplate rest) {
    this.rest = rest;
  }

  public Payment createPayment(Payment payment) {
    String uri = paymentsServiceUrl + "/payment";

    // step 1
    HttpHeaders headers = new HttpHeaders();
    headers.add("requestId", UUID.randomUUID().toString());

    // step 2
    HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);

    // step 3
    ResponseEntity<Payment> response = rest.exchange(uri, HttpMethod.POST, httpEntity, Payment.class);

    return response.getBody();
  }
}
