package inlamning;

import java.util.Scanner;

public class Printer {

    public static void main(String[] args) {

        // Variabel för att kontrollera om översättningen ska fortsätta eller avslutas
        boolean continueTranslate = true;

        // Loop för att fortsätta översättningen tills användaren väljer att avsluta
        while (continueTranslate) {


            // Skriv ut huvudmenyn för översättningen
            System.out.println("Would you like to " + "1.Translate from English to Morse-code or " +
                    "2.Translate from Morse-code to English, or write exit to end the program");

            // Skapa en scanner för att läsa användarens inmatning
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine().toUpperCase();

            // Kontrollera om användaren har valt att avsluta programmet
            if (userInput.equalsIgnoreCase("EXIT")) {
                System.out.println("Exiting the program ... ");
                break;
            }

            // Hantera användarens val baserat på inmatningen
            switch (userInput) {

                case "1":
                    // Skapa en instans av TranslatorEngMor
                    System.out.println("Write the English text you want to translate to Morse-code " + "or type Exit to go to the main options");
                    Translator translatorETM = new Translator();
                    translatorETM.getEngToMorseTranslator(); // Anropa metoden för att översätta från engelska till morsekod
                    break;

                case "2":
                    // Skapa en instans av TranslatorMorEng
                    System.out.println("Write the Morse-code you want to translate to English " + "or type Exit to go to the main options");
                    Translator translatorMTE = new Translator();
                    translatorMTE.getMorToEngTranslator(); // Anropa metoden för att översätta från morsekod till engelska
                    break;

                default:
                    // Felhantering för ogiltig inmatning
                    System.out.println("Invalid input. Please choose 1, 2, or 3");
                    break;
            }
        }
    }
}