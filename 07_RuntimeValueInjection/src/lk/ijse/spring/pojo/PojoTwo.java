/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 10:09 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoTwo implements InitializingBean {

    @Value("Panadura")
    private String address;
    public PojoTwo() {
        System.out.println("PojoTwo : Default Constructor");
//        System.out.println(address);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(address);
    }
}
