/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 11:46 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seven")
public class ControllerSeven {

    @GetMapping(consumes = {"application/json"})
    public String one(){
        return "one invoked";
    }


    @GetMapping(consumes = {"text/html"})
    public String two(){
        return "two invoked ";
    }


}
