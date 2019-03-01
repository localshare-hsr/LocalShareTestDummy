package ch.hsr.epj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinterTest {

  @Test
  public void testDefaultConstructor() {
    Printer printer = new Printer();
    assertEquals("Hello World!", printer.getString());
  }

  @Test
  public void testCustomConstructor() {
    Printer printer = new Printer("Hello HSR");
    assertEquals("Hello HSR", printer.getString());
  }

}