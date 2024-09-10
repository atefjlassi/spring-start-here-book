package spring.start.here.controllers.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class OrderService {

  public OrderService() {
    System.out.println("OrderService instance created !!");
  }
}
