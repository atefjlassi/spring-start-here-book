package spring.start.here.example3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Person {

  private String name = "John";

  private final Parrot parrot;

  @Autowired
  @Lazy
  public Person(Parrot parrot) {
    this.parrot = parrot;
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
    return "Person{" + "name='" + name + '\'' + ", parrot=" + parrot + '}';
  }
}