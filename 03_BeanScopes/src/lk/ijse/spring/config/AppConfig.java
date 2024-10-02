/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/2/2024 (Wednesday)
 * Time    : 2:44 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import lk.ijse.spring.bean.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {


    @Bean
    @Scope("prototype")
    public BasicDataSource basicDataSource(){
        return new BasicDataSource();
    }

}
