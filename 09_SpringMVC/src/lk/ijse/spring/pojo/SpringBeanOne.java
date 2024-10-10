/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/9/2024 (Wednesday)
 * Time    : 3:39 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements DisposableBean {
    public SpringBeanOne() {
        System.out.println("SpringBeanOne  : Instantiated ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy SpringBeanOne");
    }
}
