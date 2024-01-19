package semester4;

public class avgOfArray {
    public static double printAverage(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            calculate sum
            sum += arr[i];
        }
//        here calcuate average of each element
       double avg = (sum)/(arr.length);

        return avg;
    }
//    main function
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};

        System.out.println( printAverage(arr));


    }
}
