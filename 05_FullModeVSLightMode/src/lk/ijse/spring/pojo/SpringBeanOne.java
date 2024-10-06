/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 2:20 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne   : Instantiated ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne   : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanOne   : Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne   : Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanOne   : Initializing Bean\n");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne   : Disposable Bean ");

    }
    @Bean
    public SpringBeanTwo springBeanTwo(){
        SpringBeanThree springBeanThree1 = springBeanThree();
        SpringBeanThree springBeanThree2 = springBeanThree();
        System.out.println(springBeanThree1+"\n");
        System.out.println(springBeanThree2+"\n");

        return new SpringBeanTwo(); 
    }

    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SpringBeanThree springBeanThree(){
        return new SpringBeanThree();
    }
}
