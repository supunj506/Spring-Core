/*
 * @author : xCODE
 * Project : SpringFramework
 * Date    : 12/13/2024 (Friday)
 * Time    : 12:37 PM
 * For GDSE course of IJSE institute.
 */

package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/springWebThogakade", "root", "1234");
        return connection;
    }

    @PostMapping
    public ResponseUtil saveCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto.toString());
        try {
            Connection connection = getConnection();
            try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer VALUES (?,?,?,?)")) {
                preparedStatement.setString(1, dto.getId());
                preparedStatement.setString(2, dto.getName());
                preparedStatement.setString(3, dto.getAddress());
                preparedStatement.setDouble(4, dto.getSalary());

                preparedStatement.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return new ResponseUtil("200",dto.toString()+" Added",null);
    }


    @GetMapping
    public ResponseUtil getAllCustomers(){
        ArrayList<CustomerDTO> allCustomer = new ArrayList<>();

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customer");
            ResultSet rst = preparedStatement.executeQuery();
            while (rst.next()){
                allCustomer.add(new CustomerDTO(
                        rst.getString("id"),
                        rst.getString("name"),
                        rst.getString("address"),
                        rst.getDouble("salary")
                        ));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


//        allCustomer.add(new CustomerDTO("C001","Supun","Panadura",100000));
//        allCustomer.add(new CustomerDTO("C002","Arun","Mathugam",30000));
//        allCustomer.add(new CustomerDTO("C003","Nipun","Mathara",40000));
//        allCustomer.add(new CustomerDTO("C004","Kamal","Galle",35000));
        return new ResponseUtil("200","done",allCustomer);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(String id){
        System.out.println(id);

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("Delete from customer where id=?");
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return new ResponseUtil("200",id+" deleted",null);
    }

    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto.toString());

        try {
            Connection connection = getConnection();
            String sql = "UPDATE customer SET name = ?, address = ?, salary = ? WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, dto.getName());
                preparedStatement.setString(2, dto.getAddress());
                preparedStatement.setDouble(3, dto.getSalary());
                preparedStatement.setString(4, dto.getId()); // Use ID in the WHERE clause

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) updated.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return new ResponseUtil("200",dto.toString()+" Updated",null);
    }
}
