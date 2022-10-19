package org.example;

public class ArrayDemo {

    public static void main(String[] args) {

        String[] stringArray = new String[3];
        int[] number = new int[]{1, 3, 4, 5};
        char[] letters = {'s', 'e', 'k', 'r'};
        //ex1();
        //ex2();
        ex03();


    }

    public static void ex1() {
        String[] names = new String[3];
        names[0] = "feredrik";
        names[2] = " amin";
        names[1] = " ghasem pahlavoon";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names.length);
        System.out.println("......................");

    }

    public static void ex2() {
        int[] numbers = {1, 2, 3, 4, 5};
        int size = numbers.length;
        printArray(numbers);
        System.out.println("......................");
        numbers[3] = 8;
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);

        }
    }

    public static void ex03() {
        String[][] board = new String[3][3];
        board[0][0] = "x";
        board[0][1] = "y";
        board[0][2] = "z";

        board[1][0] = "a";
        board[1][1] = "b";
        board[1][2] = "c";

        board[2][0] = "p";
        board[2][1] = "q";
        board[2][2] = "r";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.println(board[i][j]);
            }

        }
    }
}
