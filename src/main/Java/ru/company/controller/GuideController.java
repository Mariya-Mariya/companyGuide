package ru.company.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.company.entity.Employee;
import ru.company.service.GuiedServiceImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ari/v1/showEmployees/")
public class GuideController {
    @Autowired
    GuiedServiceImp guiedServiceImp;

    @GetMapping(value = "{code}", produces = "application/json")
    public String showEmployees(@PathVariable String code){
        Gson gsonBuilder = new GsonBuilder().create();

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        List<Employee> employees = guiedServiceImp.findByDepartment(code);
        for (Employee employee :employees ){
            ArrayList property = new ArrayList();
            property.add(employee.getFirstName());
            property.add(employee.getMiddleName());
            property.add(employee.getLastName());
            property.add(employee.getPhone());
            property.add(employee.getEmail());
            map.put(employee.getId(), property);
        }
        String jsonFromJavaMap = gsonBuilder.toJson(map);

        return jsonFromJavaMap;
    }



}
