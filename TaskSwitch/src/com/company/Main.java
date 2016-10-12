package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //6) электронное меню

        String[] menu = {"1. Горячие блюда", "2. Десерты", "3. Напитки"};
        String[] hotDish = {"1. Супы", "2. Гарниры", "3. Мясные блюда"};
        String[] soup = {"1. Борщ", "2. Куриный", "3. Грибной"};
        String[] garnish = {"1. Картофель", "2. Овощи"};
        String[] meat = {"1. Курица", "2. Говядина", "3. Свинина"};
        String[] dessert = {"1. Торт лимонный", "2. Торт с клубникой", "3. Торт шоколадный", "4. Торт с черникой"};
        String[] drinks ={"1. Чай", "2. Кофе"};
        String close = "Для выхода из меню нажмите 9";
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        do {
            System.out.println("Меню");
            System.out.println(close);
            cycle(menu.length, menu);
            choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Выберите горячее");
                        System.out.println(close);
                        cycle(hotDish.length, hotDish);
                        choice = scanner.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("Выберите суп");
                                System.out.println(close);
                               cycle(soup.length, soup);
                                choice = scanner.nextInt();
                                switch (choice){
                                    case 1:
                                        System.out.println("Вы выбрали борщ");
                                        break;
                                    case 2:
                                        System.out.println("Вы выбрали Куриный суп");
                                        break;
                                    case 3:
                                        System.out.println("Вы выбрали Грибной суп");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Выберите гарнир");
                                System.out.println(close);
                                cycle(garnish.length, garnish);
                                choice = scanner.nextInt();
                                switch (choice){
                                    case 1:
                                        System.out.println("Вы выбрали Картофель");
                                        break;
                                    case 2:
                                        System.out.println("Вы выбрали Овощи");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Выберите мясное блюдо");
                                System.out.println(close);
                                cycle(meat.length, meat);
                                choice = scanner.nextInt();
                                switch (choice){
                                    case 1:
                                        System.out.println("Вы выбрали Курицу");
                                        break;
                                    case 2:
                                        System.out.println("Вы выбрали Говядину");
                                        break;
                                    case 3:
                                        System.out.println("Вы выбрали Свинину");
                                        break;
                                }
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Выберите десерт");
                        System.out.println(close);
                        cycle(dessert.length, dessert);
                        choice = scanner.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("Вы выбрали Торт лимонный");
                                break;
                            case 2:
                                System.out.println("Вы выбрали Торт с клубникой");
                                break;
                            case 3:
                                System.out.println("Вы выбрали Торт шоколадный");
                                break;
                            case 4:
                                System.out.println(" Торт с черникой");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Выберите напиток");
                        System.out.println(close);
                        cycle(drinks.length, drinks);
                        choice = scanner.nextInt();
                        switch (choice){
                            case 1:
                                System.out.println("Вы выбрали Чай");
                                break;
                            case 2:
                                System.out.println("Вы выбрали Кофе");
                                break;
                        }
                        break;
                }
        }while (choice != 9);
    }

    static void cycle(int length, String []mas){
        for (int i = 0; i < length; i++) {
            System.out.println(mas[i]);
        }
    }
}