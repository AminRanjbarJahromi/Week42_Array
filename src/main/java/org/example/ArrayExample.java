package org.example;

public class ArrayExample {

    private static String[] names = {"Amin", "Hamid","Mehrdad", "Mohsen"};

    public static String findName( String nameToFind){

        for(String elements : names){
            if(elements.equalsIgnoreCase(nameToFind)){
                return elements;
            }
        }
        return "No match";
    }





}
