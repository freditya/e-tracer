/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etracerproject.etracer.services;


import com.etracerproject.etracer.entities.Role;
import com.etracerproject.etracer.repositories.EmployeeRepository;
import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 *
 * @author Relion31
 */
@Service
public class EmployeeService {
//    @Autowired
//    private EmployeeRepository employeeRepository;
//    	
//    @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//     //Buscar el usuario con el repositorio y si no existe lanzar una exepcion
//     com.etracerproject.etracer.entities.Employee appUser = 
//                 employeeRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Not exist"));
//		
//    //Mapear nuestra lista de Authority con la de spring security 
//    List grantList = new ArrayList();
//    for (Role authority: appUser.getAuthority()) {
//        // ROLE_USER, ROLE_ADMIN,..
//        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
//            grantList.add(grantedAuthority);
//    }
//		
//    //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
//    UserDetails user = (UserDetails) new User(appUser.getEmail(), appUser.getPassword(), grantList);
//         return user;
//    }
}
