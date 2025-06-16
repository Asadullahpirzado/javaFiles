public class MethodsInMainClass {
    public MethodsInMainClass() {
        System.out.println("This is sum in constructor");
        System.out.println("Sum of two numbers: "+MethodsInMainClass.add(5,7));
    }
    public static void main(String[] args) {
 new MethodsInMainClass();
        System.out.println("Sum of two numbers: "+MethodsInMainClass.add(5,7));
    }
    static int add(int num1 , int num2){
        return num1 + num2;
    }
}
