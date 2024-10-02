/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/2/2024 (Wednesday)
 * Time    : 3:24 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BasicDataSource implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public BasicDataSource() {
        System.out.println("BasicDataSource : Instantiated ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BasicDataSource : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BasicDataSource : Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BasicDataSource : Application Context Aware ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BasicDataSource : Initializing Bean / Ready");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BasicDataSource : Disposable Bean");
    }
}
