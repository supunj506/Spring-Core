/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 9/30/2024 (Monday)
 * Time    : 2:00 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.BasicDataSource;
import lk.ijse.spring.pojo.ItemController;
import lk.ijse.spring.pojo.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);//there should be at least one configuration class in spring application
        context.refresh();
        /*BasicDataSource bean1 = context.getBean(BasicDataSource.class);
        BasicDataSource bean2 = context.getBean(BasicDataSource.class);
        System.out.println(bean1);
        bean1.getPool();

        System.out.println(bean2);*/
        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println(bean);

        Object springBean = context.getBean("springBean");
        System.out.println(springBean);

//        BasicDataSource bean1 = (BasicDataSource) context.getBean("basicDataSource");
//        bean1.getPool();

        ItemController item = (ItemController) context.getBean("item");
        item.getItem();

        BasicDataSource bean2 = (BasicDataSource) context.getBean("bds");
        bean2.getPool();


        context.close();    


    }
}
