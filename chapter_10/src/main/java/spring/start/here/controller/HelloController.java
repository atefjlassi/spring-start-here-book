package spring.start.here.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.start.here.model.PaymentDetails;

@RestController
public class HelloController {
  @GetMapping("/hello")
  public String hello() {
    return "Hello!";
  }
  @GetMapping("/ciao")
  public String ciao() {
    return "Ciao!";
  }
}