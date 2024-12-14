/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 11/26/2024 (Tuesday)
 * Time    : 6:51 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class RestControllerOne {

    @GetMapping
    public String getMethod(){
        return "Get Mapping";
    }

    @PostMapping
    public String postMapping (){
        return "Post Method Invoked";
    }
}
