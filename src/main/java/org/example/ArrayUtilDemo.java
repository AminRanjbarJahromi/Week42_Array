package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        //ex4();
        String[] names = new String[0];
        addNameToArray(names, "Marcus");
        addNameToArray(names, "Mehrdad");


    }
    public static void ex1(){
        String[] names ={"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"
        };
        //Arrays.sort(names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for(String name : names){
            System.out.println(name);
        }
    }
    public static void ex2(){
        int[] numbers = {900, 679, 500, 200, 89087, 35400};
        Arrays.sort(numbers);
        Scanner sc = new Scanner(System.in);
        System.out.println("search for number in the array : ");
        int input = sc.nextInt();
        int index = Arrays.binarySearch(numbers,input);
        System.out.println(index);
        if( index<0) {
            System.out.println("Data not found");
        }else{
            System.out.println(numbers[index]);
        }
    }
    public static void ex3(){
        int[] numbers = {14,13,15,16,12,12,4};
        int[] newArray = Arrays.copyOf(numbers, numbers.length+1);
        newArray[newArray.length-1] = 123;
        for( int number : newArray){
            System.out.println(number);
        }
    }
    public static void ex4(){
        char [] letter = {'J','a','v','a'};
        char[] notACopy = letter;
        char[] realCopy = Arrays.copyOf(letter,letter.length);
        letter[0] = 'H';
        for(char c : notACopy){
            System.out.print(c);
        }
        System.out.println("\n");
        System.out.println(" ........................... ");
        System.out.println("\n");

        for( char c : realCopy){

            System.out.print(c);
        }




    }
    public static void addNameToArray(String[] names,String name){
        String[] newArray = Arrays.copyOf(names,names.length + 1);
        for(String element : newArray){
            System.out.println(element);
        }


    }


}

