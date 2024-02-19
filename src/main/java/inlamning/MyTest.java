
package inlamning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTest {

    @Test
    public void testHto4stars() {

        TestTranslator translator = new TestTranslator();

        String testdata = "H";

        String expected = "****";

        String actual = TestTranslator.getMorse(testdata);

        assertEquals(expected, actual);

    }

    @Test
    public void testNullInputHandling() {

        TestTranslator translator = new TestTranslator();

        String testInput = " ";

        translator.handleInput(testInput);
    }

    @Test

    public void testMoToN() {

        TestTranslator translator = new TestTranslator();

        String testdata = "-*";

        String expected = "N";

        String actual = TestTranslator.getEng(testdata);

        assertEquals(expected, actual);
    }}

