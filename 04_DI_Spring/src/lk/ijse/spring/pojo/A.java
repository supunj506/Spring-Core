/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/2/2024 (Wednesday)
 * Time    : 3:43 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class A implements DI,BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

//    @Autowired
//    @Qualifier("b")
    private BSuper m;

//    @Autowired
//    public A(BSuper bb) {
//        this.m=bb;
//        System.out.println("A : Instantiated ");
//    }


//    @Autowired
////    @Qualifier("c")
//    public void setInjection(BSuper b){
//        this.m=b;
//    }
    public void sendRequest() {
        m.callMe();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("A : Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("A : Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("A : Application Context Aware ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("A : Initializing Bean / Ready\n");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("A : Disposable Bean");
    }

    @Autowired
@Qualifier("b")
    @Override
    public void setInjection(BSuper b) {
        this.m=b;
    }
}
