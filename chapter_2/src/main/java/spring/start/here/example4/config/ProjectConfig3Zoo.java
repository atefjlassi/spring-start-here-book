package spring.start.here.example4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.start.here.example4.bean.Parrot;

@Configuration
@ComponentScan(basePackages = "spring.start.here.example4.bean")
public class ProjectConfig3Zoo {

  @Bean
  public Parrot parrot1() {
    Parrot p = new Parrot();
    p.setName("Koko");
    return p;
  }

  @Bean
  public Parrot parrot2() {
    Parrot p = new Parrot();
    p.setName("Miki");
    return p;
  }
}
