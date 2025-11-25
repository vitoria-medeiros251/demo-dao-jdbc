package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
    void insert (Seller obj);
    void update (Seller obj);
    void deleteById(Integer id);
    Seller findyById(Integer id);  
   List<Department> findAll();
   Seller findById(Integer id);

}  
