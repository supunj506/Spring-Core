/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/8/2024 (Tuesday)
 * Time    : 7:41 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {

    @Value("${db.user.name}")
    private String userName;

    @Value("${db.user.password}")
    private String password;

    @Value("${db.user.url}")
    private String url;

    @Autowired
    Environment env;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(url);
//        System.out.println(env.getProperty("mkmkd"));

//        String url1 = env.getRequiredProperty("url");
//        System.out.println(url1);


    }
}
