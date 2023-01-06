package com.example.demo.service;
import java.util.*;
import com.example.demo.repository.emprepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class empservice   {
    @Autowired
    private emprepository repo;
    public void addemp(Employee e){

        repo.save(e);}
        public List<Employee> findall(){
return repo.findAll();
    }
}
