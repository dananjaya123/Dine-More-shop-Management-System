package lk.ijse.dinemore.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if(dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
    private DBConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost/dinmorenew","root","1234");
    }
}
