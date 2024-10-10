/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/10/2024 (Thursday)
 * Time    : 10:20 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {
}
