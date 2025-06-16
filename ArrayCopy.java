import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = new int[12];
        int[] array2 = new int[12];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <12 ; i++) {
            System.out.println("Enter the number of array");
            array1[i] = input.nextInt();

        }
        array2= array1;
        for(int num : array2){
            System.out.println(num);

        }
    }
}
