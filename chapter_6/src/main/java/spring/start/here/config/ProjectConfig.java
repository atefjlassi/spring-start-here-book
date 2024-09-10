package spring.start.here.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import spring.start.here.aspect.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "spring.start.here.service")
@EnableAspectJAutoProxy
public class ProjectConfig {

  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}