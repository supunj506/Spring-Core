/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 10:51 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/three")
public class ControllerThree {


    @GetMapping(path = "C??1")
    public String testOne(){
        return "testOne Invoked";
    }

/*    @GetMapping(path = "C??1")
    public String testTwo(){
        return "testTwo Invoked";
    }*/
}
