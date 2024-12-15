/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/15/2024 (Sunday)
 * Time    : 6:39 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public boolean addCustomer(CustomerDTO dto) {

        if(!checkExits(dto.getId())){
            Customer customer = mapper.map(dto, Customer.class);
            repo.save(customer);
            return true;
        }else {

            return false;
        }
    }
    @Override
    public boolean deleteCustomer(String id) {
        if(checkExits(id)){
            repo.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
    @Override
    public boolean updateCustomer(CustomerDTO dto) {
        if(checkExits(dto.getId())){
            Customer customer = mapper.map(dto, Customer.class);
            repo.save(customer);
            return true;
        }else {
            return false;
        }
    }
    @Override
    public ArrayList<CustomerDTO> getAllCustomer() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<CustomerDTO>>() {
        }.getType());
    }

    private Boolean checkExits(String id) {
        Optional<Customer> byId = repo.findById(id);
        return byId.isPresent();
    }
}
