/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/9/2024 (Monday)
 * Time    : 9:37 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ten")
public class ControllerTen {

    @PostMapping
    public String post(CustomerDTO customerDTO){
        return "one invoked "+customerDTO.toString();
    }
}
