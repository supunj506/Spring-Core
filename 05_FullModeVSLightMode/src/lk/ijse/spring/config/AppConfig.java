/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 2:14 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.config;

import lk.ijse.spring.pojo.SpringBeanThree;
import lk.ijse.spring.pojo.SpringBeanTwo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
//@ComponentScan(basePackageClasses = {SpringBeanOne.class})
public class AppConfig {

//    @Bean
//    public SpringBeanTwo springBeanTwo(){
//        SpringBeanThree springBeanThree1 = springBeanThree();
//        SpringBeanThree springBeanThree2 = springBeanThree();
//        System.out.println(springBeanThree1+"\n");
//        System.out.println(springBeanThree2+"\n");
//
//        return new SpringBeanTwo();
//    }
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public SpringBeanThree springBeanThree(){
//        return new SpringBeanThree();
//    }



}
