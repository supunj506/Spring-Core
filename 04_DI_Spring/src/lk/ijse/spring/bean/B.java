/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/2/2024 (Wednesday)
 * Time    : 3:43 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class B implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public B() {
        System.out.println("B : Instantiated ");
    }
    public void callMe(){
        System.out.println("Received the call");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("B : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("B : Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("B : Application Context Aware ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("B : Initializing Bean / Ready");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("B : Disposable Bean");
    }
}
