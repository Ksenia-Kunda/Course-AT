package musical_Instrument;

import hand.Hand;

import java.util.Scanner;

/**
 * Created by Ksenia on 15.10.2016.
 */
public class Piano extends MusicalInstrument {

    private String aKey[] = {"ДО", "ДО#", "PЕ", "PE#", "МИ", "ФА", "ФА#", "СОЛЬ", "СОЛЬ#", "ЛЯ", "ЛЯ#", "СИ"};

    public void playASound(int hand) {
        Scanner scanner;
        String left = "Выберите цифру от 1 до 6";
        String right = "Выберите цифру от 7 до 12";

        if (hand == 1) {
            System.out.println(left);
            playLeft();
        }
        if (hand == 2) {
            System.out.println(right);
            playRight();
        }
        if (hand == 3) {
            System.out.println(left);
            System.out.println(right);
            playLeft();
            playRight();
        }
    }


    public String play(int note) {
        return aKey[note - 1];
    }

    public void playLeft() {
        Scanner scanner;
        String massage2 = "Невозможно сыграть такую ноту";
        scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int note = scanner.nextInt();
            if (note < 7 && note > 0) {
                System.out.println(play(note));
            } else {
                System.out.println(massage2);
            }
        }
    }

    public void playRight() {
        Scanner scanner;
        String massage2 = "Невозможно сыграть такую ноту";
        scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int note = scanner.nextInt();
            if (note < 13 && note > 6) {
                System.out.println(play(note));
            }else {
                System.out.println(massage2);
            }
        }
    }
}
