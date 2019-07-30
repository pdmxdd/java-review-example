import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /*
        // Data Types
        // Primitives
        int anInteger = 5; //32 bit 2^31
        boolean aBoolean = false;
        double aDouble = 42.42; //64 bit
        long aLong = 0; //64 bit 2^63
        char aCharacter = 'a'; // one character of a string, but not a string

        // Non primitives
        String aString = "this is a string";

        ArrayList<Integer> anArrayListOfInts = new ArrayList<Integer>();
        anArrayListOfInts.add(1);
        anArrayListOfInts.add(2);
        System.out.println(anArrayListOfInts);

        // Key value pair -> a dictionary in Python; an Object (without methods) in JavaScript
        HashMap<String, String> aHashMap = new HashMap<>();
        aHashMap.put("firstName", "Paul");
        aHashMap.put("lastName", "Matthews");
        System.out.println(aHashMap);
        System.out.println(aHashMap.get("firstName"));
        aHashMap.put("firstName", "Emily");
        System.out.println(aHashMap);

        int[] anArray = new int[3]; // creates an integer array that holds three elements
        int[] anotherArray = {1, 3, 5, 7, 9}; // creates an integer array that holds 5 elements and sets them automatically

        // Casting
        int anotherInteger = 15;
        double anotherDouble = (double) anotherInteger;
        System.out.println(anotherInteger);
        System.out.println(anotherDouble);
        // end data types
         */

        /*
        // Conditionals
        // standalone if
        if(10 > 5){
            System.out.println("10 is greater than 5");
        }

        // setup
        int a = 5;
        int b = 6;
        int c = 7;

        // if else chain
        if(a > 10){
            System.out.println("variable a is greater than 10");
        }
        else {
            System.out.println("variable a is not greater than 10");
        }


        // if else if else if else chain
        if(a > b){
            System.out.println("variable a is greater than variable b");
        }
        else if(a > c){
            System.out.println("variable a is greater than variable c");
        }
        else if(b > c){
            System.out.println("variable b is greater than variable c");
        }
        else {
            System.out.println("variable c is greater than both variables a and b");
        }
        // end conditionals
        */

        /*
        // loops

        // for loop with break change break to continue
        for(int i = 0; i < 10; i++){
            if(i==5){
                break;

            }
            System.out.println(i);
        }


        // while loop
        int j = 0;
        while(j < 10){
            System.out.println(j);
            j++;
        }

        // end loops
         */

        // static methods
        //printSomething();


        /*
        // Objects
        Car aCar = new Car("Ford", "Mustang", 25.0, 10.0);
        System.out.println(aCar.getMake());
        aCar.setMpg(28.5);
        System.out.println(aCar.getMpg());

        System.out.println(aCar.getGasTankLevel());
        aCar.drive(55);
        System.out.println(aCar.getGasTankLevel());
        */
    }


    public static void printSomething() {
        System.out.println("This is something that has been printed to the console");
    }
}
