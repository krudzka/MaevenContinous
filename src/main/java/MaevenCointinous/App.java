package MaevenCointinous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Hello world!
 */
public class App {
    public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " "};
    public static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|"};

    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("Nie podano parametru wejściowego");
            System.exit(1);
        }
        String text = args[0];

        String[] letters = text.split("");


        StringBuilder morseTextBuilder = new StringBuilder();
        for (String letter : letters) {
            morseTextBuilder.append(translateToMorse(letter));
            morseTextBuilder.append("/");
        }

        String morseText = morseTextBuilder.toString();
        System.out.println(morseText);
    }

    public static String translateToMorse(String letter){
        letter = letter.toLowerCase();

        for (int i = 0; i < alpha.length; i++) {
            if(letter.equals(alpha[i])){
                return morse[i];
            }
        }

        return "  ";
    }
}