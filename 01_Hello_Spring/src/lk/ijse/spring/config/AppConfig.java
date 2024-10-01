/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 9/30/2024 (Monday)
 * Time    : 2:02 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig  : Instantiated");
    }

    @Bean(name = "bds")
    public BasicDataSource basicDataSource(){
        return new BasicDataSource();
    }
}
