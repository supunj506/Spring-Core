/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 9/30/2024 (Monday)
 * Time    : 9:23 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DBConnection {
    public Connection getData(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "1234");
            return connection;
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.err.println(e);
            throw new RuntimeException(e);
        }
    }


}
