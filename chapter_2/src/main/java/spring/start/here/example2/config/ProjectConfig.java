package spring.start.here.example2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.start.here.example2.beans")
public class ProjectConfig {
}