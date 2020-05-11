package ru.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.company.entity.Employee;
import ru.company.service.GuiedServiceImp;

@Controller
@RequestMapping("/")
public class WebController {

    @Autowired
    GuiedServiceImp guiedServiceImp;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("employees", guiedServiceImp.findAllEmEmployees());
        return "index";
    }
    @GetMapping("/department")
    public String department(Model model){
        model.addAttribute("departments", guiedServiceImp.findAllDepartments());
        return "department";
    }
    @GetMapping("/newEmployee")
    public String newEmployee(){
        return "newEmployee";
    }
    @PostMapping("/newEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee){
        guiedServiceImp.addEmployee(employee);

        return "redirect:/";
    }

}
