package spring.start.here.controllers.services;

import java.util.List;
import spring.start.here.model.Product;

public class ProductService {

  public List<Product> getProducts() {
    return List.of(new Product("p1", 500.0));
  }
}
