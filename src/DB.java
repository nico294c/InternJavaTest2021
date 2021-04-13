import java.sql.*;

public class DB {

    public static int insertCategoryRecord(String bikeType, String categoryName){
        int rows = 0;
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=DB_Bikes",
                "sa", "1234");

        PreparedStatement ps =con.prepareStatement("insert into tbl_category values('" + bikeType + "', " +
                "'" + categoryName +"')");

        rows = ps.executeUpdate();

        ps.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return rows;
    }

}
