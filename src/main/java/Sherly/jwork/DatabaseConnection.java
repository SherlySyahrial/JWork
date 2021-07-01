package Sherly.jwork;

/**
 *
 * @author Sherly
 * @version (10-04-2021)
 */

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * method connection untuk menginisiasi koneksi
 * @return data koneksi ke postgre
 */
public class DatabaseConnection {
    public static Connection connection() {
        Connection c = null;
        String db_name = "jwork";
        String db_user = "postgres";
        String db_password = "123456";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + db_name, db_user, db_password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }
}