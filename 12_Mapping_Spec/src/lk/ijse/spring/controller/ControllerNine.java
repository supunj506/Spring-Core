/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 9:21 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/nine")
public class ControllerNine {

//    @PostMapping
//    public String one(HttpServletRequest req){
//
//        System.out.println(req.getParameter("id"));
//        System.out.println(req.getParameter("name"));
//        System.out.println(req.getParameter("address"));
//        System.out.println(req.getParameter("salary"));
//        return "One invoked";
//    }

    @GetMapping
    public String get(String id,String name,String address,String salary){
        return "Get invoked "+id+" "+name+" "+address+" "+salary;
    }

    @PostMapping
    public String post(String id,String name,String address,String salary){
        return "Post invoked "+id+" "+name+" "+address+" "+salary;
    }

    @PutMapping
    public String put(String id,String name,String address,String salary){
        return "Put invoked "+id+" "+name+" "+address+" "+salary;
    }

    @DeleteMapping
    public String delete(String id,String name,String address,String salary){
        return "Delete invoked "+id+" "+name+" "+address+" "+salary;
    }
}
