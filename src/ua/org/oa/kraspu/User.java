package ua.org.oa.kraspu;

public class User {

  private String name;

  public User(String name) {
    this.name = name;
  }

  public void getUserName() {
    if (name == null) throw new IllegalArgumentException();
    else System.out.println(name);

  }
}
