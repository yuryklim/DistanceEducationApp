package TeacherSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Created by Yuriy on 24.04.2017.
 */
public class DBconnect {
    private Connection connection;
    public DBconnect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "databasenew";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String passwordDB = "yura85";
        try {
            Class.forName(driver);
            connection = DriverManager.
                    getConnection(url + dbName, username, passwordDB);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
