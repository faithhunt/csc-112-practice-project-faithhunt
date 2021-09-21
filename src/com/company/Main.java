package com.company;

public class Main {

    public static void main(String[] args) {
        import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                Random rnd = new Random(14);
                int[] ar = new int[20];
                for (int i = 0; i < ar.length; i++) {
                    ar[i] = rnd.nextInt(100) + 1;
                }
                print(ar);
                System.out.println();
                System.out.println("Bubblesort");
                bubbleSort(ar);
                print(ar);
       /*for (int i = 0; i < ar.length; i++) {
           ar[i] = rnd.nextInt(100) + 1;
       }
       System.out.println();
       System.out.println("Insertion sort");
       print(ar);
       insertionSort(ar);
       print(ar);*/

            }

            public static void insertionSort(int[] arr) {
                    int n = arr.length;
                    for (int i = 1; i < n; ++i) {
                        int numToPlace = arr[i];
                        int j = i - 1;
                        while (j >= 0 && arr[j] > numToPlace) {
                            arr[j + 1] = arr[j];
                            j = j - 1;
                        }
                        arr[j + 1] = numToPlace;
                    }
                }

            }

            public static void bubbleSort(int[] arr) {
                for (int i = 0; i < arr.length - 1; i++) {

                    for (int j = 0; j < arr.length - 1 - i; j++) {
                        int indexOfLargest = 0;
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                        if (arr[j] > arr[j + 1]) {
                            indexOfLargest = j;

                        }
                    }
           /*swap
           int temp = arr[indexOfLargest];
           arr[indexOfLargest] = arr[arr.length - 1 - i];*/
                }
            }

            public static void print ( int[] arr){
                for (int i = 0; i < arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }
}
