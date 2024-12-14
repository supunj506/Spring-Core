/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 11:26 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/six")
public class ControllerSix {

    @GetMapping(params = {"id","name"})
    public String one(@RequestParam String id,@RequestParam String name){
        return "One Invoked : id "+id+" name : "+name;
    }

    @GetMapping(params = {"address","salary"})
    public String two(String address,String salary){
        return "Two Invoked \n address : "+address+"\n salary  : "+salary;
    }
}
