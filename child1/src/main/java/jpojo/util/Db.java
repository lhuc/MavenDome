package jpojo.util;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sing on 2018/8/5.
 * desc:
 */
public class Db {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    static {
        driver = "com.mysql.jdbc.Driver";
        url ="jdbc:mysql://localhost:3306/muke";
        username = "root";
        password ="root";
    }

    public static Connection open(){
        try {
            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            return (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
        }

    public static Connection close(Connection conn) {
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return conn;
    }

}
