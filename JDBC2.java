import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC2 {
    //                                "jdbc:mysql://localhost:3306/asad"
    private static final String URL = "jdbc:mysql://localhost:3306/asad";
    private static final String USER="root";
    private static final String PASSWORD= "asad";
    public static void ADD(String name , String de){
        String sql= "INSERT INTO A (name, department) values (?,?)";
        try (Connection con= DriverManager.getConnection(URL,USER,PASSWORD);
             PreparedStatement p = con.prepareStatement(sql)
        ){
            p.setString(1,name);
            p.setString(2,de);
            p.executeUpdate();

        } catch (Exception e) {
            System.out.println("Connection Fail");
            e.printStackTrace();
        }
    }
    public static void Update(int id, int age ){
        String sql = "Update a set age =? where id = ?";
        try(Connection con = DriverManager.getConnection(URL,USER,PASSWORD)){
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1,age);
            p.setInt(2,id);
            p.executeUpdate();

        }catch(Exception e ){
            System.out.println("Fail");
        }
    }
    public static void Result (){
        String Sql = "Select * from a";
        try(Connection con= DriverManager.getConnection(URL,USER,PASSWORD)){
            PreparedStatement p=con.prepareStatement(Sql);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                System.out.println("ID "+rs.getInt("id"));
                System.out.println("Name "+rs.getString("name"));
                System.out.println("Age "+rs.getInt("age"));
                System.out.println("Department "+rs.getString("department"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
