/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/2/2024 (Wednesday)
 * Time    : 2:43 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring;

import lk.ijse.spring.bean.SpringBeanOne;
import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean1);
        SpringBeanOne bean2 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean2);


        ctx.registerShutdownHook();

    }
}
