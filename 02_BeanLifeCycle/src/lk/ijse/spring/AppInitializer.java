/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/1/2024 (Tuesday)
 * Time    : 3:45 PM
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

        SpringBeanOne bean = ctx.getBean(SpringBeanOne.class);
        System.out.println("\n"+bean+"\n");

       /* //Hooking process
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM About to Shutdown!!!");
                ctx.close();
            }
        }));*/

        //Spring Alternative for close context
        ctx.registerShutdownHook();

        SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean1);// container eka close karama bean destroy wei




    }
}
