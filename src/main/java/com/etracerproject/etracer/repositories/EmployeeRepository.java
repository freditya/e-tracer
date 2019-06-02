/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etracerproject.etracer.repositories;

import com.etracerproject.etracer.entities.Employee;
import com.etracerproject.etracer.entities.Province;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Relion31
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {
//     Optional<Employee> findByEmail(String email);
}
