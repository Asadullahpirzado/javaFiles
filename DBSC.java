import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBSC {
    private static final  String URL= "jdbc:mysql://localhost:3306/java";
    private static final String Username = "root";
    private static final String password = "asad";
    public static void add(String name , String address){
        String query = "INSERT INTO student (name, address) VALUES (?, ?)";

        try(
                Connection con = DriverManager.getConnection(URL,Username,password);
                PreparedStatement preparedStatement = con.prepareStatement(query)
                ){
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.executeUpdate();
            System.out.println("Successfully input value update");


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
