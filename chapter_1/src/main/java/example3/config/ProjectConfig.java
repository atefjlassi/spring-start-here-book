package example3.config;

import example3.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

  @Bean(value = "Koko")
  Parrot parrot1() {
    var p = new Parrot();
    p.setName("Koko");
    return p;
  }

  @Bean(name = "Miki")
  Parrot parrot2() {
    var p = new Parrot();
    p.setName("Miki");
    return p;
  }

  @Bean("Riki")
  @Primary
  Parrot parrot3() {
    var p = new Parrot();
    p.setName("Riki");
    return p;
  }

}
