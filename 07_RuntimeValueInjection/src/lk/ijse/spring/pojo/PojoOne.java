/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/6/2024 (Sunday)
 * Time    : 10:09 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoOne {
//    public PojoOne() {
//        System.out.println("PojoOne : Default Constructor");
//    }

    //    @Autowired
//    public PojoOne(@Value("Galle") String address) {
//        System.out.println("PojoOne : Instantiated "+address);
//    }
//    @Autowired
//    public PojoOne(@Value("Galle,Panadura,Kaluthara") String [] address) {
//        System.out.println("PojoOne : Instantiated "+address);
//        for (String s : address) {
//            System.out.println(s);
//        }
//    }

    @Autowired(required = false)
    public PojoOne(@Value("Galle,Panadura,Kaluthara") String[] address) {
        System.out.println("PojoOne : Instantiated one parameterised Constructor");
        for (String s : address) {
            System.out.println(s);
        }
    }

    @Autowired(required = false)
    public PojoOne(@Value("Galle,Panadura,Kaluthara") String [] address,@Value("Kamal") String name) {
        System.out.println("PojoOne : Instantiated two parameterised Constructor");
        for (String s : address) {
            System.out.println(s);
        }
    }


}
