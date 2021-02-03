package com.maxkram;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, s, j, p;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array:");
        s = sc.nextInt();

        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.print("All prime numbers are:");

        for (i = 0; i < s; i++) {
            j = 2;
            p = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                System.out.print(" " + arr[i] + ", ");
            }
        }

    }

}
