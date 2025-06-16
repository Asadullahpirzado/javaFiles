public class ConstructorInArray {
    private String name = null;
    private int age = 0;
    public ConstructorInArray(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public static void main(String[] args) {
        ConstructorInArray[] c = {new ConstructorInArray("John", 10), new ConstructorInArray("Jane", 20),};
        System.out.print(c[0].name);
        System.out.print(c[1].name);
        System.out.print(c[0].age);
        System.out.print(c[1].age);
        ConstructorInArray[] d= new ConstructorInArray[2];

    }
}
