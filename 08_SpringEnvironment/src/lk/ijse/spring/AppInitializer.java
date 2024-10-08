/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/7/2024 (Monday)
 * Time    : 5:39 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

       /* //From the os
        System.out.println("OS Environment Properties");
        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println(key +" : "+value);
        }
*/

        /*System.out.println("\n==========================================================================\n");
        //Java Environment Variables
        System.out.println("Java Environment Properties");
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            Object value = properties.get(key);
            System.out.println(key +" : "+value);
        }
*/
    }
}
