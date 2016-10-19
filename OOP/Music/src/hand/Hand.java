package hand;

import java.util.Scanner;

/**
 * Created by Ksenia on 16.10.2016.
 */
public class Hand {

    private int hand;

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int handChoiсe() {
        boolean b = false;
        int hand;
        String massage = "Не правильное значение, выберите 1, 2 или 3";
        System.out.println("Какой рукой будет играть пианист?");
        System.out.println("Для левой выберите 1.\t Для правой - 2. \t Для левой и правой - 3");
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                hand = scanner.nextInt();
                if (hand > 0 && hand < 4) {
                    setHand(hand);
                    b = true;
                } else {
                    System.out.println(massage);
                }
            } else {
                System.out.println(massage);
            }
        } while (!b);
        return this.hand;
    }
}