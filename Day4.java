import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // Insertion sort
        // for (int i = 1; i < n; i++) {
        // int temp = arr[i];
        // int j = i - 1;
        // while (j >= 0 && arr[j] > temp) {
        // arr[j + 1] = arr[j];
        // j--;
        // }
        // arr[j + 1] = temp;
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // }
        // }
        // public static void insertionSort(int[] A) {
        // for (int i = 1; i < A.length; i++) {
        // int value = A[i];
        // int j = i - 1;
        // while (j >= 0 && A[j] > value) {
        // A[j + 1] = A[j];
        // j--;
        // }
        // A[j + 1] = value;
        // }

        // printArray(A);
        // }

        // static void printArray(int[] ar) {
        // for (int n : ar) {
        // System.out.print(n + " ");
        // }
        // }

        // public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int[] ar = new int[n];
        // for (int i = 0; i < n; i++) {
        // ar[i] = in.nextInt();
        // }
        // insertionSort(ar);
        // selection sort
        // for (int i = 0; i < n - 1; i++) {
        // int minIndex = i;
        // for (int j = i + 1; j < n; j++) {
        // if (arr[j] < arr[minIndex]) {
        // minIndex = j;
        // }
        // }
        // int temp = arr[i];
        // arr[i] = arr[minIndex];
        // arr[minIndex] = temp;
        // }
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // }

        // quick sort using pivot with out using bulit in method
        // int pivot = arr[n - 1];
        // int i = 0;
        // while (i < n) {
        // for (int j = 0; j < n - 1; j++) {
        // if (arr[j] < pivot) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // i++;
        // }
        // }
        // int temp = arr[i];
        // arr[i] = arr[n - 1];
        // arr[n - 1] = temp;
        // i++;
        // }
        // for (int k = 0; k < n; k++) {
        // System.out.print(arr[k] + " ");
        // }
        // //Merge Sort without using bulitin method

        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // mergeSort(arr, 0, arr.length - 1);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

    }
}