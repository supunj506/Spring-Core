/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 9:22 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ConfigOne {
    public ConfigOne() {
        System.out.println("ConfigOne  : Instantiated ");
    }

    @Bean
    public SBeanTwo sBeanTwo(){
        return new SBeanTwo();
    }
}
