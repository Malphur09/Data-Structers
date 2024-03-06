package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr1[] = new int[6];
        int arr2[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);
        // Fill arr1 with elements
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ">> ");
            arr1[i] = scan.nextInt();
        }
        // Fill arr2 with elements
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("Enter element [" + (i+1) + "] [" + (j + 1) + "] >> ");
                arr2[i][j] = scan.nextInt();
            }
        }
        // Find MAX in arr1
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= max)
                max = arr1[i];
        }
        // Find MAX in arr2
        int max2 = arr2[0][0];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] >= max2)
                    max2 = arr2[i][j];
            }
        }
        System.out.println("MAX in arr1: " + max);
        System.out.println("MAX in arr2: " + max2);
        // Find MIN in arr1
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= min)
                min = arr1[i];
        }
        // Find MIN in arr2
        int min2 = arr2[0][0];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j] <= min2)
                    min2 = arr2[i][j];
            }
        }
        System.out.println("MIN in arr1: " + min);
        System.out.println("MIN in arr2: " + min2);
        // Sum of arr1 elements
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        // Sum of arr2 elements
        double sum2 = 0;
        int counter = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum2 += arr2[i][j];
                counter++;
            }
        }
        System.out.println("Sum of arr1: " + sum);
        System.out.println("Sum of arr2: " + sum2);
        // Average of arr1 elements
        double avg = sum / arr1.length;
        // Average of arr2 elements
        double avg2 = sum2 / counter;
        System.out.println("Average of arr1: " + avg);
        System.out.println("Average of arr2: " + avg2);
        // Print arr1 odd elements
        System.out.print("Odd elements in arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0)
                System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // Print arr2 odd elements
        System.out.print("Odd elements in arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                if (arr2[i][j] % 2 != 0)
                    System.out.print(arr2[i][j] + " ");
            }
        }
        System.out.println();
        // Print arr1 even elements
        System.out.print("Even elements in arr1: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0)
                System.out.print(arr1[i] + " ");
        }
        System.out.println();
        // Print arr2 even elements
        System.out.print("Even elements in arr2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                if (arr2[i][j] % 2 == 0)
                    System.out.print(arr2[i][j] + " ");
            }
        }
    }

}