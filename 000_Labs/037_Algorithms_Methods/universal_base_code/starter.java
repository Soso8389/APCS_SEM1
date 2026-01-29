import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {

        int[] arr = new int[((int)(Math.random() * 150) + 51)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 100) + 1);
        }

        toStringArray(arr);

        printMin(arr);
        printMax(arr);
        printAverage(arr);
    }

    public static void toStringArray(int arr[]) {
        System.out.println("The elements are:");
        System.out.println("________________________________________");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("________________________________________");
    }

    public static int getAVG(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int getMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // NEW METHODS BELOW

    public static void printMin(int arr[]) {
        System.out.println("Minimum: " + getMin(arr));
    }

    public static void printMax(int arr[]) {
        System.out.println("Maximum: " + getMax(arr));
    }

    public static void printAverage(int arr[]) {
        System.out.println("Average: " + getAVG(arr));
    }
}
