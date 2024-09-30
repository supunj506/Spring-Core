/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 9/30/2024 (Monday)
 * Time    : 2:00 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.DBConnection;
import lk.ijse.spring.pojo.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);//there should be at least one configuration class in spring application
        context.refresh();

        SpringBean bean1 = context.getBean(SpringBean.class);
        SpringBean bean2 = context.getBean(SpringBean.class);
        bean1.test();
        System.out.println(bean1);
        System.out.println(bean2);

        DBConnection bean3 = context.getBean(DBConnection.class);
        Connection connection = bean3.getData();
        try {
            ResultSet rst = connection.prepareStatement("select * from customer").executeQuery();
            while (rst.next()) {
                System.out.println(rst.getString("id"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        context.close();    


    }
}
