import java.sql.*;
import java.sql.SQLException;

class jdbc {
    public static void f1() throws SQLException{
        Connection con=null;
        String url="jdbc:mysql://localhost:3306/db1";
        con = DriverManager.getConnection(url, "root", "Madhu@2004");

        if(con!=null){
            System.out.println("Connection established");
        }
        String q="select * from Book";
        PreparedStatement ps = con.prepareStatement(q);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getDouble(3)+" ");
            System.out.print(rs.getString(4)+" ");
            System.out.println();
        }
    }
}
public class InsertintoDatabase {
    public static void main(String[] args) {
        try {
            jdbc.f1();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}