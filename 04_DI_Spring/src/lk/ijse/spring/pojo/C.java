/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/4/2024 (Friday)
 * Time    : 5:04 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class C implements BSuper, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public C() {
        System.out.println("C : Instantiated ");
    }

    @Override
    public void callMe() {
        System.out.println("Received the call to C");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("C : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("C : Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("C : Application Context Aware ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("C : Initializing Bean / Ready \n");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("C : Disposable Bean");
    }
}
