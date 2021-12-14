import java.sql.*;

public class ll {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql,cj.jdbc.Driver");
        //oracle .jdbc.oraclediver
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gla e21","root","");
        Statement s= con.createStatement();
        ResultSet rs = s.executeQuery("select * from stu");
        while (rs.next()){
            System.out.println(rs.getInt(1) + " "+rs.getString(2));
        }
    }
}
