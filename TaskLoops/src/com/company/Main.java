package com.company;

public class Main {

    public static void main(String[] args) {

        // 4) Написать программу, которая увеличивает з\п на 1000 ежемесячно
        int month = 0;
        int salary = 0;
	while (month <12){
        salary+=1000;
        month++;
        }


        month = 0;
        salary = 0;
    do {
        salary+=1000;
        month++;
    }while (month<12);


        salary = 0;
        for (int i = 0; i < 12; i++) {
            salary+=1000;
        }
    }
}
