public class MainEmployee {
    public static void main(String[] args) {
        Employee41[] employee41s= {new Employee41("Robert", 3000 ,1999, "64C- WallsStrea")
                ,new Employee41("Sam ",5000,2000 ,"68D- WallsStreat"),
                new Employee41("John" ,7900,1999 ,"26B- WallsStreat")
        };
        System.out.println("Name\tsalary\tYear of joining\t Address");
        for (int i=0; i < employee41s.length;i++){
            System.out.print(employee41s[i].getName()+"\t");
            System.out.print(employee41s[i].getSalary()+"\t     ");
            System.out.print(employee41s[i].getJoinYear()+"\t\t");
            System.out.print(employee41s[i].getAddree()+"\t");
            System.out.println();

        }
    }
}
