import java.util.ArrayList;

public class ConstructorInArrayList {
    private String name = null;
    public ConstructorInArrayList(String name) {
        this.name = name;


    }
    void show() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        ArrayList<ConstructorInArrayList> myNAmes= new ArrayList<ConstructorInArrayList>();
        myNAmes.add(new ConstructorInArrayList("ASad"));
        myNAmes.add(new ConstructorInArrayList("Sad"));
        myNAmes.add(new ConstructorInArrayList("Ali"));
        for(ConstructorInArrayList a : myNAmes){
            a.show();

        }

    }
}
