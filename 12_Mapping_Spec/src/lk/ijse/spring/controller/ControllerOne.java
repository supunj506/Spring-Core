/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 11/26/2024 (Tuesday)
 * Time    : 9:59 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/one")
public class ControllerOne {

//    @GetMapping
//    public void testOn() {
//        System.out.println("Get Mapping Invoked");
//    }

    @GetMapping
    public String testOne1() {
        System.out.println("Get Mapping 1 Invoked");
        return "Get Mapping 1 was Invoked";
    }

    @GetMapping(path="/testOne2")
    public String testOne2() {
        System.out.println("Get Mapping 2Invoked");
        return "Get Mapping 2 was Invoked";
    }

//    @PostMapping
//    public void testTwo() {
//        System.out.println("Post Method Invoked");
//
//    }

    @PostMapping
    public String testTwo() {
        System.out.println("Post Method Invoked");
        return "Post Mapping was invoked";

    }

    //    @DeleteMapping
//    public void testThree() {
//        System.out.println("Delete Method Invoked");
//    }
    @DeleteMapping
    public String testThree() {
        System.out.println("Delete Method Invoked");
        return "Delete Mapping was invoked";
    }

//    @PutMapping
//    public void testFour() {
//        System.out.println("Put Method Invoked");

//    }
//    @PutMapping
//    public String testFour(){
//        System.out.println("Put Method Invoked");
//        return "Put Method Invoked";
//    }

    @PutMapping
    public boolean testFour() {
        System.out.println("Put Method Invoked");
        return false;
    }
}
