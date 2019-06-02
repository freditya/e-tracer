/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etracerproject.etracer.services;

import com.etracerproject.etracer.entities.Employee;
import com.etracerproject.etracer.entities.Province;
import com.etracerproject.etracer.repositories.EmployeeRepository;
import com.etracerproject.etracer.repositories.ProvinceRepository;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Relion31
 */
@Service
@org.springframework.transaction.annotation.Transactional
public class ProvinceService{
    @Autowired
    private ProvinceRepository provinceRepository;
    
    
    public Iterable<Province> findAllProvince(){
        return provinceRepository.findAll();
    }
    
    public List<Province>getAll(){
        return provinceRepository.getAll();
    }
    
     
}
