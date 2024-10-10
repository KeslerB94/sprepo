package org.example;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Algorithms algorithms = new Algorithms();
        char[] input = {'c', 'a', 't'};
        char[] reversed = algorithms.reverseArray(input);
        System.out.println(reversed); // Will print: tac
    }
}

