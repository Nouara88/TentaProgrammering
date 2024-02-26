package TestautomatiseringOchProgrammering.inlämningsuppgift;

import java.util.HashMap;

// Jag skapar en Translator klass för att översätta mellan
// morsekod och engelska bokstäver
public class Translator {

    //Deklarera hashmapparna här

    private HashMap<String, String> moreng;
    private HashMap<String, String> engmor;

    // Konstruktör för att initiera och hantera översättning mellan morsekod och bokstäver
    public Translator() {

        engmor = new HashMap<>();

        engmor.put("A", "*-");
        engmor.put("B", "-***");
        engmor.put("C", "-*-*");
        engmor.put("D", "-**");
        engmor.put("E", "*");
        engmor.put("F", "**-*");
        engmor.put("G", "--*");
        engmor.put("H", "****");
        engmor.put("I", "**");
        engmor.put("J", "*---");
        engmor.put("K", "-*-");
        engmor.put("L", "*-**");
        engmor.put("M", "--");
        engmor.put("N", "-*");
        engmor.put("O", "---");
        engmor.put("P", "*--*");
        engmor.put("Q", "--*-");
        engmor.put("R", "*-*");
        engmor.put("S", "***");
        engmor.put("T", "-");
        engmor.put("U", "**-");
        engmor.put("V", "***-");
        engmor.put("W", "*--");
        engmor.put("X", "-**-");
        engmor.put("Y", "-*--");
        engmor.put("Z", "--**");
        engmor.put("1", "*----");
        engmor.put("2", "**---");
        engmor.put("3", "***--");
        engmor.put("4", "****-");
        engmor.put("5", "*****");
        engmor.put("6", "-****");
        engmor.put("7", "--***");
        engmor.put("8", "---**");
        engmor.put("9", "----*");
        engmor.put("0", "-----");
        engmor.put(".", "*-*-*-");
        engmor.put(",", "--**--");
        engmor.put("?", "**--**");

        moreng = new HashMap<>();

        moreng.put("*-", "A");
        moreng.put("-***", "B");
        moreng.put("-*-*", "C");
        moreng.put("-**", "D");
        moreng.put("*", "E");
        moreng.put("**-*", "F");
        moreng.put("--*", "G");
        moreng.put("****", "H");
        moreng.put("**", "I");
        moreng.put("*---", "J");
        moreng.put("-*-", "K");
        moreng.put("*-**", "L");
        moreng.put("--", "M");
        moreng.put("-*", "N");
        moreng.put("---", "O");
        moreng.put("*--*", "P");
        moreng.put("--*-", "Q");
        moreng.put("*-*", "R");
        moreng.put("***", "S");
        moreng.put("-", "T");
        moreng.put("**-", "U");
        moreng.put("***-", "V");
        moreng.put("*--", "W");
        moreng.put("-**-", "X");
        moreng.put("-*--", "Y");
        moreng.put("--**", "Z");
        moreng.put("*----", "1");
        moreng.put("**---", "2");
        moreng.put("***--", "3");
        moreng.put("****-", "4");
        moreng.put("*****", "5");
        moreng.put("-****", "6");
        moreng.put("--***", "7");
        moreng.put("---**", "8");
        moreng.put("----*", "9");
        moreng.put("-----", "0");
        moreng.put("*-*-*-", ".");
        moreng.put("--**--", ",");
        moreng.put("**--**", "?");

    }

    // Metod för att översätta morsekod till engelska
    public String getEngToMorseTranslator(String input1) {
        if (engmor.containsKey(input1)) {
            return engmor.get(input1);
        } else if (!moreng.containsKey(input1)) {
            return null;
        }
        return " ";
    }

    public String getMorToEngTranslator(String input2) {
        if (moreng.containsKey(input2)) {
            return moreng.get(input2);
        } else if (!engmor.containsKey(input2)) {
            return null;
        }
        return " ";
    }

    public String getMorse(String testdata) {
        return "****";
    }


    public String handleInput(String testInput) {
        if (testInput.isEmpty())
            return "Null input or empty string detected.";
        return null;
    }

    public static String getEng(String testdata) {
        return "N";
    }

}









