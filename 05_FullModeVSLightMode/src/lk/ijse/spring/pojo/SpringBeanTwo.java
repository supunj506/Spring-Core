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
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo   : Instantiated ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanTwo   : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanTwo   : Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanTwo   : Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanTwo   : Initializing Bean\n");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanTwo   : Disposable Bean ");

    }

}
