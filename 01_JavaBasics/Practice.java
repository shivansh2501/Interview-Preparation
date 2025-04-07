import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++) {

            arr[i] = sc.nextInt();

        }

        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {

            prefixSum[i] = prefixSum[i - 1] + arr[i]; 

        }

        printArray(prefixSum);

    }

    public static void printArray(int[] arr) {

        for(int i = 0 ; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");

        }

    }
    
}
