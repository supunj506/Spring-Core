/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/13/2024 (Friday)
 * Time    : 11:18 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @PostMapping
    public ResponseUtil saveItem(@RequestBody ItemDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("200","save item",dto.toString());
    }
    @GetMapping
    public ResponseUtil getItems(){
        ArrayList<ItemDTO> allItem = new ArrayList<>();

        allItem.add(new ItemDTO("P001","basmathi",350,10000));
        allItem.add(new ItemDTO("P002","Samahan",100,400));
        allItem.add(new ItemDTO("P003","Maari",200,10000));
        allItem.add(new ItemDTO("P004","Suger",210,50000));
        allItem.add(new ItemDTO("P005","red Rice",240,10000));

        return new ResponseUtil("200","done",allItem);
    }

    @DeleteMapping
    public ResponseUtil deleteItem(String code){
        System.out.println(code);
        return new ResponseUtil("200","delete done",code +" Item Deleted !");
    }

    @PutMapping
    public ResponseUtil updateItem(@RequestBody ItemDTO dto){
        System.out.println(dto.toString());
        return new ResponseUtil("200","update done",dto.getCode()+" item update as "+dto.toString());
    }
}
