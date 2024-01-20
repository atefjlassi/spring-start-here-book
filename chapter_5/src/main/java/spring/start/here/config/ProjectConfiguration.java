package spring.start.here.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring.start.here.services.ProductService;

@Configuration
@ComponentScan(
  basePackages = {"spring.start.here.repositories", "spring.start.here.services"}
)
public class ProjectConfiguration {


  // DECLARING PROTOTYPE-SCOPED BEANS WITH @BEAN
  @Bean
  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
  public ProductService productService() {
    return new ProductService();
  }
}