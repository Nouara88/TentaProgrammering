package inlamning;

import java.util.HashMap;
import java.util.Scanner;

// Jag skapar en Translator klass för att översätta mellan
// morsekod och engelska bokstäver
public class Translator {

    // Konstruktör för att initiera och hantera översättning mellan morsekod och bokstäver
    public Translator() {

        // Skapar en HashMap för att lagra morsekod till bokstav översättning
        HashMap<String, String> moreng = new HashMap<>();

        // Lägger till morsekod till bokstav översättningar i HashMap moreng
        // Nyckeln är morsekoden och värdet är motsvarande bokstav
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

        // Skapar en HashMap för att lagra bokstav till morsekod översättning
        HashMap<String, String> engmor = new HashMap<>();

        // Lägger till bokstav till morsekod översättningar i HashMap engmor
        // Nyckeln är bokstaven och värdet är motsvarande morsekod
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

        // Variabel som kontrollerar om programmet ska fortsätta att köra
        boolean restart = true;
        while (restart) {

            try {

                // Skapar en Scanner för att läsa inmatning från användaren
                Scanner scan = new Scanner(System.in);

                // Läser inmatning från användaren och omvandlar den till stora bokstäver
                String input = scan.nextLine().toUpperCase();

                // Om användaren skriver "EXIT", avslutar programmet
                if (input.equalsIgnoreCase("EXIT")) {
                    restart = false;
                    System.out.println("Going to the main options ... ");
                    break; }

                // Om användaren inte skriver något, meddelar programmet att det är ett felaktigt värde
                if (input.isEmpty()) {
                    System.out.println("Error, empty value! Please enter a valid input."); }

                // Om inmatningen inte finns i någon av översättningslistorna, meddelar programmet att det är ett felaktigt värde
                else if (!moreng.containsKey(input) && !engmor.containsKey(input)) {
                    System.out.println("Please enter a valid input."); }

                // Om inmatningen finns i morse till engelska översättningslistan, skriver programmet ut motsvarande bokstav
                if (moreng.containsKey(input)) {
                    System.out.println(moreng.get(input)); }

                // Om inmatningen finns i engelska till morse översättningslistan, skriver programmet ut motsvarande morsekod
                if (engmor.containsKey(input)) {
                        System.out.println(engmor.get(input)); }

                // Hantera undantag av typen IllegalArgumentException genom att skriva ut meddelandet som tillhör undantaget
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Metod för att översätta morsekod till engelska
    public void getMorToEngTranslator() {

        try {

        } catch (NullPointerException e) {

            // Om det uppstår ett undantag för null-inmatning, skriv ut ett felmeddelande
            System.out.println("Error: Null input.");
        }
    }

    public void getEngToMorseTranslator() {

        try {
        } catch (NullPointerException e) {
            // Om det uppstår ett undantag för null-inmatning, skriv ut ett felmeddelande
            System.out.println("Error: Null input.");
        }
    }
}






