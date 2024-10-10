/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 10/9/2024 (Wednesday)
 * Time    : 3:47 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping
    public String hello(){
        return "Hello Customer";
    }
}
