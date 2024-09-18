package spring.start.here.service;

import org.springframework.stereotype.Service;
import spring.start.here.exception.NotEnoughMoneyException;
import spring.start.here.model.PaymentDetails;

@Service
public class PaymentService {
  public PaymentDetails processPayment() {
    throw new NotEnoughMoneyException();
  }
}