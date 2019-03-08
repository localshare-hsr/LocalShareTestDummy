package ch.hsr.epj;

public class Printer {

  private String hello;

  public Printer() {
    hello = "Hello Fucking World!!";
  }

  public Printer(String newString) {
    hello = newString;
  }

  public String getString() {
    return hello;
  }

}
