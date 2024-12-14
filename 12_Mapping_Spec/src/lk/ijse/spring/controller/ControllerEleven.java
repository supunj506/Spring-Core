/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/11/2024 (Wednesday)
 * Time    : 10:58 AM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.ArgumentAware;

import java.util.ArrayList;

@RestController
@RequestMapping("/eleven")
public class ControllerEleven {

//    @PostMapping
//    public String post(@RequestBody CustomerDTO customerDTO){
//        return "post in eleven Invoked "+customerDTO.toString();
//    }

    @PostMapping
    public CustomerDTO post(@RequestBody CustomerDTO customerDTO){
        return  customerDTO;
    }

    @GetMapping
    public ArrayList<CustomerDTO> get(){
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("C001","Kamal","Panadura",50000));
        arrayList.add(new CustomerDTO("C002","Sama","Galle",34000));
        arrayList.add(new CustomerDTO("C003","Vihara","Horana",40000));
        return arrayList;
    }

}
