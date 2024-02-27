package TestautomatiseringOchProgrammering.inlämningsuppgift;

import java.util.HashMap;
import java.util.Scanner;

public class Printer {

    public static void main(String[] args) {

        // Skapa en scanner för att läsa användarens inmatning
        Scanner scan = new Scanner(System.in);

        // Variabel för att kontrollera om översättningen ska fortsätta eller avslutas
        boolean continueTranslate = true;
        // Loop för att fortsätta översättningen tills användaren väljer att avsluta
        while (continueTranslate) {

            // Skriv ut huvudmenyn för översättningen
            System.out.println("Would you like to " + "1.Translate from English to Morse-code or " +
                    "2.Translate from Morse-code to English. Write exit to end the program");

            // Spara användarens inmatning i en sträng variabel
            String userInput = scan.nextLine().toUpperCase();

            // Kontrollera om användaren har valt att avsluta programmet
            if (userInput.equals("EXIT")) {
                System.out.println("Exiting the program ... ");
                break;

            }
            // Kontrollera om användaren inte skrivit nånting
            if (userInput.isEmpty()) {
                System.out.println("Error, empty value! Please enter a valid input.");
                continue;
            }
            // Kontrollera om inmatning innehåller en av dessa tecken
            if (userInput.contains("!") || userInput.contains("½") || userInput.contains("§")) {
                System.out.println("Invalid value, write a valid value");
                continue;

            }

            // Hantera användarens val baserat på inmatningen

            switch (userInput) {

                case "1":
                    System.out.println("Write the English text you want to translate to Morse-code or type Exit to go back to the main options");
                    String input1 = scan.nextLine().toUpperCase(); // Läs in användarens inmatning
                    Translator translatorEtM = new Translator();
                    // Anropa metoden för att översätta från engelska till morsekod
                    if (input1.equals("EXIT")) {
                        System.out.println("Returning to the main options. ");
                        break;
                    }
                    System.out.println("Translated text in Morse code: " + translatorEtM.getEngToMorseTranslator(input1));
                    break;


                case "2":


                    System.out.println("Write the Morse-code you want to translate to English " + "or type Exit to go to the main options");
                    String input2 = scan.nextLine();
                    Translator translatorMtE = new Translator();
                    System.out.println("Translated text in English: " + translatorMtE.getMorToEngTranslator(input2));
                    if (input2.equals("EXIT")) {
                        System.out.println("Returning to the main options. ");
                        break;
                    }
                    break;


                default:
                    // Felhantering för ogiltig inmatning
                    System.out.println("Invalid input. Please choose 1, 2, or 3");
                    break;
            }
        }
    }

    public static String handleInput(String userInput) {
        if(userInput.isEmpty()) {

        } return null;
}}
