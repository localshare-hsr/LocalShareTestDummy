package ch.hsr.epj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrinterTest {

  @Test
  void testDefaultConstructor() {
    Printer printer = new Printer();
    assertEquals("Hello World!", printer.getString());
  }

  @Test
  void testCustomConstructor() {
    Printer printer = new Printer("Hello HSR");
    assertEquals("Hello HSR", printer.getString());
  }

}