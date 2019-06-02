/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etracerproject.etracer.controllers;

import com.etracerproject.etracer.entities.Employee;
import com.etracerproject.etracer.entities.Message;
import com.etracerproject.etracer.entities.Province;
import com.etracerproject.etracer.entities.User;
import com.etracerproject.etracer.repositories.ProvinceRepository;
import com.etracerproject.etracer.services.ProvinceService;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Relion31
 */
@Controller
public class MainController {

    @Autowired
    private ProvinceService ps;
    @Autowired
    private ProvinceRepository provinceRepository;
    
//    @GetMapping({"/","/login"})
//	public String index() {
//		return "index";
//	}
//	
//	@GetMapping("/dashboard")
//	public String dashboard() {
//		return "dashboard";
//	}
//	
//        @GetMapping("/datauser")
//	public String datauser() {
//		return "province";
//	}
//	@GetMapping("/user")
//	public String user() {
//		return "user";
//	}
//	
//	@GetMapping("/admin")
//	public String admin() {
//		return "admin";
//	}
    
//    ====================================================

    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/province")
    public String province(Model model) {
        model.addAttribute("dataProvince", provinceRepository.getAll());
        return "province";
    }

    @PostMapping("/addData")
    public String addData(@Valid Province province) {
        provinceRepository.save(province);
        return "redirect:/province";
    }

    @GetMapping("/update")
    public String updateActor(@Valid Province province) {
        provinceRepository.save(province);
        return "redirect:/province";
    }

    @GetMapping("/delete")
    public String softDelete(@Valid Province province) {
        provinceRepository.save(province);
        return "redirect:/province";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpSession session, ModelMap modelMap, Employee employee, Model model) {
        String usernamedb = employee.getEmail();
        String passworddb = employee.getPassword();
        if (email.equalsIgnoreCase(usernamedb) && password.equalsIgnoreCase(passworddb)) {
            session.setAttribute("email", email);
            model.addAttribute("dataProvince", provinceRepository.getAll());
            return "province";
        } else {
            modelMap.put("error", "Invalid Account");
            return "index";
        }
    }
    
    @GetMapping("/*")
    public String Error(){
        return "error";
    }

}
