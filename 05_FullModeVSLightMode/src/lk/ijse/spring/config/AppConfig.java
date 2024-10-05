/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 2:14 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "lk.ijse.spring")
@ComponentScan(basePackageClasses = {SpringBeanOne.class})
public class AppConfig {

}
