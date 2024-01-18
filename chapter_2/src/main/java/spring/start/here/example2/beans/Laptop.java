package spring.start.here.example2.beans;


import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private String type = "thinkpad";

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return
      "Laptop : " + type ;
  }
}
