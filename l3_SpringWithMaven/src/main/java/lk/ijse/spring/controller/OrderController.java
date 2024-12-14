/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/13/2024 (Friday)
 * Time    : 11:47 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OrderDetailDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    public ResponseUtil saveOrder(@RequestBody OrderDetailDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("200","Save order",dto.toString()+" has saved");
    }




}
