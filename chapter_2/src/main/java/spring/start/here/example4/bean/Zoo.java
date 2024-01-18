package spring.start.here.example4.bean;

import org.springframework.stereotype.Component;

@Component
public class Zoo {
  private String name = "Belvedère";

  private final Parrot parrot;

  public Zoo(Parrot parrot2) { // but the best way is to use @Qualifier annotation
    this.parrot = parrot2;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parrot getParrot() {
    return parrot;
  }

  @Override
  public String toString() {
    return "Zoo{" +
      "name='" + name + '\'' +
      ", parrot=" + parrot +
      '}';
  }
}
