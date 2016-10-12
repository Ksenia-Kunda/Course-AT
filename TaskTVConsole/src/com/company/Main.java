package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] channels = {"1. ONT","2. BT","3. NTB","4. TNT","5. MIR","6. Animal Planet","7. Discovery","8. CTC","9. TV3","10. National Geographic"};
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

            choise = scanner.nextInt();
        try {
            System.out.println(channels[choise-1]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("The Channel with such number doesn't exist!");
        }

    }
}

