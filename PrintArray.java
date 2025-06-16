public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {3,4,6,3,7,8,5,3,2,4};
        int j=0;
        System.out.println("Element   value       his");
        for(int num : arr){
            System.out.print(j+"\t\t"+num+"\t\t");
           // System.out.println("");
            for (int i = 0; i <num ; i++) {
                System.out.print("*");


            }
            System.out.println("");
            j++;

        }
    }
}
