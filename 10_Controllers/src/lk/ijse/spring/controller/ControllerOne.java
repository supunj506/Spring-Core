/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 11/26/2024 (Tuesday)
 * Time    : 6:14 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class ControllerOne {
    public ControllerOne() {
        System.out.println("ControllerOne : Instantiated");
    }
    @GetMapping
    public ModelAndView invokedMe(){
        return new ModelAndView("customer");
    }
}
