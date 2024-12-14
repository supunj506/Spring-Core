/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/13/2024 (Friday)
 * Time    : 12:36 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring.controller")
@EnableWebMvc
public class WebAppConfig {
}
