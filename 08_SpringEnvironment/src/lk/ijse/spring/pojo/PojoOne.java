/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/7/2024 (Monday)
 * Time    : 5:43 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements InitializingBean {

    //from os environment
    @Value("${USERNAME}")
    private String myLogName;

    //from java environment
    @Value("${os.name}")
    private String osName;

    @Value("${my.project}")
    private String myProjectName;

    @Value("${project.option}")
    private String option;

    public PojoOne() {
        System.out.println("\n\nPojoOne  : Instantiated\n ");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(myLogName);
        System.out.println(myProjectName);
        System.out.println(option);
    }
}
