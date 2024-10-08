/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/7/2024 (Monday)
 * Time    : 5:40 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@PropertySource("classpath:application.properties")
@PropertySource("classpath:config.properties")
public class AppConfig {

}
