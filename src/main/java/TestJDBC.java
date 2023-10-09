import java.sql.*;

public class TestJDBC {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver found");

      Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "5EiT_pa$$");
        System.out.println("Connection Established");

        Statement statement = con.createStatement();
      ResultSet resultSet =  statement.executeQuery("select * from employeedetails");
   ResultSetMetaData metaData    =  resultSet.getMetaData();

        while (resultSet.next()){

            System.out.println(resultSet.getInt(1) +" "
            +resultSet.getString(2) +" "
            +resultSet.getString(3) +" "
            +resultSet.getString(4) +" "
            +resultSet.getInt(5));
        }
    }
}
