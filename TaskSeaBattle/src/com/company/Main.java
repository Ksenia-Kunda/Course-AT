package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] table = new char[10][10];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = '0';
            }
        }

        table = infillV(6, 1, 4, table);
        table = infillH(4,0,3,table);
        table = infillV(0, 8, 3, table);
        table = infillV(0, 2, 2, table);
        table = infillV(8, 5, 2, table);
        table = infillH(6,6,2,table);
        table = infillH(1,4,1,table);
        table = infillH(6,3,1,table);
        table = infillH(8,9,1,table);
        table = infillH(4,9,1,table);



            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    System.out.print(table[i][j] + "\t");
                }
                System.out.println();
            }
    }

    static char[][] infillV(int x, int y, int n, char[][] mas){
        for (int i = 0; i < n; i++) {
            mas [x][y]='X';
            x++;
        }
        return mas;
    }

    static char[][] infillH(int x, int y, int n, char[][] mas){
        for (int i = 0; i < n; i++) {
            mas [x][y]='X';
            y++;
        }
        return mas;
    }
}