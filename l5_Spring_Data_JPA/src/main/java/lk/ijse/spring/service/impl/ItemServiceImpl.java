/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/15/2024 (Sunday)
 * Time    : 7:57 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService{
    @Autowired
    ItemRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean saveItem(ItemDTO dto){
        if(checkItemExits(dto.getCode())){
            return false;
        }else {

            Item item = mapper.map(dto, Item.class);
            repo.save(item);
            return true;
        }
    }

    @Override
    public boolean deleteItem(String code){
        if(checkItemExits(code)){
            repo.deleteById(code);
            return true;

        }else {
            return false;
        }
    }

    @Override
    public boolean updateItem(ItemDTO dto){
        if(checkItemExits(dto.getCode())){
            repo.save(mapper.map(dto, Item.class));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public ArrayList<ItemDTO> getAllItem(){
        return mapper.map(repo.findAll(),new TypeToken<ArrayList<ItemDTO>>(){}.getType());
    }

    private boolean checkItemExits(String code){
        Optional<Item> byId = repo.findById(code);
        return byId.isPresent();
    }
}
