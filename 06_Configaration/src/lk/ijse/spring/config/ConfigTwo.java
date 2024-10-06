/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 9:22 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SBeanThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigTwo {
    public ConfigTwo() {
        System.out.println("ConfigTwo  : Instantiated ");
    }

    @Bean
    public SBeanThree sBeanThree(){
        return new SBeanThree();
    }
}
