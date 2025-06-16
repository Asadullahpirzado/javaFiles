import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class JDBC {
    private final static String URL = "jdbc:mysql://localhost:3306/asad";
    private final static String URES = "root";
    private final static String Password = "asad";
   public static void addName(){
       try(Connection connection = DriverManager.getConnection(URL,URES,Password);
               Scanner input = new Scanner(System.in)){
           String sql= "insert into a(name, age, department) values (?,?,?)";

           System.out.println("Enter the name :");
           String name = input.next();
           System.out.println("Enter the age :");
           int age = input.nextInt();
           System.out.println("Enter the department :");
           String de = input.next();
           PreparedStatement preparedStatement= connection.prepareStatement(sql);
           preparedStatement.setString(1,name);
           preparedStatement.setInt(2,age);
           preparedStatement.setString(3,de);
           preparedStatement.executeUpdate();
           System.out.println("Add successfully ");
       }catch(Exception exception){
           System.out.println("Connection fail");
       }
   }
   public static void Update(int id ,String name){
       String sql= "Update a set name=? where id =?";
       try(Connection connection=DriverManager.getConnection(URL,URES,Password);
           PreparedStatement p= connection.prepareStatement(sql)
         ){
           p.setString(1,name);
           p.setInt(2,id);
           p.executeUpdate();
           // update a set name = asad where id =4
           System.out.println("Updated");
       } catch (Exception e) {
          // e.printStackTrace();
           System.out.println("Fail");
       }
   }
   public static void delete(int id){
       String sql = "delete from a where id=?";
       try(Connection con=DriverManager.getConnection(URL,URES,Password)){
           PreparedStatement p= con.prepareStatement(sql);
           p.setInt(1,id);
           p.executeUpdate();

       }catch(Exception e){
           System.out.println("Fail");
       }
   }
   public static void ViewInFo(){
       String sql= "Select * from a";
       try(Connection connection= DriverManager.getConnection(URL,URES,Password);
       PreparedStatement p= connection.prepareStatement(sql)
       ){
           ResultSet resultSet= p.executeQuery();
           while(resultSet.next()){
               System.out.println("Id "+resultSet.getInt("id"));
               System.out.println("Name"+resultSet.getString("name"));
               System.out.println("Department"+resultSet.getString("Department"));
           }

       }catch(Exception exception){
           exception.printStackTrace();

       }


       }



}
