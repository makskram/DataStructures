package com.maxkram;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter size of array bigger than 1:");
        Scanner userInputEntry = new Scanner(System.in);
        int inputLength =userInputEntry.nextInt();
        int[] intArray = new int[inputLength];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 1 + (int) (Math.random() * 100);
            System.out.print(intArray[i]);
        }

    }




}
