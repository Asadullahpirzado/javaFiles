public class ArraySort {
    public static void main(String[] args) {
        int[] myArray = {34, 56, 35, 6, 590, 7, 75, 7, 15, 1, 2, 3, 5};

        for (int i = 0; i <myArray.length-1 ; i++) {
            for (int j = 0; j <myArray.length-1-i ; j++) {
                if (myArray [j]>myArray[j+1]) {
                    int temp=myArray[j+1];
                    myArray[j+1]=myArray[j];
                    myArray[j]= temp;
                }

            }

        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
