package spring.start.here.example2.beans;

import org.springframework.stereotype.Component;

@Component
public class TV {

  private String type = "Samsung";

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "TV: " + type;
  }
}
