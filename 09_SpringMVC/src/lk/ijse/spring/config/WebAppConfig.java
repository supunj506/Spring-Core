/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/9/2024 (Wednesday)
 * Time    : 3:33 PM
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
    public WebAppConfig() {
        System.out.println("WebAppConfig   : Instantiated ");
    }
}
