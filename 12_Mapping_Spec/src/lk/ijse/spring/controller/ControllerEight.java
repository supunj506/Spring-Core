/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 8:45 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eight")
public class ControllerEight {
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String one(){
        return "One invoked";
    }

    @GetMapping(produces = {"text/html"})
    public String two(){
        return "Two invoked";
    }

    @GetMapping(headers = {"Content-Type=application/json","Accept=text/html"})
    public String three(){
        return "Three Invoked";
    }
}
