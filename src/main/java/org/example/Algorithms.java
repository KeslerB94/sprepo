package org.example;

public class Algorithms {

    public char[] reverseArray(char[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap the elements at left and right indices
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            // Move the pointers towards each other
            left++;
            right--;
        }
        return array;
    }
}
