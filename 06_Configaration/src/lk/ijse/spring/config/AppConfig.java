/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 9:16 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.pojo")
@Import({ConfigOne.class, ConfigTwo.class})
//@ImportResource("file:appconfig.xml")
//@ImportResource("classpath:appconfig.xml")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig  : Instantiated ");
    }
}
