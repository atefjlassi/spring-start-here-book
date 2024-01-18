package spring.start.here.example2.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

  private String name = "Ella";
  @Autowired // 1. Using Autowired through fields
  private Parrot parrot;
  private Laptop laptop;
  private TV tv;


  @Autowired // 2. Using Autowired through constructor
  public Person(TV tv) {
    this.tv = tv;
  }

  @Autowired // 3. Using Autowired through setters
  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
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

  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  public TV getTv() {
    return tv;
  }

  public void setTv(TV tv) {
    this.tv = tv;
  }
}
