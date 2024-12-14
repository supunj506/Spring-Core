/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 11/26/2024 (Tuesday)
 * Time    : 6:39 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class ControllerTwo {
    @GetMapping
    public ModelAndView modelAndView(){
        return new ModelAndView("item");
    }
}
