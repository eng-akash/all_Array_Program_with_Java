package semester4;
import java.util.Scanner;

public class sum_Array {
    public static int printSum(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println( printSum(arr));

    }
}

