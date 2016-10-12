package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 5)используя условный оператар реализовать общение

        System.out.println("Hello, type your sex: female/male");
        String sexFemale="female";
        String sexMale="male";
        String answer="";
        boolean b=false;

        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine().toLowerCase();
                if (sexFemale.equals(answer)) {
                    System.out.println("Let's go to a cinema");
                    b=true;
                } else {
                    if (sexMale.equals(answer)) {
                        System.out.println("Let's go to play football");
                        b=true;
                    } else {
                        System.out.println("Incorrect sex. Please try again");
                    }
                }
            }

        }while (b==false);



    }
}



