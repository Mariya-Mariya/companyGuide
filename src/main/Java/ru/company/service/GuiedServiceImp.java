package ru.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.company.dao.DepartmentDAO;
import ru.company.dao.EmployeeDAO;
import ru.company.entity.Department;
import ru.company.entity.Employee;

import java.util.List;

@Service
public class GuiedServiceImp implements GuideService {
    @Autowired
    DepartmentDAO departmentDAO;
    @Autowired
    EmployeeDAO employeeDAO;

    public List<Department> findAllDepartments(){return departmentDAO.findAll();}
    public List<Employee> findAllEmEmployees (){return  employeeDAO.findAll();}
    public void addEmployee(Employee employee){employeeDAO.add(employee);}
}
