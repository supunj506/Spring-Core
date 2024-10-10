/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/9/2024 (Wednesday)
 * Time    : 3:37 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig  : Instantiated ");
    }
}
