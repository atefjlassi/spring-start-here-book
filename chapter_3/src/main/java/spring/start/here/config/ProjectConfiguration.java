package spring.start.here.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
  basePackages = {"spring.start.here.proxies", "spring.start.here.services", "spring.start.here.repositories"}
)
public class ProjectConfiguration {
}