/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 9:16 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.config.ConfigOne;
import lk.ijse.spring.config.ConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
//        ctx.register(ConfigOne.class);
//        ctx.register(ConfigTwo.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
