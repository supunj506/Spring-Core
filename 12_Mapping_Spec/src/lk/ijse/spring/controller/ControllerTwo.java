/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 11/27/2024 (Wednesday)
 * Time    : 3:25 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class ControllerTwo {
    //Exact Mapping

    @GetMapping
    public String defaultGet() {
        return "defaultGet Mapping Invoked";
    }
    @GetMapping(path = "/m1")
    public String methodOne() {
        return "Get Mapping One Invoked";
    }

    @GetMapping(path = "/m2")
    public String methodTwo() {
        return "Get Mapping Two Invoked";
    }
    @GetMapping(path = "/m3")
    public String methodThree() {
        return "Get Mapping three Invoked";
    }

    // how to access the path segment value in spring
    @GetMapping(path = "/m4/seg/{value}/ijse")
    public String methodFour(@PathVariable ("value")String value){
        return "Get Mapping four invoked the path segment is : "+value;
    }

    @GetMapping(path = "/m5/seg/{value1}/{value2}")
    public String methodFive(@PathVariable String value1,@PathVariable String value2){
        return "Get Mapping five invoked the path segment is : "+value1+" & "+value2;
    }

    //validate path segment variable using regex
    @GetMapping(path = "/m6/seg/{value:[a-z]{4}}")
    public String methodSix(@PathVariable String value){
        return "Get Mapping six invoked the path segment is : "+value;
    }

    @GetMapping(path = "/m7/seg/{id:[C]{1}[0-9]{3}}")
    public String methodSeven(@PathVariable String id){
        return "Get Mapping seven invoked the path segment is : "+id;
    }
}
