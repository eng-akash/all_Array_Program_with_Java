package basicSorting;

public class selection_sort {
    public static void printSortedArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            int minPos = i;
            for (int j=i+1;j<arr.length-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
//            swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }
    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
//    main function
    public static void main(String[] args) {
        int arr[] = {4,3,2,1,5};
        printSortedArray(arr);
        printArr(arr);

    }
}
