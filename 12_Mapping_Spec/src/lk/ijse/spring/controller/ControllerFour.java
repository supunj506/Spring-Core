/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 11:01 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/four")
public class ControllerFour {

    @GetMapping
    public String defaultMethod(){
        return "Default Method";
    }

    @GetMapping(path = "/a/*/last")
    public String one(){
        return "One Invoked";
    }

    @GetMapping(path = "/a/b/*/last")
    public String two(){
        return "Two Invoked";
    }
}
