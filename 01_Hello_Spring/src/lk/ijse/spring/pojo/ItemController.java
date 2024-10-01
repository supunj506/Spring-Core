/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 9/30/2024 (Monday)
 * Time    : 10:39 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component("item")
public class ItemController {
    public ItemController() {
        System.out.println("ItemController : Instantiated ");
    }
    public void getItem(){
        System.out.println("get Item Working");
    }
}
