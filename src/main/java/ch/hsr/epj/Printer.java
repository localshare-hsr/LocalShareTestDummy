package ch.hsr.epj;

public class Printer {

  private String hello;

  public Printer() {
    hello = "Hello World!";
  }

  public Printer(String newString) {
    hello = newString;
  }

  public String getString() {
    return hello;
  }

}
