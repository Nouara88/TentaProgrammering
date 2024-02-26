package TestautomatiseringOchProgrammering.inlämningsuppgift;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class MyTest {

  @Test
    public void testHto4stars() {
        //PRINTER läser in text med scanner
        //Skickar texten till Translator
        //Translator skickar tillbaka morse
        //Printer skriver ut morse

        Translator translator = new Translator();

        String testdata = "H";

        String expected = "****";

        String actual = translator.getMorse(testdata);

        assertEquals(expected, actual);

    }

    @Test
    public void testInvalidInputHandling() {

        Translator translator = new Translator();

        String testInput = "";

        String result = translator.handleInput(testInput);

        assertEquals("Null input or empty string detected.", result);
    }

    @Test

    public void testMoToN() {

        Translator translator = new Translator();

        String testdata = "-*";

        String expected = "N";

        String actual = Translator.getEng(testdata);

        assertEquals(expected, actual);
    }}

